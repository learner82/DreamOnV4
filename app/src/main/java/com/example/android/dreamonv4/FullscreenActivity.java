package com.example.android.dreamonv4;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by learner on 1/10/2017.
 */

public class FullscreenActivity extends AppCompatActivity {


    public static Bitmap decodeBitmapFromResources(Resources res, int resID,
                                                   int reqWidth, int reqHeight){

        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res,resID,options);

        options.inSampleSize = calculateSampleSize(options, reqWidth,reqHeight);
        options.inJustDecodeBounds =false;
        return BitmapFactory.decodeResource(res,resID,options);
    }

    public static int calculateSampleSize(BitmapFactory.Options options,
                                          int reqWidth, int reqHeight){
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize =1;
        if(height > reqHeight || width>reqWidth){
            final int halfHeight = height/2;
            final int halfWidth = width/2;

            while  ((halfHeight/inSampleSize) >= reqHeight &&
                    (halfWidth/inSampleSize)>=reqWidth){
                inSampleSize *=2;
            }
        }
        return inSampleSize;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        setContentView(R.layout.activity_fullscreen);

        boolean isFullScreen = intent.getBooleanExtra("isFullScreen", false);

        if (isFullScreen){
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        final int imageRes = intent.getIntExtra("currentPhoto",0);


        String r = "R"+"."+"id"+"."+ String.valueOf(imageRes);
        //ImageView image = (ImageView) findViewById(R.id.imageOnFull);
        int myNum = Integer.parseInt(r);
       //image.setBackgroundResource(imageRes);

       final ImageView image2  =(ImageView)this.findViewById(R.id.imageOnFull2);

        ViewTreeObserver vto = image2.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(){
        public boolean onPreDraw(){image2.getViewTreeObserver().removeOnPreDrawListener(this);
        final int finalHeight = image2.getMeasuredHeight();
        final int finalWidth = image2.getMeasuredWidth();

        image2.setImageBitmap(decodeBitmapFromResources(getResources(),imageRes,finalWidth,finalHeight));
        return true;}});



    }


}
