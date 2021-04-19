package models;

public class SubCollection {
    protected String name;
    protected String decription;
    protected String[] keywords = new String[6];

    public SubCollection(String name, String decription, String[] keywords) {
        this.name = name;
        this.decription = decription;
        this.keywords = keywords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }
}
