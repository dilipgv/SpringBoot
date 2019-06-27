package com.courseAPI.topic;

public class Topic {

    private String name;
    private String id;
    private  String desc;

    public Topic(){}

    public Topic(String name, String id, String desc) {
        this.name = name;
        this.id = id;
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }
}
