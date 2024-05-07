import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;

public class LionTest {

    @Test
    public void testGetFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getFood("Predator")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Male", mockFeline);
        List<String> foodList = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList);
    }

    @Test
    public void testGetKittens() throws Exception {
        Feline mockFeline = Mockito.mock(Feline.class);
        Mockito.when(mockFeline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Male", mockFeline);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void testDoesHaveManeForMaleLion() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lionWithMane = new Lion("Male", mockFeline);

        assertEquals(true, lionWithMane.doesHaveMane());
    }

    @Test
    public void testDoesHaveManeForFemaleLion() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lionWithoutMane = new Lion("Female", mockFeline);

        assertEquals(false, lionWithoutMane.doesHaveMane());
    }

}
