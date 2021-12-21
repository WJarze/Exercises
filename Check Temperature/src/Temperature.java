public class Temperature {
    private double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void testTemperature() {
        boolean positiveTemp = getTemperature() > 0;
        if (positiveTemp) {
            System.out.println("positive temperature");
        } else {
            System.out.println("negative temperature");
        }
    }

}
