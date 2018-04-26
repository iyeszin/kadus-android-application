package com.org.hci.kadus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class HomeFragment extends Fragment implements View.OnClickListener {

    public  HomeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home_page, container, false);
        ImageButton angry_btn = (ImageButton) view.findViewById(R.id.angry_btn);
        angry_btn.setOnClickListener(this);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDateandTime = sdf.format(new Date());
        TextView tv = (TextView) view.findViewById(R.id.textView);
        tv.setText(currentDateandTime);

        return view;
    }

//    public View onSetDate(){
//        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
//        Date d = new Date();
//        String dayOfTheWeek = sdf.format(d);
//
//        Calendar c = Calendar.getInstance();
//        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM ");
//        String strDate = sdf2.format(c.getTime());
//
//        TextView day;
//        day = (TextView)getView().findViewById(R.id.textView);
//        day.setText(strDate + dayOfTheWeek);
//        day.setOnClickListener(this);
//
//        return day;
//    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;

//        datetimetext.setText("" + DateFormat.format("dd/MM/yyyy kk:mm", System.currentTimeMillis()));

        switch (view.getId()) {
//            case R.id.textView:
//                break;
            case R.id.angry_btn:
                fragment = new DictionaryFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.containerView, fragment);
                transaction.commit();
                break;
        }

    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        AppCompatActivity activity = (AppCompatActivity) this.getActivity();
//        ActionBar aBar = activity.getSupportActionBar();
//        aBar.hide();
//    }

}
