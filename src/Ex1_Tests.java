import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Ex1_Tests {
    Ex1 ex1 = new Ex1();
    @Test
    public void testePositivo(){
        Assert.assertEquals(ex1.bruto(40,50),2000);
    }

    @Test
    public void testeExcedeHoras(){
        Assert.assertEquals(ex1.bruto(85,50),-1);
    }

    @Test
    public void testeExcedeVH(){
        Assert.assertEquals(ex1.bruto(40,130),-1);
    }
}
