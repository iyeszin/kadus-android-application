package com.org.hci.kadus;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class LearningFragment extends Fragment {

    ArrayList<GreetingModel> listitems = new ArrayList<GreetingModel>();
    RecyclerView MyRecyclerView;
//    String Greetings[] = {"Good morning","Good afternoon","Good night","Thank you"};
//    int  Images[] = {R.mipmap.morning,R.mipmap.afternoon,R.mipmap.night,R.mipmap.thankyou};

    public LearningFragment(){
        //required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        initializeList();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_learning, container, false);
        MyRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        MyRecyclerView.setHasFixedSize(true);

        LinearLayoutManager MyLayoutManager = new LinearLayoutManager(getActivity());
        MyRecyclerView.setLayoutManager(MyLayoutManager);
        MyLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        RecyclerView.Adapter adapter = new RecyclerAdapter();
        MyRecyclerView.setAdapter(adapter);
        

//        MyAdapter = new MyAdapter(listitems);
//        MyRecyclerView.setAdapter(new MyAdapter(listitems));

//        if (listitems.size() > 0 & MyRecyclerView != null) {
//            MyRecyclerView.setAdapter(new RecyclerAdapter());
//        }


        return view;
    }


//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        getActivity().setTitle("Simple Greeting Phrases");
//        View view = inflater.inflate(R.layout.activity_learning_front, container, false);
//        MyRecyclerView = (RecyclerView) view.findViewById(R.id.cardView);
//        MyRecyclerView.setHasFixedSize(true);
//
//        LinearLayoutManager MyLayoutManager = new LinearLayoutManager(getActivity());
//        MyRecyclerView.setLayoutManager(MyLayoutManager);
//
//        MyLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//
////        MyAdapter = new MyAdapter(listitems);
////        MyRecyclerView.setAdapter(MyAdapter);
//        if (listitems.size() > 0 & MyRecyclerView != null) {
//            MyRecyclerView.setAdapter(new MyAdapter(listitems));
//        }
//
//
//
//
//
//        return view;
//    }
//
//
//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//    }
//
//    public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
//        private ArrayList<GreetingModel> list;
//
//        public MyAdapter(ArrayList<GreetingModel> Data) {
//            list = Data;
//        }
//
//        @Override
//        public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
//            // create a new view
//            View view = LayoutInflater.from(parent.getContext())
//                    .inflate(R.layout.activity_learning_front, parent, false);
//            MyViewHolder holder = new MyViewHolder(view);
//            return holder;
//        }
//
//        @Override
//        public void onBindViewHolder(final MyViewHolder holder, int position) {
//
//            holder.titleTextView.setText(list.get(position).getCardName());
//            holder.coverImageView.setImageResource(list.get(position).getImageResourceId());
//            holder.coverImageView.setTag(list.get(position).getImageResourceId());
//            holder.likeImageView.setTag(R.mipmap.ic_like);
//
//        }
//
//        //return the size of itemsData (invoked by the layout manager)
//        @Override
//        public int getItemCount() {
//            return list.size();
//        }
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//
//        public TextView titleTextView;
//        public ImageView coverImageView;
//        public ImageView likeImageView;
//        public ImageView shareImageView;
//
//        public MyViewHolder(View v) {
//            super(v);
//            titleTextView = (TextView) v.findViewById(R.id.titleTextView);
//            coverImageView = (ImageView) v.findViewById(R.id.coverImageView);
//            likeImageView = (ImageView) v.findViewById(R.id.likeImageView);
//            shareImageView = (ImageView) v.findViewById(R.id.shareImageView);
//            likeImageView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//
//                    int id = (int)likeImageView.getTag();
//                    if( id == R.mipmap.ic_like){
//
//                        likeImageView.setTag(R.mipmap.ic_liked);
//                        likeImageView.setImageResource(R.mipmap.ic_liked);
//
//                        Toast.makeText(getActivity(),titleTextView.getText()+" added to favourites",Toast.LENGTH_SHORT).show();
//
//                    }else{
//
//                        likeImageView.setTag(R.mipmap.ic_like);
//                        likeImageView.setImageResource(R.mipmap.ic_like);
//                        Toast.makeText(getActivity(),titleTextView.getText()+" removed from favourites",Toast.LENGTH_SHORT).show();
//
//
//                    }
//
//                }
//            });
//
//
//
//            shareImageView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
//                            "://" + getResources().getResourcePackageName(coverImageView.getId())
//                            + '/' + "drawable" + '/' + getResources().getResourceEntryName((int)coverImageView.getTag()));
//
//
//                    Intent shareIntent = new Intent();
//                    shareIntent.setAction(Intent.ACTION_SEND);
//                    shareIntent.putExtra(Intent.EXTRA_STREAM,imageUri);
//                    shareIntent.setType("image/jpeg");
//                    startActivity(Intent.createChooser(shareIntent, getResources().getText(R.string.send_to)));
//
//
//
//                }
//            });
//
//
//
//        }
//    }
//
//    public void initializeList() {
//        listitems.clear();
//
//        for(int i =0;i<4;i++){
//
//            GreetingModel item = new GreetingModel();
//            item.setCardName(Greetings[i]);
//            item.setImageResourceId(Images[i]);
//            item.setIsfav(0);
//            item.setIsturned(0);
//            listitems.add(item);
//
//        }
//
//    }

}
