import java.util.Random;
import java.util.Scanner;

// Blackjack program. Allows betting and determines card values and suit, including face cards.

public class BlackJack
{	
	
	// Setup variables
	static int playerCount, dealerCount, aceCountD, aceCountP, card, raise, hitCount;
	static boolean aceD, aceP, playerBust, dealerBust, blackJackP, blackJackD, pStay, onDeal, playAgain;
	static String pline1, pline2, pline3, pline4, dline1, dline2, dline3, dline4, face, hit, risk;
	static double money = 100.00;
	
	public static void main( String[] args )
	{	
		System.out.println( "Let's play Blackjack." );
		System.out.println( "You start out with $" + money + "." );
		
		do
		{
			// Sets non prompted variables here. Otherwise they they will carry over through each play thru. (that would be bad)
			pline1 = "";
			pline2 = "";
			pline3 = "";
			pline4 = ""; 
			dline1 = ""; 
			dline2 = ""; 
			dline3 = ""; 
			dline4 = "";
			playerCount = 0; 
			dealerCount = 0; 
			aceCountD = 0;
			aceCountP = 0;
			hitCount = 0;
			aceD = false;
			aceP = false; 
			playerBust = false;
			dealerBust = false;
			blackJackP = false;
			blackJackD = false;
			pStay = false;
			onDeal = true;
			
			// Play the game
			play();
			
			// Check the winner
			whoWon();
			
			// if the player can no longer meet the minimum bet or decides to quit end the program
			keepGoing();
			
		} while ( playAgain );
	}

	// method checks if the player or dealer busts if there are aces in the hand convert them from 11 to 1 before bust
	public static void checkBust(String hand)
	{
		if (hand.equals("player"))
		{
		
			if ( playerCount > 21 )
			{	
				playerBust = true;
				
				while ( aceP )
				{
					playerBust = true;
					playerCount = playerCount - 10;
					aceCountP = aceCountP - 1;
					
					if ( aceCountP == 0 )
						aceP = false;
					
					playerBust = false;
				}
			}
		}
			
		else if (hand.equals("dealer"))
		{
	
			if ( dealerCount > 21 )
			{
				dealerBust = true;
				
				while ( aceD )
				{
					dealerBust = true;
					dealerCount = dealerCount - 10;
					aceCountD = aceCountD - 1;
					
					if ( aceCountD == 0 )
						aceD = false;
					
					dealerBust = false;
				}
			}
		}
	}
	
