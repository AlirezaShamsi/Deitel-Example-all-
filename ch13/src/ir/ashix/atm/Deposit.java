package ir.ashix.atm;

public class Deposit extends Transaction 
{
	private double amount;
	private Keypad keypad;
	private DepositSlot depositSlot;
	private final static int CANCELED = 0;
	
	public Deposit (int userAccountNumber, Screen atmScreen,BankDatabase atmBankDatabase,
					Keypad atmKeypad,DepositSlot atmDepositSlot)
	{
		super(userAccountNumber, atmScreen, atmBankDatabase);
		keypad = atmKeypad;
		depositSlot = atmDepositSlot;
	}
	public void execute()
	{
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		amount = promptForDepositAmount();
		
		if(amount != CANCELED)
		{
			screen.displayMessage("\nPlease Insert a deposit envelope containing ");
			screen.displayDollarAmount(amount);
			screen.displayMessageLine(".");
			
			boolean envelopeRecieved = depositSlot.isEnvelopeReceived();
			
			if(envelopeRecieved)
			{
				screen.displayMessageLine("\nYour Envelope has been received."
											+ "\nNote:The money just Deposited will not be available until we verify the amount of any enclosed cash "
											+ "and your checks clear.");
				bankDatabase.credit(getAccountNumber(), amount);
			}
			else {
				screen.displayMessageLine("\nyou did not insert an envelope, so the ATM has canceled your transaction");
			}
		}
		else {
			screen.displayMessageLine("\nCanceling transaction...");
		}
	}
	
	private double promptForDepositAmount()
	{
		Screen screen = getScreen();
		screen.displayMessage("\nPlease enter a deposit amount in Cents (or 0 to cancel):");
		int input = keypad.getInput();
		if(input==CANCELED)
			return CANCELED;
		else {
			return (double)input / 100;
		}
	}
}
