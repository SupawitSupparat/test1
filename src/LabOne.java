
	import java.util.Scanner;
	import java.awt.Font;

	public class TripSwitch{
		 public static void main(String[] args)
		    {
			 Scanner input = new Scanner(System.in);
		       int x,y,z,a=0,b=0,c=0;
			 System.out.println("Welcome !");
			 System.out.println("Please choose your vacation :\n");
			 
			 
			 System.out.println("Destination");
			 System.out.println("\t1.Nakhon Sri Thammarat(3000 Baht)");
			 System.out.println("\t2.Chiang Mai(4000 Baht)");
			 System.out.println("\t3.Chiangrai(3800 Baht)"); 
			 System.out.println("\t4.Krabi(2500 Baht)");
			 System.out.println("\t5.Phuket(3500 Baht)");
			 System.out.println("\t6.HuaHin(3200 Baht)");
			 System.out.println("\t7.Surat Thani(2800 Baht)");
			 
			 
			 System.out.println("Special food");
			 System.out.println("\t1.Soup(120 Baht)");
			 System.out.println("\t2.Hamburger(150 Baht)");
			 System.out.println("\t3.Pizza(300 Baht)");
			 System.out.println("\t4.Noodle(100 Baht)");
			 System.out.println("\t5.Steak(199 Baht)"); 
			 System.out.println("\t5.Ramen(210 Baht)"); 
			 System.out.println("\t6.Icecream(99 Baht)");
			 
			 System.out.println("Activity");
			 System.out.println("\t1.Swimming(150 Baht)");
			 System.out.println("\t2.Football(100 Baht)");
			 System.out.println("\t3.Diving(200 Baht)");
			 System.out.println("\t4.Racing(120 Baht)");
			 System.out.println("\t5.Tennis(110 Baht)");
			 System.out.println("\t6.Watching movie(90 Baht)");
			 
			 System.out.print("Choose destination: ");
			 x=input.nextInt();

			 System.out.print("Choose special food: ");
			 y=input.nextInt();
			 System.out.print("Choose activity: ");
			 z=input.nextInt();
			 
			 System.out.println("\nYour order and total price:");
			 
			switch(x){
			case 1:System.out.println("Nakhon Sri Thammarat");
			 a=3000;break;
			case 2:	 System.out.println("Chiang Mai");
			 a=4000;break;
			case 3 : System.out.println("Chiangrai");
			 a=3800;break;
			case 4: System.out.println("Krabi");
				 a=2500; break;
			case 5 : System.out.println("Phuket");
			a=3500;break;
			case 6: System.out.println("HuaHin");
			a=3200;break;
			case 7:System.out.println("Surat Thani");
			a=2800;break;
			case -1:y=0;
			z=0;
			System.out.println("Error! No selected destination.");
			}
			switch(y){
			case 1:	System.out.println("Soup"); 
			b=120;break;
			case 2:System.out.println("Hamburger"); 
			b=150;break;
			case 3:System.out.println("Pizza");
			b=300;break;
			case 4:System.out.println("Noodle"); 
			b=100;break;
			case 5:System.out.println("Steak");
			b=100;break;
			case 6: System.out.println("Ramen");
			b=210;break;
			case 7: System.out.println("Icecream"); 
			b=99;break;
			case -1: System.out.println("None");break;
			}
			
			switch(z){
			case 1:System.out.println("Swimming");
			c=150;break;
			case 2:System.out.println("Football");
			c=100;break;
			case 3:System.out.println("Diving");
			c=200;break;
			case 4:System.out.println("Racing");
			c=120;break;
			case 5: System.out.println("Tennis");
			c=110;break;
			case 6: System.out.println("Watching movie")
			;c=90;break;
			case -1:System.out.println("None");break;
			}
			
			
			if(x!=-1){
			 System.out.print(a+b+c+" Bath");
			}
		    }}
				
		    
		    
		    
		    
		