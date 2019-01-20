
public class MiniVan {

	public static String miniVanDoors(String Input)
	/*
	 * Input goes Dashboard Left, Dashboard Right, child lock, master lock
	 * Left Inside Handle, Left Outside Handle, Right Inside Handle, Right Outside Handle, Gear shift
	 */
	{
		boolean lockedDoors = false;  //declaration of variables used to determine which doors open
		boolean childLock = false;
		boolean leftDoorOpenInside = false;
		boolean leftDoorOpenOutside = false;
		boolean rightDoorOpenOutside = false;
		boolean rightDoorOpenInside = false;
		boolean rightDoorOpens = false;
		boolean leftDoorOpens = false;
		if (Input.charAt(8) != 'P'|| Input.charAt(3) == '1') //checking to see if masterlock or car is in wrong gear
		{
			lockedDoors = true;
		}
		if (Input.charAt(0) == '1' || Input.charAt(5) == '1')  //checking to see if outside door handle or dashboard is pressed for the left
		{
			leftDoorOpenOutside = true;
		}
		if (Input.charAt(1) == '1' || Input.charAt(7) == '1') //checking to see if outside door handle or dashboard is pressed for the right
		{
			rightDoorOpenOutside = true;
		}
		if (Input.charAt(2)== '1') //checking childlock
		{
			childLock = true;
		}
		if (Input.charAt(4) == '1') //checking inside door handle for left
		{
			leftDoorOpenInside = true;
		}
		if (Input.charAt(6) =='1') //checking inside door handle for right
		{
			rightDoorOpenInside = true;
		}
		if (lockedDoors == false)  //checking variables. if the doors are locked via earlier, doors stay closed, otherwise, it continues
		{
			if (rightDoorOpenOutside == true)  //opens right door if the dash or outside handle is pulled
			{
				rightDoorOpens = true;
			}
			if (leftDoorOpenOutside == true)  // opens left door if outside handle or dash is used
			{
				leftDoorOpens = true;
			}			
			if ((childLock == false) && (rightDoorOpenOutside == false)) //makes sures child lock is off and the door already isn't opened. then opens the door if inside handle is pulled
			{
				if(rightDoorOpenInside == true)
				{
					rightDoorOpens = true;
				}	
			}
			if ((childLock == false) && (leftDoorOpenOutside == false)) //checks child lock and makes sure door isn't already opened. then opens door if inside is pulled.
			{
				if(leftDoorOpenInside == true)
				{
					leftDoorOpens = true;
				}	
			}
		}
		if ((leftDoorOpens == false) && (rightDoorOpens == false)) //checks what doors are open and then returns the appropriate statement
		{
			String bothClosed = "Both Doors Stay Closed.";
			return bothClosed;
		}
		else if ((leftDoorOpens == true) && (rightDoorOpens == true))
		{
			String bothOpen = "Both Doors Open";
			return bothOpen;
		}
		else if ((leftDoorOpens == true) && (rightDoorOpens == false))
		{	
			String leftOpened = "Left Door Opens";
			return leftOpened;
		}
		else
		{	
			String rightOpened = "Right Door Opens";
			return rightOpened;
		}
	}
	
	
	public static void main(String[] args) 
	{
		String whichDoor = miniVanDoors("11000000P"); // these are test cases
		String whichDoor2 = miniVanDoors("00101010P"); //they are dashboard controls, child look, masterlock, inner doorhandles
		String whichDoor3 = miniVanDoors("00101001P"); // outer doorhandles, and gear of the car.
		String whichDoor4 = miniVanDoors("00101010D");
		String whichDoor5 = miniVanDoors("11010000P");
		System.out.println(whichDoor);
		System.out.println(whichDoor2);
		System.out.println(whichDoor3);
		System.out.println(whichDoor4);
		System.out.println(whichDoor5);
	}

}
