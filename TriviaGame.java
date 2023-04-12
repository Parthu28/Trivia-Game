import java.util.Scanner;

public class TriviaGame {

	public static void main(String args[])
	{
		// Constants
		final int NUM_QUESTIONS = 10;
		final int NUM_PLAYERS = 2;
		int player1Points = 0;
		int player2Points = 0;

Scanner keyboard = new Scanner(System.in);
Question[] gameQuestions = new Question[NUM_QUESTIONS];


		gameQuestions[0] = new Question("According to Norse mythology, who is the god of thunder?","Thor","Loki","Odin","Zeus",1);

		gameQuestions[1] = new Question("What is capital of U.S.A","Washington","New Delhi","New York","Singapore",1);

		gameQuestions[2] = new Question("Who was the first cartoon character to get his own star on Hollywood Boulevard’s Walk of Fame?"
											,"Minnie Mouse","Goofy","Mickey Mouse","Tweety",3);

		gameQuestions[3] = new Question("What was the first publicly traded U.S. company to reach a $1 trillion market cap?"
											,"Microsoft","Apple","Coca-Cola","Nike",2);

		gameQuestions[4] = new Question("How many electrons does a hydrogen atom have?","Two","One","Five","Ten",2);

		gameQuestions[5] = new Question("What is capital of Egypt","Dhaka","Islamabad","Cairo","Paris",3);

		gameQuestions[6] = new Question("What are the first four digits of Pi?","3.141","3.879","4.975","3.111",1);

		gameQuestions[7] = new Question("Alexander the great was taught by which Greek philosopher?","Plato","Aristotle","Socrates","Pythagoras",2);

		gameQuestions[8] = new Question("In what city would you find the Wizard of Oz?","The City of Oz","The Emerald City","Paris","Silver Lake",2);

		gameQuestions[9] = new Question("The Hound of the Baskervilles is a crime novel featuring which fictional detective(s)?"
											,"The Hardy Boys","Sherlock Holmes","Nancy Drew","Percy Jackson",2);


		for (int i= 0; i < gameQuestions.length/2; i++)    //This loops runs through a number of questions for player
		{
			System.out.println("\nQuestion " + (i + 1) + " for player #1" + "\n"); //prints  Trivia object question
			System.out.println(gameQuestions[i].getQuestion());
			System.out.println("1."+ gameQuestions[i].getPossibleAnswer1());
			System.out.println("2."+ gameQuestions[i].getPossibleAnswer2());
			System.out.println("3."+ gameQuestions[i].getPossibleAnswer3());
			System.out.println("4."+ gameQuestions[i].getPossibleAnswer4());
			System.out.print("Enter answer : ");

			int useranswer = keyboard.nextInt();    //This ask  the user for an answer

			if(gameQuestions[i].getAnswer() == useranswer)
			{
				player1Points++;
				System.out.println("\nCorrect");
			}else{
				System.out.println("\nInCorrect, The Correct Answer is " +
									gameQuestions[i].getAnswer());
			}
		}

		//This for loops runs through a number of questions for player 2
		for (int index = gameQuestions.length/2; index < gameQuestions.length; index++)
		{
			//This prints the Trivia object question
			System.out.println("Question " + (index + 1) + " for player #2" + "\n");
			System.out.println(gameQuestions[index].getQuestion());
			System.out.println("1."+ gameQuestions[index].getPossibleAnswer1());
			System.out.println("2."+ gameQuestions[index].getPossibleAnswer2());
			System.out.println("3."+ gameQuestions[index].getPossibleAnswer3());
		    System.out.println("4."+ gameQuestions[index].getPossibleAnswer4());
			System.out.println("Enter answer : ");
			//This Prompts  the user for an answer
			int useranswer = keyboard.nextInt();

      if(gameQuestions[index].getAnswer() == useranswer)
	  			{
	  				player2Points++;
	  				System.out.println("\nCorrect");
	  			}

	  			else
	  			{
	  				System.out.println("\nInCorrect, The Correct Answer is " +
	  									gameQuestions[index].getAnswer());
	  			}
		}


     if(player1Points == player2Points)
		{
			//This prints that the game is a tie
			System.out.println("Game is tie.");
		}
		/*This else-if statement checks if player1's score is greater than
			player2's score*/
		else if(player1Points>player2Points)
		{
			//This prints that player-1 has won the game
			System.out.println("Player-1 WINS!!.");
		}

		/*This else statement checks if player2's score is greater than
			player1's score*/
		else
		{
			//This prints that player-2 has won the game
			System.out.println("Player-2 Wins!!.");
		}
	}
}