//represents a single customer in a queue waiting for a register
public class Customer
{
	private int timeEnteredQueue;  //the time this customer entered the queue
	private int timeNeededAtRegister;  //how long this customer will need at the register

	//creates a new customer, who got into the queue at the given time,
	//and who will need a random amount of time at the register, from 1 to 10 minutes
	public Customer(int timeEntered)
	{
		timeEnteredQueue = timeEntered;

		//initialize to random number from 1 to 10 minutes
		timeNeededAtRegister = (int)(Math.random() * 10 + 1);
	}

	//returns the time this customer entered the queue
	public int getTimeEnteredQueue()
	{
		return timeEnteredQueue;
	}

	//returns the time this customer will need at the register
	public int getTimeNeededAtRegister()
	{
		return timeNeededAtRegister;
	}
}