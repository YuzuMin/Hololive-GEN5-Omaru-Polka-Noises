package com.yuzumin.polkanoises;

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

    TableRow PolkaIMG0Row;
    TableRow PolkaIMG1Row;
    TableRow PolkaIMG2Row;
    TableRow PolkaIMG3Row;
    TableRow PolkaIMG4Row;
    TableRow PolkaIMG5Row;
    RadioButton PolkaIMG0;
    RadioButton PolkaIMG1;
    RadioButton PolkaIMG2;
    RadioButton PolkaIMG3;
    RadioButton PolkaIMG4;
    RadioButton PolkaIMG5;

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


        PolkaIMG0=findViewById(R.id.polka0_img);
        PolkaIMG0Row=findViewById(R.id.polka0_img_row);
        PolkaIMG1=findViewById(R.id.polka1_img);
        PolkaIMG1Row=findViewById(R.id.polka1_img_row);
        PolkaIMG2=findViewById(R.id.polka2_img);
        PolkaIMG2Row=findViewById(R.id.polka2_img_row);
        PolkaIMG3=findViewById(R.id.polka3_img);
        PolkaIMG3Row=findViewById(R.id.polka3_img_row);
        PolkaIMG4=findViewById(R.id.polka4_img);
        PolkaIMG4Row=findViewById(R.id.polka4_img_row);
        PolkaIMG5=findViewById(R.id.polka5_img);
        PolkaIMG5Row=findViewById(R.id.polka5_img_row);


        PolkaIMG0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(true);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG0Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=0;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(true);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(true);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG1Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=1;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(true);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(true);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG2Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=2;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(true);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(true);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG3Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=3;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(true);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=4;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(true);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG4Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=4;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(true);
                PolkaIMG5.setChecked(false);
            }
        });
        PolkaIMG5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=5;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(true);
            }
        });
        PolkaIMG5Row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                charavalue=5;
                SoundSettingsEditor =getSharedPreferences("Chara",MODE_PRIVATE).edit();
                SoundSettingsEditor.putInt("CharaValue",charavalue);
                SoundSettingsEditor.apply();
                PolkaIMG0.setChecked(false);
                PolkaIMG1.setChecked(false);
                PolkaIMG2.setChecked(false);
                PolkaIMG3.setChecked(false);
                PolkaIMG4.setChecked(false);
                PolkaIMG5.setChecked(true);
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
                PolkaIMG0.setChecked(true);
                break;
            case 1:
                PolkaIMG1.setChecked(true);
                break;
            case 2:
                PolkaIMG2.setChecked(true);
                break;
            case 3:
                PolkaIMG3.setChecked(true);
                break;
            case 4:
                PolkaIMG4.setChecked(true);
                break;
            default:
                PolkaIMG5.setChecked(true);
                break;
        }
    }
}