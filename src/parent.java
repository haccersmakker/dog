public class parent extends human {
    int numOfKids;
    boolean hasJob;

    public parent(double agei, double highti, String genderi, String hairColori, String eyeColori, boolean hasJobi,
            int numOfKidsi, String namei) {
        super(agei, highti, genderi, hairColori, eyeColori, namei);
        hasJob = hasJobi;
        numOfKids = numOfKidsi;

    }

    public parent(int agei, int highti, String genderi, String hairColori, String eyeColori, boolean hasJobi,
            int numOfKidsi, String namei) {
        super(agei, highti, genderi, hairColori, eyeColori, namei);
        hasJob = hasJobi;
        numOfKids = numOfKidsi;

    }

    public void setHasJob(boolean inputHasJob) {
        hasJob = inputHasJob;
    }

    public int getNumOfKids() {
        return numOfKids;
    }

    public boolean getHasJob() {
        return hasJob;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "The have " + numOfKids + " and it is " + hasJob + " that they have a job.";
    }
}