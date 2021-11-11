package com.ennovations.fitcru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ennovations.fitcru.adapter.NutritionTrackAdapter;
import com.ennovations.fitcru.pojo.NutritionTrack;
import com.github.jhonnyx2012.horizontalpicker.DatePickerListener;
import com.github.jhonnyx2012.horizontalpicker.HorizontalPicker;

import org.joda.time.DateTime;

import java.util.Calendar;

//import devs.mulham.horizontalcalendar.HorizontalCalendar;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    NutritionTrackAdapter nutritionTrackAdapter;
    NutritionTrack[] nutritionTracks;
    TextView text_kcal, text_protien, text_fat, text_curb;
//    private HorizontalCalendar horizontalCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        HorizontalPicker picker = (HorizontalPicker) findViewById(R.id.datePicker);
        text_kcal = (TextView) findViewById(R.id.text_kcal);
        text_fat = (TextView) findViewById(R.id.text_fat);
        text_curb = (TextView) findViewById(R.id.text_carbs);
        text_protien = (TextView) findViewById(R.id.text_protiens);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.MONTH, -2);

        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 2);

        final Calendar defaultSelectedDate = Calendar.getInstance();

//        horizontalCalendar = new HorizontalCalendar.Builder(this, R.id.calendarView)
//                .range(startDate, endDate)
//                .datesNumberOnScreen(5)
//                .configure()
//                .formatMiddleText("EEE")
//                .formatBottomText("dd")
//                .showBottomText(true)
//                .showTopText(false)
//                .textColor(R.color.overlay_dark_50, R.color.overlay_dark_50)
//                .end()
//                .defaultSelectedDate(startDate)
//                .build();
        
        
//        picker.setListener(this)
//                .setDays(20)
//                .setOffset(10)
//                .setDateSelectedColor(R.drawable.backgroud_nutrition)
//                .setDateSelectedTextColor(Color.BLACK)
//                .setDateSelectedTextColor(Color.WHITE)
//                .setMonthAndYearTextColor(Color.DKGRAY)
//                .setUnselectedDayTextColor(Color.DKGRAY)
//                .setDayOfWeekTextColor(Color.DKGRAY)
//                .init();
//
//        picker.setBackgroundColor(Color.LTGRAY);
//        picker.setDate(new DateTime());
//

    }

//    @Override
//    public void onDateSelected(DateTime dateSelected) {
//
//        String date = dateSelected.toString();
//        String h = date.substring(0,10);
//        Log.i("HorizontalPicker", "Selected date is " +h);
//
//
//
//
//    }


}