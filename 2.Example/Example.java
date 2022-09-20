import java.util.Date;
import java.awt.*;
import java.util.Arrays;
 
public class Example{
	public static void main(String[] args){

		//Print age & temperature
		//int age = 30;
		int temperature=20;
		//age = 35;
		System.out.println(temperature);
		
		//recapping to variable
		int myAge=30;
		int herAge=myAge;
		System.out.println(herAge);

		//primitive types
		byte age = 30;
		long viewsCount = 3_123_456_789L;
		float price = 10.99F;
		char letter = 'N';
 		boolean isEligible = false;
		System.out.println(letter + "\n"+ isEligible);
		
		//print Date
		Date now = new Date();
		System.out.println(now);
		
         	//independent variables
		byte x = 1;
   		byte y = x;
		x = 2;   
		System.out.println(y);

		//Memory Allocation
		Point point1 = new Point( 1,1);
		Point point2 = point1;
		point1.x = 2;
		System.out.println( point2 );
   
		//Strings
		String message = "   Hello World" + "!!";
		String messages = "c:\n\t \\Hii\\.. \"Hello\"";
	 	System.out.println(message.startsWith ("!!") +"\n"+ message.length() + "\n" + message.endsWith ("!!") + "\n" + message + "\n" + message.indexOf("sky"));
		System.out.println(message.replace("!" , "*"));
                System.out.println(message.toLowerCase());
		System.out.println(message.trim());
		System.out.println(messages);

		//Arrays
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		System.out.println(Arrays.toString(numbers));
		int[] numbers1 = {2,3,5,3,4};
		System.out.println(numbers1.length);

		//Array Sort
		Arrays.sort(numbers1); 
		System.out.println(Arrays.toString(numbers1));
		
		//Mulit dimensional Arrays  
		int[] [][] numbers2 = new int[2][2][2];
		numbers2[0][0][0]=1;
		System.out.println(Arrays.deepToString(numbers2));   
		int[][] numbers3 ={{1,3,4},{3,7,8},{4,9,8}};
		System.out.println(Arrays.deepToString(numbers3));
		
		//Final Float
		float PI = 3.14F;
		PI = 1;
		final float Pi = 3.25F;
		System.out.println(Pi);

		//Arithmetic Expressions
		int result = 10+3;
		int result1 = 10-3;
		int result2 = 10/3;
		int result3 = 10*3;
		System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3);
		
		//using double
		double results = (double)10/(double)3;
		System.out.println(results);
   
		int a = 1;
                //a -=  2;
		a +=  3;
		//a /=  2;
		//a *=  2;
		//int b = a++;
		System.out.println(a);

		int z = (10+3)*2;  
		System.out.println(z);

		//Implicit casting
		//byte>short>int>long>float>double
		short X =1;
		int Y=x+2;
		System.out.println(Y); 

		double c=1.1;
		int Z = (int)c+2;
 		System.out.println(Z);

		//String
		String m = "1";
	        double o = Double.parseDouble(m) + 2;
		System.out.println(o);
		
		//Math class
		//int results1 = Math.round(1.1F);
		//int results1 = (int)Math.floor(1.1F);
		int results1 = Math.max(1,2);
		System.out.println(results1);    
   
	}
}