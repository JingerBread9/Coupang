package com.coupang.model;

public class UserProfile {

    private String id;
    private String name;
    private Integer point;

    public UserProfile(String id, String name, Integer point)
    {
        super();
        this.id = id;
        this.name=name;
        this.point=point;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }



}
