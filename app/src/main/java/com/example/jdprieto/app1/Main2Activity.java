package com.example.jdprieto.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn=(Button)findViewById(R.id.btnVolver);
        txt=(TextView)findViewById(R.id.txtmuestra);
        Bundle bundle=getIntent().getExtras();


        String nom=bundle.getString("nombre");
       txt.setText(nom);






    }
}
