public class dog {
    String breed = " ";
    String color = " ";
    int size = 0;
    double age = 0;

    public dog(int agei, int sizei, String breedi, String colori) {
        age = agei;
        size = sizei;
        color = colori;
        breed = breedi;
    }

    public dog(double agei, int sizei, String breedi, String colori) {
        age = agei;
        size = sizei;
        color = colori;
        breed = breedi;
    }

    public double getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setAge(double inputAge) {
        age = inputAge;
    }

    public void setSize(int inputSize) {
        size = inputSize;
    }

    public String toString() {
        return "The age is " + age + " the color is " + color + " the size is " + size + " the breed is " + breed + ".";
    }

}