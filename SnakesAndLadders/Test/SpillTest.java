import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SpillTest {

    private Spiller spiller;
    private Brett brett;
    private Map<Integer, Integer> flytt;


    @BeforeEach
    void SpillTester() {

        spiller = new Spiller("Test", 0, true, false);
        brett = new Brett(100);
        flytt = new HashMap<>();

        flytt.put(18,9); //Slange
        flytt.put(67,45); //Slange
        flytt.put(99,50); //Slange

        flytt.put(11,20); //Stige
        flytt.put(51,65); // Stige
        flytt.put(79, 88); // Stige

    }


    @Test
    void spillerFlytter(){
        spiller.setPosisjon(0);
        int kast = 4;

        spiller.setPosisjon(spiller.getPosisjon() + kast);
        assertEquals (4, spiller.getPosisjon());

    }
    @Test
    void spillVinner(){
        spiller.setPosisjon(100);
        spiller.setVinner();
        assertTrue(spiller.getVinner());
    }


    @Test
    void spillerTrefferSlange() {
        spiller.setPosisjon(17);
        int kast = 1;

        spiller.setPosisjon(spiller.getPosisjon() + kast);

        if (flytt.containsKey(spiller.getPosisjon())) {
            spiller.setPosisjon(flytt.get(spiller.getPosisjon()));
        }
            assertEquals(9, spiller.getPosisjon());

    }

    @Test
    void spillerTrefferStige() {
        spiller.setPosisjon(10);
        int kast = 1;

        spiller.setPosisjon(spiller.getPosisjon() + kast);

        if (flytt.containsKey(spiller.getPosisjon())) {
            spiller.setPosisjon(flytt.get(spiller.getPosisjon()));
        }
        assertEquals(20, spiller.getPosisjon());
    }


}
