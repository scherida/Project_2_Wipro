package model;

import enums.Color;
import enums.Gender;
import enums.SizeTshirt;
import enums.Sleeve;

public class VariantTShirt extends ProductVariant {
    private SizeTshirt sizeTshirt;
    private Sleeve sleeve;

    public VariantTShirt(Color color, Gender gender, SizeTshirt sizeTshirt, Sleeve sleeve) {
        super(color, gender);
        this.sizeTshirt = sizeTshirt;
        this.sleeve = sleeve;
    }

    public VariantTShirt(){}

    public SizeTshirt getSizeTshirt() {
        return sizeTshirt;
    }

    public Sleeve getSleeve() {
        return sleeve;
    }

    public void setSizeTshirt(SizeTshirt sizeTshirt) {
        this.sizeTshirt = sizeTshirt;
    }

    public void setSleeve(Sleeve sleeve) {
        this.sleeve = sleeve;
    }

    @Override
    public String toString() {
        return "VariantTShirt{" +
                super.toString()+
                "size TShirt=" + sizeTshirt +
                ", sleeve=" + sleeve +
                '}';
    }
}
