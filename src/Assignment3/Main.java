import Chain.*;
import Command.*;
import Iterator.*;
import Mediator.*;
import Memento.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============Chain of Responsibility ==========");
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        paymentA.setNextPaymentMethod(paymentB);
        paymentB.setNextPaymentMethod(paymentC);

        double totalAmount = 210;
        System.out.println("Attempting to make a purchase with total amount: $" + totalAmount);
        paymentA.processPayment(totalAmount);

        System.out.println("\n==========Command Pattern==========");
        Television television = new Television();

        Command turnOn = new TurnOnCommand(television);
        Command turnOff = new TurnOffCommand(television);
        Command volumeUp = new VolumeUpCommand(television);
        Command volumeDown = new VolumeDownCommand(television);
        Command nextChannel = new NextChannelCommand(television);
        Command previousChannel = new PreviousChannelCommand(television);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.assignCommand(0, turnOn);
        remoteControl.assignCommand(1, turnOff);
        remoteControl.assignCommand(2, volumeUp);
        remoteControl.assignCommand(3, volumeDown);
        remoteControl.assignCommand(4, nextChannel);
        remoteControl.assignCommand(5, previousChannel);

        remoteControl.pressButton(0);
        remoteControl.pressButton(2);
        remoteControl.pressButton(4);
        remoteControl.pressButton(5); 
        remoteControl.pressButton(3);
        remoteControl.pressButton(1);

        System.out.println("\n  ==========Iterator Pattern==========");
        List<String> movieList = Arrays.asList("Inception", "Interstellar", "Dunkirk");
        ListMovieCollection listMovieCollection = new ListMovieCollection(movieList);
        Iterator listIterator = listMovieCollection.makeIterator();

        System.out.println("Movies from List:");
        while (listIterator.hasMore()) {
            System.out.println(listIterator.getNext());
        }

        String[] movieArray = {"The Matrix", "Avatar", "Titanic"};
        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(movieArray);
        Iterator arrayIterator = arrayMovieCollection.makeIterator();

        System.out.println("\nMovies from Array:");
        while (arrayIterator.hasMore()) {
            System.out.println(arrayIterator.getNext());
        }

        System.out.println("\n \n ==========Mediator Pattern==========");
        HomeMediator mediator = new HomeMediatorImpl();
        TemperatureSensor temperatureSensor = new TemperatureSensor(mediator);
        HumiditySensor humiditySensor = new HumiditySensor(mediator);
        LightSensor lightSensor = new LightSensor(mediator);

        temperatureSensor.setTemperature("22°C");
        humiditySensor.setHumidity("45%");
        lightSensor.setLightLevel("Bright");

        ((HomeMediatorImpl) mediator).displayReport();

        System.out.println("\n \n ==========Memento Pattern==========");
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.appendText("Hello, ");
        System.out.println("Current Text: " + editor.retrieveCurrentText());

        caretaker.preserveSnapshot(editor.createSnapshot());

        editor.appendText("world!");
        System.out.println("Text after addition: " + editor.retrieveCurrentText());

        editor.revertToSnapshot(caretaker.getSnapshot());
        System.out.println("Restored Text: " + editor.retrieveCurrentText());
    }
}
