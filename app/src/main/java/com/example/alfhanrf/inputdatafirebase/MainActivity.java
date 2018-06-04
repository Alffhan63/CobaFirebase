package com.example.alfhanrf.inputdatafirebase;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.Map;


public class MainActivity extends AppCompatActivity {
//
//    private EditText isinama;
//    private EditText isialamat;
//    private Button mInput;
//    private TextView isian;
//    private TextView isian1;

    private Button mInput;
    private Spinner fungsi;
    private Spinner jenis;
    private Spinner pergunakan;

    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


////        //deklarasi nama firebase
////
////        mRootRef = new Firebase("https://inputdatafirebase-5a160.firebaseio.com/Users");
////
////        isinama = (EditText) findViewById(R.id.nama);
////        isialamat= (EditText) findViewById(R.id.alamat) ;
////        mInput = (Button) findViewById(R.id.input);
////        isian = (TextView) findViewById(R.id.isian);
////        isian1 = (TextView) findViewById(R.id.isian1);
////
////        mRootRef.addValueEventListener(new ValueEventListener() {
////            @Override
////            public void onDataChange(DataSnapshot dataSnapshot) {
////
////                Map<String, String> map = dataSnapshot.getValue(Map.class);
////
////                String name = map.get("Name");
////                String alamat = map.get("Alamat");
////
////                isian.setText(name);
////                isian1.setText(alamat);
////            }
//
//            @Override
//            public void onCancelled(FirebaseError firebaseError) {
//
//            }
//        });
//
//        mInput.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String nama = isinama.getText().toString();
//                String alamat = isialamat.getText().toString();
//
//                Firebase childRef = mRootRef.child("Name");
//                Firebase childRef1 = mRootRef.child("Alamat");
//
//                childRef.setValue(nama);
//                childRef1.setValue(alamat);
//            }
//
//        });
























        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
