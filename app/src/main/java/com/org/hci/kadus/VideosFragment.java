package com.org.hci.kadus;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import static android.view.View.GONE;

public class VideosFragment extends Fragment {
    View view;
    Button click;
    Button click2;
    Button click3;
    Button click4;
    Button click5;
    Button click6;
    VideoView video;
    VideoView video_1;
    VideoView video_2;
    VideoView video_3;
    VideoView video_4;
    VideoView video_5;
    VideoView video_6;
    MediaController mediaC;
    int Video1 = 1;
    int Video2 = 1;
    int Video3 = 1;
    int Video4 = 1;
    int Video5 = 1;
    int Video6 = 1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_videos, container, false);

        click = (Button) view.findViewById(R.id.Play);
        click2 = (Button) view.findViewById(R.id.Play2);
        click3 = (Button) view.findViewById(R.id.Play3);
        click4 = (Button) view.findViewById(R.id.Play4);
        click5 = (Button) view.findViewById(R.id.Play5);
        click6 = (Button) view.findViewById(R.id.Play6);
        mediaC = new MediaController(VideosFragment.this.getActivity());

        video_1 = (VideoView) view.findViewById(R.id.videoView);
        String path_1 = "android.resource://com.org.hci.kadus/" + R.raw.culture01;
        Uri uri_1 = Uri.parse(path_1);
        video_1.setVideoURI(uri_1);
        video_1.seekTo(10000);

        video_2 = (VideoView) view.findViewById(R.id.videoView2);
        String path_2 = "android.resource://com.org.hci.kadus/" + R.raw.culture02;
        Uri uri_2 = Uri.parse(path_2);
        video_2.setVideoURI(uri_2);
        video_2.seekTo(10000);

        video_3 = (VideoView) view.findViewById(R.id.videoView3);
        String path_3 = "android.resource://com.org.hci.kadus/" + R.raw.learning01;
        Uri uri_3 = Uri.parse(path_3);
        video_3.setVideoURI(uri_3);
        video_3.seekTo(10000);

        video_4 = (VideoView) view.findViewById(R.id.videoView4);
        String path_4 = "android.resource://com.org.hci.kadus/" + R.raw.learning02;
        Uri uri_4 = Uri.parse(path_4);
        video_4.setVideoURI(uri_4);
        video_4.seekTo(10000);

        video_5 = (VideoView) view.findViewById(R.id.videoView5);
        String path_5 = "android.resource://com.org.hci.kadus/" + R.raw.history01;
        Uri uri_5 = Uri.parse(path_5);
        video_5.setVideoURI(uri_5);
        video_5.seekTo(10000);

        video_6 = (VideoView) view.findViewById(R.id.videoView6);
        String path_6 = "android.resource://com.org.hci.kadus/" + R.raw.history02;
        Uri uri_6 = Uri.parse(path_6);
        video_6.setVideoURI(uri_6);
        video_6.seekTo(10000);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Video1 == 0)
                {
                    video = (VideoView) view.findViewById(R.id.videoView);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.culture01;
                    Uri uri = Uri.parse(path);
                    video.setVideoURI(uri);
                    video.seekTo(1000);
                    Video1 = 2;
                    click.setText("Stop");
                    click.setBackgroundColor(Color.YELLOW);
                    video.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();


                }
                else if (Video1 == 1) {
                    video = (VideoView) view.findViewById(R.id.videoView);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.culture01;
                    Uri uri = Uri.parse(path);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150* displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 70;
                    params.topMargin = 810;
                    Video1 = 0;
                    video.setLayoutParams(params);
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();


                }

                else if(Video1 == 2){
                    video = (VideoView) view.findViewById(R.id.videoView);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 70;
                    params.topMargin = 810;
                    click.setText("");
                    click.setBackgroundColor(Color.TRANSPARENT);
                    Video1 = 1;
                    video.setLayoutParams(params);
                    video.stopPlayback();
                    video.setBackgroundColor(Color.TRANSPARENT);
                    video.setVisibility(GONE);
                    video.setVisibility(View.VISIBLE);

                }

                video.seekTo(10000);


            }
        });



        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Video2 == 0) {
                    video = (VideoView) view.findViewById(R.id.videoView2);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.culture02;
                    Uri uri = Uri.parse(path);
                    Video2 = 2;
                    click2.setText("Stop");
                    click2.setBackgroundColor(Color.YELLOW);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    video.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if(Video2 == 1){
                    video = (VideoView) view.findViewById(R.id.videoView2);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.culture02;
                    Uri uri = Uri.parse(path);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 590;
                    params.topMargin = 810;
                    Video2 = 0;
                    video.setLayoutParams(params);
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if(Video2 == 2){
                    video = (VideoView) view.findViewById(R.id.videoView2);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 590;
                    params.topMargin = 810;
                    click2.setText("");
                    click2.setBackgroundColor(Color.TRANSPARENT);
                    Video2 = 1;
                    video.setLayoutParams(params);
                    video.stopPlayback();
                    video.setBackgroundColor(Color.TRANSPARENT);
                    video.setVisibility(GONE);
                    video.setVisibility(View.VISIBLE);

                }

                video.seekTo(10000);

            }
        });

        click3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Video3 == 0) {
                    video = (VideoView) view.findViewById(R.id.videoView3);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.learning01;
                    Uri uri = Uri.parse(path);
                    Video3 = 2;
                    click3.setText("Stop");
                    click3.setBackgroundColor(Color.YELLOW);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    video.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if(Video3 == 1){
                    video = (VideoView) view.findViewById(R.id.videoView3);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.learning01;
                    Uri uri = Uri.parse(path);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 70;
                    params.topMargin = 1230;
                    Video3 = 0;
                    video.setLayoutParams(params);
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if(Video3 == 2){
                    video = (VideoView) view.findViewById(R.id.videoView3);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 70;
                    params.topMargin = 1230;
                    click3.setText("");
                    click3.setBackgroundColor(Color.TRANSPARENT);
                    Video3 = 1;
                    video.setLayoutParams(params);
                    video.stopPlayback();
                    video.setBackgroundColor(Color.TRANSPARENT);
                    video.setVisibility(GONE);
                    video.setVisibility(View.VISIBLE);

                }

                video.seekTo(10000);
            }
        });

        click4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Video4 == 0) {
                    video = (VideoView) view.findViewById(R.id.videoView4);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.learning02;
                    Uri uri = Uri.parse(path);
                    Video4 = 2;
                    click4.setText("Stop");
                    click4.setBackgroundColor(Color.YELLOW);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    video.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if(Video4 == 1){
                    video = (VideoView) view.findViewById(R.id.videoView4);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.learning02;
                    Uri uri = Uri.parse(path);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 590;
                    params.topMargin = 1230;
                    Video4 = 0;
                    video.setLayoutParams(params);
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if(Video4 == 2){
                    video = (VideoView) view.findViewById(R.id.videoView4);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 590;
                    params.topMargin = 1230;
                    click4.setText("");
                    click4.setBackgroundColor(Color.TRANSPARENT);
                    Video4 = 1;
                    video.setLayoutParams(params);
                    video.stopPlayback();
                    video.setBackgroundColor(Color.TRANSPARENT);
                    video.setVisibility(GONE);
                    video.setVisibility(View.VISIBLE);

                }

                video.seekTo(10000);
            }
        });


        click5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Video5 == 0) {
                    video = (VideoView) view.findViewById(R.id.videoView5);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.history01;
                    Uri uri = Uri.parse(path);
                    Video5 = 2;
                    click5.setText("Stop");
                    click5.setBackgroundColor(Color.YELLOW);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    video.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if (Video5 == 1) {
                    video = (VideoView) view.findViewById(R.id.videoView5);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.history01;
                    Uri uri = Uri.parse(path);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 70;
                    params.topMargin = 1650;
                    params.bottomMargin = 20;
                    Video5 = 0;
                    video.setLayoutParams(params);
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if (Video5 == 2) {
                    video = (VideoView) view.findViewById(R.id.videoView5);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 70;
                    params.topMargin = 1650;
                    params.bottomMargin = 20;
                    click5.setText("");
                    click5.setBackgroundColor(Color.TRANSPARENT);
                    Video5 = 1;
                    video.setLayoutParams(params);
                    video.stopPlayback();
                    video.setBackgroundColor(Color.TRANSPARENT);
                    video.setVisibility(GONE);
                    video.setVisibility(View.VISIBLE);

                }
                video.seekTo(10000);
            }
        });

        click6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Video6 == 0) {
                    video = (VideoView) view.findViewById(R.id.videoView6);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.history02;
                    Uri uri = Uri.parse(path);
                    Video6 = 2;
                    click6.setText("Stop");
                    click6.setBackgroundColor(Color.YELLOW);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    video.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if (Video6 == 1) {
                    video = (VideoView) view.findViewById(R.id.videoView6);
                    String path = "android.resource://com.org.hci.kadus/" + R.raw.history02;
                    Uri uri = Uri.parse(path);
                    video.setVideoURI(uri);
                    video.seekTo(100);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 590;
                    params.topMargin = 1650;
                    params.bottomMargin = 20;
                    Video6 = 0;
                    video.setLayoutParams(params);
                    mediaC.setAnchorView(video);
                    video.setMediaController(mediaC);
                    video.requestFocus();
                    video.start();
                }

                else if (Video6 == 2) {
                    video = (VideoView) view.findViewById(R.id.videoView6);
                    DisplayMetrics displaymetric = new DisplayMetrics();
                    VideosFragment.this.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetric);
                    android.widget.RelativeLayout.LayoutParams params = (android.widget.RelativeLayout.LayoutParams) video.getLayoutParams();
                    params.width = (int) (150 * displaymetric.density);
                    params.height = (int) (200 * displaymetric.density);
                    params.leftMargin = 590;
                    params.topMargin = 1650;
                    params.bottomMargin = 20;
                    click6.setText("");
                    click6.setBackgroundColor(Color.TRANSPARENT);
                    Video6 = 1;
                    video.setLayoutParams(params);
                    video.stopPlayback();
                    video.setBackgroundColor(Color.TRANSPARENT);
                    video.setVisibility(GONE);
                    video.setVisibility(View.VISIBLE);

                }
                video.seekTo(10000);

            }
        });

        return view;
    }
}

