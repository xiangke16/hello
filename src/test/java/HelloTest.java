import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloTest {
    String user = "me";

    @Test
    public void testMe() {
        System.out.println("What am I going to say?");
        assertTrue(1 == 1);
    }

    @Test
    public void testYou() throws Exception {
        String you = "you21";
        assertTrue(you.equals(you));
    }

    @Test
    public void testReport() {
        assertTrue(12 == 12);
    }
}