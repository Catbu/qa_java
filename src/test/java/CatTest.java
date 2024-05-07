import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import com.example.Feline;
import com.example.Cat;

public class CatTest {

    @Test
    public void testGetFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));


        Cat cat = new Cat(mockFeline);
        List<String> foodList = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList);
    }

    @Test
    public void testGetSound() throws Exception {
        Feline mockFeline = mock(Feline.class);

        Cat cat = new Cat(mockFeline);
        String sound = cat.getSound();
        assertEquals("Meow", sound);
    }
}
