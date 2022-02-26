import org.junit.Assert;
import org.junit.Test;

public class ThingTest {

    @Test
    public void testThingName() {
        Thing thing = new Thing();
        thing.setName("Thing1");
        Assert.assertEquals(thing.getName(), "Thing1");
    }
}
