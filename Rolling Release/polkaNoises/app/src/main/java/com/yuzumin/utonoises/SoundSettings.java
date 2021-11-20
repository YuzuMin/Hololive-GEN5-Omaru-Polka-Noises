package com.yuzumin.utonoises;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TableLayout;

public class SoundSettings extends AppCompatActivity {

    ImageView back_btn;

    CardView toggle_btn;

    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    Switch switch11;
    Switch switch12;
    Switch switch13;
    Switch switch14;
    Switch switch15;
    Switch switch16;
    Switch switch17;
    Switch switch18;
    Switch switch19;
    Switch switch20;
    Switch switch21;
    Switch switch22;
    Switch switch23;
    Switch switch24;
    Switch switch25;
    Switch switch26;
    Switch switch27;
    Switch switch28;
    Switch switch29;
    Switch switch30;
    Switch switch31;
    Switch switch32;
    Switch switch33;
    Switch switch34;
    Switch switch35;
    Switch switch36;
    Switch switch37;
    Switch switch38;
    Switch switch39;
    Switch switch40;
    Switch switch41;
    Switch switch42;
    Switch switch43;
    Switch switch44;
    Switch switch45;
    Switch switch46;
    Switch switch47;
    Switch switch48;
    Switch switch49;
    Switch switch50;
    Switch switch51;
    Switch switch52;
    Switch switch53;
    Switch switch54;
    Switch switch55;
    Switch switch56;
    Switch switch57;
    Switch switch58;
    Switch switch59;
    Switch switch60;
    Switch switch61;
    Switch switch62;
    Switch switch63;
    Switch switch64;
    Switch switch65;
    Switch switch66;
    Switch switch67;
    Switch switch68;
    Switch switch69;
    Switch switch70;
    Switch switch71;
    Switch switch72;
    Switch switch73;
    Switch switch74;
    Switch switch75;
    Switch switch76;
    Switch switch77;
    Switch switch78;
    Switch switch79;
    Switch switch80;
    Switch switch81;
    Switch switch82;
    Switch switch83;
    Switch switch84;
    Switch switch85;
    Switch switch86;
    Switch switch87;
    Switch switch88;
    Switch switch89;
    Switch switch90;
    Switch switch91;
    Switch switch92;
    Switch switch93;
    Switch switch94;
    Switch switch95;
    Switch switch96;
    Switch switch97;
    Switch switch98;
    Switch switch99;
    Switch switch100;
    Switch switch101;
    Switch switch102;

    Integer DevCount;

    TableLayout explicitContainer;


