package com.kpi.lab.music;

import java.util.List;

public class MusicModel {
    private Integer id;         // UUID identifier for the asset
    private String src;         // Path to the input file. E.g. http://url... s3://....
    private String name;        // Unique name for the asset, this is unique across the account so we can flatten the it on the public URL

    private String author;       // Friendly label for the asset, this is what a customer will see. If not specified this will default to srcName
    private String coverPicSrc; // picture of album etc
    private List<String> tags;
    private List<String> genres;

    public MusicModel() {
    }

    public MusicModel(Integer id, String src, String name, String author, String coverPicSrc, List<String> tags, List<String> genres
    ) {
        this.id = id;
        this.src = src;
        this.name = name;
        this.author = author;
        this.tags = tags;
        this.coverPicSrc = coverPicSrc;
        this.genres = genres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPicSrc() {
        return coverPicSrc;
    }

    public void setCoverPicSrc(String coverPicSrc) {
        this.coverPicSrc = coverPicSrc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}

