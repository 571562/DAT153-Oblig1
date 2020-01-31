package com.example.oblig1;


import android.media.Image;
import android.net.Uri;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class DatabaseActivity extends AppCompatActivity {

    ListView list;
    ArrayList<Image> images;
    String[] name;
    Uri[] imageId;
    Image toBeUploaded;
    Button addToDb;
    Uri uploadImageUri;
    private static final int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 1;

    private void splitListToTable() {
        images = ((GlobalStorage) this.getApplication()).getImages();
        name = new String[images.size()];
        imageId = new Uri[images.size()];
        
    }





}
