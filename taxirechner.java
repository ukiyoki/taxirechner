// Rechner für die Taxieinnahmen

import java.util.Scanner;

public class taxirechner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viele Arbeitstage hattest du? ");

        int arbeitstage = scanner.nextInt();
        double gesamt = 0.0;

        for (int j = 1; j <= arbeitstage; j++) {

            System.out.println("<Tag" + j + ">");

            System.out.print("Verdienst (Barzahlung, summiert): ");
            double verdienstnormal = scanner.nextDouble();
            gesamt += verdienstnormal;
            
            System.out.print("Wie viele Uber Fahrten hattest du?");
            int anzahluber = scanner.nextInt();
            double summeuber;
            summeuber = 0.0;

            
                for (int i = 1; i <= anzahluber; i++){
                    System.out.println("Uberfahrt: " + i );
                    double verdiensttag = scanner.nextDouble(); 
                    summeuber += verdiensttag;
                }
            
            gesamt += (summeuber - (summeuber*0.15));
            
            System.out.print("Wie viele FreeNow Fahrten hattest du?");
            int anzahlfreenow = scanner.nextInt();
            double summefreenow;
            summefreenow = 0.0;

            
                for (int i = 1; i <= anzahlfreenow; i++){
                    System.out.println("FreeNowfahrt: " + i );
                    double verdiensttag = scanner.nextDouble(); 
                    summefreenow += verdiensttag;
                }
            

            gesamt += (summefreenow - (summefreenow*0.15));

            System.out.print("Wie viele Bolt Fahrten hattest du?");
            int anzahlbolt = scanner.nextInt();
            double summebolt;
            summebolt = 0.0;

           
                for (int i = 1; i <= anzahlbolt; i++){
                    System.out.println("Boltfahrt: " + i );
                    double verdiensttag = scanner.nextDouble(); 
                    summebolt += verdiensttag;
                }
            

            gesamt += (summebolt - (summebolt*0.13));

            System.out.print("Wie viele EC-Karten Bezahlungen hattest du?");
            int anzahlec = scanner.nextInt();
            double summeec;
            summeec = 0.0;

            
                for (int i = 1; i <= anzahlec; i++){
                    System.out.println("EC-Bezahlung: " + i );
                    double verdiensttag = scanner.nextDouble(); 
                    summeec += verdiensttag;
                }
            

            gesamt += (summeec - (summeec*0.0139));
        }

        
        scanner.close();

        double verdienst;
        verdienst = gesamt*0.47;

        System.out.printf("Du hast %.2f Euro verdient!\n", verdienst);

    }
}
