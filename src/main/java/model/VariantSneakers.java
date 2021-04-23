package model;

import enums.Activity;
import enums.Color;
import enums.Gender;
import enums.SizeSneakers;

public class VariantSneakers extends ProductVariant{
    private SizeSneakers sizeSneakers;
    private Activity activity;

    public VariantSneakers (){};
    public VariantSneakers(Color color, Gender gender, SizeSneakers sizeSneakers, Activity activity) {
        super(color, gender);
        this.sizeSneakers = sizeSneakers;
        this.activity = activity;
    }

    public SizeSneakers getSizeSneakers() {
        return sizeSneakers;
    }

    public void setSizeSneakers(SizeSneakers sizeSneakers) {
        this.sizeSneakers = sizeSneakers;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "VariantSneakers{" +
                super.toString()+
                "sizeSneakers=" + sizeSneakers +
                ", activity=" + activity +
                '}';
    }
}
