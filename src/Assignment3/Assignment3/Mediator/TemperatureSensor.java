package Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;
    private String temperature;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        transmitData();     
    }
    @Override
    public void transmitData() {    
        mediator.gatherData("Temperature Sensor", temperature);     
    }
}
