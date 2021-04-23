package enums;

public enum SizePants {
    _S("S"), _SM("S/M"), _M("M"), _MT("MT"), _L("L"),
    _LT("LT"), _XLT("XLT"), _XXS("XXS"), _XS("XS"),
    _XL("XL"), _XXL("XXL");

    private final String size;

    SizePants(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}
