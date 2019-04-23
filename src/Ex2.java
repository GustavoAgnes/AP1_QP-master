import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {
    public Date diaseg(int dd,int mm,int aa) throws ParseException {
        dd++;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String data = dd+"/"+mm+"/"+aa;
        Date date = formatter.parse(data);
        return date;
    }
}
