package Tests.org.duma;

public class CodeBlocksAndIfThenElseControlStatements {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000 ) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if(score < 1000){
            System.out.println("Your score was less than 1000");
        }else{
            System.out.println("Got here");
        }

        System.out.println("This was executed");


        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        //variabila "finalScore  afost creata in blocul de cod de mai sus
        //si va ramane in acel bloc de cod.
        //Nu poti sa folosesti variabila dintrun bloc de cod, in afara.
        //Dar se poate sa accesezi variabila din blocul de cod, dinafara.

        //int savedFinalScore = finalScore;   <-X_X

        //////////////////CHALENGE//////////

        /*
        Print out a second score on the screen with the following:
        score set to 10000
        levelCompleted set to 8
        bonus set to 200
        But make sure the first printout above still displays as well
         */

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(gameOver){
            int newFinalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + newFinalScore);
        }
    }
}
