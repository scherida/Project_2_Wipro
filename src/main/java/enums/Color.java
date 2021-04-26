package enums;

public enum Color {
    BLUE("Blue"),
    RED("Red"),
    GREEN("Green"),
    GRAY("Gray"),
    WHITE("White"),
    BLACK("Black"),
    YELLOW("Yellow"),
    PURPLE("Purple"),
    SALMON("Salmon");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
