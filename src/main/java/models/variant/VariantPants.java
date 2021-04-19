package models.variant;

public class VariantPants extends Variant{

    private String size;
    private String activity;
    private String material;

    public VariantPants(String size, String activity, String material) {
        this.size = size;
        this.activity = activity;
        this.material = material;
    }
}
