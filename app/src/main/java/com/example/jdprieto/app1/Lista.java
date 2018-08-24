package com.example.jdprieto.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lista extends AppCompatActivity {
ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        lst =(ListView)findViewById(R.id.listView);
        ArrayAdapter<String>ada=new ArrayAdapter<String>(this,R.layout.activity_lista);
        lst.setAdapter(ada);

       lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       Toast t=Toast.makeText(getApplicationContext(),"Estas en colombia",Toast.LENGTH_SHORT);
                       t.show();
                       break;
                   case 1:
                       Toast t1=Toast.makeText(getApplicationContext(),"Estas en Peru",Toast.LENGTH_SHORT);
                   t1.show();
                   break;
                   case 2:
                       Toast t2=Toast.makeText(getApplicationContext(),"Estas en Dubai",Toast.LENGTH_SHORT);
                       t2.show();
                       break;

               }
           }
       });


    }
}
