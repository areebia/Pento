package com.example.pento.data.model;

import java.util.ArrayList;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class Group {
    private ArrayList<String> members;
    private String tag;
    private String id;
    private String name;
    private String region;

    public Group () {}
    public Group (ArrayList<String> members, String tag, String id, String name, String region) {
        this.members = members;
        this.tag = tag;
        this.id = id;
        this.name = name;
        this.region = region;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    public ArrayList<String> getMembers() {
        return this.members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getTag() {
        return this.tag;
    }

    public String getId() {
        return this.id;
    }

    public String getRegion() {
        return this.region;
    }

}
