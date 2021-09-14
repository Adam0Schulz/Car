public class Engine {
    private int horsepower;
    private double displacement;
    private int numberOfCylinders;

    public Engine(int horse, double displacement, int cylinders) {
        horsepower = horse;
        this.displacement = displacement;
        numberOfCylinders = cylinders;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public double getDispl() {
        return displacement;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }
}
