import java.util.Scanner;

public class javaAdd
{
	public static void main(String args[])
	{
		float a,b,res;
		char choice,ch;
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("1 to add");
			System.out.println("2 to subtract");
			System.out.println("3 to exit");
			System.out.println("Enter choice ");
			choice = scan.next().charAt(0);
			switch(choice)
			{
				case '1' : System.out.print("enter 2 numbers : ");
					   a = scan.nextFloat();
					   b = scan.nextFloat();
					   res = a+b;
					   System.out.println(res);
					   break;
				case '2'  : System.out.print("enter 2 numbers : ");
					   a = scan.nextFloat();
					   b = scan.nextFloat();
					   res = a*b;
					   System.out.println(res);
					   break;
				case '3' : System.exit(0);
					   break;
				default  : System.out.println("invalid");
					   break;
				
			}
			}while(choice!=2);
			
		
	}
}
