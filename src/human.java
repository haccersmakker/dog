public class human {
    double age;
    double hight;
    String gender;
    String hairColor;
    String eyeColor;
    String name;

    public human(double agei, double highti, String genderi, String hairColori, String eyeColori, String namei) {
        age = agei;
        hight = highti;
        gender = genderi;
        hairColor = hairColori;
        eyeColor = eyeColori;
        name = namei;

    }

    public human(int agei, int highti, String genderi, String hairColori, String eyeColori, String namei) {
        age = agei;
        hight = highti;
        gender = genderi;
        hairColor = hairColori;
        eyeColor = eyeColori;
        name = namei;
    }

    public void setAge(double inputAge) {
        age = inputAge;
    }

    public void setHight(double inputHight) {
        hight = inputHight;
    }

    public void setName(String inputName){name = inputName;}

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

    public String getName(){return name;}

    public String toString() {
        return name + "'s age is " + age + " their hight is " + hight + " their gender is " + gender + " their hair color is "
                + hairColor + " their eye color is " + eyeColor + ".";
    }

}