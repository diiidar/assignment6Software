package assignment6Software.thirdEx;

class WeatherService {
    private WeatherDataAdapter weatherDataAdapter;

    public WeatherService(WeatherDataAdapter weatherDataAdapter) {
        this.weatherDataAdapter = weatherDataAdapter;
    }

    public WeatherData getWeather(String location) {
        try {
            return weatherDataAdapter.fetchWeather(location);
        } catch (WeatherDataException e) {
            // Handle exception
            System.err.println("Failed to fetch weather data: " + e.getMessage());
            return null; // or provide fallback data
        }
    }
}
