package com.example.oblig1;

import android.media.Image;
import android.net.Uri;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GlobalStorage extends AppCompatActivity {


    private ArrayList<Image> images = new ArrayList<Image>();

    public ArrayList<Image> getImages(){
        return images;
    }

    public void addImage(Image image) {
        images.add(image);
    }

    public boolean removeImage(Image image) {
        return this.images.remove(image);
    }

    public Image getImage(Uri id) {
        for(int i = 0; i < images.size(); i++) {
            if(images.get(i).getId() == id){
                return images.get(i);
            }
        }
    }

}