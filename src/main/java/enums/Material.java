package enums;

public enum Material {
    JEANS("Jeans"),
    CANVAS("Canvas"),
    LACE("Lace"),
    POLYESTER("Polyester"),
    LINEN("Linen"),
    SATIN("Satin");

    private final String material;

    Material(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Material{" +
                "material='" + material + '\'' +
                '}';
    }
}
