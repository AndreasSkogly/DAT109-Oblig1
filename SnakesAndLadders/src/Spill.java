import java.util.ArrayList;
import java.util.List;

public class Spill {
    public static void main(String[] args) {
    Spill spill = new Spill();
    List<Spiller> spillere = new ArrayList<>(4);
    spillere.add(new Spiller("Andreas Bukspyttkjertelsen", 0, false));
    spillere.add(new Spiller("Ingunn Insulinsen", 0, false));
    spillere.add(new Spiller("Daniel Høyfett-prosentsen", 0, false));
    spillere.add(new Spiller("Børre Bruv", 0, false));
    Brett brett = new Brett(100);
    Terning terning = new Terning(6);

    spill.spillRunde(terning, brett, spillere);
    }

    public void spillRunde(Terning terning, Brett brett, List<Spiller> spillere) {
        int hvemBegynner = (int) (Math.random() * spillere.size());
        Spiller spiller = spillere.get(hvemBegynner);
        spiller.setTur(true);


        while(true) {

            int kast = terning.trill();
            int kastVerdi = kast;

        System.out.println("Spiller sin tur: " + spiller.getNavn());
        System.out.println("Triller terning....");

        System.out.println(spiller.getNavn() + " trilte " + kastVerdi);
        System.out.println("Flytter "+spiller.getNavn()+" fra: " + spiller.getPosisjon());

        spiller.setPosisjon(spiller.getPosisjon() + kast);


        if(spiller.getPosisjon() == 100){
            System.out.println("Gratulerer!\n"+spiller.getNavn()+" har vunnet spillet");
            break;
        } else if((spiller.getPosisjon()+kastVerdi) > 100){
            spiller.setPosisjon(spiller.getPosisjon()-kastVerdi);
        } else {
            System.out.println("Til: " + spiller.getPosisjon());
        }

            spiller.setTur(false);
            hvemBegynner = (hvemBegynner + 1) % spillere.size();
            spiller = spillere.get(hvemBegynner);
            spiller.setTur(true);

        }
    }
}
