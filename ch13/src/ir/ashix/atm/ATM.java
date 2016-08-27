package ir.ashix.atm;

public class ATM 
{	
	private boolean userAuthenticated;
	private int currentAccountNumber;
	private Screen screen;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	private DepositSlot depositSlot;
	private BankDatabase bankDatabase;
	
	
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	public ATM()
	{
		userAuthenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		keypad = new Keypad();
		cashDispenser = new CashDispenser();
		depositSlot = new DepositSlot();
		bankDatabase = new BankDatabase();
		
	}
	
	public void run()
	{
		while(true)
		{
			while(!userAuthenticated)
			{
				screen.displayMessageLine("\nWellcome!");
				authenticateUser();
			}
			
			performTransaction();
			userAuthenticated = false;
			currentAccountNumber = 0;
			screen.displayMessageLine("\nThank you! GoodBye!");
		}
	}
	
	private void authenticateUser()
	{
		screen.displayMessageLine("\nPlease Enter your account number : ");
		int accountNumber = keypad.getInput();
		screen.displayMessageLine("\nEnter your Pin : ");
		int pin = keypad.getInput();
		
		userAuthenticated = bankDatabase.authenticateUser(accountNumber , pin);
		
		if(userAuthenticated)
		{
			currentAccountNumber = accountNumber;
		}
		else {
			screen.displayMessageLine("\ninvalid Account Number or PIN . Please try again.");
			
		}
		
	}
	private void performTransaction()
	{
		Transaction currentTransaction = null;
		boolean userExited = false;
		
		while(!userExited)
		{
			int mainMenuSelection = displayMainMenu();
			switch (mainMenuSelection) 
			{
			case BALANCE_INQUIRY:
			case WITHDRAWAL:
			case DEPOSIT:
			
			currentTransaction = createTransaction( mainMenuSelection );
			
			currentTransaction.execute();
			break;
			case EXIT: // user chose to terminate session
	               screen.displayMessageLine( "\nExiting the system..." );
	               userExited = true; // this ATM session should end
	               break;
			default:
				screen.displayMessageLine("\nYou did not enter a valid selection please try again.");
				break;
			}
		}
	}
	private int displayMainMenu()
	{
		screen.displayMessageLine("\nMain Menu :");
		screen.displayMessageLine("1 - View my Balance");
		screen.displayMessageLine("2 - Withdraw Cash");
		screen.displayMessageLine("3 - Deposit funds");
		screen.displayMessageLine("4 - Exit\n");
		screen.displayMessageLine("Enter a choice");
		return keypad.getInput();
	}
	
	private Transaction createTransaction(int type)
	{
		Transaction temp = null;
		
		switch(type)
		{
		case BALANCE_INQUIRY:
			temp = new BalanceInquiry(currentAccountNumber , screen , bankDatabase);
		break;
		
		case WITHDRAWAL:
			temp = new Withdrawal(currentAccountNumber , screen , bankDatabase,
					keypad, cashDispenser);
			break;
		case DEPOSIT:
			temp = new Deposit(currentAccountNumber,screen,bankDatabase,keypad,
					depositSlot);
			break;
		}
		return temp;
	}
}
