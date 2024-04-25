package assignment6Software.thirdEx;

interface WeatherDataAdapter {
    WeatherData fetchWeather(String location) throws WeatherDataException;
}