    SharedPreferences userPreferences;
    SharedPreferences.Editor userPreferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_settings);
        getSupportActionBar().hide();

        back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        explicitContainer=findViewById(R.id.explicitContainer);
        retrievedata();


        toggle_btn=findViewById(R.id.toggle_btn);
        toggle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()&&switch4.isChecked()){

                    userPreferencesEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value3",false);
                    userPreferencesEditor.apply();
                    switch3.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value4",false);
                    userPreferencesEditor.apply();
                    switch4.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value5",false);
                    userPreferencesEditor.apply();
                    switch5.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value6",false);
                    userPreferencesEditor.apply();
                    switch6.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value7",false);
                    userPreferencesEditor.apply();
                    switch7.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value8",false);
                    userPreferencesEditor.apply();
                    switch8.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value9",false);
                    userPreferencesEditor.apply();
                    switch9.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value10",false);
                    userPreferencesEditor.apply();
                    switch10.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value11",false);
                    userPreferencesEditor.apply();
                    switch11.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value12",false);
                    userPreferencesEditor.apply();
                    switch12.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value13",false);
                    userPreferencesEditor.apply();
                    switch13.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value14",false);
                    userPreferencesEditor.apply();
                    switch14.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value15",false);
                    userPreferencesEditor.apply();
                    switch15.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value16",false);
                    userPreferencesEditor.apply();
                    switch16.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value17",false);
                    userPreferencesEditor.apply();
                    switch17.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value18",false);
                    userPreferencesEditor.apply();
                    switch18.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value19",false);
                    userPreferencesEditor.apply();
                    switch19.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value20",false);
                    userPreferencesEditor.apply();
                    switch20.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value21",false);
                    userPreferencesEditor.apply();
                    switch21.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value22",false);
                    userPreferencesEditor.apply();
                    switch22.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value23",false);
                    userPreferencesEditor.apply();
                    switch23.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value24",false);
                    userPreferencesEditor.apply();
                    switch24.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value25",false);
                    userPreferencesEditor.apply();
                    switch25.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value26",false);
                    userPreferencesEditor.apply();
                    switch26.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value27",false);
                    userPreferencesEditor.apply();
                    switch27.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value28",false);
                    userPreferencesEditor.apply();
                    switch28.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value29",false);
                    userPreferencesEditor.apply();
                    switch29.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value30",false);
                    userPreferencesEditor.apply();
                    switch30.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value31",false);
                    userPreferencesEditor.apply();
                    switch31.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value32",false);
                    userPreferencesEditor.apply();
                    switch32.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value33",false);
                    userPreferencesEditor.apply();
                    switch33.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value34",false);
                    userPreferencesEditor.apply();
                    switch34.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value35",false);
                    userPreferencesEditor.apply();
                    switch35.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value36",false);
                    userPreferencesEditor.apply();
                    switch36.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value37",false);
                    userPreferencesEditor.apply();
                    switch37.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value38",false);
                    userPreferencesEditor.apply();
                    switch38.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value39",false);
                    userPreferencesEditor.apply();
                    switch39.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value40",false);
                    userPreferencesEditor.apply();
                    switch40.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value41",false);
                    userPreferencesEditor.apply();
                    switch41.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value42",false);
                    userPreferencesEditor.apply();
                    switch42.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value43",false);
                    userPreferencesEditor.apply();
                    switch43.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value44",false);
                    userPreferencesEditor.apply();
                    switch44.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value45",false);
                    userPreferencesEditor.apply();
                    switch45.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value46",false);
                    userPreferencesEditor.apply();
                    switch46.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value47",false);
                    userPreferencesEditor.apply();
                    switch47.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save48",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value48",false);
                    userPreferencesEditor.apply();
                    switch48.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save49",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value49",false);
                    userPreferencesEditor.apply();
                    switch49.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save50",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value50",false);
                    userPreferencesEditor.apply();
                    switch50.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save51",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value51",false);
                    userPreferencesEditor.apply();
                    switch51.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save52",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value52",false);
                    userPreferencesEditor.apply();
                    switch52.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save53",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value53",false);
                    userPreferencesEditor.apply();
                    switch53.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save54",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value54",false);
                    userPreferencesEditor.apply();
                    switch54.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save55",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value55",false);
                    userPreferencesEditor.apply();
                    switch55.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save56",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value56",false);
                    userPreferencesEditor.apply();
                    switch56.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save57",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value57",false);
                    userPreferencesEditor.apply();
                    switch57.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save58",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value58",false);
                    userPreferencesEditor.apply();
                    switch58.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save59",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value59",false);
                    userPreferencesEditor.apply();
                    switch59.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save60",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value60",false);
                    userPreferencesEditor.apply();
                    switch60.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save61",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value61",false);
                    userPreferencesEditor.apply();
                    switch61.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save62",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value62",false);
                    userPreferencesEditor.apply();
                    switch62.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save63",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value63",false);
                    userPreferencesEditor.apply();
                    switch63.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save64",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value64",false);
                    userPreferencesEditor.apply();
                    switch64.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save65",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value65",false);
                    userPreferencesEditor.apply();
                    switch65.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save66",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value66",false);
                    userPreferencesEditor.apply();
                    switch66.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save67",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value67",false);
                    userPreferencesEditor.apply();
                    switch67.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save68",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value68",false);
                    userPreferencesEditor.apply();
                    switch68.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save69",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value69",false);
                    userPreferencesEditor.apply();
                    switch69.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save70",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value70",false);
                    userPreferencesEditor.apply();
                    switch70.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save71",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value71",false);
                    userPreferencesEditor.apply();
                    switch71.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save72",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value72",false);
                    userPreferencesEditor.apply();
                    switch72.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save73",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value73",false);
                    userPreferencesEditor.apply();
                    switch73.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save74",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value74",false);
                    userPreferencesEditor.apply();
                    switch74.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save75",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value75",false);
                    userPreferencesEditor.apply();
                    switch75.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save76",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value76",false);
                    userPreferencesEditor.apply();
                    switch76.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save77",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value77",false);
                    userPreferencesEditor.apply();
                    switch77.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save78",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value78",false);
                    userPreferencesEditor.apply();
                    switch78.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save79",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value79",false);
                    userPreferencesEditor.apply();
                    switch79.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save80",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value80",false);
                    userPreferencesEditor.apply();
                    switch80.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save81",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value81",false);
                    userPreferencesEditor.apply();
                    switch81.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save82",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value82",false);
                    userPreferencesEditor.apply();
                    switch82.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save83",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value83",false);
                    userPreferencesEditor.apply();
                    switch83.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save84",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value84",false);
                    userPreferencesEditor.apply();
                    switch84.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save85",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value85",false);
                    userPreferencesEditor.apply();
                    switch85.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save86",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value86",false);
                    userPreferencesEditor.apply();
                    switch86.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save87",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value87",false);
                    userPreferencesEditor.apply();
                    switch87.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save88",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value88",false);
                    userPreferencesEditor.apply();
                    switch88.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save89",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value89",false);
                    userPreferencesEditor.apply();
                    switch89.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save90",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value90",false);
                    userPreferencesEditor.apply();
                    switch90.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save91",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value91",false);
                    userPreferencesEditor.apply();
                    switch91.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save92",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value92",false);
                    userPreferencesEditor.apply();
                    switch92.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save93",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value93",false);
                    userPreferencesEditor.apply();
                    switch93.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save94",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value94",false);
                    userPreferencesEditor.apply();
                    switch94.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save95",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value95",false);
                    userPreferencesEditor.apply();
                    switch95.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save96",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value96",false);
                    userPreferencesEditor.apply();
                    switch96.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save97",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value97",false);
                    userPreferencesEditor.apply();
                    switch97.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save98",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value98",false);
                    userPreferencesEditor.apply();
                    switch98.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save99",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value99",false);
                    userPreferencesEditor.apply();
                    switch99.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save100",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value100",false);
                    userPreferencesEditor.apply();
                    switch100.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save101",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value101",false);
                    userPreferencesEditor.apply();
                    switch101.setChecked(false);

                    userPreferencesEditor =getSharedPreferences("save102",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value102",false);
                    userPreferencesEditor.apply();
                    switch102.setChecked(false);

                }else{

                    userPreferencesEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value3",true);
                    userPreferencesEditor.apply();
                    switch3.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value4",true);
                    userPreferencesEditor.apply();
                    switch4.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value5",true);
                    userPreferencesEditor.apply();
                    switch5.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value6",true);
                    userPreferencesEditor.apply();
                    switch6.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value7",true);
                    userPreferencesEditor.apply();
                    switch7.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value8",true);
                    userPreferencesEditor.apply();
                    switch8.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value9",true);
                    userPreferencesEditor.apply();
                    switch9.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value10",true);
                    userPreferencesEditor.apply();
                    switch10.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value11",true);
                    userPreferencesEditor.apply();
                    switch11.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value12",true);
                    userPreferencesEditor.apply();
                    switch12.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value13",true);
                    userPreferencesEditor.apply();
                    switch13.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value14",true);
                    userPreferencesEditor.apply();
                    switch14.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value15",true);
                    userPreferencesEditor.apply();
                    switch15.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value16",true);
                    userPreferencesEditor.apply();
                    switch16.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value17",true);
                    userPreferencesEditor.apply();
                    switch17.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value18",true);
                    userPreferencesEditor.apply();
                    switch18.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value19",true);
                    userPreferencesEditor.apply();
                    switch19.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value20",true);
                    userPreferencesEditor.apply();
                    switch20.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value21",true);
                    userPreferencesEditor.apply();
                    switch21.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value22",true);
                    userPreferencesEditor.apply();
                    switch22.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value23",true);
                    userPreferencesEditor.apply();
                    switch23.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value24",true);
                    userPreferencesEditor.apply();
                    switch24.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value25",true);
                    userPreferencesEditor.apply();
                    switch25.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value26",true);
                    userPreferencesEditor.apply();
                    switch26.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value27",true);
                    userPreferencesEditor.apply();
                    switch27.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value28",true);
                    userPreferencesEditor.apply();
                    switch28.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value29",true);
                    userPreferencesEditor.apply();
                    switch29.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value30",true);
                    userPreferencesEditor.apply();
                    switch30.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value31",true);
                    userPreferencesEditor.apply();
                    switch31.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value32",true);
                    userPreferencesEditor.apply();
                    switch32.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value33",true);
                    userPreferencesEditor.apply();
                    switch33.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value34",true);
                    userPreferencesEditor.apply();
                    switch34.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value35",true);
                    userPreferencesEditor.apply();
                    switch35.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value36",true);
                    userPreferencesEditor.apply();
                    switch36.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value37",true);
                    userPreferencesEditor.apply();
                    switch37.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value38",true);
                    userPreferencesEditor.apply();
                    switch38.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value39",true);
                    userPreferencesEditor.apply();
                    switch39.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value40",true);
                    userPreferencesEditor.apply();
                    switch40.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value41",true);
                    userPreferencesEditor.apply();
                    switch41.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value42",true);
                    userPreferencesEditor.apply();
                    switch42.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value43",true);
                    userPreferencesEditor.apply();
                    switch43.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value44",true);
                    userPreferencesEditor.apply();
                    switch44.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value45",true);
                    userPreferencesEditor.apply();
                    switch45.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value46",true);
                    userPreferencesEditor.apply();
                    switch46.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value47",true);
                    userPreferencesEditor.apply();
                    switch47.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save48",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value48",true);
                    userPreferencesEditor.apply();
                    switch48.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save49",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value49",true);
                    userPreferencesEditor.apply();
                    switch49.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save50",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value50",true);
                    userPreferencesEditor.apply();
                    switch50.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save51",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value51",true);
                    userPreferencesEditor.apply();
                    switch51.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save52",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value52",true);
                    userPreferencesEditor.apply();
                    switch52.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save53",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value53",true);
                    userPreferencesEditor.apply();
                    switch53.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save54",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value54",true);
                    userPreferencesEditor.apply();
                    switch54.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save55",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value55",true);
                    userPreferencesEditor.apply();
                    switch55.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save56",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value56",true);
                    userPreferencesEditor.apply();
                    switch56.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save57",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value57",true);
                    userPreferencesEditor.apply();
                    switch57.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save58",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value58",true);
                    userPreferencesEditor.apply();
                    switch58.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save59",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value59",true);
                    userPreferencesEditor.apply();
                    switch59.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save60",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value60",true);
                    userPreferencesEditor.apply();
                    switch60.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save61",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value61",true);
                    userPreferencesEditor.apply();
                    switch61.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save62",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value62",true);
                    userPreferencesEditor.apply();
                    switch62.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save63",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value63",true);
                    userPreferencesEditor.apply();
                    switch63.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save64",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value64",true);
                    userPreferencesEditor.apply();
                    switch64.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save65",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value65",true);
                    userPreferencesEditor.apply();
                    switch65.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save66",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value66",true);
                    userPreferencesEditor.apply();
                    switch66.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save67",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value67",true);
                    userPreferencesEditor.apply();
                    switch67.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save68",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value68",true);
                    userPreferencesEditor.apply();
                    switch68.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save69",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value69",true);
                    userPreferencesEditor.apply();
                    switch69.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save70",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value70",true);
                    userPreferencesEditor.apply();
                    switch70.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save71",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value71",true);
                    userPreferencesEditor.apply();
                    switch71.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save72",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value72",true);
                    userPreferencesEditor.apply();
                    switch72.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save73",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value73",true);
                    userPreferencesEditor.apply();
                    switch73.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save74",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value74",true);
                    userPreferencesEditor.apply();
                    switch74.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save75",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value75",true);
                    userPreferencesEditor.apply();
                    switch75.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save76",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value76",true);
                    userPreferencesEditor.apply();
                    switch76.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save77",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value77",true);
                    userPreferencesEditor.apply();
                    switch77.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save78",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value78",true);
                    userPreferencesEditor.apply();
                    switch78.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save79",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value79",true);
                    userPreferencesEditor.apply();
                    switch79.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save80",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value80",true);
                    userPreferencesEditor.apply();
                    switch80.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save81",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value81",true);
                    userPreferencesEditor.apply();
                    switch81.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save82",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value82",true);
                    userPreferencesEditor.apply();
                    switch82.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save83",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value83",true);
                    userPreferencesEditor.apply();
                    switch83.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save84",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value84",true);
                    userPreferencesEditor.apply();
                    switch84.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save85",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value85",true);
                    userPreferencesEditor.apply();
                    switch85.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save86",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value86",true);
                    userPreferencesEditor.apply();
                    switch86.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save87",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value87",true);
                    userPreferencesEditor.apply();
                    switch87.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save88",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value88",true);
                    userPreferencesEditor.apply();
                    switch88.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save89",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value89",true);
                    userPreferencesEditor.apply();
                    switch89.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save90",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value90",true);
                    userPreferencesEditor.apply();
                    switch90.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save91",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value91",true);
                    userPreferencesEditor.apply();
                    switch91.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save92",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value92",true);
                    userPreferencesEditor.apply();
                    switch92.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save93",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value93",true);
                    userPreferencesEditor.apply();
                    switch93.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save94",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value94",true);
                    userPreferencesEditor.apply();
                    switch94.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save95",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value95",true);
                    userPreferencesEditor.apply();
                    switch95.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save96",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value96",true);
                    userPreferencesEditor.apply();
                    switch96.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save97",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value97",true);
                    userPreferencesEditor.apply();
                    switch97.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save98",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value98",true);
                    userPreferencesEditor.apply();
                    switch98.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save99",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value99",true);
                    userPreferencesEditor.apply();
                    switch99.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save100",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value100",true);
                    userPreferencesEditor.apply();
                    switch100.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save101",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value101",true);
                    userPreferencesEditor.apply();
                    switch101.setChecked(true);

                    userPreferencesEditor =getSharedPreferences("save102",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value102",true);
                    userPreferencesEditor.apply();
                    switch102.setChecked(true);

                }
            }
        });

