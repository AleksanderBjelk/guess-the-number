import java.util.Random;
import java.util.Scanner;


public class Main {
    //min metod för att evaluera om svaren är rätt eller fel och ger argument
    private static void myMethod(int minGissning, int randomNummer, int aGissningar){

        if ( minGissning < randomNummer ){
            System.out.println("Ditt nummer är för lågt, gissa högre!");
        }

        else if ( minGissning > randomNummer ){
            System.out.println("Ditt nummer är för högt, gissa lägre!");
        }

        else {
            System.out.println("Du fick rätt! Bra jobbat! Så här många gissningar tog det: " + aGissningar + ". Testa igen!" );
        }

    }

    public static void main(String[] args) {

        //skapar en random för att sen kunna få ett slumpmässigt tal mellan 0-100
        Random random = new Random();

        //skapar en scanner för att ta in användarens input
        Scanner scan = new Scanner(System.in);

        //100 ska vara det högsta som får användas och det får inte ändras
        final int MAX = 100;

        //svar är det nummer vi vill gissa oss fram till som är det slumpmässiga talet
        int svar = random.nextInt(MAX + 1);


        System.out.println("Vi spelar en gissningslek!");

        //Frågar spelaren om deras gissning
        System.out.println("Gissa ett nummer mellan 0-100: ");

        int gissningar = 1;

        //skapar en loop för att frågan och svar ska kunna genomföras flera tillfällen
        while(true){

            //mata in den gissningen användaren gör med scanner
            int gissning = scan.nextInt();

            //anropar min metod med evalueringen och argumenten
            myMethod(gissning, svar, gissningar);

            //Här börjar vi om loopen när svaret är rätt med ett nytt slumpmässigt nummer, om spelaren vill
            if ( gissning == svar ){
                System.out.println("Vill du fortsätta? Y/N");
                String spelaigen = scan.nextLine();
                spelaigen = scan.nextLine();

                //både y och Y ska funka, ny siffra, gissningar börjar om
                if (spelaigen.equals("y")|| spelaigen.equals("Y")) {
                    gissningar = 1;
                    svar = random.nextInt(MAX + 1) ;
                    System.out.println("kör igen, Gissa ett nummer mellan 0-100: "); }

                //i fall att spelaren säger nej så avslutas spelet
                else {
                    break;
                }
            }
            //gissningar ska öka i takt med ett utifrån försök från användaren
            else {
                gissningar++;
            }

        }
    }
}