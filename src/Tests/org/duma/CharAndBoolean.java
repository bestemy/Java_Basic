package Tests.org.duma;

public class CharAndBoolean {

    public static void main(String[] args) {

        char myChar = 'D';
        // char - Poate stoca un numar (0-9),o litera
        // un caracter special(! @ # $...),
        // sau unicode.//https://unicode-table.com/en/#ipa-extensions

        char myChar1 = '\u00A9';
        System.out.println("Unicode output was: " + myChar1); //©


        boolean myBoolean = false;
        // boolean - Poate fi doar adevarat sau fals. true / false.


        /*//////CHALENGE///////

        1. Find the code for the registered symbol on the same line as the copyright symbol.
        2. Create a variable of type char and assign it the unicode value for that symbol.
        3. Display on screen.
         */

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol = " + registeredSymbol);

    }
}
