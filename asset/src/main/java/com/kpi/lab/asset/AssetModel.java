package com.kpi.lab.asset;

import java.util.List;

/**
 * Created by Andrey on 4/26/2018.
 */
public class AssetModel {
    private Integer id;         // UUID identifier for the asset
    private String src;         // Path to the input file. E.g. http://url... s3://.... multipart://...
    private String type;        // ['image' or 'video' or 'set' or 'spin' or 'document' or 'other']: Sets the type of media to create
    private String name;        // Unique name for the asset, this is unique across the account so we can flatten the it on the public URL
    private String label;       // Friendly label for the asset, this is what a customer will see. If not specified this will default to srcName
    private String srcName;     // Original filename
    private List<String> tags;

    public AssetModel() {}

    public AssetModel(Integer id, String src, String type, String name, String label, String srcName, List<String> tags) {
        this.id = id;
        this.src = src;
        this.type = type;
        this.name = name;
        this.label = label == null ? srcName : label;
        this.srcName = srcName;
        this.tags = tags;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
