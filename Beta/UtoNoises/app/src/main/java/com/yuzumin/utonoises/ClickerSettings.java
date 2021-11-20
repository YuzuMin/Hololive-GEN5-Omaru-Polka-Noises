package com.yuzumin.utonoises;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class ClickerSettings extends AppCompatActivity {

    ImageView back_btn;

    TableRow UtoIMG0Row;
    TableRow UtoIMG1Row;
    TableRow UtoIMG2Row;
    TableRow UtoIMG3Row;
    TableRow UtoIMG4Row;
    RadioButton UtoIMG0;
    RadioButton UtoIMG1;
    RadioButton UtoIMG2;
    RadioButton UtoIMG3;
    RadioButton UtoIMG4;

    Integer charavalue;

    Switch switch0;
    Switch switch1;
    Switch switch2;


    SharedPreferences SoundSettings;
    SharedPreferences.Editor SoundSettingsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicker_settings);
        getSupportActionBar().hide();

        back_btn=findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        UtoIMG0 =findViewById(R.id.uto0_img);
        UtoIMG0Row =findViewById(R.id.uto0_img_row);
        UtoIMG1 =findViewById(R.id.uto1_img);
        UtoIMG1Row =findViewById(R.id.uto1_img_row);
        UtoIMG2=findViewById(R.id.uto2_img);
        UtoIMG2Row=findViewById(R.id.uto2_img_row);
        UtoIMG3=findViewById(R.id.uto3_img);
        UtoIMG3Row=findViewById(R.id.uto3_img_row);
        UtoIMG4=findViewById(R.id.uto4_img);
        UtoIMG4Row=findViewById(R.id.uto4_img_row);



        UtoIMG0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG0.setChecked(true);
                UtoIMG1.setChecked(false);
            }
        });
        UtoIMG0Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG0.setChecked(true);
                UtoIMG1.setChecked(false);
            }
        });
        UtoIMG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG0.setChecked(false);
                UtoIMG1.setChecked(true);
            }
        });
        UtoIMG1Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG0.setChecked(false);
                UtoIMG1.setChecked(true);
            }
        });
        UtoIMG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG2.setChecked(true);
                UtoIMG3.setChecked(false);
                UtoIMG4.setChecked(false);
            }
        });
        UtoIMG2Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG2.setChecked(true);
                UtoIMG3.setChecked(false);
                UtoIMG4.setChecked(false);
            }
        });
        UtoIMG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG2.setChecked(false);
                UtoIMG3.setChecked(true);
                UtoIMG4.setChecked(false);
            }
        });
        UtoIMG3Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG2.setChecked(false);
                UtoIMG3.setChecked(true);
                UtoIMG4.setChecked(false);
            }
        });
        UtoIMG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=4;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG2.setChecked(false);
                UtoIMG3.setChecked(false);
                UtoIMG4.setChecked(true);
            }
        });
        UtoIMG4Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=4;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                UtoIMG2.setChecked(false);
                UtoIMG3.setChecked(false);
                UtoIMG4.setChecked(true);
            }
        });



        retrievedata();

        // for switch 0 to activate
        switch0=findViewById(R.id.switch0);
        SoundSettings =getSharedPreferences("save0",MODE_PRIVATE);
        switch0.setChecked(SoundSettings.getBoolean("value0",false));
        switch0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch0.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save0",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value0",true);
                    SoundSettingsEditor.apply();
                    switch0.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save0",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value0",false);
                    SoundSettingsEditor.apply();
                    switch0.setChecked(false);
                }
            }
        });

        // for switch 1 to activate
        switch1=findViewById(R.id.switch1);
        SoundSettings =getSharedPreferences("save1",MODE_PRIVATE);
        switch1.setChecked(SoundSettings.getBoolean("value1",true));
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch1.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",true);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save1",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value1",false);
                    SoundSettingsEditor.apply();
                    switch1.setChecked(false);
                }
            }
        });

        // for switch 2 to activate
        switch2=findViewById(R.id.switch2);
        SoundSettings =getSharedPreferences("save2",MODE_PRIVATE);
        switch2.setChecked(SoundSettings.getBoolean("value2",false));
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch2.isChecked()){
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",true);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(true);
                }else{
                    SoundSettingsEditor =getSharedPreferences("save2",MODE_PRIVATE).edit();
                    SoundSettingsEditor.putBoolean("value2",false);
                    SoundSettingsEditor.apply();
                    switch2.setChecked(false);
                }
            }
        });
    }

    private void retrievedata(){
        SoundSettings=getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue=SoundSettings.getInt("CharaValue",0);

        switch (charavalue) {
            case 0:
                UtoIMG0.setChecked(true);
                break;
            case 1:
                UtoIMG1.setChecked(true);
                break;
            case 2:
                UtoIMG2.setChecked(true);
                break;
            case 3:
                UtoIMG3.setChecked(true);
                break;
            default:
                UtoIMG4.setChecked(true);
                break;
        }
    }
}