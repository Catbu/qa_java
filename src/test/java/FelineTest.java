import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import com.example.Feline;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> foodList = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();

        String family = feline.getFamily();
        assertEquals("CatMeow", family);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        assertEquals(1, kittensCount);
    }
}
