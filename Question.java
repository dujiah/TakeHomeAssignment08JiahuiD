package com.example.du.takehomeassignment08_jiahuid;

/**
 * Created by du on 3/24/18.
 */

public class Question {
    public int location;
    public int question;
    public int photoId;

    public Question(int location, int question, int photoId) {
        this.location = location;
        this.question = question;
        this.photoId = photoId;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
