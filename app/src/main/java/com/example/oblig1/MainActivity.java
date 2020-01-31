package com.example.oblig1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImages();
    }

    public MainActivity() {
    }

    public void startQuiz(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
    public void gotoDB(View view) {
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }
    public void gotoAdd(View v){
        Intent intent = new Intent(this, AddImages.class);
        startActivity(intent);

    }

    private void initImages(){
        Image img1 = new Image("Ragdoll", Uri.parse("android.resource://com.example.oblig1/"+R.drawable.katt1));
        Image img2 = new Image("Grumpy", Uri.parse("android.resource://com.example.oblig1/"+R.drawable.katt2));
        ((GlobalStorage) this.getApplication()).addImage(img1);
        ((GlobalStorage) this.getApplication()).addImage(img2);


        for(int i = 0;i<((GlobalStorage) this.getApplication()).getImages().size();i++){
            System.out.println(((GlobalStorage) this.getApplication()).getImages().get(i));
        }

    }
}
