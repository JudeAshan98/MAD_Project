package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bonusLevel extends AppCompatActivity {

    public String noobExtra = "text";
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus_level);

//      button.setOnClickListener(new View.OnClickListener(){
//          @Override
//                  public void onClick(View view){
//                  Intent intent =  new Intent(bonusLevel.this,settings.class);
//                  intent.putExtra("testExtra",noobExtra);
//                  startActivity(intent);
//                }
//        });

    }
}
