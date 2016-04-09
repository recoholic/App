package com.example.akane.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import java.io.InputStream;
import java.io.IOException;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.util.Log;

/**
 * Created by akane on 16/04/06.
 */
public class SubActivity1 extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);
        ImageView imageView = (ImageView)findViewById(R.id.image_view);
        try {
            InputStream istream = getResources().getAssets().open("drago.jpg");
            Bitmap bitmap = BitmapFactory.decodeStream(istream);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            Log.d("Assets","Error");
        }
    }
}
