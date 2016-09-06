package odonnell;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
	import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		Finch myFinch = new Finch();
		int red, blue, green;
		String turns = "";
		while(myFinch.isBeakUp()== false)
		{
			System.out.print("Direct: Should I turn left, right, stop, go, or back??");
			
			turns = scan.nextLine();
			while (!(turns.equalsIgnoreCase("Right")||turns.equalsIgnoreCase("Left")||turns.equalsIgnoreCase("stop")||turns.equalsIgnoreCase("go")||turns.equalsIgnoreCase("back")))
			{
					System.out.print("That's not valid! Should I turn left, turn right, stop, go, or back? ");
					turns = scan.nextLine();
			}
			if (turns.equalsIgnoreCase("Right"))
				myFinch.setWheelVelocities(125,0,500);
			else if (turns.equalsIgnoreCase("Left"))
				myFinch.setWheelVelocities(0,125,500);
			else if (turns.equalsIgnoreCase("go"))
				myFinch.setWheelVelocities(125,125,500);
			else if (turns.equalsIgnoreCase("back"))
				myFinch.setWheelVelocities(-125,-125,500);
			else 
				myFinch.setWheelVelocities(0,0);
				
			for (int x = 1; x <= 2; x++)
			{
				red = (int)(Math.random()*255);
				blue = (int)(Math.random()*255);
				green = (int)(Math.random()*255);
				myFinch.setLED(red, blue, green);
			}
		}
		
		myFinch.quit();
	}	
}