// for switch 3 to activate
        switch3= findViewById(R.id.switch3);
        userPreferences =getSharedPreferences("save3",MODE_PRIVATE);
        switch3.setChecked(userPreferences.getBoolean("value3",true));
        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch3.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value3",true);
                    userPreferencesEditor.apply();
                    switch3.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save3",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value3",false);
                    userPreferencesEditor.apply();
                    switch3.setChecked(false);
                }
            }
        });

// for switch 4 to activate
        switch4= findViewById(R.id.switch4);
        userPreferences =getSharedPreferences("save4",MODE_PRIVATE);
        switch4.setChecked(userPreferences.getBoolean("value4",true));
        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch4.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value4",true);
                    userPreferencesEditor.apply();
                    switch4.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save4",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value4",false);
                    userPreferencesEditor.apply();
                    switch4.setChecked(false);
                }
            }
        });

// for switch 5 to activate
        switch5= findViewById(R.id.switch5);
        userPreferences =getSharedPreferences("save5",MODE_PRIVATE);
        switch5.setChecked(userPreferences.getBoolean("value5",true));
        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch5.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value5",true);
                    userPreferencesEditor.apply();
                    switch5.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save5",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value5",false);
                    userPreferencesEditor.apply();
                    switch5.setChecked(false);
                }
            }
        });

// for switch 6 to activate
        switch6= findViewById(R.id.switch6);
        userPreferences =getSharedPreferences("save6",MODE_PRIVATE);
        switch6.setChecked(userPreferences.getBoolean("value6",true));
        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch6.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value6",true);
                    userPreferencesEditor.apply();
                    switch6.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save6",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value6",false);
                    userPreferencesEditor.apply();
                    switch6.setChecked(false);
                }
            }
        });

// for switch 7 to activate
        switch7= findViewById(R.id.switch7);
        userPreferences =getSharedPreferences("save7",MODE_PRIVATE);
        switch7.setChecked(userPreferences.getBoolean("value7",true));
        switch7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch7.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value7",true);
                    userPreferencesEditor.apply();
                    switch7.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save7",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value7",false);
                    userPreferencesEditor.apply();
                    switch7.setChecked(false);
                }
            }
        });

// for switch 8 to activate
        switch8= findViewById(R.id.switch8);
        userPreferences =getSharedPreferences("save8",MODE_PRIVATE);
        switch8.setChecked(userPreferences.getBoolean("value8",true));
        switch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch8.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value8",true);
                    userPreferencesEditor.apply();
                    switch8.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save8",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value8",false);
                    userPreferencesEditor.apply();
                    switch8.setChecked(false);
                }
            }
        });

// for switch 9 to activate
        switch9= findViewById(R.id.switch9);
        userPreferences =getSharedPreferences("save9",MODE_PRIVATE);
        switch9.setChecked(userPreferences.getBoolean("value9",true));
        switch9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch9.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value9",true);
                    userPreferencesEditor.apply();
                    switch9.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save9",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value9",false);
                    userPreferencesEditor.apply();
                    switch9.setChecked(false);
                }
            }
        });

// for switch 10 to activate
        switch10= findViewById(R.id.switch10);
        userPreferences =getSharedPreferences("save10",MODE_PRIVATE);
        switch10.setChecked(userPreferences.getBoolean("value10",true));
        switch10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch10.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value10",true);
                    userPreferencesEditor.apply();
                    switch10.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save10",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value10",false);
                    userPreferencesEditor.apply();
                    switch10.setChecked(false);
                }
            }
        });

// for switch 11 to activate
        switch11= findViewById(R.id.switch11);
        userPreferences =getSharedPreferences("save11",MODE_PRIVATE);
        switch11.setChecked(userPreferences.getBoolean("value11",true));
        switch11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch11.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value11",true);
                    userPreferencesEditor.apply();
                    switch11.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save11",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value11",false);
                    userPreferencesEditor.apply();
                    switch11.setChecked(false);
                }
            }
        });

// for switch 12 to activate
        switch12= findViewById(R.id.switch12);
        userPreferences =getSharedPreferences("save12",MODE_PRIVATE);
        switch12.setChecked(userPreferences.getBoolean("value12",true));
        switch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch12.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value12",true);
                    userPreferencesEditor.apply();
                    switch12.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save12",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value12",false);
                    userPreferencesEditor.apply();
                    switch12.setChecked(false);
                }
            }
        });

// for switch 13 to activate
        switch13= findViewById(R.id.switch13);
        userPreferences =getSharedPreferences("save13",MODE_PRIVATE);
        switch13.setChecked(userPreferences.getBoolean("value13",true));
        switch13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch13.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value13",true);
                    userPreferencesEditor.apply();
                    switch13.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save13",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value13",false);
                    userPreferencesEditor.apply();
                    switch13.setChecked(false);
                }
            }
        });

// for switch 14 to activate
        switch14= findViewById(R.id.switch14);
        userPreferences =getSharedPreferences("save14",MODE_PRIVATE);
        switch14.setChecked(userPreferences.getBoolean("value14",true));
        switch14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch14.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value14",true);
                    userPreferencesEditor.apply();
                    switch14.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save14",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value14",false);
                    userPreferencesEditor.apply();
                    switch14.setChecked(false);
                }
            }
        });

