package com.org.hci.kadus;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 29/9/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    private int[] images = {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return images.length;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return History_One_images.newInstance(images[0]);
            case 1:
                return History_One_images.newInstance(images[1]);
            case 2:
                return History_One_images.newInstance(images[2]);
            default:
                return null;
        }
    }

  /*  @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View view = layoutInflator.inflate(R.layout.home_custom_layout,null);


        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view,0);

        return view;
    }
*/

}
