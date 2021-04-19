package models.variant;

public class VariantTshirt extends Variant{

    private String size;
    private String sleeve;

    public VariantTshirt(String size, String sleeve) {
        this.size = size;
        this.sleeve = sleeve;
    }
}