	// deals cards. the dealer output varies on if it is the deal, first hit or any subsequent hit
	public static void dealCard(String hand)
	{	
		if (hand.equals("player"))
		{	
			drawCard(hand);
			playerCount = playerCount + card;
			checkBust(hand);
			System.out.println( "\nYour card is a " + face + ".\nYour total is " + playerCount + "." );
			System.out.println( pline1 + "\n" + pline2 + "\n" + pline3 + "\n" + pline4 );
		}	
		
		else if (hand.equals("dealer"))
		{	
			if ( hitCount == 0 )
			{
				drawCard(hand);
				dealerCount = dealerCount + card;
				System.out.println( "\nThe dealer shows a " + face + " plus one hidden card. The dealer's total is " + dealerCount + "." );
				System.out.println( dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
				drawCard(hand);
				dealerCount = dealerCount + card;
				onDeal = false;
			}
			
			else if ( hitCount == 1 )
			{
				System.out.println( "\nThe dealer reveals the hidden card.\n" + dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
				System.out.println( "The Dealer's total is: " + dealerCount );
				drawCard(hand);
				System.out.println( "\nThe dealer hits." );
				dealerCount = dealerCount + card;
				System.out.println( "The dealer's new card is a " + face + "." );
				System.out.println( dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
			}
			else
			{
				drawCard(hand);
				System.out.println( "\nThe dealer hits." );
				dealerCount = dealerCount + card;
				System.out.println( "The dealer's card is a " + face + "." );
				System.out.println( dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
			}
		}
		checkBust(hand);
		check21(hand);
	}
	
	// check for 21 if it is a natural payout 3/2 bet to the player. player auto stays on 21. Player automatically loses if dealer gets 21. Push on 2 blackjacks.
	public static void check21 (String hand)
	{
		if (hand.equals("player"))
		{
			if (playerCount == 21)
			{	
				if ( onDeal )
				{
					blackJackP = true;
					pStay = true;
					System.out.println( "BlackJack! That pays out 3/2. Congratulations!" );
					money = money + ( 3 * raise / 2 );
				}
				else
				{
					pStay = true;
					System.out.println( "You have 21. You automatically stay." );
				}
			}	
		}	
		
		else if (hand.equals("dealer"))
		{	
			
			if (dealerCount == 21)
			{	
				if ( hitCount == 0 )
				{
					blackJackD = true;
					if ( blackJackP )
					{
						System.out.println( dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
						System.out.println( "It's a push, the dealer also has 21. Tough luck." );
					}
					else
					{	
						System.out.println( dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
						System.out.println( "You lose, the dealer has 21. Tough luck." );
						money = money - raise;
						pStay = true;
					}
				}
				else
				{
					blackJackD = true;
					System.out.println( "You lose, the dealer has 21. Tough luck." );
					money = money - raise;
				}
			}
		}	
	}
	
	// generates value, face, suit and ASCII art for cards
	public static void drawCard(String hand)
	{
		Random r = new Random();
		int suitNum;
		String suit;
		card = 2 + r.nextInt(13);
		suitNum = 1 + r.nextInt(4);
		
		switch(suitNum)
		{
			case 1: suit = "D";
					break;
			case 2: suit = "C";
					break;
			case 3: suit = "H";
					break;
			case 4: suit = "S";
					break;
			default: suit = "?";
					break;
		}
		
		if ( card > 9 )
		{
			switch(card)
			{
				case 14:
				{
					if ( hand.equals("player"))
					{
						aceP = true;
						aceCountP = aceCountP + 1;
						card = 11;
						face = "A";
					}
					else if ( hand.equals("dealer"))
					{
						aceD = true;
						aceCountD = aceCountD + 1;
						card = 11;
						face = "A";
					}
					break;
				}
				case 13:
				{
					card = 10;
					face = "K";
					break;
				}	
				case 12:
				{
					card = 10;
					face = "Q";
					break;
				}	
				case 11:
				{
					card = 10;
					face = "J";
					break;
				}
				default:
				{
					face = Integer.toString(card);
					break;
				}
			}
		}
		else
			face = Integer.toString(card);

		if (hand.equals("player"))
		{
			pline1 = pline1 + "---\t";
			pline2 = pline2 + "|" + face + "|\t";
			pline3 = pline3 + "|" + suit + "|\t";
			pline4 = pline4 + "---\t";
		}
		else if (hand.equals("dealer"))
		{
			dline1 = dline1 + "---\t";
			dline2 = dline2 + "|" + face + "|\t";
			dline3 = dline3 + "|" + suit + "|\t";
			dline4 = dline4 + "---\t";
		}
	}


	// no duplicate code in the following 3 methods I just took them out of main
	
	// if no one busts or has a natural blackjack calculate the winner & reveal the dealers hand if it was over 16 on the deal
	public static void whoWon()
	{
		if ( playerBust == false && dealerBust == false && blackJackP == false && blackJackD == false)
		{
			if ( hitCount == 0 )
			{
				System.out.println( "\nThe dealer reveals the hidden card.\n" + dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
				
				if ( playerCount == dealerCount )
				{
					System.out.println( "\nYour total is " + playerCount + ". The dealer's total is " + dealerCount + ". The dealer wins on ties." );
					money = money - raise;
				}
				else if ( playerCount > dealerCount )
				{
					System.out.println( "\nYour total is " + playerCount + ". The dealer's total is " + dealerCount + ". Congratulations, you win!" );
					money = money + raise;
				}
				else
				{
					System.out.println( "\nYour total is " + playerCount + ". The dealer's total is " + dealerCount + ". The dealer wins." );
					money = money - raise;
				}
			}
			
			else
			{
				if ( playerCount == dealerCount )
				{	
					System.out.println( "\nYour total is " + playerCount + ". The dealer's total is " + dealerCount + ". The dealer wins on ties." );
					money = money - raise;
				}
				
				else if ( playerCount > dealerCount )
				{	
					System.out.println( "\nYour total is " + playerCount + ". The dealer's total is " + dealerCount + ". Congratulations, you win!" );
					money = money + raise;
				}
				
				else
				{
					System.out.println( "\nYour total is " + playerCount + ". The dealer's total is " + dealerCount + ". The dealer wins." );
					money = money - raise;
				}
			}				
		}
	}
	
	// The meat of the game is here dealing and hitting
	public static void play()
	{
		Scanner keyboard = new Scanner(System.in);
		// get initial bet and makes sure the value is within the acceptable range
		System.out.print( "Your current funds are $" + money + ". How much would you like to bet?\n>" );
		raise = keyboard.nextInt();
	
		while ( raise < 5 || raise > money )
		{ 
			if  ( raise < 5 )
			{
				System.out.print( "Sorry, the minimum bet is $5. How much would you like to bet?\n>" );
				raise = keyboard.nextInt();
			}
				
			else if ( raise > money )
			{
				System.out.print( "Sorry, you don't have that much. How much would you like to bet?\n>" );
				raise = keyboard.nextInt();
			}
		}
		
		// Deal the player and dealer hands			
		dealCard("player");
		dealCard("player");
		
		dealCard("dealer");
	
		// on the deal ask if the player wishes to double down given that no one has a blackjack
		if ( blackJackD == false && pStay == false )
		{
			System.out.print( "\nYour total is " + playerCount + ". Would you like to Double Down?\nY/N >" );
			risk = keyboard.next();
	
			if ( risk.equalsIgnoreCase("Y")  )
			{		
				if ( raise * 2 > money )
				{	
					System.out.print( "Sorry, you can't afford it." );
				}
				else	
				{	
					pStay = true;
					raise = (raise + raise);
					dealCard("player");
				}
			}
		}
		
		// given that no one has a blackjack and the player decided not to double down ask to hit
		
		while (pStay == false && playerBust == false && blackJackD == false)
		{
			System.out.print( "\nWould you like to hit? Your current total is " + playerCount + ".\nY/N >" );
			hit = keyboard.next();
		
			if ( hit.equalsIgnoreCase("Y")  )
			{	
				dealCard("player");
			}
			else
			{	
				System.out.println( "You decide to stay at " + playerCount + "." );
				pStay = true;
			}
		}
		
		// if the player busts they automatically lose
		
		if (playerBust)			
		{
			System.out.println ( "\nSorry. You bust and the dealer wins. :(" );
			money = money - raise;	
		}
		
		// given the player does not bust the dealer hits on anything 16 or below the player wins if the dealer busts
		else
		{			
			while ( dealerCount < 17 )
			{	
				hitCount = hitCount + 1;
				dealCard("dealer");
				System.out.println( "The Dealer's total is: " + dealerCount );
				
				if (dealerBust)
				{
					System.out.println ( "\nThe dealer busts. Congratulations, you win!" );
					money = money + raise;	
				}
			}
		}
	}
	
	// Check if it should play another game
	public static void keepGoing()
	{
		String doEet = "";
		Scanner keyboard = new Scanner(System.in);
		
		if ( money > 5.0 )
		{
			do
			{
				System.out.print( "\nYou currently have " + money + ". Would you like to keep going?\nY/N>" );
				doEet = keyboard.next();
	
				if ( doEet.equalsIgnoreCase("N") )
				{
					System.out.println( "\nSometimes it is better to quit while you're ahead.\n" );
					playAgain = false;
				}
				if ( doEet.equalsIgnoreCase("Y") )
				{
					System.out.println( "\nIt's not real money.\n" );
					playAgain = true;
				}
			} while ( doEet.equalsIgnoreCase("N") == false && doEet.equalsIgnoreCase("Y") == false );
		}
		
		else
		{
			System.out.println( "You ran out of money." );
			playAgain = false;
		}
	}
}