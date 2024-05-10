public class human {
    double age;
    double hight;
    String gender;
    String hairColor;
    String eyeColor;

    public human(double agei, double highti, String genderi, String hairColori, String eyeColori) {
        age = agei;
        hight = highti;
        gender = genderi;
        hairColor = hairColori;
        eyeColor = eyeColori;

    }

    public human(int agei, int highti, String genderi, String hairColori, String eyeColori) {
        age = agei;
        hight = highti;
        gender = genderi;
        hairColor = hairColori;
        eyeColor = eyeColori;
    }

    public void setAge(double inputAge) {
        age = inputAge;
    }

    public void setHight(double inputHight) {
        hight = inputHight;
    }

    public double getAge() {
        return age;
    }

    public double getHight() {
        return hight;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "The age is " + age + " the hight is " + hight + " the gender is " + gender + " the hair color is "
                + hairColor + " the eye color is " + eyeColor + ".";
    }

}