package com.org.hci.kadus;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DictionaryFragment extends Fragment {

    Button Translate;
    TextView TranslateWord;
    EditText ChosenWord;
    TextView Definition;
    Spinner mySpinner;
    Spinner mySpinner2;
    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter2;
    int DefineWord = 0;
    int ChangeWord = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_dictionary, container, false);

        Translate = (Button) view.findViewById(R.id.Translate);
        ChosenWord = (EditText) view.findViewById(R.id.ChosenWord);
        TranslateWord = (TextView) view.findViewById(R.id.TranslateWord);
        Definition = (TextView) view.findViewById(R.id.Description);
        mySpinner = (Spinner) view.findViewById(R.id.WordDefine);
        mySpinner2 = (Spinner) view.findViewById(R.id.WordTranslate);
        adapter = ArrayAdapter.createFromResource(DictionaryFragment.this.getActivity(),R.array.language,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0)
                {
                    DefineWord = 1;
                    Toast.makeText(DictionaryFragment.this.getActivity().getBaseContext(),parent.getItemAtPosition(position) + " is selected",Toast.LENGTH_LONG ).show();
                }

                else if(position == 1)
                {
                    DefineWord = 2;
                    Toast.makeText(DictionaryFragment.this.getActivity().getBaseContext(),parent.getItemAtPosition(position) + " is selected",Toast.LENGTH_LONG ).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        adapter2 = ArrayAdapter.createFromResource(DictionaryFragment.this.getActivity(),R.array.language2,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(adapter2);
        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0)
                {
                    ChangeWord = 1;
                    Toast.makeText(DictionaryFragment.this.getActivity().getBaseContext(),parent.getItemAtPosition(position) + " is selected",Toast.LENGTH_LONG ).show();
                }

                else if(position == 1)
                {
                    ChangeWord = 2;
                    Toast.makeText(DictionaryFragment.this.getActivity().getBaseContext(),parent.getItemAtPosition(position) + " is selected",Toast.LENGTH_LONG ).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(DefineWord == 2 && ChangeWord == 2) {
                    if (ChosenWord.getText().toString().trim().equals("good")||ChosenWord.getText().toString().trim().equals("Good")) {
                        TranslateWord.setText("Avasi");
                        Definition.setText("To be desired or approved of");
                        Definition.setTextColor(Color.BLACK);
                    }
                }

                else if(DefineWord == 1 && ChangeWord == 1) {
                    if (ChosenWord.getText().toString().trim().equals("avasi")||ChosenWord.getText().toString().trim().equals("Avasi")) {
                        TranslateWord.setText("Good");
                        Definition.setText("To be desired or approved of");
                        Definition.setTextColor(Color.BLACK);
                    }
                    else{
                        AlertDialog.Builder a_dialog = new AlertDialog.Builder(DictionaryFragment.this.getActivity());
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
                        alert.show();}
                }



            }
        });

        return view;
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        AppCompatActivity activity = (AppCompatActivity) this.getActivity();
//        ActionBar aBar = activity.getSupportActionBar();
//        aBar.show();
//    }
}