// for switch 15 to activate
        switch15= findViewById(R.id.switch15);
        userPreferences =getSharedPreferences("save15",MODE_PRIVATE);
        switch15.setChecked(userPreferences.getBoolean("value15",true));
        switch15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch15.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value15",true);
                    userPreferencesEditor.apply();
                    switch15.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save15",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value15",false);
                    userPreferencesEditor.apply();
                    switch15.setChecked(false);
                }
            }
        });

// for switch 16 to activate
        switch16= findViewById(R.id.switch16);
        userPreferences =getSharedPreferences("save16",MODE_PRIVATE);
        switch16.setChecked(userPreferences.getBoolean("value16",true));
        switch16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch16.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value16",true);
                    userPreferencesEditor.apply();
                    switch16.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save16",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value16",false);
                    userPreferencesEditor.apply();
                    switch16.setChecked(false);
                }
            }
        });

// for switch 17 to activate
        switch17= findViewById(R.id.switch17);
        userPreferences =getSharedPreferences("save17",MODE_PRIVATE);
        switch17.setChecked(userPreferences.getBoolean("value17",true));
        switch17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch17.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value17",true);
                    userPreferencesEditor.apply();
                    switch17.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save17",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value17",false);
                    userPreferencesEditor.apply();
                    switch17.setChecked(false);
                }
            }
        });

// for switch 18 to activate
        switch18= findViewById(R.id.switch18);
        userPreferences =getSharedPreferences("save18",MODE_PRIVATE);
        switch18.setChecked(userPreferences.getBoolean("value18",true));
        switch18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch18.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value18",true);
                    userPreferencesEditor.apply();
                    switch18.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save18",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value18",false);
                    userPreferencesEditor.apply();
                    switch18.setChecked(false);
                }
            }
        });

// for switch 19 to activate
        switch19= findViewById(R.id.switch19);
        userPreferences =getSharedPreferences("save19",MODE_PRIVATE);
        switch19.setChecked(userPreferences.getBoolean("value19",true));
        switch19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch19.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value19",true);
                    userPreferencesEditor.apply();
                    switch19.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save19",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value19",false);
                    userPreferencesEditor.apply();
                    switch19.setChecked(false);
                }
            }
        });

// for switch 20 to activate
        switch20= findViewById(R.id.switch20);
        userPreferences =getSharedPreferences("save20",MODE_PRIVATE);
        switch20.setChecked(userPreferences.getBoolean("value20",true));
        switch20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch20.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value20",true);
                    userPreferencesEditor.apply();
                    switch20.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save20",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value20",false);
                    userPreferencesEditor.apply();
                    switch20.setChecked(false);
                }
            }
        });

// for switch 21 to activate
        switch21= findViewById(R.id.switch21);
        userPreferences =getSharedPreferences("save21",MODE_PRIVATE);
        switch21.setChecked(userPreferences.getBoolean("value21",true));
        switch21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch21.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value21",true);
                    userPreferencesEditor.apply();
                    switch21.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save21",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value21",false);
                    userPreferencesEditor.apply();
                    switch21.setChecked(false);
                }
            }
        });

// for switch 22 to activate
        switch22= findViewById(R.id.switch22);
        userPreferences =getSharedPreferences("save22",MODE_PRIVATE);
        switch22.setChecked(userPreferences.getBoolean("value22",true));
        switch22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch22.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value22",true);
                    userPreferencesEditor.apply();
                    switch22.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save22",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value22",false);
                    userPreferencesEditor.apply();
                    switch22.setChecked(false);
                }
            }
        });

// for switch 23 to activate
        switch23= findViewById(R.id.switch23);
        userPreferences =getSharedPreferences("save23",MODE_PRIVATE);
        switch23.setChecked(userPreferences.getBoolean("value23",true));
        switch23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch23.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value23",true);
                    userPreferencesEditor.apply();
                    switch23.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save23",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value23",false);
                    userPreferencesEditor.apply();
                    switch23.setChecked(false);
                }
            }
        });

// for switch 24 to activate
        switch24= findViewById(R.id.switch24);
        userPreferences =getSharedPreferences("save24",MODE_PRIVATE);
        switch24.setChecked(userPreferences.getBoolean("value24",true));
        switch24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch24.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value24",true);
                    userPreferencesEditor.apply();
                    switch24.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save24",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value24",false);
                    userPreferencesEditor.apply();
                    switch24.setChecked(false);
                }
            }
        });

// for switch 25 to activate
        switch25= findViewById(R.id.switch25);
        userPreferences =getSharedPreferences("save25",MODE_PRIVATE);
        switch25.setChecked(userPreferences.getBoolean("value25",true));
        switch25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch25.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value25",true);
                    userPreferencesEditor.apply();
                    switch25.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save25",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value25",false);
                    userPreferencesEditor.apply();
                    switch25.setChecked(false);
                }
            }
        });

// for switch 26 to activate
        switch26= findViewById(R.id.switch26);
        userPreferences =getSharedPreferences("save26",MODE_PRIVATE);
        switch26.setChecked(userPreferences.getBoolean("value26",true));
        switch26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch26.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value26",true);
                    userPreferencesEditor.apply();
                    switch26.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save26",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value26",false);
                    userPreferencesEditor.apply();
                    switch26.setChecked(false);
                }
            }
        });

// for switch 27 to activate
        switch27= findViewById(R.id.switch27);
        userPreferences =getSharedPreferences("save27",MODE_PRIVATE);
        switch27.setChecked(userPreferences.getBoolean("value27",true));
        switch27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch27.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value27",true);
                    userPreferencesEditor.apply();
                    switch27.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save27",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value27",false);
                    userPreferencesEditor.apply();
                    switch27.setChecked(false);
                }
            }
        });

// for switch 28 to activate
        switch28= findViewById(R.id.switch28);
        userPreferences =getSharedPreferences("save28",MODE_PRIVATE);
        switch28.setChecked(userPreferences.getBoolean("value28",true));
        switch28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch28.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value28",true);
                    userPreferencesEditor.apply();
                    switch28.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save28",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value28",false);
                    userPreferencesEditor.apply();
                    switch28.setChecked(false);
                }
            }
        });

// for switch 29 to activate
        switch29= findViewById(R.id.switch29);
        userPreferences =getSharedPreferences("save29",MODE_PRIVATE);
        switch29.setChecked(userPreferences.getBoolean("value29",true));
        switch29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch29.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value29",true);
                    userPreferencesEditor.apply();
                    switch29.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save29",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value29",false);
                    userPreferencesEditor.apply();
                    switch29.setChecked(false);
                }
            }
        });

// for switch 30 to activate
        switch30= findViewById(R.id.switch30);
        userPreferences =getSharedPreferences("save30",MODE_PRIVATE);
        switch30.setChecked(userPreferences.getBoolean("value30",true));
        switch30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch30.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value30",true);
                    userPreferencesEditor.apply();
                    switch30.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save30",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value30",false);
                    userPreferencesEditor.apply();
                    switch30.setChecked(false);
                }
            }
        });

// for switch 31 to activate
        switch31= findViewById(R.id.switch31);
        userPreferences =getSharedPreferences("save31",MODE_PRIVATE);
        switch31.setChecked(userPreferences.getBoolean("value31",true));
        switch31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch31.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value31",true);
                    userPreferencesEditor.apply();
                    switch31.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save31",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value31",false);
                    userPreferencesEditor.apply();
                    switch31.setChecked(false);
                }
            }
        });

// for switch 32 to activate
        switch32= findViewById(R.id.switch32);
        userPreferences =getSharedPreferences("save32",MODE_PRIVATE);
        switch32.setChecked(userPreferences.getBoolean("value32",true));
        switch32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch32.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value32",true);
                    userPreferencesEditor.apply();
                    switch32.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save32",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value32",false);
                    userPreferencesEditor.apply();
                    switch32.setChecked(false);
                }
            }
        });

