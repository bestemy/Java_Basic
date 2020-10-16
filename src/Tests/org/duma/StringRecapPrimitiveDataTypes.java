package Tests.org.duma;

public class StringRecapPrimitiveDataTypes {

    public static void main(String[] args) {
        /*
        byte
        short
        int
        long
        float
        double
        char
        boolean
         */


        String myString = "This is a string";
        // String - Un sir de caractere.

        System.out.println("myString is equal to: " + myString);
        myString = myString + ",and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString= myString + " \u00A9 2015";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);   // 250.5549.95
        //Chiar daca sunt numere, in Strign vor fi tratate doar ca text.
        //String nu suporta operatii de calcul.

        String lastString = "10";
        int myInt = 50;
        lastString= lastString + myInt;
        System.out.println("LastString is equal to " + lastString);  // 1050
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);  //1050120.47

        /*

        Chiar daca are cuvant rezervat "Sting" si ii poti da valoare,
        String nu este un tip da data primitiv. String este o clasa si este tratat diferit.

         */

    }
}