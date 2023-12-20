import java.util.Arrays;

public class Cities {
    private String[] cityNames;

    public Cities(String[] cityNames) {
        this.cityNames = cityNames;
    }

    public Cities filter(char firstLetter) {
        String[] filteredCities = Arrays.stream(cityNames)
                .filter(city -> city.charAt(0) == firstLetter)
                .toArray(String[]::new);
        return new Cities(filteredCities);
    }

    public String cities() {
        return String.join("", cityNames);
    }

    public static void main(String[] args) {
        Cities citiesObject = new Cities(new String[]{"Warszawa", "Sopot", "Kielce", "Szczecin"});
        String result = citiesObject.filter('S').cities();
        System.out.println(result); 
    }
}