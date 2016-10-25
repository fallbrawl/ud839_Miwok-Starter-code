package com.example.android.miwok;

/**
 * Created by nexus on 22.10.2016.
 */
public class Word {
    private String defaultTranslation = "";
    private String miwokTranslation = "";
    private boolean isImage = false;
    private int imageId = -1;

    public Word(String defaultTranslation,String miwokTranslation, int imageId){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageId = imageId;
    }

    public Word(String defaultTranslation,String miwokTranslation){
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public String getDefaultranslation(){
        return defaultTranslation;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public int getImageResourceId(){
        return imageId;
    }
}
