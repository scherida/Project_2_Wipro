package model;

public class Images {
    private String name;
    private Long size ;
    final String EXTENSION = ".jpg";
    private String path;

    public Images(String name, Long size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getEXTENSION() {
        return EXTENSION;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