// for switch 33 to activate
        switch33= findViewById(R.id.switch33);
        userPreferences =getSharedPreferences("save33",MODE_PRIVATE);
        switch33.setChecked(userPreferences.getBoolean("value33",true));
        switch33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch33.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value33",true);
                    userPreferencesEditor.apply();
                    switch33.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save33",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value33",false);
                    userPreferencesEditor.apply();
                    switch33.setChecked(false);
                }
            }
        });

// for switch 34 to activate
        switch34= findViewById(R.id.switch34);
        userPreferences =getSharedPreferences("save34",MODE_PRIVATE);
        switch34.setChecked(userPreferences.getBoolean("value34",true));
        switch34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch34.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value34",true);
                    userPreferencesEditor.apply();
                    switch34.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save34",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value34",false);
                    userPreferencesEditor.apply();
                    switch34.setChecked(false);
                }
            }
        });

// for switch 35 to activate
        switch35= findViewById(R.id.switch35);
        userPreferences =getSharedPreferences("save35",MODE_PRIVATE);
        switch35.setChecked(userPreferences.getBoolean("value35",true));
        switch35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch35.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value35",true);
                    userPreferencesEditor.apply();
                    switch35.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save35",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value35",false);
                    userPreferencesEditor.apply();
                    switch35.setChecked(false);
                }
            }
        });

// for switch 36 to activate
        switch36= findViewById(R.id.switch36);
        userPreferences =getSharedPreferences("save36",MODE_PRIVATE);
        switch36.setChecked(userPreferences.getBoolean("value36",true));
        switch36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch36.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value36",true);
                    userPreferencesEditor.apply();
                    switch36.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save36",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value36",false);
                    userPreferencesEditor.apply();
                    switch36.setChecked(false);
                }
            }
        });

// for switch 37 to activate
        switch37= findViewById(R.id.switch37);
        userPreferences =getSharedPreferences("save37",MODE_PRIVATE);
        switch37.setChecked(userPreferences.getBoolean("value37",true));
        switch37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch37.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value37",true);
                    userPreferencesEditor.apply();
                    switch37.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save37",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value37",false);
                    userPreferencesEditor.apply();
                    switch37.setChecked(false);
                }
            }
        });

// for switch 38 to activate
        switch38= findViewById(R.id.switch38);
        userPreferences =getSharedPreferences("save38",MODE_PRIVATE);
        switch38.setChecked(userPreferences.getBoolean("value38",true));
        switch38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch38.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value38",true);
                    userPreferencesEditor.apply();
                    switch38.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save38",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value38",false);
                    userPreferencesEditor.apply();
                    switch38.setChecked(false);
                }
            }
        });

// for switch 39 to activate
        switch39= findViewById(R.id.switch39);
        userPreferences =getSharedPreferences("save39",MODE_PRIVATE);
        switch39.setChecked(userPreferences.getBoolean("value39",true));
        switch39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch39.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value39",true);
                    userPreferencesEditor.apply();
                    switch39.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save39",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value39",false);
                    userPreferencesEditor.apply();
                    switch39.setChecked(false);
                }
            }
        });

// for switch 40 to activate
        switch40= findViewById(R.id.switch40);
        userPreferences =getSharedPreferences("save40",MODE_PRIVATE);
        switch40.setChecked(userPreferences.getBoolean("value40",true));
        switch40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch40.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value40",true);
                    userPreferencesEditor.apply();
                    switch40.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save40",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value40",false);
                    userPreferencesEditor.apply();
                    switch40.setChecked(false);
                }
            }
        });

// for switch 41 to activate
        switch41= findViewById(R.id.switch41);
        userPreferences =getSharedPreferences("save41",MODE_PRIVATE);
        switch41.setChecked(userPreferences.getBoolean("value41",true));
        switch41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch41.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value41",true);
                    userPreferencesEditor.apply();
                    switch41.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save41",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value41",false);
                    userPreferencesEditor.apply();
                    switch41.setChecked(false);
                }
            }
        });

// for switch 42 to activate
        switch42= findViewById(R.id.switch42);
        userPreferences =getSharedPreferences("save42",MODE_PRIVATE);
        switch42.setChecked(userPreferences.getBoolean("value42",true));
        switch42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch42.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value42",true);
                    userPreferencesEditor.apply();
                    switch42.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save42",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value42",false);
                    userPreferencesEditor.apply();
                    switch42.setChecked(false);
                }
            }
        });

// for switch 43 to activate
        switch43= findViewById(R.id.switch43);
        userPreferences =getSharedPreferences("save43",MODE_PRIVATE);
        switch43.setChecked(userPreferences.getBoolean("value43",true));
        switch43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch43.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value43",true);
                    userPreferencesEditor.apply();
                    switch43.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save43",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value43",false);
                    userPreferencesEditor.apply();
                    switch43.setChecked(false);
                }
            }
        });

// for switch 44 to activate
        switch44= findViewById(R.id.switch44);
        userPreferences =getSharedPreferences("save44",MODE_PRIVATE);
        switch44.setChecked(userPreferences.getBoolean("value44",true));
        switch44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch44.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value44",true);
                    userPreferencesEditor.apply();
                    switch44.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save44",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value44",false);
                    userPreferencesEditor.apply();
                    switch44.setChecked(false);
                }
            }
        });

// for switch 45 to activate
        switch45= findViewById(R.id.switch45);
        userPreferences =getSharedPreferences("save45",MODE_PRIVATE);
        switch45.setChecked(userPreferences.getBoolean("value45",true));
        switch45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch45.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value45",true);
                    userPreferencesEditor.apply();
                    switch45.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save45",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value45",false);
                    userPreferencesEditor.apply();
                    switch45.setChecked(false);
                }
            }
        });

// for switch 46 to activate
        switch46= findViewById(R.id.switch46);
        userPreferences =getSharedPreferences("save46",MODE_PRIVATE);
        switch46.setChecked(userPreferences.getBoolean("value46",true));
        switch46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch46.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value46",true);
                    userPreferencesEditor.apply();
                    switch46.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save46",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value46",false);
                    userPreferencesEditor.apply();
                    switch46.setChecked(false);
                }
            }
        });

// for switch 47 to activate
        switch47= findViewById(R.id.switch47);
        userPreferences =getSharedPreferences("save47",MODE_PRIVATE);
        switch47.setChecked(userPreferences.getBoolean("value47",true));
        switch47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch47.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value47",true);
                    userPreferencesEditor.apply();
                    switch47.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save47",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value47",false);
                    userPreferencesEditor.apply();
                    switch47.setChecked(false);
                }
            }
        });

// for switch 48 to activate
        switch48= findViewById(R.id.switch48);
        userPreferences =getSharedPreferences("save48",MODE_PRIVATE);
        switch48.setChecked(userPreferences.getBoolean("value48",true));
        switch48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch48.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save48",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value48",true);
                    userPreferencesEditor.apply();
                    switch48.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save48",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value48",false);
                    userPreferencesEditor.apply();
                    switch48.setChecked(false);
                }
            }
        });

// for switch 49 to activate
        switch49= findViewById(R.id.switch49);
        userPreferences =getSharedPreferences("save49",MODE_PRIVATE);
        switch49.setChecked(userPreferences.getBoolean("value49",true));
        switch49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch49.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save49",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value49",true);
                    userPreferencesEditor.apply();
                    switch49.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save49",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value49",false);
                    userPreferencesEditor.apply();
                    switch49.setChecked(false);
                }
            }
        });

// for switch 50 to activate
        switch50= findViewById(R.id.switch50);
        userPreferences =getSharedPreferences("save50",MODE_PRIVATE);
        switch50.setChecked(userPreferences.getBoolean("value50",true));
        switch50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch50.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save50",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value50",true);
                    userPreferencesEditor.apply();
                    switch50.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save50",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value50",false);
                    userPreferencesEditor.apply();
                    switch50.setChecked(false);
                }
            }
        });

