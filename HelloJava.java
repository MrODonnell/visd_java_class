public class HelloJava {
// for now we will just create a class that is the same name as the 
	public static void main(String[] args) {
		//most classes will have a method called "main"
		//this is the code that will run without being called
		
		String helloWorldVar = new String("Hello World");
		// this is a string assignment
		// a string is actually an object in java, so it needs to be have capital S
		// this example is a little over the top, but use a variable name that means something
		
		System.out.println(helloWorldVar);
		// the println will print the value enclosed in parentheses along with new line character
		 
		// When you declare a variable you must specify the type
		
		int firstInteger;
		double firstDouble;
		
		// you can then initialize the variable with a value
		
		firstInteger = 100;
		firstDouble = 3.14;
		
		System.out.println(firstInteger);
		System.out.println(firstDouble);
		
		// you can do these two steps in the same line
		
		int secondVar = 237;
		
		System.out.println("This is the second integer variable: " + secondVar);
		
		//similarly you can also use this for a string:
		
		String aString = "Hello again";
		System.out.println(aString);
		
		// a boolean is a primitive that is either "true" or "false"
		
		boolean yesOrNo = true;
		
		if(yesOrNo)
		{
			System.out.println("The expression is true");
		}
		
		//When you only have one line after an if 
		//(or other conditional) you do not need to
		//use brackets
		
		if(yesOrNo)System.out.println("The expression is still true");
		
		// there are 5 arithmetic expressions 
		// +, -, * for multiplication, / for division, % is a modulus
		
		// 2 + 2 is four
		int sum = 2 + 2;
		System.out.println(sum);
		
		// 4 - 2 is two
		int difference = 4 - 2;
		System.out.println(difference);
		
		// 4 * 2 is eight
		// 4 x 2 is WRONG
		int product = 4 * 2;
		System.out.println(product);
		
		// 16 / 8 = 2
		int quotient = 16 / 8;
		System.out.println(quotient);
		
		// this example demonstrates the use of a double 
		double dblQuotient = 7.0 / 3.0;
		System.out.println(dblQuotient);
		
		// The modulus operator returns the remainder after the numbers are divided 
		int modulus = 7 % 3;
		// because 7 divided by 3 would return 2 with a remainder of 1
		// this function will return 1
		System.out.println(modulus);
		
		// this will return two empty lines
		// backspace and an "n" is an "escape character"
		// that will print out a new line
		System.out.print("\n\n");
		
		// the equal sign is only used to assign a value to a variable
		// it is sometimes called the assignment operator
		// there are 5 more assignment operators:
		// -=, +=, *=, /=, and %=
		// here are the examples of this
		
		int a = 12;
		a -= 3;
		// 12 minus 3 is 9 so the result will be 9
		System.out.println("when a starts as 12; a -= 3; will yeild " + a);
		
		a = 12;
		a += 3;
		// 12 plus 3 is 15 so the result will be 15
		System.out.println("when a starts as 12; a += 3; will yeild " + a);
		
		a = 12;
		a /= 3;
		// 12 divided by 3 is 4 so the result will be 4
		System.out.println("when a starts as 12; a /= 3; will yeild " + a);
		
		a = 12;
		a *= 3;
		// 12 times 3 is 36 so the result will be 36
		System.out.println("when a starts as 12; a *= 3; will yeild " + a);
		
		a = 12;
		a %= 5;
		// 12 modulus 5 is 2 so the result will be 2
		System.out.println("when a starts as 12; a %= 5; will yeild " + a);
		
	
		// There are three operators used for logical comparison
		// ! is use for "not", && is used for "and", || is use for "or"
		// the vertical line character is called a "pipe";
		// and there are also 6 comparison operators 
		// these can be used along with logical operators to
		// control conditional statements
		
		if(!true)
		{
			//this line will not print
			System.out.println("This will never print");
		}
		else
		{
			System.out.println("This will!!");
		}
		
		//the above code also demonstrates the if/else 
		
		int x = 12;
		int y = 12;
		int z = 13;
		
		if(x == y)
		{
			// This is true!
			System.out.println("x is: " + x + " and y is: " + y);
		}
		
		System.out.println("x is: " + x + " and y is: " + y);
		if(x < y)
		{
			// This is NOT true and will not print!
			System.out.println("This will NOT print!");
		}
		
		if(x <= y)
		{
			// This is true and will print!
			System.out.println("x is: " + x + " and y is: " + y);
		}
		
		if(z > y)
		{
			// This is true!
			System.out.println("z is: " + z + " and y is: " + y);
		}
		
		if(x >= y)
		{
			// This is true!
			System.out.println("x is: " + x + " and y is: " + y);
		}
		
		if(x != z)
		{
			// This is true!
			System.out.println("x is: " + x + " and z is: " + z);
		}
		
		// this is a little tricky
		// z is NOT less than x
		//therefore the following WILL evaluate as true
		if(!(z < x))System.out.println("yes");
		// remember: if you only have one line after an "if" the { } are optional

		if((z > x)||(z < x))
		{
			//only one of these is true
			System.out.println("z is equal to: " + z + " and x is equal to: " + x);
		}
		
		if((z > x)&&(z < x))
		{
			//only one of these is true so it will NOT print
			System.out.println("z is equal to: " + z + " and x is equal to: " + x);
			System.out.println("This will NOT print");
		}
		
		// because of the order of operations this is the same:
		// I think the () help make it clearer
		if(z > x && z < x)
		{
			//only one of these is true so it will NOT print
			System.out.println("z is equal to: " + z + " and x is equal to: " + x);
			System.out.println("This will NOT print");
		}
		
		//There is a function called increment
		//it increases the value of an int by one
		// The value of x is now 12
		System.out.println("The value of x is: " + x);
		x++;
		System.out.println("After incrementing the value of x is: " + x);
		
		//this if very often used for a while loop
		
		while(x < 20)
		{
			System.out.println("The value of x is now: " + x);
			x++;
		}
		
	} // this bracket closes the main method

} // this bracket closes the class
