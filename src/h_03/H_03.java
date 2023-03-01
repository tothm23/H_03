package h_03;

//import java.util.LinkedList;
/**
 *
 * @author Tóth Milán
 */
public class H_03 {

    public static void main(String[] args) {
        /*
        LinkedList<Double> hazi = new LinkedList<>();

        hazi.add(4.4);
        hazi.add(6.5);
        hazi.add(0, 2.3);
        hazi.add(0, 8.8);
        hazi.add(6.5);

        double osszeg = 0;
        for (int i = 0; i < hazi.size(); i++) {
            osszeg += hazi.get(i);
        }

        System.out.println("Összeg: " + osszeg);
        
        for (Double elem : hazi) {
            System.out.println(elem + ", ");
        }
        
        hazi.remove(3);
        hazi.set(3, 12.74);
         */

        //Tesztelés
        // Szökőév
        //System.out.println(szokoEv(1988));
        //System.out.println(szokoEv(1976));
        //System.out.println(szokoEv(1980));
        //System.out.println(szokoEv(1984));
        //System.out.println(szokoEv(1988));
        //System.out.println(szokoEv(1992));
        //System.out.println(szokoEv(1996));
        //System.out.println(szokoEv(2000));
        //System.out.println(szokoEv(2004));
        //System.out.println(szokoEv(2008));
        //System.out.println(szokoEv(2012));
        //System.out.println(szokoEv(2016));
        //System.out.println(szokoEv(2016));
        //System.out.println(szokoEv(2024));
        //System.out.println(szokoEv(1600));
        //System.out.println(szokoEv(2000));
        //System.out.println(szokoEv(2400));
        // Nem szökőév
        //System.out.println("\n" + szokoEv(1700));
        //System.out.println(szokoEv(1800));
        //System.out.println(szokoEv(1900));
        //System.out.println(szokoEv(2200));
        //System.out.println(szokoEv(2300));
        /*
        int szam = 123;
        for (int i = 0; i < 1000; i++) {
            if (szam % 2 == 0) {
                if (szam % 3 == 0) {
                    System.out.println("breakpoint");
                    break;
                }
                System.out.println("páros");
            } else {
                System.out.println("nem páros");
            }
        }
         */
        // Értékelések
        int szazalek = 72;
        if (szazalek >= 0 && szazalek <= 100) {
            if (szazalek < 41) {
                System.out.println("1");
            } else if (szazalek < 61) {
                System.out.println("2");
            } else if (szazalek < 76) {
                System.out.println("3");
            } else if (szazalek < 86) {
                System.out.println("4");
            } else {
                System.out.println("5");
            }
        }

        // if-else
        int szokoev = 1920;
        if (szokoev % 4 == 0) {
            if (szokoev % 100 == 0) {
                if (szokoev % 400 == 0) {
                    System.out.println("Szökőév");
                } else {
                    System.out.println("Nem szökőév");
                }
            } else {
                System.out.println("Szökőév");
            }
        } else {
            System.out.println("Nem szökőév");
        }

        // ternary
        boolean szokoeve = szokoev % 4 == 0 && !(szokoev % 100 == 0) || szokoev % 400 == 0;
        System.out.println(szokoeve);

    }

    /**
     * Megmondja egy évről, hogy szökőév-e (ternary operátorral)
     *
     * @param ev
     * @return
     */
    public static boolean szokoEv(int ev) {
        return ev % 4 == 0 && !(ev % 100 == 0) || ev % 400 == 0;
    }
}
