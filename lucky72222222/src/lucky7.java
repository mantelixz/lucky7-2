import java.util.Random;

public class lucky7 {
    public static void main(String[] args) throws Exception {
        
        Random r = new Random();

        int rahat = 5;

        while (rahat > 0) {

            rahat = rahat -1;

        int luku1 = r.nextInt(11);
        int luku2 = r.nextInt(11);
        int luku3 = r.nextInt(11);

        System.out.println(luku1);
        System.out.println(luku2);
        System.out.println(luku3);

        int seiskat = 0;

        if (luku1 == 7) {
            seiskat ++;
        }
        if (luku2 == 7) {
            seiskat++;
        }
        if (luku3 == 7) {
            seiskat++;
        }
        if (seiskat == 1) {
            rahat = rahat + 3;
            System.out.println("Voitit 3 euroa!");
        }
        else if (seiskat == 2) {
            rahat = rahat +5;
            System.out.println("voitit 5 euroa!!");
        }
        else if (seiskat == 3) {
            rahat = rahat +10;
            System.out.println("VOITIT 10 EUROA!!!!");
        }
        else {
            System.out.println("Hävisit.");
        }

        System.out.println("Rahaa jäljellä: " + rahat + " euroa");
        System.out.println();
    }
    System.out.println("Rahat loppu. GAME OVER");

    }
}
