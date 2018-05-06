package com.example.android.tourguide;
/**
 * This project is done by Khaidem Sandip Singha under the Udacity Android Foundations Nanodegree program.
 *
 * I confirm that this submission is my own work. I have not used code from any other Udacity student's or graduate's submission of the same project.
 * I understand that Udacity will check my submission for plagiarism, and that failure to adhere to the Udacity Honor Code may result in the cancellation of my
 * enrollment.
 */
/**
 * Created by Owner on 02-03-2018.
 */

public class Word {



    /**Headline for the place*/
    private String mHeader;

    /**Description for the headline*/
    private String mDescription;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**Url link for the topic*/
    private String mLink;
    /**
     * Create a new Word object.
     *
     * @param header is the headline of the topic
     * @param description is the description of the topic
     * @param link is the url link of the topic
     */
    public Word(String header, String description, String link){
        mHeader = header;
        mDescription = description;
        mLink = link;
    }
    /**
     * Create a new Word object.
     *
     * @param header is the headline of the topic
     * @param description is the description of the topic
     */
    public Word(String header, String description){
        mHeader = header;
        mDescription = description;
    }
    /**
     * Create a new Word object.
     *
     * @param header is the headline of the topic
     * @param description is the description of the topic
     * @param imageResourceId is the resource ID for the image file associated with this word
     */
    public Word(String header, String description, int imageResourceId){
        mHeader = header;
        mDescription = description;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the url link topic for each item
     */
    public String getLink(){
        return mLink;
    }

    /**
     * Get the Headline topic for each item
     */
    public String getHeader(){
        return mHeader;
    }

    /**
     * Get the description of each headline topic
     */
    public String getDescription(){
        return mDescription;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
