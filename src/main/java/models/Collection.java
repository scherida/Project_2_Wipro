package models;

public class Collection {

    protected String name;
    protected String decription;
    protected String[] keywords = new String[6];
    private SubCollection SubCollection;

    public String getName() {
        return name;
    }

    public String getDecription() {
        return decription;
    }

    public String[] getKeywords() {
        return keywords;
    }
}
