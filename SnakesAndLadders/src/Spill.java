import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spill {
    public static void main(String[] args) {
    Spill spill = new Spill();
    List<Spiller> spillere = new ArrayList<>(4);
    spillere.add(new Spiller("Andreas Bukspyttkjertelsen", 0, false, false));
    spillere.add(new Spiller("Ingunn Insulinsen", 0, false, false));
    spillere.add(new Spiller("Daniel Høyfett-prosentsen", 0, false, false));
    spillere.add(new Spiller("Børre Bruv", 0, false, false));
    Brett brett = new Brett(100);
    Terning terning = new Terning();


    spill.spillRunde(terning, brett, spillere);
    }

    public void spillRunde(Terning terning, Brett brett, List<Spiller> spillere) {
        int hvemBegynner = (int) (Math.random() * spillere.size());
        Spiller spiller = spillere.get(hvemBegynner);
        spiller.setTur(true);

        // Farger for å vise tydeligere i konsollen om spiller traff stige eller slange
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String RESET = "\u001B[0m";

        Map<Integer, Integer> flytt = new HashMap<>();
        flytt.put(18,9); //Slange
        flytt.put(67,45); //Slange
        flytt.put(99,50); //Slange

        flytt.put(11,20); //Stige
        flytt.put(51,65); // Stige
        flytt.put(79, 88); // Stige


        while(true) {
            int kast = terning.trill();
            int kastVerdi = kast;

        System.out.println("Spiller sin tur: " + spiller.getNavn());
        System.out.println("Triller terning....");

        System.out.println(spiller.getNavn() + " trilte " + kastVerdi);
        System.out.println("Flytter " + spiller.getNavn()+" fra: " + spiller.getPosisjon());

        spiller.setPosisjon(spiller.getPosisjon() + kast);

        if(spiller.getPosisjon() == brett.getStorrelse()){
            System.out.println(GREEN + "Gratulerer!\n"+spiller.getNavn()+" har vunnet spillet" + RESET);
            spiller.setVinner();
            break;
        } else if((spiller.getPosisjon()+kastVerdi) > brett.getStorrelse()){
            spiller.setPosisjon(spiller.getPosisjon()-kastVerdi);
            System.out.println("Til: " + spiller.getPosisjon());

        } else if (flytt.containsKey(spiller.getPosisjon())) {
            Integer til = flytt.get(spiller.getPosisjon()); // Sjekker posisjonen til slange/stige i forhold til spiller

            // Sjekker om spiller har truffet stige eller slange og oppdaterer posisjonen
            if (til > spiller.getPosisjon()) {
                System.out.println(spiller.getNavn() + GREEN + " traff en stige" + RESET + " på rute " + spiller.getPosisjon());
            } else {
                System.out.println(spiller.getNavn() + RED + " traff en slange " + RESET + " på rute " + spiller.getPosisjon());
            }

            spiller.setPosisjon(til);
            System.out.println(spiller.getNavn() + " ble flyttet til: " + spiller.getPosisjon());

        } else {
            System.out.println("Til: " + spiller.getPosisjon());
        }

            spiller.setTur(false);
            hvemBegynner = (hvemBegynner + 1) % spillere.size();
            spiller = spillere.get(hvemBegynner);
            spiller.setTur(true);

            System.out.println("-------------------------------------------------");
        }
    }
}
