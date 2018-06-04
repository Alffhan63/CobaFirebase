package com.example.alfhanrf.inputdatafirebase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Alfhanrf on 5/26/2018.
 */

public class Spinner extends MainActivity {

    private Button mInput;
    private android.widget.Spinner fungsi;
    private android.widget.Spinner jenis;
    private android.widget.Spinner pergunakan;
    private Firebase mRootRef;
    public Button mmasukfirebase;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        mRootRef = new Firebase("https://inputdatafirebase-5a160.firebaseio.com/Users");

        addItemOnfungsi();
        addListenerButton();
        addListenerOnSpinnerItemSelection();

        mRootRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Map<String,String> map = dataSnapshot.getValue(Map.class);

                String name = map.get("Nama");

                mmasukfirebase.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fungsi= (android.widget.Spinner) findViewById(R.id.fungsi);

                        mmasukfirebase= (Button) findViewById(R.id.masukfirebase);

                        Toast.makeText(Spinner.this,
                                "OnClickListener : " +
                                        "\nSpinner 1 : "+ String.valueOf(fungsi.getSelectedItem()),Toast.LENGTH_SHORT).show();

                    }
                });

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


    }


    private void addItemOnfungsi() {
        fungsi = (android.widget.Spinner) findViewById(R.id.fungsi);
        List<String> list = new ArrayList<String>();
        list.add("list1");

        ArrayAdapter<String> dataAdapater = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);
        fungsi.setAdapter(dataAdapater);

    }

    private void addListenerOnSpinnerItemSelection() {

        fungsi = (android.widget.Spinner) findViewById(R.id.fungsi);
        fungsi.setOnItemSelectedListener(new CustomOnSelectedListener());
    }



    private void addListenerButton() {
        fungsi= (android.widget.Spinner) findViewById(R.id.fungsi);

        mInput= (Button) findViewById(R.id.input);
        mInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Spinner.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(fungsi.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }
        });
    }


}

