package com.org.hci.kadus;


import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.wajahatkarim3.easyflipview.EasyFlipView;

import org.w3c.dom.Text;

import static com.org.hci.kadus.R.id.cardView_back;
import static com.org.hci.kadus.R.id.coverImageView;
import static com.org.hci.kadus.R.id.easyFlipView2;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] titles_back = {"Violin   Biula\n" +
            "Saxophone   Saksofan\n" +
            "Piano   Piano\n" +
            "Gong   Tagung",
            "Good Morning   \nKopisanangan do kosuabon\n" +
                    "Good Afternoon   \nKopisanangan do tangadau\n" +
                    "Good Night    \nKopisanangan do minsosodop\n" +
                    "Thank You   Poinsikou",
            "Red   Aragang\n" +
                    "Yellow   Osilou\n" +
                    "Green   Otomou\n" +
                    "Blue   Obulou",
            "Mango   Mangga\n" +
                    "Watermelon   Batad\n" +
                    "Papaya   Tapayas\n" +
                    "Banana   Punti"};

    private String[] titles = {"Musical Instruments   Tuunizon",
            "Greetings   Ucapan",
            "Colour    Warana",
            "Fruits    Tuva-uva"};

    private int[] images = { R.mipmap.music,
            R.mipmap.greetings,
            R.mipmap.colour,
            R.mipmap.fruit};

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public ImageView likeImageView;
        public ImageView shareImageView;
        public TextView itemAnswer;

        public CardView thisCard;

        public ViewHolder(final View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(coverImageView);
            itemTitle = (TextView)itemView.findViewById(R.id.titleTextView);
            likeImageView = (ImageView)itemView.findViewById(R.id.likeImageView);
            shareImageView = (ImageView)itemView.findViewById(R.id.shareImageView);
            itemAnswer = (TextView)itemView.findViewById(R.id.titleTextView_back);



            likeImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //check for null values
                    int id = (v.getTag() == null) ? -1 : (Integer) v.getTag();
//                    int id = (int) likeImageView.getTag();
                    if (id == R.mipmap.ic_like) {

                        likeImageView.setTag(R.mipmap.ic_liked);
                        likeImageView.setImageResource(R.mipmap.ic_liked);
                        likeImageView.setVisibility(View.VISIBLE);

//                        Snackbar.make(v, titles[position] + "added to favourites",
//                                Snackbar.LENGTH_LONG)
//                                .setAction("Action", null).show();

//                        Toast.makeText(getActivity(),titles.getText()+" added to favourites",Toast.LENGTH_SHORT).show();

                    } else {

                        likeImageView.setTag(R.mipmap.ic_like);
                        likeImageView.setImageResource(R.mipmap.ic_like);
//                        Toast.makeText(getActivity(),titleTextView.getText()+" removed from favourites",Toast.LENGTH_SHORT).show();


                    }

                }
            });


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

            //click on card
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
//                    int position = getAdapterPosition();
                    int i=0;
                    final EasyFlipView thisCard = (EasyFlipView) itemView.findViewById(R.id.easyFlipView2);

//                    Snackbar.make(v, titles_back[i++],
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();

                    thisCard.flipTheView();
                }
            });

        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v1, v2 = null;
        ViewHolder viewHolder = null;

        switch (i){
            case 0:
                v1 = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.activity_learning_front, viewGroup, false);
                viewHolder = new ViewHolder(v1);
                break;
            case 1:
                v2 = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.activity_learning_back, viewGroup, false);
                viewHolder = new ViewHolder(v2);
                break;
        }
        return viewHolder;

    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemImage.setImageResource(images[i]);
        viewHolder.itemAnswer.setText(titles_back[i]);

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }


}