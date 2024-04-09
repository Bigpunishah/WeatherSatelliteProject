import java.util.Random;

public class AutonomousOrbitAdjustments{
    private double currentSpeed;
    private double currentAngle;
    private String currentLocation;
    private Random ran = new Random();

    public void currentPositionData(){
        currentSpeed = ran.nextDouble(17500, 25000);
        currentAngle = ran.nextDouble(360);
        currentLocation = "28B-76A";
        System.out.println("New position: " + currentLocation);
    }

    public void adjustPosition(){
        currentSpeed = ran.nextDouble(17500, 25000);
        currentAngle = ran.nextDouble(360);
        currentLocation = "25B-72A";

        System.out.println("Adjusting from: " +
        "\nAngle: " +  currentAngle + " to " + ran.nextDouble(360) +
        "\nLocation: " + currentLocation + " to " + "73A-12L" +
        "\nSpeed:" + currentSpeed + " to " + ran.nextDouble(17500, 25000) + 
        "\nETA: 2 hours, 24 minutes, 10 seconds.");
    }
}