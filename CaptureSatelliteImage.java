import java.util.Random;

public class CaptureSatelliteImage{
    private String imageName;
    private String[] metaData;
    private String imageData;

    public void captureImage(){
        //Simaulate capturing an image
        Random rand = new Random();
        this.imageName = "image_" + rand.nextInt(1000);
        this.metaData = new String[]{"date: 2024-04-09", "location: 40.7128° N, 74.0060° W"}; // Sample metadata
        System.out.println("Image captured: " + this.imageName);
    }

    public String processImage(String imageName, String[] metaData){
        this.imageData = imageName;
        this.metaData = metaData;

        return "Image Processed!";
    }

    public String extractInformation(String processedImage){
        // Simulate extracting information from the processed image
        String extractedInfo = "Image Name: " + processedImage + "\n";
        extractedInfo += "Metadata: ";
        for (String data : this.metaData) {
            extractedInfo += data + ", ";
        }
        extractedInfo = extractedInfo.substring(0, extractedInfo.length() - 2); // Remove trailing comma and space
        return extractedInfo;
    }

    public void transmitData(String imageData){
        // Simulate transmitting the image data
        this.imageData = imageData;
        System.out.println("Data transmitted: " + this.imageData);
    }
}