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

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMalayTranslation() {
        return mMalayTranslation;
    }

}