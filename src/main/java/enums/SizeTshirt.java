package enums;

public enum SizeTshirt {
    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL");

    private final String size;

    SizeTshirt(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

}
