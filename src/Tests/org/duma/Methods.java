package Tests.org.duma;

public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }

        calculateScore(true, 800, levelCompleted, bonus);

        calculateScore(true, 1000, 8, 200);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        //Daca creezi o metoda, si definesti parametrii cu tipul si numele,
        //nu mai trebuie sa le definesti in metoda


//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        return  finalScore;
        } else {
            return -1;
        }
    }
}
