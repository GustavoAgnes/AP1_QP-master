import org.junit.Assert;
import org.junit.Test;
import org.opentest4j.AssertionFailedError;

import java.text.ParseException;

public class Ex3_Tests {
    Ex3 ex3 = new Ex3();
    @Test
    public void testePositivo() throws ParseException {
        Assert.assertEquals(ex3.difHoras("08:40","18:40"),600);
    }

    @Test
    public void testeHoras() throws ParseException {
        Assert.assertNotEquals(ex3.difHoras("8:40","18:40"),10);
    }
}
