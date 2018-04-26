package com.org.hci.kadus;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class History_One_images  extends Fragment {

    private int image;

    public static History_One_images newInstance(int resImage) {
        History_One_images fragment = new History_One_images();
        Bundle args = new Bundle();
        args.putInt("image", resImage);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        image = getArguments().getInt("image", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_custom_layout, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(image);


        return view;
    }

}
