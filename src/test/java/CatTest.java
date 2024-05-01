import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import com.example.Feline;
import com.example.Cat;

public class CatTest {

    @Test
    public void testGetFood() throws Exception {
        // Создаем мок объекта Feline
        Feline mockFeline = mock(Feline.class);
        // Указываем, что при вызове метода eatMeat() должен возвращаться определенный список еды
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        // Создаем экземпляр Cat с моком Feline
        Cat cat = new Cat(mockFeline);

        // Получаем список еды, который возвращает метод getFood()
        List<String> foodList = cat.getFood();

        // Проверяем, что полученный список еды соответствует ожидаемому
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList);
    }

    @Test
    public void testGetSound() throws Exception {
        // Создаем мок объекта Feline
        Feline mockFeline = mock(Feline.class);

        // Создаем экземпляр Cat с моком Feline
        Cat cat = new Cat(mockFeline);
        String sound = cat.getSound();
        assertEquals("Meow", sound);
    }
}
