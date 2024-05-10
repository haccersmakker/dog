public class App {
    public static void main(String[] args) throws Exception {
        dog dog1 = new dog(10, 25, "Poodle", "Brown");

        child kid1 = new child(11, 2, "Female", "Black", "Brown", "none", true, "beth");
        child kid2 = new child(4, 1, "Male", "Black", "Brown", "none", false, "john");
        simulation sim = new simulation();
        sim.addToList(kid1);
        sim.addToList(kid2);
        sim.runSim();

    }
}
