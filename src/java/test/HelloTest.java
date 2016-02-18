import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloTest {

    @Test
    public void testMe() {
        System.out.println("What am I going to say?");
        assertTrue(1 == 1);
    }

    @Test
    public void testYou() throws Exception {
        assertTrue("me".equals("me"));
    }
}