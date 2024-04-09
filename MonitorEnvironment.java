import java.util.Random;

public class MonitorEnvironment {
    private enum weather{WIND, RAINY, SUNNY, CLOUDY, FOGGY, THUNDERSTORM, LIGHT_SHOWERS};
    private double temperature;
    private double humidity;
    private double atmosphericPressure;

    public void alert(){
        //Simulates the weather in the location
        Random ran = new Random();
        int ranWeather = ran.nextInt(7);
        this.temperature = ran.nextDouble(50, 80);
        this.humidity = ran.nextDouble(20, 99);
        this.atmosphericPressure = ran.nextDouble(10, 40);
        System.out.println( "Location 25B-72A -" +
            "\nWeather: " + weather.values()[ranWeather] + 
            "\nTemperature: " + temperature +
            "\nHumidity: " + humidity  + "%" + 
            "\nAtmospheric Pressure: " + atmosphericPressure);
    }

}
