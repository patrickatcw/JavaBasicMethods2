public class MethodsContinued {

    public static void main(String[] args) {        //main method

        //hardcoding the values, maybe better for visual and organizing
        boolean gameOver = true;            //variables
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);  //assigning a var to the method result
        System.out.println("Your final score was " + highScore);

        gameOver = true;                    //variables
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);  //reassigning value to highScore
        System.out.println("Your final score was " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {    //new method
        //parameters variables are defined within quotes, actual values are listed variables above
        //void keyword means do not send any value back
        //but if you do want to return something;so change void to int, to return
        //value of int finalScore

        if (gameOver) {                                     //method logic if statement

            int finalScore = score + (levelCompleted * bonus);  //incorporating new variable for finalScore
            finalScore += 2000;
            return finalScore;          //returns for int change in method from void

        }
        return -1;  //if gameOver is not true
        //-1 is used to indicate an error, a invalid value or value not
        //found

    }

}
// no printout in calculateScore method