// for switch 51 to activate
        switch51= findViewById(R.id.switch51);
        userPreferences =getSharedPreferences("save51",MODE_PRIVATE);
        switch51.setChecked(userPreferences.getBoolean("value51",true));
        switch51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch51.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save51",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value51",true);
                    userPreferencesEditor.apply();
                    switch51.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save51",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value51",false);
                    userPreferencesEditor.apply();
                    switch51.setChecked(false);
                }
            }
        });

// for switch 52 to activate
        switch52= findViewById(R.id.switch52);
        userPreferences =getSharedPreferences("save52",MODE_PRIVATE);
        switch52.setChecked(userPreferences.getBoolean("value52",true));
        switch52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch52.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save52",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value52",true);
                    userPreferencesEditor.apply();
                    switch52.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save52",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value52",false);
                    userPreferencesEditor.apply();
                    switch52.setChecked(false);
                }
            }
        });

// for switch 53 to activate
        switch53= findViewById(R.id.switch53);
        userPreferences =getSharedPreferences("save53",MODE_PRIVATE);
        switch53.setChecked(userPreferences.getBoolean("value53",true));
        switch53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch53.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save53",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value53",true);
                    userPreferencesEditor.apply();
                    switch53.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save53",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value53",false);
                    userPreferencesEditor.apply();
                    switch53.setChecked(false);
                }
            }
        });

// for switch 54 to activate
        switch54= findViewById(R.id.switch54);
        userPreferences =getSharedPreferences("save54",MODE_PRIVATE);
        switch54.setChecked(userPreferences.getBoolean("value54",true));
        switch54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch54.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save54",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value54",true);
                    userPreferencesEditor.apply();
                    switch54.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save54",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value54",false);
                    userPreferencesEditor.apply();
                    switch54.setChecked(false);
                }
            }
        });

// for switch 55 to activate
        switch55= findViewById(R.id.switch55);
        userPreferences =getSharedPreferences("save55",MODE_PRIVATE);
        switch55.setChecked(userPreferences.getBoolean("value55",true));
        switch55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch55.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save55",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value55",true);
                    userPreferencesEditor.apply();
                    switch55.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save55",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value55",false);
                    userPreferencesEditor.apply();
                    switch55.setChecked(false);
                }
            }
        });

// for switch 56 to activate
        switch56= findViewById(R.id.switch56);
        userPreferences =getSharedPreferences("save56",MODE_PRIVATE);
        switch56.setChecked(userPreferences.getBoolean("value56",true));
        switch56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch56.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save56",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value56",true);
                    userPreferencesEditor.apply();
                    switch56.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save56",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value56",false);
                    userPreferencesEditor.apply();
                    switch56.setChecked(false);
                }
            }
        });

// for switch 57 to activate
        switch57= findViewById(R.id.switch57);
        userPreferences =getSharedPreferences("save57",MODE_PRIVATE);
        switch57.setChecked(userPreferences.getBoolean("value57",true));
        switch57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch57.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save57",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value57",true);
                    userPreferencesEditor.apply();
                    switch57.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save57",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value57",false);
                    userPreferencesEditor.apply();
                    switch57.setChecked(false);
                }
            }
        });

// for switch 58 to activate
        switch58= findViewById(R.id.switch58);
        userPreferences =getSharedPreferences("save58",MODE_PRIVATE);
        switch58.setChecked(userPreferences.getBoolean("value58",true));
        switch58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch58.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save58",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value58",true);
                    userPreferencesEditor.apply();
                    switch58.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save58",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value58",false);
                    userPreferencesEditor.apply();
                    switch58.setChecked(false);
                }
            }
        });

// for switch 59 to activate
        switch59= findViewById(R.id.switch59);
        userPreferences =getSharedPreferences("save59",MODE_PRIVATE);
        switch59.setChecked(userPreferences.getBoolean("value59",true));
        switch59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch59.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save59",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value59",true);
                    userPreferencesEditor.apply();
                    switch59.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save59",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value59",false);
                    userPreferencesEditor.apply();
                    switch59.setChecked(false);
                }
            }
        });

// for switch 60 to activate
        switch60= findViewById(R.id.switch60);
        userPreferences =getSharedPreferences("save60",MODE_PRIVATE);
        switch60.setChecked(userPreferences.getBoolean("value60",true));
        switch60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch60.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save60",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value60",true);
                    userPreferencesEditor.apply();
                    switch60.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save60",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value60",false);
                    userPreferencesEditor.apply();
                    switch60.setChecked(false);
                }
            }
        });

// for switch 61 to activate
        switch61= findViewById(R.id.switch61);
        userPreferences =getSharedPreferences("save61",MODE_PRIVATE);
        switch61.setChecked(userPreferences.getBoolean("value61",true));
        switch61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch61.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save61",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value61",true);
                    userPreferencesEditor.apply();
                    switch61.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save61",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value61",false);
                    userPreferencesEditor.apply();
                    switch61.setChecked(false);
                }
            }
        });

// for switch 62 to activate
        switch62= findViewById(R.id.switch62);
        userPreferences =getSharedPreferences("save62",MODE_PRIVATE);
        switch62.setChecked(userPreferences.getBoolean("value62",true));
        switch62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch62.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save62",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value62",true);
                    userPreferencesEditor.apply();
                    switch62.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save62",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value62",false);
                    userPreferencesEditor.apply();
                    switch62.setChecked(false);
                }
            }
        });

// for switch 63 to activate
        switch63= findViewById(R.id.switch63);
        userPreferences =getSharedPreferences("save63",MODE_PRIVATE);
        switch63.setChecked(userPreferences.getBoolean("value63",true));
        switch63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch63.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save63",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value63",true);
                    userPreferencesEditor.apply();
                    switch63.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save63",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value63",false);
                    userPreferencesEditor.apply();
                    switch63.setChecked(false);
                }
            }
        });

// for switch 64 to activate
        switch64= findViewById(R.id.switch64);
        userPreferences =getSharedPreferences("save64",MODE_PRIVATE);
        switch64.setChecked(userPreferences.getBoolean("value64",true));
        switch64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch64.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save64",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value64",true);
                    userPreferencesEditor.apply();
                    switch64.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save64",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value64",false);
                    userPreferencesEditor.apply();
                    switch64.setChecked(false);
                }
            }
        });

// for switch 65 to activate
        switch65= findViewById(R.id.switch65);
        userPreferences =getSharedPreferences("save65",MODE_PRIVATE);
        switch65.setChecked(userPreferences.getBoolean("value65",true));
        switch65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch65.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save65",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value65",true);
                    userPreferencesEditor.apply();
                    switch65.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save65",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value65",false);
                    userPreferencesEditor.apply();
                    switch65.setChecked(false);
                }
            }
        });

// for switch 66 to activate
        switch66= findViewById(R.id.switch66);
        userPreferences =getSharedPreferences("save66",MODE_PRIVATE);
        switch66.setChecked(userPreferences.getBoolean("value66",true));
        switch66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch66.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save66",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value66",true);
                    userPreferencesEditor.apply();
                    switch66.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save66",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value66",false);
                    userPreferencesEditor.apply();
                    switch66.setChecked(false);
                }
            }
        });

// for switch 67 to activate
        switch67= findViewById(R.id.switch67);
        userPreferences =getSharedPreferences("save67",MODE_PRIVATE);
        switch67.setChecked(userPreferences.getBoolean("value67",true));
        switch67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch67.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save67",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value67",true);
                    userPreferencesEditor.apply();
                    switch67.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save67",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value67",false);
                    userPreferencesEditor.apply();
                    switch67.setChecked(false);
                }
            }
        });

// for switch 68 to activate
        switch68= findViewById(R.id.switch68);
        userPreferences =getSharedPreferences("save68",MODE_PRIVATE);
        switch68.setChecked(userPreferences.getBoolean("value68",true));
        switch68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch68.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save68",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value68",true);
                    userPreferencesEditor.apply();
                    switch68.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save68",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value68",false);
                    userPreferencesEditor.apply();
                    switch68.setChecked(false);
                }
            }
        });

