package mycoumputer;

/** Homework 6.8
A Simpletron computer simulator */

import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.*;
import java.awt.event.*;

public class Simpletron {

String welcome = "*** Welcome to Simpletron! ***" +
                 "\n*** Please enter your program one instruction  ***" +
                 "\n*** (or data word) at a time into the input    ***" +
                 "\n*** text field. I will display the location    ***" +
                 "\n*** number and a question mark (?). You then   ***" +
                 "\n*** type the word for that location. Press the ***" +
                 "\n*** Done button to stop entering your program  ***";
String start = "*** Program loading completed ***" +
               "\n*** Program execution begins  ***";
String fatalError1 = "*** Atempt to divide by zero ***" +
                    "\n*** Simpletron execution abnormally terminated ***";
String fatalError2 = "*** Accumulator overflow ***" +
                     "\n*** Simpletron execution abnormally terminated ***";

final int READ = 10;
final int WRITE = 11;
final int LOAD = 20;
final int STORE = 21;
final int ADD = 30;
final int SUBTRACT = 31;
final int DIVIDE = 32;
final int MULTIPLY = 33;
final int BRANCH = 40;
final int BRANCHNEG = 41;
final int BRANCHZERO = 42;
final int HALT = 43;

int memory[] = new int[ 100 ];

int accumulator = 0;
int instructionCounter = 0;
int operationCode = 0;
int operand = 0;
int instructionRegister;

public boolean terminate = false;

/** processes the instructions in memory, 
    also includes some error checking */
public void process()
{
    instructionRegister = memory[ instructionCounter ];
    operationCode = instructionRegister / 100;
    operand = instructionRegister % 100;
    
    switch ( operationCode ) {
        case READ:
            memory[ operand ] = Integer.parseInt(
                JOptionPane.showInputDialog(
                "Enter an integer." ) );
            instructionCounter++;
            break;
        case WRITE:
            JOptionPane.showMessageDialog( null, 
                Integer.toString( memory[ operand ] ),
                "Simpletron", JOptionPane.INFORMATION_MESSAGE );
            instructionCounter++;
            break;
        case LOAD:
            accumulator = memory[ operand ];
            instructionCounter++;
            break;
        case STORE:
            memory[ operand ] = accumulator;
            instructionCounter++;
            break;
        case ADD:
            if ( accumulator + memory[ operand ] > 9999 ||
                accumulator + memory[ operand ] < -9999 ) {
                JOptionPane.showMessageDialog( null, fatalError2,
                    "Simpletron", JOptionPane.ERROR_MESSAGE );
                terminate = true;
            }
            else {
                accumulator += memory[ operand ];
                instructionCounter++;
            }
            break;
        case SUBTRACT:
            if ( accumulator - memory[ operand ] > 9999 ||
                accumulator - memory[ operand ] < -9999 ) {
                JOptionPane.showMessageDialog( null, fatalError2,
                    "Simpletron", JOptionPane.ERROR_MESSAGE );
                terminate = true;
            }
            else {
                accumulator -= memory[ operand ];
                instructionCounter++;
            }
            break;
        case DIVIDE:
            if ( memory[ operand ] == 0 ) {
                JOptionPane.showMessageDialog( null, fatalError1,
                    "Simpletron", JOptionPane.ERROR_MESSAGE );
                terminate = true;
            }
            else {
                accumulator /= memory[ operand ];
                instructionCounter++;
            }
            break;
        case MULTIPLY:
            if ( accumulator * memory[ operand ] > 9999 ||
                accumulator * memory[ operand ] < -9999 ) {
                JOptionPane.showMessageDialog( null, fatalError2,
                    "Simpletron", JOptionPane.ERROR_MESSAGE );
                terminate = true;
            }
            else {
                accumulator *= memory[ operand ];
                instructionCounter++;
            }
            break;
        case BRANCH:
            instructionCounter = operand;
            break;
        case BRANCHNEG:
            if ( accumulator < 0 ) {
                instructionCounter = operand;
            }
            else {
                instructionCounter++;
            }
            break;
        case BRANCHZERO:
            if ( accumulator == 0 ) {
                instructionCounter = operand;
            }
            else {
                instructionCounter++;
            }
            break;
        case HALT:
            JOptionPane.showMessageDialog( null,
            "*** Simpletron execution terminated ***",
            "Simpeltron", JOptionPane.INFORMATION_MESSAGE );
            terminate = true;
            break;
    }
}

/** returns a string containing the register values */
public String registerDump()
{
    String dump;
    
    DecimalFormat df2 = new DecimalFormat( "00" );
    DecimalFormat df4 = new DecimalFormat( "0000" );

    dump = "REGISTERS:\naccumulator\t\t" +
        ( accumulator >= 0 ? "+" : "" ) + df4.format( accumulator ) +
        "\ninstructionCounter\t" + df2.format( instructionCounter ) +
        "\ninstructionRegister\t" +
        ( instructionRegister >= 0 ? "+" : "" ) +
        df4.format( instructionRegister )+ "\noperationCode\t\t" +
        df2.format( operationCode ) + "\noperand\t\t\t" +
        df2.format( operand );
    return( dump );
}

/** returns a string containing the memory values */
public String memoryDump()
{
    String dump;
    
    DecimalFormat df4 = new DecimalFormat( "0000" );

    dump = "\n\nMEMORY:\n";

    for ( int i = 0; i < memory.length; i++ ) {
        if ( memory[ i ] >= 0 ) {
            dump += " +" + df4.format( memory[ i ] );
        }
        else {
            dump += " " + df4.format( memory[ i ] );
        }
        if ( (i+1) >= 10 && (i+1) % 10 == 0 ) {
            dump += "\n";
        }       
    }
    return( dump );
}
}