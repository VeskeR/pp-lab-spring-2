package com.kpi.lab.adv;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class AdvModel {
    private Integer id;
    private String subject;
    private String content;
    private List<String> socialNetworks;
    private List<String> keywords;

    public AdvModel() {}

    public AdvModel(Integer id, String subject, String content, List<String> socialNetworks, List<String> keywords) {
        this.id = id;
        this.subject = subject;
        this.content = content;
        this.socialNetworks = socialNetworks;
        this.keywords = keywords;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getSocialNetworks() {
        return socialNetworks;
    }

    public void setTSocialNetworks(List<String> socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }
}