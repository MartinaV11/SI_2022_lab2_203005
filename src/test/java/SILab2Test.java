import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
@Test
    void everyBranchTest(){
        List<String> slucaj1 =  List.of();
        List<String> slucaj2 = List.of("0", "#");
        //List<String> slucaj3= List.of("")

        IllegalArgumentException prazna, neKvadratna;

        prazna= assertThrows(IllegalArgumentException.class, () -> SILab2.function(slucaj1));
        assertTrue(prazna.getMessage().contains("Dolzinata na listata treba da e pogolema od 0"));

        neKvadratna=assertThrows(IllegalArgumentException.class, () -> SILab2.function(slucaj2));
        assertTrue(neKvadratna.getMessage().contains("Dolzinata na listata mora da e kvadratna matrica"));
    }

}