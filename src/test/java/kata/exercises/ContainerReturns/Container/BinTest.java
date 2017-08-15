package kata.exercises.ContainerReturns.Container;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by djp4830 on 8/10/17.
 */
public class BinTest {

    private Bin bin;

    @Before
    public void createBinFixture(){
        bin = new Bin("round", 50);
    }

    @Test
    public void verifyBinAcceptsContainerWhenBinIsNotFull(){
        //set item count below maxItems threshold
        bin.setItemCount(45);

        //verify that the isBinFull method logic accepts a container when the itemCount is below the maxItems threshold
        Assert.assertFalse("Item was not accepted", bin.isBinFull());

        //set itemCount over the maxItems threshold
        bin.setItemCount(51);

        //verify that the isBinFull method logic does not accept a container when the itemCount is over the maxItems threshold
        Assert.assertTrue("Item was accepted.", bin.isBinFull());
    }

    @Test
    public void verifyBinDoesNotAcceptContainerWhenBinIsFull(){
        //set itemCount over the maxItems threshold
        bin.setItemCount(51);

        //verify that the isBinFull method logic does not accept a container when the itemCount is over the maxItems threshold
        Assert.assertTrue("Item was accepted.", bin.isBinFull());
    }

    @Test
    public void verifyRejectWrongShape(){
        //create container object
        Container container = new Container("rock", true);

        //verify the bin won't accept an unacceptable shape
        Assert.assertFalse("Invalid container shape was accepted", (bin.acceptItem(container)));
    }

    @Test
    public void verifyRejectFullContainer(){
        //create a new "full container"
        Container fullContainer = new Container("round", false);

        //verify the bin will not accept a full container
        Assert.assertFalse("bin accepted a non empty container", bin.acceptItem(fullContainer));
    }
}
