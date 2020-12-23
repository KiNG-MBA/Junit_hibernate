import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static jdk.nashorn.internal.runtime.JSType.toInteger;

@RunWith(JUnit4.class)
public class TestStringToInt {
    @Test
    public void testInteger() {
        Assert.assertEquals(2929, toInteger("2929"));
    }

    @Test
    public void testInteger1() {
        Assert.assertEquals(1253, toInteger("123"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInteger2() {
        Integer result = StringToInteger.stringToInt("okij456");
        Assert.assertEquals(0,result.intValue());
    }

    @Test
    public void testInteger3() {
        Integer result = StringToInteger.stringToInt("okij456");
        Assert.assertEquals(0, result.intValue());

    }
}
