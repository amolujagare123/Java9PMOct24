package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    // String into Date

    public static void main(String[] args) throws ParseException {

        String dateStr = "11/20/2024";

        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");


        Date date = sd.parse(dateStr);


        System.out.println("dateStr="+dateStr);
        System.out.println("date="+date);

        String dateStr0= "23-June-2016" ;
        //→ dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println("dateStr0="+dateStr0);
        System.out.println("date0="+date0);


        String dateStr1= "23 | June 16  8:34" ;
        //→ dd | MMMM yy hh:mm

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println("dateStr1="+dateStr1);
        System.out.println("date1="+date1);

        String dateStr2= "2016-06-23 | 8:34:23";
        //→ yyyy-MM-dd | hh:mm:ss

        String dateStr3= "Thursday 2016/06/23";
        //→ EEEE yyyy/MM/dd

    }
}
