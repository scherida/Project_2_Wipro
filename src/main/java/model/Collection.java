package model;

import java.util.Arrays;

public class Collection {
    private String name;
    private String description;
    private String[] keywords = new String[6];

    public Collection(String name, String description, String[] keywords) {
        this.name = name;
        this.description = description;
        this.keywords = keywords;
    }

    public Collection(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", keywords=" + Arrays.toString(keywords) +
                '}';
    }
}
