package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sydney
        TextView tz = findViewById(R.id.sydeny);
        Calendar calendar6=Calendar.getInstance();
        SimpleDateFormat s6 = new SimpleDateFormat("HH:mm:ss");
        s6.setTimeZone(TimeZone.getTimeZone("Australia/NSW"));
        tz.setText(s6.format(calendar6.getTime()));
        //beijing
        TextView tz1 = findViewById(R.id.bei);
        Calendar calendar1=Calendar.getInstance();
        SimpleDateFormat s1 = new SimpleDateFormat("HH:mm:ss");
        s1.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        tz1.setText(s1.format(calendar1.getTime()));
        //bangkok
        TextView tz2 = findViewById(R.id.bang);
        Calendar calendar2=Calendar.getInstance();
        SimpleDateFormat s2 = new SimpleDateFormat("HH:mm:ss");
        s2.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
        tz2.setText(s2.format(calendar2.getTime()));
        //Paris
        TextView tz3 = findViewById(R.id.pars);
        Calendar calendar3 = Calendar.getInstance();
        SimpleDateFormat s3 = new SimpleDateFormat("HH:mm:ss");
        s3.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        tz3.setText(s3.format(calendar3.getTime()));
        //LONDON
        TextView tz4 = findViewById(R.id.lon);
        Calendar calendar4 = Calendar.getInstance();
        SimpleDateFormat s4 = new SimpleDateFormat("HH:mm:ss");
        s4.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        tz4.setText(s4.format(calendar4.getTime()));
        //Tokyo
        TextView tz5 = findViewById(R.id.tok);
        Calendar calendar5 = Calendar.getInstance();
        SimpleDateFormat s5 = new SimpleDateFormat("HH:mm:ss");
        s5.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        tz5.setText(s5.format(calendar5.getTime()));


    }

    public void button_onClick(View view){
        TextView tz1 = findViewById(R.id.bei);
        TextView tz2 = findViewById(R.id.bang);
        TextView tz3 = findViewById(R.id.pars);
        TextView tz4 = findViewById(R.id.lon);
        TextView tz5 = findViewById(R.id.tok);
        TextView tz = findViewById(R.id.sydeny);
        DateFormat outputformat=new SimpleDateFormat("hh:mm:ss aa");

        //beijing
        Calendar calendar1=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        tz1.setText(outputformat.format(calendar1.getTime()));
        //bangkok
        Calendar calendar2=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
        tz2.setText(outputformat.format(calendar2.getTime()));
        Calendar calendar3=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        tz3.setText(outputformat.format(calendar3.getTime()));
        Calendar calendar4=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        tz4.setText(outputformat.format(calendar4.getTime()));
        Calendar calendar5=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        tz5.setText(outputformat.format(calendar5.getTime()));
        Calendar calendar6=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Australia/NSW"));
        tz.setText(outputformat.format(calendar6.getTime()));
    }


    public void button3_onClick(View view){
        TextView tz1 = findViewById(R.id.bei);
        TextView tz2 = findViewById(R.id.bang);
        TextView tz3 = findViewById(R.id.pars);
        TextView tz4 = findViewById(R.id.lon);
        TextView tz5 = findViewById(R.id.tok);
        TextView tz = findViewById(R.id.sydeny);
        DateFormat outputformat=new SimpleDateFormat("HH:mm:ss");

        //beijing
        Calendar calendar1=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        tz1.setText(outputformat.format(calendar1.getTime()));
        //bangkok
        Calendar calendar2=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
        tz2.setText(outputformat.format(calendar2.getTime()));
        Calendar calendar3=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        tz3.setText(outputformat.format(calendar3.getTime()));
        Calendar calendar4=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        tz4.setText(outputformat.format(calendar4.getTime()));
        Calendar calendar5=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        tz5.setText(outputformat.format(calendar5.getTime()));
        Calendar calendar6=Calendar.getInstance();
        outputformat.setTimeZone(TimeZone.getTimeZone("Australia/NSW"));
        tz.setText(outputformat.format(calendar6.getTime()));
    }



}
