package enums;

public enum SizeSneakers {
    _24("24"), _25("25"), _26("26"), _27("27"), _28("28"),
    _29("29"), _30("30"), _31("31"), _32("32"), _33("33"),
    _34("34"), _35("35"), _36("36"), _37("37"), _38("38"),
    _39("39"), _40("40"), _41("41"), _42("42"), _43("43"),
    _44("44"), _45("45"), _46("46");

    private final String size;

    SizeSneakers(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "SizeSneakers{" +
                "size='" + size + '\'' +
                '}';
    }
}
