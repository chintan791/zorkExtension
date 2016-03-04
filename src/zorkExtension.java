import java.util.Random;
import java.util.Scanner;
public class zorkExtension {

	static int counter = 0;
	static Scanner darkly = new Scanner(System.in);
	static boolean treasureroom = false;
	//	static boolean entered = false;

	static int r1 = 1;
	static int r2 = 1;
	static int r3 = 1;
	static int r4 = 1;
	static int r5 = 1;
	static int r6 = 1;
	static int r7 = 1;
	static int r8 = 1;
    static int money; 
   static int totalAmount;
     
 static int add;
	
	

	static int roomcount = 0;	 // counts total no. of rooms entered (each room once)




	private static void roomDescribe(String where, String[] stuff, String directions)
	{
		System.out.println("You are in " + where);
		for (String thing : stuff) {
			System.out.println("You see " + thing);

		}
		System.out.println("Number of times room changed "+ counter);

		System.out.println("Number of rooms entered = " + roomcount);

		System.out.println("You can go " + directions);
		
		//  System.out.println("Random money is " + money);
		     
		   //   System.out.println("Total money is  " + total);
		
	  

	}


	// To calculate money collected once in each room entered

	private static void total(int add)
	{
	

		 Random random = new Random();
	     int money = 1 + random.nextInt(1000);

	     System.out.println("Found money in this room amounting to $ " + money);
	
	   totalAmount+= money ; 
	   
	   System.out.println("Total money collected is "+ totalAmount);
	}
	
	

	public static void room1()
	{

		Random rnd = new Random();

		int randomInt = 1 + rnd.nextInt(4);

		// System.out.println(randomInt);

	

		if (randomInt == 1)
			System.out.println("do not look back- a ghost is following you");

		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		String direct = " to the north (n) or the south (s)";
		counter++;
		
		

		if (r1 == 1)
		{

			roomcount ++;
			r1 = 0 ;
		
			total(add);
			
			
			
			 
		}

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room2();
			}


		} while (1==1);


  



	}

	public static void room2()
	{
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a phone";
		String direct = " to the east (e), the south (s) or the west (w)";

		counter++;

		if (r2==1)
		{
			//	c2 = 1;
			
			roomcount++;
			
			r2 = 0 ;
		
			total(add);
			add +=add;
			// money += money ; 
		}

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("e")) 
			{
				room4();
			} else if (choice.equals("w")) 
			{
				room3();
			} 
			else if (choice.equals("s")) 
			{
				room1();
			} 
		} while (1==1);
	}




	public static void room3()
	{
		String place = "the Library";
		String[] things = new String[1];
		things[0] = "spiders";
		String direct = " to the east (e) or the north (n) )";

		counter++;



		if (r3== 1)
		{
			
			roomcount += 1;
			r3 = 0 ;
			total(add);
			add+=add;
		}



		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room5();
			} else if (choice.equals("e")) 
			{
				room2();
			} 
		} while (1==1);
	}



	public static void room4()
	{
		String place = "the Kitchen";
		String[] things = new String[1];
		things[0] = "bats";
		String direct = " to the west (w) or the north (n)";

		counter++;


		if (r4==1)
		{
			
			roomcount += 1;
			r4 = 0 ;
			total(add);
		}
		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("w")) 
			{
				room2();
			} else if (choice.equals("n")) 
			{
				room7();
			} 
		} while (1==1);
	}



	public static void room5()
	{
		String place = "the dining room";
		String[] things = new String[1];
		things[0] = "dust and an empty box";
		String direct = " to the south (s)";


		counter++;


		if (r5==1)
		{
			
			roomcount += 1;
			r5 = 0 ;
			total(add);
		}

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room3();
			}  
		} while (1==1);
	}


	public static void room6()
	{
		String place = "the Vault";
		String[] things = new String[1];
		things[0] = "3 walking skeletons";
		String direct = " to the east (e)";


		counter++;


		if (r6==1)
		{
			
			roomcount += 1;
			r6 = 0 ;
			total(add);
		}

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();
			Random rnd = new Random();
			int randomInt = 1 + rnd.nextInt(4);

			System.out.println("The number is "+ randomInt);

			if (randomInt == 1 && choice.equals("e")) 



			{
				room8();
			}

			else 
			{
				room7();
			}



		} while (1==1);
	}



	public static void room7()
	{
		String place = "the parlor";
		String[] things = new String[1];
		things[0] = "treasure chest";
		String direct = " to the south (s) or to the west (w)";


		counter++;


		if (r7==1)
		{
			
			roomcount += 1;
			r7 = 0 ;
			total(add);
		}

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room4();
			} 
			else if (choice.equals("w")) 
			{
				room6();
			} 
		} while (1==1);
	} 


	public static void room8()
	{
		String place = "secret room";
		String[] things = new String[1];
		things[0] = "piles of gold";
		String direct = "to the west (w)";


		counter++;


		if (r8==1)
		{
			
			roomcount += 1;
			r8 = 0;
			total(add);
		}

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("w")) 
			{
				room6();
			} 


		} while (1==1);
	} 


	public static void main(String[] args) {
		room1();

	}

}

