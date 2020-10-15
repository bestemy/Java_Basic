package Tutorial;

public class operators {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

   /*

           =    Simple assignement operator

           +	Addition	    Adds together two values	            x + y
           -    Sbtraction	    Subtracts one value from another	    x - y
           *	Multiplication	Multiplies two values	                x * y
           /	Division	    Divides one value by another	        x / y
           %	Modulus	        Returns the division remainder	        x % y
           ++	Increment	    Increases the value of a variable by 1	++x
           --	Decrement	    Decreases the value of a variable by 1	--x
    */
        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("result is now = " + result);
        result++;
        System.out.println("result is now = " + result);
        result--;
        System.out.println("result is now = " + result);

        result += 2;
        System.out.println("result is now = " + result);
        result *= 10;
        System.out.println("result is now = " + result);
        result -= 10;
        System.out.println("result is now = " + result);
        result /= 10;
        System.out.println("result is now = " + result);

        /////////

        /*
        Operator	Example	    Same As
           =	     x = 5	     x = 5
           +=	     x += 3	     x = x + 3
           -=	     x -= 3	     x = x - 3
           *=	     x *= 3	     x = x * 3
           /=	     x /= 3	     x = x / 3
           %=	     x %= 3	     x = x % 3
           &=	     x &= 3	     x = x & 3
           |=	     x |= 3	     x = x | 3
           ^=	     x ^= 3	     x = x ^ 3
           >>=     	 x >>= 3     x = x >> 3
           <<=     	 x <<= 3     x = x << 3


           ==       Equal to	                x == y
           !=    	Not equal	                x != y
           >	    Greater than                x > y
           <	    Less than	                x < y
           >=    	Greater than or equal to	x >= y
           <=    	Less than or equal to	    x <= y

                */

        boolean isAlien = false;
        if (isAlien == true) ;
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100);
        System.out.println("Greater than second top score and less then 100");

        ////////////

        /*
        Operator	   Name	           Description	                                          Example
           &&      	   and	    Returns true if both statements are true	              x < 5 &&  x < 10
           ||      	   or	    Returns true if one of the statements is true	          x < 5 || x < 4
           !	       not	    Reverse the result, returns false if the result is true	  !(x < 5 && x < 10)
         */

        if((topScore > 90) || (secondTopScore <= 90));
        System.out.println("One of these thest is true");

        /*
        int newValue = 50;
        if(newValue = 50);
        System.out.println("This is an error");
        */

        int newValue = 50;
        if(newValue == 50);
        System.out.println("This is true");

        boolean isCar = false;
        if(isCar = true);
        System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        if(wasCar = true);
        System.out.println("This is not supposed to happen");
        /*
        boolean isCar = false;
        if(isCar);
        System.out.println("This is not supposed to happen");

         ///////

           ?:       ternary operator
           Sau   condition ? consequent : alternative
           Sau   is this condition true ? yes : no


        /////////////  CHALENGE  ////////


        1. Create a double variable with the 20 value
        2. Create a second variable of type double with the value 100;
        3. Add both numbers up and multiply by 25
        4. Use the remainder operator ti figyre out the remainder from the sum of #3 divided by 40
        5. Write an "if" statement that displays a message "Total was over the limit"
           if the remaining #4 is equal to 20 or less.
         */

        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) *25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder is " + theRemainder);
        if(theRemainder <= 20)
        System.out.println("Total was over the limit");
    }
}