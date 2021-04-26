package enums;

public enum Activity {
    SPORT("Sport"),
    CASUAL("Casual"),
    SOCIAL("Social");

    private final String activity;

    Activity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activity='" + activity + '\'' +
                '}';
    }
}
