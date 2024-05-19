import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAddNumber() {
        Main.addNumber(5); // Assuming initial values are 0
        assertEquals(5, Main.min);
        assertEquals(5, Main.max);
        assertEquals(5, Main.sum);
        assertEquals(1, Main.mult);
    }

    @Test
    public void testMultipleNumbers() {
        Main.readNumbers("smallInput.txt"); // Assuming smallInput.txt has numbers 1, 2, 3
        assertEquals(1, Main._min());
        assertEquals(3, Main._max());
        assertEquals(6, Main._sum());
        assertEquals(6, Main._mult());
    }

    @Test(expected = IOException.class)
    public void testReadNumbersException() throws Exception {
        Main.readNumbers("nonExistentFile.txt");
    }

    
}
