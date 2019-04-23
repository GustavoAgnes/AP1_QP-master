import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex3 {
    public long difHoras(String hora1, String hora2) throws ParseException {

    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    Date date1 = format.parse(hora1);
    Date date2 = format.parse(hora2);
    long difference = date2.getTime() - date1.getTime();
    difference = TimeUnit.MILLISECONDS.toMinutes(difference);
    return difference;
    }
}
