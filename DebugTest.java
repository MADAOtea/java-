import java.util.Scanner;
public class DebugTest{
	public static void main(String[] args){
		String s = "";
		char c = ' ';
		Scanner keyboard = new Scanner(System.in);
		Boolean invalidKey;
		do
		{
		  System.out.println("Enter 'A' for option A or 'B' for option B.");
		  s = keyboard.next();
		 // System.out.println("String s = " + s);
  		  s = s.toLowerCase();
		//  System.out.println("Lowercase s = " + s);
  	          //c = s.substring(0,1);
		  c = s.charAt(0);
		//  System.out.println("c = " + c);
		//if ( c == 'a')
   			//break;     
   		//if (c == 'b')
			//break;
		//System.out.println("c != 'a' is " + (c != 'a'));
   		//System.out.println("c != 'b' is " + (c != 'b'));
   		//System.out.println("(c != 'a') || (c != 'b')) is "+ ((c != 'a') || (c != 'b')));
		if (c == 'a')
			invalidKey = false;
		else if (c == 'b')
			invalidKey = false;
		   else
			invalidKey = true;

		}while (invalidKey);
	}
}