
public class Utils {
    private double celsius;
    private double fahrenheit;
    final double zeroabs = -459.67;

    public Utils() {
        this.celsius = 0;
        this.fahrenheit = 0;
    }

    public Utils(double celsius, double fahrenheit) {
        setCelsius(celsius);
        setFahrenheit(fahrenheit);
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return this.celsius;
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    public double toCelsius(double fahrenheit) {
        if (fahrenheit < zeroabs) {
            throw new FahrenheitException("O valor em fahrenheit é menor que o Zero Absoluto digite outro valor.");
        } else {
            double c = (fahrenheit - 32) / 1.8;
            return String.format("A temperatura em Celsius é:" + c);
        }
        

    }
}