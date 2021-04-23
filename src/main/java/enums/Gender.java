package enums;

public enum Gender {
    MALE ("Male"),
    FEMALE ("Female"),
    KIDS ("Kids"),
    OTHERS ("Others");

    private final String gender;

    Gender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }
}
