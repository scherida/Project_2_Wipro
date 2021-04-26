package enums;

public enum Sleeve {
    LONG("Long"),
    MEDIUM("Medium"),
    SHORT("Short"),
    OTHERS("Others");

    private final String sleeveType;

    Sleeve(String sleeveType){
        this.sleeveType = sleeveType;
    }

    public String getSleeveType(){
        return sleeveType;
    }

    @Override
    public String toString() {
        return "Sleeve{" +
                "sleeveType='" + sleeveType + '\'' +
                '}';
    }
}
