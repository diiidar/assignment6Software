package assignment6Software.thirdEx;

import java.util.Random;

class WeatherAPI2Adapter implements WeatherDataAdapter {
    @Override
    public WeatherData fetchWeather(String location) throws WeatherDataException {
        // Simulated implementation for Weather API 2
        // In real-world scenario, this would involve actual API calls
        return new WeatherData(location, generateRandomTemperature(), "Cloudy");
    }

    private double generateRandomTemperature() {
        Random random = new Random();
        return random.nextDouble() * 25; // Random temperature between 0 and 25 degrees Celsius
    }
}
