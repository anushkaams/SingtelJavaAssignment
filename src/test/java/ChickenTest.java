import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.anushka.model.Bird;
import com.anushka.model.Chicken;
import com.anushka.model.behaviour.behaviourimpl.Cluck;

public class ChickenTest {
    @Test
    public void testSing(){
        Bird bird = new Chicken();
        bird.setSingable(new Cluck());
        String expected = "Cluck, cluck";
        assertEquals(bird.getSingable().sing(),expected);
    }
}
