package com.yuzumin.polkanoises.activities;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.yuzumin.polkanoises.R;
import com.yuzumin.polkanoises.data.Alarm;
import com.yuzumin.polkanoises.service.AlarmService;

import java.util.Calendar;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RingActivity extends AppCompatActivity {
    @BindView(R.id.activity_ring_dismiss) CardView dismiss;
    @BindView(R.id.activity_ring_snooze) CardView snooze;
    @BindView(R.id.activity_ring_clock) ImageView image;

    SharedPreferences SavedSettings;
    int charavalue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring);
        getSupportActionBar().hide();
        ButterKnife.bind(this);

        SavedSettings =getSharedPreferences("Chara",MODE_PRIVATE);
        charavalue= SavedSettings.getInt("CharaValue",0);

        switch (charavalue) {
            case 0:
                image.setImageResource(R.drawable.polka0);
                break;
            case 1:
                image.setImageResource(R.drawable.polka1);
                break;
            case 2:
                image.setImageResource(R.drawable.polka2);
                break;
            case 3:
                image.setImageResource(R.drawable.polka3);
                break;
            case 4:
                image.setImageResource(R.drawable.polka4);
                break;
            default:
                image.setImageResource(R.drawable.polka5);
                break;
        }

        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentService = new Intent(getApplicationContext(), AlarmService.class);
                getApplicationContext().stopService(intentService);
                finish();
            }
        });
        dismiss.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    dismiss.setCardBackgroundColor(getResources().getColor(R.color.button));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    dismiss.setCardBackgroundColor(getResources().getColor(R.color.clearbutton));
                }
                return false;
            }
        });

        snooze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(Calendar.MINUTE, 10);

                Alarm alarm = new Alarm(
                        new Random().nextInt(Integer.MAX_VALUE),
                        calendar.get(Calendar.HOUR_OF_DAY),
                        calendar.get(Calendar.MINUTE),
                        "Snooze",
                        System.currentTimeMillis(),
                        true,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false
                );

                alarm.schedule(getApplicationContext());

                Intent intentService = new Intent(getApplicationContext(), AlarmService.class);
                getApplicationContext().stopService(intentService);
                finish();
            }
        });
        snooze.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    snooze.setCardBackgroundColor(getResources().getColor(R.color.button));
                } else if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    snooze.setCardBackgroundColor(getResources().getColor(R.color.clearbutton));
                }
                return false;
            }
        });

        animateClock();
    }

    private void animateClock() {
        ObjectAnimator rotateAnimation = ObjectAnimator.ofFloat(image, "rotation", 0f, 20f, 0f, -20f, 0f);
        rotateAnimation.setRepeatCount(ValueAnimator.INFINITE);
        rotateAnimation.setDuration(800);
        rotateAnimation.start();
    }
}
