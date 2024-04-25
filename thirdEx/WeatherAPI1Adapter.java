package assignment6Software.thirdEx;

import java.util.Random;

class WeatherAPI1Adapter implements WeatherDataAdapter {
    @Override
    public WeatherData fetchWeather(String location) throws WeatherDataException {
        // Simulated implementation for Weather API 1
        // In real-world scenario, this would involve actual API calls
        return new WeatherData(location, generateRandomTemperature(), "Sunny");
    }

    private double generateRandomTemperature() {
        Random random = new Random();
        return random.nextDouble() * 30; // Random temperature between 0 and 30 degrees Celsius
    }
}
