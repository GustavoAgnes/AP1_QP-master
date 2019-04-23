import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2_Tests {
    Ex2 ex2 = new Ex2();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = formatter.parse;
    @Test
    public void testePositivo(){
        Assert.assertEquals(ex2.diaseg(28,02,2019),;
    }
