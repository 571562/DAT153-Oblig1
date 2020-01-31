package com.example.oblig1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickData(View view) {
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }

    public void onclickQuiz(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void onclickAdd(View view) {
        Intent intent = new Intent(this, AddActivity.class);
        startActivity(intent);
    }



}
