package com.example.xyzreader.ui;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.xyzreader.R;

/**
 * Project name xyz-reader-starter-code
 * Created by kenneth on 27/09/2017.
 */

public class ParallaxPageTransformer implements ViewPager.PageTransformer {
    private ImageView mPhotoView;
    public void transformPage(View view, float position) {

        int pageWidth = view.getWidth();


        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.setAlpha(1);

        } else if (position <= 1) { // [-1,1]
            if (mPhotoView!=null){
                mPhotoView = (ImageView) view.findViewById(R.id.photo);
                mPhotoView.setTranslationX(-position * (pageWidth / 2)); //Half the normal speed
            }


        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(1);
        }


    }
}
