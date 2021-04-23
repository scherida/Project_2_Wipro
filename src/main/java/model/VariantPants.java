package model;

import enums.*;

public class VariantPants extends ProductVariant {
    private SizePants sizePants;
    private Activity activity;
    private Material material;

    public VariantPants(){};

    public VariantPants(Color color, Gender gender, SizePants sizePants, Activity activity, Material material) {
        super(color, gender);
        this.sizePants = sizePants;
        this.activity = activity;
        this.material = material;
    }

    public SizePants getSizePants() {
        return sizePants;
    }

    public Activity getActivity() {
        return activity;
    }

    public Material getMaterial() {
        return material;
    }

    public void setSizePants(SizePants sizePants) {
        this.sizePants = sizePants;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "VariantPants{" +
                super.toString()+
                "sizePants=" + sizePants +
                ", activity=" + activity +
                ", material=" + material +
                '}';
    }
}
