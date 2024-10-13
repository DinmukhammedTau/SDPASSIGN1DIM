package Mediator;

public class Main {
    public static void main(String[] args) {

        HomeMediator mediator = new HomeMediatorImpl();
        TemperatureSensor temperatureSensor = new TemperatureSensor(mediator);
        HumiditySensor humiditySensor = new HumiditySensor(mediator);
        LightSensor lightSensor = new LightSensor(mediator);

        temperatureSensor.setTemperature("22°C");
        humiditySensor.setHumidity("45%");
        lightSensor.setLightLevel("Bright");

        ((HomeMediatorImpl) mediator).displayReport();
    }
}
