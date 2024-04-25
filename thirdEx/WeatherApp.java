package assignment6Software.thirdEx;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherDataAdapter adapter1 = new WeatherAPI1Adapter();
        WeatherDataAdapter adapter2 = new WeatherAPI2Adapter();

        WeatherService weatherService1 = new WeatherService(adapter1);
        WeatherService weatherService2 = new WeatherService(adapter2);

        WeatherData weatherData1 = weatherService1.getWeather("New York");
        WeatherData weatherData2 = weatherService2.getWeather("London");

        // Use weather data in the mobile application
        if (weatherData1 != null) {
            System.out.println("Weather in " + weatherData1.getLocation() + ":");
            System.out.println("Temperature: " + weatherData1.getTemperature() + " Celsius");
            System.out.println("Description: " + weatherData1.getDescription());
        }

        if (weatherData2 != null) {
            System.out.println("\nWeather in " + weatherData2.getLocation() + ":");
            System.out.println("Temperature: " + weatherData2.getTemperature() + " Celsius");
            System.out.println("Description: " + weatherData2.getDescription());
        }
    }
}