// for switch 69 to activate
        switch69= findViewById(R.id.switch69);
        userPreferences =getSharedPreferences("save69",MODE_PRIVATE);
        switch69.setChecked(userPreferences.getBoolean("value69",true));
        switch69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch69.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save69",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value69",true);
                    userPreferencesEditor.apply();
                    switch69.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save69",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value69",false);
                    userPreferencesEditor.apply();
                    switch69.setChecked(false);
                }
            }
        });

// for switch 70 to activate
        switch70= findViewById(R.id.switch70);
        userPreferences =getSharedPreferences("save70",MODE_PRIVATE);
        switch70.setChecked(userPreferences.getBoolean("value70",true));
        switch70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch70.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save70",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value70",true);
                    userPreferencesEditor.apply();
                    switch70.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save70",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value70",false);
                    userPreferencesEditor.apply();
                    switch70.setChecked(false);
                }
            }
        });

// for switch 71 to activate
        switch71= findViewById(R.id.switch71);
        userPreferences =getSharedPreferences("save71",MODE_PRIVATE);
        switch71.setChecked(userPreferences.getBoolean("value71",true));
        switch71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch71.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save71",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value71",true);
                    userPreferencesEditor.apply();
                    switch71.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save71",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value71",false);
                    userPreferencesEditor.apply();
                    switch71.setChecked(false);
                }
            }
        });

// for switch 72 to activate
        switch72= findViewById(R.id.switch72);
        userPreferences =getSharedPreferences("save72",MODE_PRIVATE);
        switch72.setChecked(userPreferences.getBoolean("value72",true));
        switch72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch72.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save72",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value72",true);
                    userPreferencesEditor.apply();
                    switch72.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save72",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value72",false);
                    userPreferencesEditor.apply();
                    switch72.setChecked(false);
                }
            }
        });

// for switch 73 to activate
        switch73= findViewById(R.id.switch73);
        userPreferences =getSharedPreferences("save73",MODE_PRIVATE);
        switch73.setChecked(userPreferences.getBoolean("value73",true));
        switch73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch73.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save73",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value73",true);
                    userPreferencesEditor.apply();
                    switch73.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save73",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value73",false);
                    userPreferencesEditor.apply();
                    switch73.setChecked(false);
                }
            }
        });

// for switch 74 to activate
        switch74= findViewById(R.id.switch74);
        userPreferences =getSharedPreferences("save74",MODE_PRIVATE);
        switch74.setChecked(userPreferences.getBoolean("value74",true));
        switch74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch74.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save74",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value74",true);
                    userPreferencesEditor.apply();
                    switch74.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save74",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value74",false);
                    userPreferencesEditor.apply();
                    switch74.setChecked(false);
                }
            }
        });

// for switch 75 to activate
        switch75= findViewById(R.id.switch75);
        userPreferences =getSharedPreferences("save75",MODE_PRIVATE);
        switch75.setChecked(userPreferences.getBoolean("value75",true));
        switch75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch75.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save75",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value75",true);
                    userPreferencesEditor.apply();
                    switch75.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save75",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value75",false);
                    userPreferencesEditor.apply();
                    switch75.setChecked(false);
                }
            }
        });

// for switch 76 to activate
        switch76= findViewById(R.id.switch76);
        userPreferences =getSharedPreferences("save76",MODE_PRIVATE);
        switch76.setChecked(userPreferences.getBoolean("value76",true));
        switch76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch76.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save76",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value76",true);
                    userPreferencesEditor.apply();
                    switch76.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save76",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value76",false);
                    userPreferencesEditor.apply();
                    switch76.setChecked(false);
                }
            }
        });

// for switch 77 to activate
        switch77= findViewById(R.id.switch77);
        userPreferences =getSharedPreferences("save77",MODE_PRIVATE);
        switch77.setChecked(userPreferences.getBoolean("value77",true));
        switch77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch77.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save77",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value77",true);
                    userPreferencesEditor.apply();
                    switch77.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save77",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value77",false);
                    userPreferencesEditor.apply();
                    switch77.setChecked(false);
                }
            }
        });

// for switch 78 to activate
        switch78= findViewById(R.id.switch78);
        userPreferences =getSharedPreferences("save78",MODE_PRIVATE);
        switch78.setChecked(userPreferences.getBoolean("value78",true));
        switch78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch78.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save78",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value78",true);
                    userPreferencesEditor.apply();
                    switch78.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save78",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value78",false);
                    userPreferencesEditor.apply();
                    switch78.setChecked(false);
                }
            }
        });

// for switch 79 to activate
        switch79= findViewById(R.id.switch79);
        userPreferences =getSharedPreferences("save79",MODE_PRIVATE);
        switch79.setChecked(userPreferences.getBoolean("value79",true));
        switch79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch79.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save79",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value79",true);
                    userPreferencesEditor.apply();
                    switch79.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save79",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value79",false);
                    userPreferencesEditor.apply();
                    switch79.setChecked(false);
                }
            }
        });

// for switch 80 to activate
        switch80= findViewById(R.id.switch80);
        userPreferences =getSharedPreferences("save80",MODE_PRIVATE);
        switch80.setChecked(userPreferences.getBoolean("value80",true));
        switch80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch80.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save80",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value80",true);
                    userPreferencesEditor.apply();
                    switch80.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save80",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value80",false);
                    userPreferencesEditor.apply();
                    switch80.setChecked(false);
                }
            }
        });

// for switch 81 to activate
        switch81= findViewById(R.id.switch81);
        userPreferences =getSharedPreferences("save81",MODE_PRIVATE);
        switch81.setChecked(userPreferences.getBoolean("value81",true));
        switch81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch81.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save81",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value81",true);
                    userPreferencesEditor.apply();
                    switch81.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save81",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value81",false);
                    userPreferencesEditor.apply();
                    switch81.setChecked(false);
                }
            }
        });

// for switch 82 to activate
        switch82= findViewById(R.id.switch82);
        userPreferences =getSharedPreferences("save82",MODE_PRIVATE);
        switch82.setChecked(userPreferences.getBoolean("value82",true));
        switch82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch82.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save82",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value82",true);
                    userPreferencesEditor.apply();
                    switch82.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save82",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value82",false);
                    userPreferencesEditor.apply();
                    switch82.setChecked(false);
                }
            }
        });

// for switch 83 to activate
        switch83= findViewById(R.id.switch83);
        userPreferences =getSharedPreferences("save83",MODE_PRIVATE);
        switch83.setChecked(userPreferences.getBoolean("value83",true));
        switch83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch83.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save83",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value83",true);
                    userPreferencesEditor.apply();
                    switch83.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save83",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value83",false);
                    userPreferencesEditor.apply();
                    switch83.setChecked(false);
                }
            }
        });

// for switch 84 to activate
        switch84= findViewById(R.id.switch84);
        userPreferences =getSharedPreferences("save84",MODE_PRIVATE);
        switch84.setChecked(userPreferences.getBoolean("value84",true));
        switch84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch84.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save84",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value84",true);
                    userPreferencesEditor.apply();
                    switch84.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save84",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value84",false);
                    userPreferencesEditor.apply();
                    switch84.setChecked(false);
                }
            }
        });

// for switch 85 to activate
        switch85= findViewById(R.id.switch85);
        userPreferences =getSharedPreferences("save85",MODE_PRIVATE);
        switch85.setChecked(userPreferences.getBoolean("value85",true));
        switch85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch85.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save85",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value85",true);
                    userPreferencesEditor.apply();
                    switch85.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save85",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value85",false);
                    userPreferencesEditor.apply();
                    switch85.setChecked(false);
                }
            }
        });

// for switch 86 to activate
        switch86= findViewById(R.id.switch86);
        userPreferences =getSharedPreferences("save86",MODE_PRIVATE);
        switch86.setChecked(userPreferences.getBoolean("value86",true));
        switch86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch86.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save86",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value86",true);
                    userPreferencesEditor.apply();
                    switch86.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save86",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value86",false);
                    userPreferencesEditor.apply();
                    switch86.setChecked(false);
                }
            }
        });

