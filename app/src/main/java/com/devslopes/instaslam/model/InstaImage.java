package com.devslopes.instaslam.model;

import android.net.Uri;

/**
 * Created by markprice on 6/14/16.
 */
public class InstaImage {
    public Uri getImgResourceUrl() {
        return imgResourceUrl;
    }

    private Uri imgResourceUrl;

    public InstaImage(Uri imgResourceUrl) {
        this.imgResourceUrl = imgResourceUrl;
    }
}
