package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastDate {

    public String FirstAndLastOfWeek() {
    StringBuilder stringBuilder=new StringBuilder();
    Calendar c = Calendar.getInstance();


     c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);

      DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        stringBuilder=stringBuilder.append(df.format(c.getTime()));
        for(int i = 0; i<6;i++) {
        c.add(Calendar.DATE, 1);
    }
        stringBuilder=stringBuilder.append("\n"+df.format(c.getTime()));
       return stringBuilder.toString();

    }
}
