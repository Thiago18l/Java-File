import java.util.*;

public class Ctemp {
    public static void main(String[] args) {

        Utils utils = new Utils();

        try {
            double c = utils.toCelsius(-500.00);
            System.out.println(c);
        } catch (FahrenheitException e) {
            System.out.println(e.getMessage());
        }
        catch(TemperatureException e){
            System.out.println(e.getMessage());
        }
    }
}