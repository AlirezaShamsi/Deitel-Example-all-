package ir.ashix.atm;


public class Withdrawal extends Transaction {
	
	private int amount;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	private final static int CANCELED = 6;
	public Withdrawal(int userAccountNumber, Screen atmScreen,BankDatabase atmBankDatabase,Keypad atmKeypad, CashDispenser atmCashDispenser)
	{
		super(userAccountNumber, atmScreen, atmBankDatabase);
		keypad = atmKeypad;
		cashDispenser = atmCashDispenser;
	}
	
	@Override
	public void execute()
	{
		boolean cashDispensed = false;
		double availableBalance;
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		do
		{
			amount = displayMenuOfAmount();
			
			if(amount != CANCELED)
			{
				availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
				
				if(amount <= availableBalance)
				{
					if(cashDispenser.isSufficientCashAvailable( amount ))
					{
						bankDatabase.debit(getAccountNumber(), amount);
						cashDispenser.dispenseCash(amount);
						cashDispensed = true;
						screen.displayMessageLine("\nYour cash has been dispensed please take your cash now");
					}
					else
						screen.displayMessageLine("\nisSufficient cash available in the Atm.\n\nPlease choos a smaller amount");
				}
				else
				{
					screen.displayMessageLine("\nisSufficient  funds in your account.\nnPlease choose a smaller amount");
				}
			}
			else
			{
				screen.displayMessageLine("\nCancelling transaction...");
				return;
			}
			
		}while(!cashDispensed);
	}
	
	private int displayMenuOfAmount()
	{
		int userChoise = 0;
		Screen screen = getScreen();
		int[] amount = { 0 , 20 , 40 , 60 , 100 , 200 };
		
		while(userChoise==0)
		{
			screen.displayMessageLine("\nWithdrawal Menue:");
			screen.displayMessageLine("1 - $20");
			screen.displayMessageLine("2 - $40");
			screen.displayMessageLine("3 - $60");
			screen.displayMessageLine("4 - $100");
			screen.displayMessageLine("5 - $200");
			screen.displayMessageLine("6 - Canceled Transaction");
			screen.displayMessage("\nChoose a Withdrawal amount:");
			int input = keypad.getInput();
			
			switch (input) 
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				userChoise = amount[input];
				break;
			case CANCELED:
				userChoise = CANCELED;
				break;
			default:
				screen.displayMessageLine("Invalid Selection try Again");	
				break;

			}
		}
		return userChoise;
	}

}
