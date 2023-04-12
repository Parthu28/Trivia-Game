public class Question
{
	//instance variables
	private String question;
	private String possibleAnswer1;
	private String possibleAnswer2;
	private String possibleAnswer3;
	private String possibleAnswer4;
	private int correct;
	/*This set a question, four possible
	answers and the correct answer of type integer*/
	public Question(String question,
	String possibleAnswer1,
	String possibleAnswer2,
	String possibleAnswer3,
	String possibleAnswer4,
	int correct)
	{
	this.question=question;
	this.possibleAnswer1=possibleAnswer1;
	this.possibleAnswer2=possibleAnswer2;
	this.possibleAnswer3=possibleAnswer3;
	this.possibleAnswer4=possibleAnswer4;
	this.correct=correct;
	}

	public void setQuestion(String question)   //set question
	{
	this.question=question;
	}

	public String getQuestion()       //returns the question
	{
	return question;
	}

	public void setPossibleAnswer1(String possibleAnswer1)  //Set first possible answer
	{
	this.possibleAnswer1=possibleAnswer1;
	}

	public void setPossibleAnswer2(String possibleAnswer2) 	//Set second possible answer
	{
	this.possibleAnswer2=possibleAnswer2;
	}

	public void setPossibleAnswer3(String possibleAnswer3)	//Set second possible answer
	{
	this.possibleAnswer3=possibleAnswer3;
	}

	public void setPossibleAnswer4(String possibleAnswer4) //Set four possible answer
	{
	this.possibleAnswer4=possibleAnswer4;
	}

	public String getPossibleAnswer1()    	//Returns first possible answer
	{
	return possibleAnswer1;
	}

	public String getPossibleAnswer2()    //Returns secod possible answer
	{
	return possibleAnswer2;
	}

	public String getPossibleAnswer3()    //Returns third possible answer
	{
	return possibleAnswer3;
	}

	public String getPossibleAnswer4()    //Returns four possible answer
	{
	return possibleAnswer4;
	}

	public void setAnswer(int correct)  //Set the correct answer
	{
	this.correct=correct;
	}

	public int getAnswer()   //Returns correct answer
	{
	return correct;
	}
}