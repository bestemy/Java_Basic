package Tutorial;

public class dataTypePrimitive {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue =  2_147_483_647;

        // byte has a width of 8
        byte myMinByeValue =  -128;
        byte myMaxByteValue =  127;
        byte myNewByteValuea =(byte) (myMaxByteValue/2);

        //Nu poti pune "/2" deoarece 2 este integer.
        //Pentru rezolvare, se foloseste "casting"(declarare) acel "(byte)"
        //si va fi: Java, vreau sa tratezi ce e dupa mine,ca fiind byte

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue =  32767;
        short MyNewShortValue = (short) (myMinShortValue/2);

        // La Short se va folosii la fel,(short).

        // long has a width of 64
        long myMinLongValuea = -9_223_372_036_854_775_808L;   // "L" sau "l"
        long myMaxLongValuea = 9_223_372_036_854_775_807L;



        /////// CHALLENGE ///////

        /*
        1. Create a byte variable and set it to any valid byte number.
        2. Create a short variable and set it to any valid short number.
        3. Create a int variable and set it to any valid int number.
        4. create a variable of type long, and make it equal to
        50000 + 10 times the sum of the byte, plus the short plus the int.
         */

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        //long accepta celelalte tipuri de variabile.

        short shortTotal = (short) (50000 + 10 * (byteValue + shortValue + intValue));
        //Dar daca ar trebui sa faem pentru short(shortTotal),
        // va trebuii sa declaram(casting) "(short)" ca vrem sa le ia ca fiind short

        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);

    }
}
