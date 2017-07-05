package com.rohan.movieroll.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseSinglePoster {

    @SerializedName("file_path")
    @Expose
    private String filePath;

    /**
     *
     * @return
     * The filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     *
     * @param filePath
     * The file_path
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}