import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.anushka.model.Bird;

/**
 * Unit test for Bird class
 */

public class BirdTest {

    Bird bird = new Bird();

    @Test
    public void testSing(){
        String expected = "I am Singing";
        assertEquals(bird.sing(),expected);
    }
}
