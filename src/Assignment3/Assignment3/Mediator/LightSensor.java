package Mediator;

public class LightSensor implements Sensor {
    private HomeMediator mediator;
    private String lightLevel;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void setLightLevel(String lightLevel) {
        this.lightLevel = lightLevel;
        transmitData();
    }

    @Override
    public void transmitData() { 
        mediator.gatherData("Light Sensor", lightLevel);
    }
}
