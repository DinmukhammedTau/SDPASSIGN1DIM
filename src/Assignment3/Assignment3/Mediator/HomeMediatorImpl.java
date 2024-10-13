package Mediator;

import java.util.HashMap;
import java.util.Map;

public class HomeMediatorImpl implements HomeMediator {
    private Map<String, String> sensorData = new HashMap<>();

    @Override
    public void gatherData(String sensorType, String data) { 
        sensorData.put(sensorType, data);
        System.out.println(sensorType + " transmitted data: " + data); 
    }

    @Override
    public void displayReport() { 
        System.out.println("\n--- Smart Home Sensors Report ---");
        sensorData.forEach((sensorType, data) -> {
            System.out.println(sensorType + ": " + data);
        });
    }
}
