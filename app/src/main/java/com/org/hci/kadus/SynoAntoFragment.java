package com.org.hci.kadus;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SynoAntoFragment extends Fragment {

    EditText input_word;
    TextView output_word1;
    TextView output_word2;
    TextView output_word3;
    TextView output_word4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_syno_anto, container, false);



        input_word = (EditText)view.findViewById(R.id.editText2);
        Button search_button = (Button)view.findViewById(R.id.button3);
        output_word1 = (TextView)view.findViewById(R.id.textView11);
        output_word2 = (TextView)view.findViewById(R.id.textView14);
        output_word3 = (TextView)view.findViewById(R.id.textView15);
        output_word4 = (TextView)view.findViewById(R.id.textView16);


        search_button.setBackgroundColor(Color.parseColor("#EB8686"));
        input_word.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                input_word.setText("");
            }
        });
        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_word.getText().toString().contentEquals("hazid")) {
                    String antonyms = "nohoing";
                    String synonym1 = "vagu";
                    String synonym2 = "omuhok";
                    String meaning = "old";
                    output_word1.setText(antonyms);
                    output_word2.setText(synonym1);
                    output_word3.setText(synonym2);
                    output_word4.setText(meaning);
                }
                else if(input_word.getText().toString().contentEquals("")){
                    output_word1.setText("");
                    output_word2.setText("");
                    output_word3.setText("");
                }
                else{
                    AlertDialog.Builder a_dialog = new AlertDialog.Builder(SynoAntoFragment.this.getActivity());
                    a_dialog.setMessage("The word is not found. Please try with different word :)")
                            .setCancelable(false)
                            .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            });

                    AlertDialog alert = a_dialog.create();
                    alert.setTitle("Ops");
                    alert.show();
                    alert.show();
                }

            }
        });

        return view;
    }
}
