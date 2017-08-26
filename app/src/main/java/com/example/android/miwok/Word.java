package com.example.android.miwok;

/**
 * Created by ridhwan on 25/08/2017.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMalayTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param malayTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String malayTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMalayTranslation = malayTranslation;
    }

    public Word(String defaultTranslation, String malayTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMalayTranslation = malayTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMalayTranslation() {
        return mMalayTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}