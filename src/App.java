public class App {
    public static void main(String[] args) throws Exception {
        dog dog1 = new dog(10, 25, "Poodle", "Brown");
        child kid1 = new child(11, 2, "Female", "Black", "Brown", "none", true);
        System.out.println(kid1.toString());
        kid1.setSchool("ALA");
        System.out.println(kid1.getSchool());

    }
}
