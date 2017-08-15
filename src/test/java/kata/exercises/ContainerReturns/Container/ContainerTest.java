package kata.exercises.ContainerReturns.Container;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by djp4830 on 8/9/17.
 */
public class ContainerTest {

    @Test
    public void verifyBasicConstructor(){

        Container c = new Container("Round", true);

        Assert.assertNotNull(c);
        Assert.assertEquals("Round", c.getShape());
        Assert.assertTrue(c.isEmpty());

    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void expectedExceptionWithNullShape(){
        Container c = new Container(null, false);
    }

}