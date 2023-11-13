public class Temperatures {

    static double celciusToKelvin(double c){
        return c + 273.15;
    }

    static double kelvinToCelcius(double k){
        return k -273.15;
    }

    static double celciusToFarenheit(double c){
        return c *(9/5) + 32;
    }

    static double farenheitToCelcius(double f){
        return (f-32)/(9/5);
    }
    
}
