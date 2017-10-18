package com.example.thikumpron.projiect2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect imgItem
        final ImageView imgItem = (ImageView)findViewById(R.id.imgItem);

        //Connect btnHammer
        Button btnHammer = (Button)findViewById(R.id.btnHammer);
        //Click button  show hammer image
        btnHammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show image Hammer
                imgItem.setImageResource(R.drawable.hammer);
            }
        });
         //Connect btnPaper
        Button btnPaper = (Button)findViewById(R.id.btnPaper);
        //Click button show paper image
        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // show image Paper
                imgItem.setImageResource(R.drawable.paper);
            }
        });
        //Connect btnScissors
        Button btnScissors = (Button)findViewById(R.id.btnScissors);
        //Click button show scissors image
        btnScissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show imge scissors
                imgItem.setImageResource(R.drawable.scissors);
            }
        });

    }

}
