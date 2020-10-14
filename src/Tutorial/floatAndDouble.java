package Tutorial;

public class floatAndDouble {

    public static void main(String[] args) {
        int myIntValue = 5;
        float myFloatValue = 5f;  // sau 5.25f
        //Orice numar care are "f" la sfarsit,stii ca are valoare de float.
        //Nu poti pune 5.4 deoarece ai variabila float si 5.4 e valoare de double.

        /*Rezolvare pentru valoarea de 5,4

        float myFloatValue =(float) 5.4;
        float myFloatValue = 5.4f; - Recomandat. Deoarece e mai clar. */

        double myDoubleValue = 5d;
        //orice numar care are "d" la sfarsit, stii ca are valoare de double.
        // 5d   - Stii ca 5 este double deoarece are "d"
        // 5.25 - Stii ca 5.25 este double deoarece are are zecimale (specifice double)

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Chiar daca ai 5d/5f. La SOUT, va fi cu zecimala.

        /*
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 2;
        double myDoubleValue = 5d / 2;
        ------
        myIntValue = 1
        myFloatValue = 2.5
        myDoubleValue = 2.5


        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        ------
        myFloatValue = 1.6666666
        myDoubleValue = 1.6666666666666667



        ////////   CHALLENGE   ///////

        Convert a given number of pounds to kilograms.
        1. Create a variable to store the number of pounds.
        2. Calculate the number of kilograms for the number above and store in a variable.
        3. Print the result.

        NOTESS: 1 pound is equal to 0.45359237 kilograms.*/

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);   //Kilograms = 90.718474

    }
}
