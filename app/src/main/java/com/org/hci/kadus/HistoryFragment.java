package com.org.hci.kadus;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class HistoryFragment extends Fragment {
    ViewPager viewPager;
    String str_history;
    String str_location;
    String str_musicdance;
    ViewPagerAdapter viewPagerAdapter;
    @Nullable




    public static HistoryFragment newInstance(int resImage) {
        HistoryFragment fragment = new HistoryFragment();
        Bundle args = new Bundle();
        args.putInt("image", resImage);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_history, container, false);


        viewPager = (ViewPager) view.findViewById(R.id.pagerView);

        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());

        viewPager.setAdapter((viewPagerAdapter));

        if(getActivity()!=null) {
            //do stuff
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
        }

        TextView label_1 = (TextView)view.findViewById(R.id.textHistoryLabel_1);
        TextView label_2 = (TextView)view.findViewById(R.id.textHistoryLabel_2);
        TextView label_3 = (TextView)view.findViewById(R.id.textHistoryLabel_3);
        TextView information = (TextView)view.findViewById(R.id.textHistory);
        TextView location = (TextView)view.findViewById(R.id.textLocation);
        TextView musicdance = (TextView)view.findViewById(R.id.textMusicDance);

        label_1.setTypeface(null, Typeface.BOLD);
        label_1.setTypeface(null, Typeface.ITALIC);
        label_2.setTypeface(null, Typeface.BOLD);
        label_2.setTypeface(null, Typeface.ITALIC);
        label_3.setTypeface(null, Typeface.BOLD);
        label_3.setTypeface(null, Typeface.ITALIC);

        str_history = "The Kadazans are an ethnic group indigenous to the state of Sabah in Malaysia. They are found mainly in Penampang on the west coast of Sabah, the surrounding locales, and various locations in the interior. Due to the sharing of culture and language with the Dusun people, as well as for political initiatives, the new term \"Kadazan-Dusun\" was created to combine them. Together, they are the largest ethnic group in Sabah. ";
        information.setText(str_history);

        str_location ="The largest indigenous group, the Kadazandusun live primarily on the west coast and in the interior region. Traditionally cultivators of rice, their ritual celebrations revolved around the rice cycle. These rituals, including the most important event of the year, the Harvest Festival or Pesta Ka'amatan, are presided over by priestesses, generally known as bobohizan. These women conduct complex rituals complete with lengthy chants in an archaic language, passed down by word of mouth over generations. Today, many Kadazandusun (like Sabah's other ethnic groups), can be found in all walks of life as teachers, business people, doctors or office workers. ";
        location.setText(str_location);

        str_musicdance = "The Kadazans have also developed their own unique dance and music. SUMAZAU is the name of the dance between a male and female, performed by couples as well as groups of couples, which is usually accompanied by a symphony of handcrafted bronze gongs that are individually called 'tagung'. The sompoton is another musical instrument. A ceremonial ring of cloth sash is worn by both male and female. The Sumazau and gong accompaniment is typically performed during joyous ceremonies and occasions, the most common of which being wedding feasts.";
        musicdance.setText(str_musicdance);


        return view;
    }

    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            if(getActivity() == null)
                return;

            HistoryFragment.this.getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if(viewPager.getCurrentItem() == 0){
                        viewPager.setCurrentItem(1);
                    }else if(viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    }else {
                        viewPager.setCurrentItem(0);
                    }


                }
            });




        }
    }
}
