import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        //Setup string responses and boolean
        String playerAInput = "";
        String playerBInput = "";
        boolean done = false;
        String userResp = "";

        //Start scanning for input commands
        Scanner in = new Scanner(System.in);

        //Start

        do{
            //Get Player A and B input

            System.out.println("Player A, what is your choice?");
            if (in.hasNextLine()) {
                playerAInput = in.nextLine();
            } else {
                System.out.println("You have entered an invalid choice");
            }

            System.out.println("Player B, what is your choice?");
            if (in.hasNextLine()) {
                playerBInput = in.nextLine();
            } else {
                System.out.println("You entered an invalid choice");
            }


            //Assess responses from player A and then player B

            //Rock and Scissors
            if (playerAInput.equalsIgnoreCase("R")) {
                if (playerBInput.equalsIgnoreCase("S")) {
                    System.out.println("Rock beats scissors!");
                }
            }

            //Rock and Paper
            if (playerAInput.equalsIgnoreCase("R")) {
                if (playerBInput.equalsIgnoreCase("P")) {
                    System.out.println("Paper beats Rock!");
                }
            }

            //Rock and Rock
            if (playerAInput.equalsIgnoreCase("R")) {
                if (playerBInput.equalsIgnoreCase("R")) {
                    System.out.println("It's a tie!");
                }
            }

            //Paper and Paper
            if (playerAInput.equalsIgnoreCase("P")) {
                if (playerBInput.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie!");
                }
            }

            //Paper and Scissors
            if (playerAInput.equalsIgnoreCase("P")) {
                if (playerBInput.equalsIgnoreCase("S")) {
                    System.out.println("Scissors beats paper!");
                }
            }

            //Paper and Rock
            if (playerAInput.equalsIgnoreCase("P")) {
                if (playerBInput.equalsIgnoreCase("R")) {
                    System.out.println("Paper beats rock!");
                }
            }

            //Scissors and Scissors
            if (playerAInput.equalsIgnoreCase("S")) {
                if (playerBInput.equalsIgnoreCase("S")) {
                    System.out.println("Its a tie!");
                }
            }

            //Scissors and Paper
            if (playerAInput.equalsIgnoreCase("S")) {
                if (playerBInput.equalsIgnoreCase("P")) {
                    System.out.println("Scissors beats paper!");
                }
            }

            //Scissors and Rock
            if (playerAInput.equalsIgnoreCase("S")) {
                if (playerBInput.equalsIgnoreCase("R")) {
                    System.out.println("Rock beats scissors!");
                }
            }

            //Error check
            if(!playerAInput.equalsIgnoreCase("S" + "R" + "P")){
                System.out.println("You entered a invalid value.");
            }

            if(!playerBInput.equalsIgnoreCase("S" + "R" + "P")){
                System.out.println("You entered a invalid value.");
            }

            //Ask user to continue?
            System.out.println("Do you want to continue playing? [Y/N?]");
            if (in.hasNextLine()) {
                userResp = in.nextLine();
            } else {
                System.out.println("You have entered an invalid choice");
            }

            //Assess user response
            if (userResp.equalsIgnoreCase("Y")){
                done = false;
            }else if(userResp.equalsIgnoreCase("N")){
                done = true;
            }

        }while(!done);

    }
}
