import java.time.LocalTime;

public class ReceiveSatelliteData {
    // private String[] rawData;
    private boolean dataProcessed;
    private String processedData;

    public boolean processData(String rawData){
        //Simulates data being processed
        rawData =
            //Used a Text to binary converter
            "01010111 01100101 01100001 01110100" + 
            "01101000 01100101 01110010 00100000" + 
            "01110011 01110000 01100001 01100011" +
            "01100101 00100000 01110011 01110100" +
            "01100001 01110100 01101001 01101111" +
            "01101110 00100000 01101000 01100101" +
            "01110010 01100101 00101100 00100000" +
            "01110111 01100101 01101100 01100011" +
            "01101111 01101101 01100101 00100000" +
            "01110100 01101111 00100000 01110011" +
            "01110000 01100001 01100011 01100101" +
            "00100001 00001010"
        ;

        System.out.println("Processing: " + rawData + "\n");

        this.processedData = "Weather space station here, welcome to space!";
        System.out.println("Processed Data: " + processedData);
        dataProcessed = true;
        return dataProcessed;
    }

    public void orbitData(String processedData){
        //Receiving processed data & printing orbit data

        System.out.println(
            "Satellite ID: " + "WEATSAT-528\n" +
            "TimeStamp: " + LocalTime.now() +
            "Position Lat: " + "40.7128° N" +
            "Position Lon: " + "74.0060° W" +
            "Inclanation: " + "55°"
        );
    }

    public void transmitData(){
        //transmitting data
        System.out.println("Sending data packets...");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data transmitted");
    }
}
