package Mediator;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;
    private String humidity;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
        transmitData(); 
    }

    @Override
    public void transmitData() {    
        mediator.gatherData("Humidity Sensor", humidity);   
    }
}
