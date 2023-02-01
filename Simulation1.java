import java.util.*;

//Simulates a number of customers getting into a single queue to reach one of several registers.
public class Simulation1
{
	//the probability that a customer will arrive in any given 1-minute interval
	private static final double ARRIVAL_PROBABILITY = 0.5;

	//the total number of minutes to simulate
	private static final int SIMULATION_TIME = 480;

	//the number of registers
	private static final int NUM_REGISTERS = 3;

	public static void main(String[] args)
	{
		//registerAvailableTimes[i] indicates the minute when the ith register will become available to help the next customer.
		//For example, suppose registerAvailableTimes[2] = 30.  Then at minute 29, register 2 is still busy helping some customer.
		//At minute 30, the customer at register 2 is no longer behing helped, and a new customer can now get help from register 2.
		int[] registerAvailableTimes = new int[NUM_REGISTERS];

        //create queue
        Queue<Customer> q = new LinkedList<Customer>();

        //the total time that each customer has spent waiting in the queue before successfully reaching a register
        int totalWaitTime = 0;

        //the total number of customers who have successfully reached a register
        int numCustomers = 0;

        for (int minute = 1; minute <= SIMULATION_TIME; minute++)
        {
			//INSERT CODE HERE
			//Use the customerArrives method to determine if a customer arrives at this particular minute.
			//If so, add a customer to the queue.



			//INSERT CODE HERE
			//Check each register.
			//  If the register is available and there are customer's waiting in the queue,
			//    1.  Remove the customer at the front of the queue.
			//    2.  Update the total number of customers who have successfully reached a register
			//    3.  Update the total time that each customer has spent waiting in the queue before successfully reaching a register
			//    4.  Update the time when this register will be available next.



        }
        System.out.println("Average waiting time = " + (double)totalWaitTime/numCustomers);
    }

    // Returns true if customer arrives given probability p
    private static boolean customerArrives(double p)
    {
        double randNum = Math.random();
        return randNum < p;
    }
}