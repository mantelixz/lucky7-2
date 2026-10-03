import java.util.Random;
public class lucky7 {
    public static void main(String[] args) throws Exception {
        
        Random r = new Random();

        int luku1 = r.nextInt(11);
        int luku2 = r.nextInt(11);
        int luku3 = r.nextInt(11);

        System.out.println(luku1);
        System.out.println(luku2);
        System.out.println(luku3);

        if (luku1 == 7) {
            System.out.println("Voitit!!");
        } else if (luku2 == 7) {
            System.out.println("Voitit!!");
        } else if (luku3 == 7) {
            System.out.println("Voitit!!");
        } else {
            System.out.println("Hävisit");
        }
    }
}
