public class child extends human {

    String school;
    boolean hasParents;

    public child(double agei, double highti, String genderi, String hairColori, String eyeColori, String schooli,
            boolean hasParentsi) {
        super(agei, highti, genderi, hairColori, eyeColori);
        school = schooli;
        hasParents = hasParentsi;

    }

    public child(int agei, int highti, String genderi, String hairColori, String eyeColori, String schooli,
            boolean hasParentsi) {
        super(agei, highti, genderi, hairColori, eyeColori);
        school = schooli;
        hasParents = hasParentsi;
    }

    public void setSchool(String inputSchool) {
        school = inputSchool;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "The school is " + school + ".";
    }

}