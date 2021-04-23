package model;

import enums.Color;
import enums.Gender;

public class ProductVariant {
    private Color color;
    private Gender gender;

    public ProductVariant(){};

    public ProductVariant(Color color, Gender gender) {
        this.color = color;
        this.gender = gender;
    }

    public Color getColor() {
        return color;
    }

    public Gender getGender() {
        return gender;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ProductVariant{" +
                "color=" + color +
                ", gender=" + gender +
                '}';
    }
}