// for switch 87 to activate
        switch87= findViewById(R.id.switch87);
        userPreferences =getSharedPreferences("save87",MODE_PRIVATE);
        switch87.setChecked(userPreferences.getBoolean("value87",true));
        switch87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch87.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save87",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value87",true);
                    userPreferencesEditor.apply();
                    switch87.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save87",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value87",false);
                    userPreferencesEditor.apply();
                    switch87.setChecked(false);
                }
            }
        });

// for switch 88 to activate
        switch88= findViewById(R.id.switch88);
        userPreferences =getSharedPreferences("save88",MODE_PRIVATE);
        switch88.setChecked(userPreferences.getBoolean("value88",true));
        switch88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch88.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save88",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value88",true);
                    userPreferencesEditor.apply();
                    switch88.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save88",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value88",false);
                    userPreferencesEditor.apply();
                    switch88.setChecked(false);
                }
            }
        });

// for switch 89 to activate
        switch89= findViewById(R.id.switch89);
        userPreferences =getSharedPreferences("save89",MODE_PRIVATE);
        switch89.setChecked(userPreferences.getBoolean("value89",true));
        switch89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch89.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save89",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value89",true);
                    userPreferencesEditor.apply();
                    switch89.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save89",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value89",false);
                    userPreferencesEditor.apply();
                    switch89.setChecked(false);
                }
            }
        });

// for switch 90 to activate
        switch90= findViewById(R.id.switch90);
        userPreferences =getSharedPreferences("save90",MODE_PRIVATE);
        switch90.setChecked(userPreferences.getBoolean("value90",true));
        switch90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch90.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save90",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value90",true);
                    userPreferencesEditor.apply();
                    switch90.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save90",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value90",false);
                    userPreferencesEditor.apply();
                    switch90.setChecked(false);
                }
            }
        });

// for switch 91 to activate
        switch91= findViewById(R.id.switch91);
        userPreferences =getSharedPreferences("save91",MODE_PRIVATE);
        switch91.setChecked(userPreferences.getBoolean("value91",true));
        switch91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch91.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save91",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value91",true);
                    userPreferencesEditor.apply();
                    switch91.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save91",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value91",false);
                    userPreferencesEditor.apply();
                    switch91.setChecked(false);
                }
            }
        });

// for switch 92 to activate
        switch92= findViewById(R.id.switch92);
        userPreferences =getSharedPreferences("save92",MODE_PRIVATE);
        switch92.setChecked(userPreferences.getBoolean("value92",true));
        switch92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch92.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save92",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value92",true);
                    userPreferencesEditor.apply();
                    switch92.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save92",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value92",false);
                    userPreferencesEditor.apply();
                    switch92.setChecked(false);
                }
            }
        });

// for switch 93 to activate
        switch93= findViewById(R.id.switch93);
        userPreferences =getSharedPreferences("save93",MODE_PRIVATE);
        switch93.setChecked(userPreferences.getBoolean("value93",true));
        switch93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch93.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save93",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value93",true);
                    userPreferencesEditor.apply();
                    switch93.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save93",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value93",false);
                    userPreferencesEditor.apply();
                    switch93.setChecked(false);
                }
            }
        });

// for switch 94 to activate
        switch94= findViewById(R.id.switch94);
        userPreferences =getSharedPreferences("save94",MODE_PRIVATE);
        switch94.setChecked(userPreferences.getBoolean("value94",true));
        switch94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch94.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save94",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value94",true);
                    userPreferencesEditor.apply();
                    switch94.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save94",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value94",false);
                    userPreferencesEditor.apply();
                    switch94.setChecked(false);
                }
            }
        });

// for switch 95 to activate
        switch95= findViewById(R.id.switch95);
        userPreferences =getSharedPreferences("save95",MODE_PRIVATE);
        switch95.setChecked(userPreferences.getBoolean("value95",true));
        switch95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch95.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save95",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value95",true);
                    userPreferencesEditor.apply();
                    switch95.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save95",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value95",false);
                    userPreferencesEditor.apply();
                    switch95.setChecked(false);
                }
            }
        });

// for switch 96 to activate
        switch96= findViewById(R.id.switch96);
        userPreferences =getSharedPreferences("save96",MODE_PRIVATE);
        switch96.setChecked(userPreferences.getBoolean("value96",true));
        switch96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch96.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save96",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value96",true);
                    userPreferencesEditor.apply();
                    switch96.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save96",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value96",false);
                    userPreferencesEditor.apply();
                    switch96.setChecked(false);
                }
            }
        });

// for switch 97 to activate
        switch97= findViewById(R.id.switch97);
        userPreferences =getSharedPreferences("save97",MODE_PRIVATE);
        switch97.setChecked(userPreferences.getBoolean("value97",true));
        switch97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch97.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save97",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value97",true);
                    userPreferencesEditor.apply();
                    switch97.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save97",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value97",false);
                    userPreferencesEditor.apply();
                    switch97.setChecked(false);
                }
            }
        });

// for switch 98 to activate
        switch98= findViewById(R.id.switch98);
        userPreferences =getSharedPreferences("save98",MODE_PRIVATE);
        switch98.setChecked(userPreferences.getBoolean("value98",true));
        switch98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch98.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save98",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value98",true);
                    userPreferencesEditor.apply();
                    switch98.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save98",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value98",false);
                    userPreferencesEditor.apply();
                    switch98.setChecked(false);
                }
            }
        });

// for switch 99 to activate
        switch99= findViewById(R.id.switch99);
        userPreferences =getSharedPreferences("save99",MODE_PRIVATE);
        switch99.setChecked(userPreferences.getBoolean("value99",true));
        switch99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch99.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save99",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value99",true);
                    userPreferencesEditor.apply();
                    switch99.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save99",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value99",false);
                    userPreferencesEditor.apply();
                    switch99.setChecked(false);
                }
            }
        });

// for switch 100 to activate
        switch100= findViewById(R.id.switch100);
        userPreferences =getSharedPreferences("save100",MODE_PRIVATE);
        switch100.setChecked(userPreferences.getBoolean("value100",true));
        switch100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch100.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save100",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value100",true);
                    userPreferencesEditor.apply();
                    switch100.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save100",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value100",false);
                    userPreferencesEditor.apply();
                    switch100.setChecked(false);
                }
            }
        });

// for switch 101 to activate
        switch101= findViewById(R.id.switch101);
        userPreferences =getSharedPreferences("save101",MODE_PRIVATE);
        switch101.setChecked(userPreferences.getBoolean("value101",true));
        switch101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch101.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save101",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value101",true);
                    userPreferencesEditor.apply();
                    switch101.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save101",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value101",false);
                    userPreferencesEditor.apply();
                    switch101.setChecked(false);
                }
            }
        });

// for switch 102 to activate
        switch102= findViewById(R.id.switch102);
        userPreferences =getSharedPreferences("save102",MODE_PRIVATE);
        switch102.setChecked(userPreferences.getBoolean("value102",true));
        switch102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch102.isChecked()){
                    userPreferencesEditor =getSharedPreferences("save102",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value102",true);
                    userPreferencesEditor.apply();
                    switch102.setChecked(true);
                }else{
                    userPreferencesEditor =getSharedPreferences("save102",MODE_PRIVATE).edit();
                    userPreferencesEditor.putBoolean("value102",false);
                    userPreferencesEditor.apply();
                    switch102.setChecked(false);
                }
            }
        });


    }

    private void retrievedata() {
        //For explicit content

        userPreferences =getSharedPreferences("DevMode",MODE_PRIVATE);
        DevCount= userPreferences.getInt("DevCount",0);
        if(DevCount==7){
            explicitContainer.setVisibility(View.VISIBLE);
        }else{
            explicitContainer.setVisibility(View.GONE);
        }

    }
}