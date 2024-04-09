import java.util.Scanner;

public class WeatherSatelliteSystem {
    Authentication auth = new Authentication();
    CaptureSatelliteImage capImage = new CaptureSatelliteImage();
    ReceiveSatelliteData receiveSatData = new ReceiveSatelliteData();
    MonitorEnvironment monitor = new MonitorEnvironment();
    AutonomousOrbitAdjustments autoAdjust = new AutonomousOrbitAdjustments();
    Scanner sc = new Scanner(System.in);

    public void startProgram() {
        System.out.println("Welcome to the Weather Satellite System\n");

        // Authenticate the user
        authenticateUser();
    }

    private void authenticateUser() {
        System.out.println("Please login:");
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        boolean grant = auth.checkUser(username, password);
        if (!grant) {
            System.out.println("Error! Login Failed!");
            authenticateUser(); // Retry authentication
        }
        else
            displayMainMenu();

    }

    private void displayMainMenu() {
        System.out.println("\n****Menu****");
        System.out.println("1. Capture Satellite Image");
        System.out.println("2. Receive Satellite Data");
        System.out.println("3. Monitor Environment");
        System.out.println("4. Autonomous Orbit Adjustments");
        System.out.println("5. Exit");

        int userInput = sc.nextInt();
        switch (userInput) {
            case 1:
                capImageMenu();
                break;
            case 2:
                receiveSatDataMenu();
                break;
            case 3:
                monitorEnvironmentMenu();
                break;
            case 4:
                autoAdjustMenu();
                break;
            case 5:
                System.out.println("Goodbye!");
                System.exit(0); // Terminate the program
            default:
                System.out.println("Invalid input! Please try again.");
                displayMainMenu(); // Retry input
                break;
        }
    }

    private void capImageMenu() {
        System.out.println("Capture Satellite Image Section");
        System.out.println("1.) Capture image");
        System.out.println("2.) Transmit Image");
        System.out.println("3.) Return to Menu ");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                String metaData[] = {"Data..."};
                capImage.captureImage();
                capImage.processImage("", metaData);
                capImage.extractInformation("");
                capImageMenu();
                break;
            case 2:
                capImage.transmitData("Image Processed");
                capImageMenu();
                break;
            case 3:
                displayMainMenu();
        }
    }

    private void receiveSatDataMenu() {
        System.out.println("Receive Satellite Data Section");
        System.out.println("1.) Process Data");
        System.out.println("2.) Orbit Data");
        System.out.println("3.) Transmit Data");
        System.out.println("4.) Return to Menu");

        int input = sc.nextInt();
        switch (input) {
            case 1:
                receiveSatData.processData("");
                receiveSatDataMenu();
                break;
            case 2:
                receiveSatData.orbitData("");
                receiveSatDataMenu();
                break;
            case 3:
                receiveSatData.transmitData();
                receiveSatDataMenu();
                break;
            case 4:
                displayMainMenu();
        }
    }

    private void monitorEnvironmentMenu() {
        System.out.println("Monitor Environment Section");
        monitor.alert();
        System.out.println("\nPress any number to return to menu...");
        int in = sc.nextInt();
        switch (in) {             
            default:
                displayMainMenu();
                break;
        }
    }

    private void autoAdjustMenu() {
        System.out.println("Autonomous Orbit Adjustments Section");
        System.out.println("1.) Adjust Position");
        System.out.println("2.) Current Position");
        System.out.println("3.) Return to Menu");
        int in = sc.nextInt();
        switch (in) {
            case 1:
                autoAdjust.adjustPosition();
                autoAdjustMenu();
                break;
            case 2:
                autoAdjust.currentPositionData();
                autoAdjustMenu();
            default:
                displayMainMenu();
                break;
        }
    }

    public static void main(String[] args) {
        WeatherSatelliteSystem weatherSatSystem = new WeatherSatelliteSystem();
        weatherSatSystem.startProgram();
    }
}
