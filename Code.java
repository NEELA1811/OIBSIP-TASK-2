import java.util.Scanner;
import java.util.Random;
class Game
{
    public static void main(String[]args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("                   WELCOME TO NUMBER GUESSING GAME                          ");
            System.out.println("1.NEW GAME");
            System.out.println("2.VIEW RULES");
            System.out.println("3.EXIT");
            System.out.println("Please select one of the above options:");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    game();
                    break;
                case 2:
                    rules();
                    break;
                case 3:
                    System.out.println("------------------THANK YOU-------------");
                    break;
                default:
                {
                    System.out.println("----------INVALID OPTION ....TRY AGAIN!..-------------");
                }

                    
            }
        }
        }
    public  static void game()
    {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int no = rand.nextInt(100);
            int score=100;
            OUTER:
            for(int i=0;i<10;i++)
            {
                System.out.println("Enter your guess:");
                int guess=sc.nextInt();
                if(guess==no&&score>=50)
                {
                    System.out.println("HURRAY! YOU ARE accepted for next round....");
                    score=score+10;
                    System.out.println("Press 0 to continue next round");
                    int con=sc.nextInt();
                    if(con==0)
                    continue OUTER;
                    else
                    break;
                }
                else if(guess>no){
                    System.out.println(" LOWER..");
                    score=score-10;
                }
                else if(guess<no)
                {
                    System.out.println(" HIGHER...");
                    score=score-10;
                }
                else if(guess>100)
                {
                    System.out.println("INVALID NUMBER!");
                }
                else
                {
                    score=score+10;
                    if(score>=50)
                    {
                        continue OUTER;
                    }
                    else{
                        System.out.println("YOUR GUESS IS RIGHT BUT YOU ARE NOT ELIGIBLE FOR NEXT ROUND..");
                    break;
                    }
                }
            }
            System.out.println("YOUR FINAL SCORE IS:"+score);
        System.out.println("SRY..YOU HAVE FAILED TO GUESS.PLEASE TRY AGAIN....");
    }
}
    public static void rules()
    {
        System.out.println("1.YOU HAVE TEN ATTEMPTS.");
        System.out.println("IF YOU WIN IN YOUR FIRST TRY YOUR SCORES WILL BE 100 AND ACCEPTED FOR NEXT ROUND.");
        System.out.printkn("IF YOU WIN IN THE CONSECUTIVE ATTEMPTS AND YOUR SCORE IS >=50 THEN YOU ARE PROMOTED TO NEXT ROUND");
        System.out.println("IF YOU LOSE,SCORES WILL BE DECREASED FOR ATTEMPTS YOU LOSE .");
        System.out.println("THE GUESS SHOULD BE BETWEEN 0 TO 100.");
        System.out.println("SCORES WILL BE DECREASED FOR INVALID GUESSES ALSO.");

    }
}
