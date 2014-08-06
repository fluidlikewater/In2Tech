// I hope someone actually does this. It was a lot of typing...

import java.util.Scanner;

public class ChooseAdventure
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String answer1, answer2, answer3;
		
		System.out.println( "WELCOME TO JOHN'S CHOOSE YOUR OWN ADVENTURE! Prepare to die, obviously." );
		
		System.out.print( "\nYou get off the freeway in the morning on your way to you job at Zappos."  
							+ "\nIt seems to be just like any other morning you are faced with your first difficult decision of the day." 
							+ "\nDo you park at the \"7th\" Street lot or in the \"garage\"?" 
							+ "\n>");
		answer1 = keyboard.next();
		
		if ( answer1.equals("7th") )
		{
			System.out.print( "\nYou decide to park at the 7th street lot like you usually do. You pull in and park." 
								+ "\nOn your way in you see an unusual fellow pacing around and talking to himself."
								+ "\nHe he starts to approach you with a friendly greeting. Do you \"avoid\" this jolly"
								+ "\nfellow or decide to have a \"chat\" while you wait for the light." 
								+ "\n>");
			answer2 = keyboard.next();
			
			if ( answer2.equals("avoid") )
			{
				System.out.print( "\nYou decide to avoid him because you've always been anti-social and this guys seems" 
									+ "\nto be of questionable bearing. You make it by the light unscathed and head up the stairs"
									+ "\ntowards the rotunda. You get to the doors and realize that you forgot your badge."
									+ "\nDo you head back to the \"car\" to get your badge or go to the \"lobby\" to get a temp?" 
									+ "\n>");
				answer3 = keyboard.next();
				
				if ( answer3.equals( "lobby" ) )
				{
					System.out.println( "\nYou head towards the lobby because you figure that it's too hot to walk all the way back to your car."
										+ "\nUnfortunately as you enter the middle of the rotunda you are struck by a rogue meteorite."
										+ "\nYou are instantly vaporized by the impact. At least you saved your loved ones on the funeral cost.");
				}
	
				else if ( answer3.equals("car") )
				{ 
					System.out.println( "\nYou figure that it is only 115 out today. Why not walk back and get your badge? The trip back to"
										+ "\nyour car is uneventful and you see your badge has fallen between the front seats. As you reach over to"
										+ "\nretrieve it you accidentally hit your horn. It startles you and you jump hitting your head on the roof"
										+ "\nknocking yourself unconscious in your car. Sadly, you are extra crispy by the time anyone finds you.");
				}
				else
					System.out.println( "\nEverything goes black. You are about to be eaten by a Grue... goodbye." );
			}
	
			else if ( answer2.equals("chat") )
			{ 
				System.out.print( "\nYou decide to have a conversation with the amiable man. He is unusually sober at 8am for a downtownian and the"
									+ "\nsubject is relatively innocuous. After a while he sees that his walk sign is on and moves to shake your"
									+ "\nhand before heading on his way. Do you \"accept\" the offered hand or \"recoil\" away because you don't know"
									+ "\nwhere he's been?"
									+ "\n>" );
				answer3 = keyboard.next();
				
				if ( answer3.equals("accept") )
				{
					System.out.println( "\nYou decide you accept the handshake because what harm could it do? Unbeknownst to you this man is a member of"
										+ "\nthe Anti-Zappos Downtown Underground. He whacks you over the head and spirits you away to their secret, underground"
										+ "\nlair. You are never seen or heard from again." );
				}
	
				else if ( answer3.equals("recoil") )
				{ 
					System.out.println( "\nTalking is one thing but actually touching another human being? Yuck! You recoil from the man like"
										+ "\nhe just asked you to sit through an entire screening of the Star Wars Christmas Special. As you back away"
										+ "\nfrom him you dont notice the curb as you step off and trip into oncoming traffic. You know that you are"
										+ "\ndoomed because the traffic doesn't even stop when you have the right of way." );
				}
				else
					System.out.println( "\nEverything goes black. You are about to be eaten by a Grue... goodbye." );

			}
			else
				System.out.println( "\nEverything goes black. You are about to be eaten by a Grue... goodbye." );
		}
		
		else if ( answer1.equals("garage") )
		{ 
			System.out.print( "\nYou decide to park in the parking garage because you figure that you are early enough to get a decent spot. You"
								+ "\nwind your way up floor after floor and finally locate a parking spot on the 5th floor. You fetch your laptop and"
								+ "\nbadge and head towards the \"stairs\" by the \"elevator\". Hmm, which will you take?" 
								+ "\n>");					
			answer2 = keyboard.next();
			
			if ( answer2.equals("elevator") )
			{
				System.out.print( "\nYou decide to take the elevator down to the ground floor. After all, the 5th floor actually means 6 flights down and who wants"
									+ "\nto do that this early in the morning? The elevator eventually arrives with a 'ding' and you get on. You cross the street and"
									+ "\nhead past the guards at the front. Wait... \"stairs\" and \"elevator\" again? Now I'm just being lazy!"
									+ "\n>");
				answer3 = keyboard.next();

				if ( answer3.equals("elevator") )
				{
					System.out.println( "\nYou are feeling extra lazy today so you decide on the elevator a second time. You press the button to go up"
										+ "\nto your floor and get on the elevator when it arrives. Someone comes up as the doors start to close but you don't"
										+ "\nhold the elevator because you're a jerk like that. As the elevator begins to rise to your floor it starts to shudder"
										+ "\nand stops moving. Suddenly, it plummets to the ground and your last thoughts are what a cruel mistress karma is." );
				}
	
				else if ( answer3.equals("stairs") )
				{ 
					System.out.println( "\nYou decide to take the stairs because there is a bit of a crowd waiting for the elevator this morning and one"
										+ "\ndoesn't look like it will be coming by anytime soon. As usual, you hear the familiar 'ding' from the lobby as"
										+ "\nyou round the corner. But your mind is already made up you climb the several flights of stairs up to your floor"
										+ "\nand as you grab for the handle the sudden exertion causes a weak blood vessel in your brain to rupture."
										+ "\nRemember aneurysms can strike at anywhere, anytime..." );
				}
				else
					System.out.println( "\nEverything goes black. You are about to be eaten by a Grue... goodbye." );
				
			}
		
			else if ( answer2.equals("stairs") )
			{ 
				System.out.print( "\nYou decide to take the stairs down (good for you). You make it to the crosswalk just in time to get across."
									+ "\nOnce you get to your floor you set your things down at your desk and try to decide whether you should go"
									+ "\nahead and get to \"work\" or grab something real quick from the \"break\" room." 
									+ "\n>" );
				answer3 = keyboard.next();
				
				if ( answer3.equals("break") )
				{
					System.out.println( "\nYou go to the break room to grab a cup of coffe before getting to work but..."
										+ "\nSomeone drank the last and didn't brew any more. Nooooooooooooooooo! Ok, so you didn't die"
										+ "\nbut this is pretty bad too." );
				}
	
				else if ( answer3.equals("work") )
				{ 
					System.out.println( "\nYou sit down at your desk and start your day. I'm not sure if any of the choose your own adventure books"
										+ "\nactually had outcomes where something horrible didn't happen to you. I never found one but I decided to put one" 
										+ "\nin mine. Congratulations, you live." );
				}
				else
					System.out.println( "\nEverything goes black. You are about to be eaten by a Grue... goodbye." );
				
			}
			else
				System.out.println( "\nEverything goes black. You are about to be eaten by a Grue... goodbye." );
		}
		
		else
			System.out.println( "\nEverything goes black. You are about to be eaten by a Grue... goodbye." );
			
		System.out.println( "\nThanks for playing! Try again, if you dare.");
	}
}