import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        //Setup string responses and boolean
        String playerAInput = "";
        String playerBInput = "";
        boolean done1 = false;
        boolean done2 = false;
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
                    done1 = true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Rock and Paper
            if (playerAInput.equalsIgnoreCase("R")) {
                if (playerBInput.equalsIgnoreCase("P")) {
                    System.out.println("Paper beats Rock!");
                    done1 = true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Rock and Rock
            if (playerAInput.equalsIgnoreCase("R")) {
                if (playerBInput.equalsIgnoreCase("R")) {
                    System.out.println("It's a tie!");
                    done1= true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Paper and Paper
            if (playerAInput.equalsIgnoreCase("P")) {
                if (playerBInput.equalsIgnoreCase("P")) {
                    System.out.println("It's a tie!");
                    done1 = true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Paper and Scissors
            if (playerAInput.equalsIgnoreCase("P")) {
                if (playerBInput.equalsIgnoreCase("S")) {
                    System.out.println("Scissors beats paper!");
                    done1 = true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Paper and Rock
            if (playerAInput.equalsIgnoreCase("P")) {
                if (playerBInput.equalsIgnoreCase("R")) {
                    System.out.println("Paper beats rock!");
                    done1 = true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Scissors and Scissors
            if (playerAInput.equalsIgnoreCase("S")) {
                if (playerBInput.equalsIgnoreCase("S")) {
                    System.out.println("Its a tie!");
                    done1 = true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Scissors and Paper
            if (playerAInput.equalsIgnoreCase("S")) {
                if (playerBInput.equalsIgnoreCase("P")) {
                    System.out.println("Scissors beats paper!");
                    done1 = true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Scissors and Rock
            if (playerAInput.equalsIgnoreCase("S")) {
                if (playerBInput.equalsIgnoreCase("R")) {
                    System.out.println("Rock beats scissors!");
                    done1 = true;
                } else {
                    System.out.println("You entered an invalid value.");
                }
            }else{
                System.out.println("You entered an invalid value.");
            }

            //Ask user to continue?
            System.out.println("Do you want to continue playing? [Y/N?]");
            if (in.hasNextLine()) {
                userResp = in.nextLine();
            } else {
                System.out.println("You have entered an invalid choice");
            }

            //Assess user response
            if(!done1)
            {
                if(userResp.equalsIgnoreCase("N"))
                {
                    done2 = true;
                }else if(userResp.equalsIgnoreCase("Y"))
                    done2 = false;
                }

        }while(!done2);

    }
}
