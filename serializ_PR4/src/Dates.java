import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Dates {
    int seconds;
    int minutes;
    int hours;
    int day;
    String month;
    int year;

    static GregorianCalendar gc = new GregorianCalendar();


    public Dates() {
        seconds = gc.get(Calendar.SECOND);
        minutes = gc.get(Calendar.MINUTE);
        hours =gc.get(Calendar.HOUR);
        day = gc.get(Calendar.DAY_OF_MONTH);
        month = gc.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        year = gc.get(Calendar.YEAR);
    }
    public void printOut3(){
        String month = new SimpleDateFormat("MMM").format(gc.getTime());
        System.out.println(hours + ":" + minutes + ":" + seconds + ", " + day + " " + month + " " + year);
    }
    public  void printOut5(){
        Locale b = new Locale("uk","UA");
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss, d MMMM yyyy",b);
        System.out.println(sdf.format(gc.getTime()));
    }
}
