import java.util.Random;
import java.util.Scanner;

public class BlackJack
{	
	static int playerCount = 0, dealerCount = 0, aceCountD = 0, aceCountP = 0, card, raise = 5;
	static boolean aceD, aceP, playerBust, dealerBust, blackJackP, blackJackD, pStay, onDeal = true, playAgain = true;
	static String pline1 = "", pline2 = "", pline3 = "", pline4 = "", dline1 = "", dline2 = "", dline3 = "", dline4 = "", suit, face;
	static double money = 100;
	
	public static void main( String[] args )
	{	
		Scanner keyboard = new Scanner(System.in);
		String doEet = "", hit = "", risk = "";
		
		System.out.println( "Let's play Blackjack." );
		System.out.println( "You start out with $" + money + "." );
		
		while ( playAgain )
		{	
			doEet = ""; 
			hit = ""; 
			risk = "";
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
			aceD = false;
			aceP = false; 
			playerBust = false;
			dealerBust = false;
			blackJackP = false;
			blackJackD = false;
			pStay = false;
			onDeal = true;
				
			System.out.print( "Your current funds are $" + money + " and your current bet is " + raise + ". How much would you like to bet?\n>" );
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
		
			dealCard("player");
			dealCard("player");
			
			dealCard("dealer");
			
			if ( blackJackP == false )
			{
				System.out.print( "Would you like to Double Down?\nY/N >" );
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
			
			while (pStay == false && playerBust == false)
			{
				System.out.print( "Would you like to hit? Your current total is " + playerCount + ".\nY/N >" );
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
			
			if (playerBust)			
			{
				System.out.println ( "Sorry. You bust and the dealer wins. :(" );
				money = money - raise;	
			}
			else
			{			
				while ( dealerCount < 17 )
				{	
					System.out.println( "The Dealer's total is: " + dealerCount );
					System.out.println( "The dealer hits." );
					dealCard("dealer");
					
					if (dealerBust)
					{
						System.out.println ( "The dealer busts. Congratulations, you win!" );
						money = money + raise;	
					}
				}
			}
		
			if ( playerBust == false && dealerBust == false && blackJackP == false && blackJackD == false)
			{
				if (onDeal)
				{
					if ( playerCount == dealerCount )
					{
						System.out.println( "The dealer reveals the hidden card.\n" + dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
						System.out.println( "Your total is " + playerCount + ". The dealer's total is " + dealerCount + ". The dealer wins on ties." );
						money = money - raise;
					}
					else if ( playerCount > dealerCount )
					{
						System.out.println( "The dealer reveals the hidden card.\n" + dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
						System.out.println( "Your total is " + playerCount + ". The dealer's total is " + dealerCount + ". Congratulations, you win!" );
						money = money + raise;
					}
					else
					{
						System.out.println( "The dealer reveals the hidden card.\n" + dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
						System.out.println( "Your total is " + playerCount + ". The dealer's total is " + dealerCount + ". The dealer wins." );
						money = money - raise;
					}
				}
				else
				{
					if ( playerCount == dealerCount )
					{	
						System.out.println( "Your total is " + playerCount + ". The dealer's total is " + dealerCount + ". The dealer wins on ties." );
						money = money - raise;
					}
					
					else if ( playerCount > dealerCount )
					{	
						System.out.println( "Your total is " + playerCount + ". The dealer's total is " + dealerCount + ". Congratulations, you win!" );
						money = money + raise;
					}
					
					else
					{
						System.out.println( "Your total is " + playerCount + ". The dealer's total is " + dealerCount + ". The dealer wins." );
						money = money - raise;
					}
				}				
			}
			
			if ( money > 5.0 )
			{
				System.out.print( "You currently have " + money + ". Would you like to keep going? " );
				doEet = keyboard.next();
		
				if ( doEet.equalsIgnoreCase("N") )
				{
					System.out.println( "Sometimes it is better to quit while you're ahead." );
					playAgain = false;
				}
			}
			else
			{
				System.out.println( "You ran out of money." );
				playAgain = false;
			}
		}
	}

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
	
	public static void dealCard(String hand)
	{	
		drawCard(hand);
		if (hand.equals("player"))
		{	
			playerCount = playerCount + card;
			System.out.println( "Your card is a " + face + ".\nYour total is " + playerCount + "." );
			System.out.println( pline1 + "\n" + pline2 + "\n" + pline3 + "\n" + pline4 );
			checkBust(hand);
			check21(hand);
		}	
		
		else if (hand.equals("dealer"))
		{	
			if ( onDeal )
			{
				dealerCount = dealerCount + card;
				System.out.println( "The dealer shows a " + face + " plus one hidden card.\nDealer's total is " + dealerCount + "." );
				System.out.println( dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
				drawCard(hand);
				dealerCount = dealerCount + card;
				checkBust(hand);
				check21(hand);
			}
			else
			{
				dealerCount = dealerCount + card;
				System.out.println( "The dealer's card is a " + face + ".\nDealer's total is " + dealerCount + "." );
				System.out.println( dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
				checkBust(hand);
				check21(hand);
			}
			onDeal = false;
		}
		checkBust(hand);
	}
	
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
				if ( onDeal )
				{
					blackJackD = true;
					System.out.println( dline1 + "\n" + dline2 + "\n" + dline3 + "\n" + dline4 );
					System.out.println( "You lose, the dealer has 21. Tough luck." );
					money = money - raise;
					pStay = true;
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
	public static void drawCard(String hand)
	{
		Random r = new Random();
		int suitNum;
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
}