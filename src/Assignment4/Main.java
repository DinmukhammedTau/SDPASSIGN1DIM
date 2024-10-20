import Assignment4.Observer.*;
import Assignment4.State.Player;
import Assignment4.Strategy.*;
import Assignment4.Template.*;
import Assignment4.Visitor.*;

public class Main {
    public static void main(String[] args) {

        // Observer pattern
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        newsPublisher.registerSubscriber(smartphoneSubscriber);
        newsPublisher.registerSubscriber(laptopSubscriber);
        newsPublisher.registerSubscriber(tabletSubscriber);

        newsPublisher.releaseNews("Sports", "Team 4 loses the match, :( !");
        newsPublisher.releaseNews("Science", "New scientific breakthrough!!!");
        newsPublisher.releaseNews("All", "A major update to the city's public transport system is scheduled for next month!");

        System.out.println();

        // State pattern 
        Player player = new Player();

        player.requestPlay();  
        player.requestPause(); 
        player.requestPlay();  
        player.requestStop();  
        player.requestPause(); 

        System.out.println();

        // Strategy pattern 
        Order order = new Order(1000);

        order.choosePaymentMethod(new CardPaymentStrategy());
        order.displayFinalCost();

        order.choosePaymentMethod(new WalletPaymentStrategy());
        order.displayFinalCost();

        order.choosePaymentMethod(new CashOnDeliveryStrategy());
        order.displayFinalCost();
        //Template pattrn

        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Food product quality Check:");
        foodCheck.performCheck();

        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Electronics product quality Check:");
        electronicsCheck.performCheck();

        System.out.println();

        // Visitor pattern - Ensure file scanning works correctly
        File textFile = new TextFile("This document is free of any prohibited content.");
        File bannedTextFile = new TextFile("This document contain banned material.");
        File executableFile = new ExecutableFile("+safe_code+");
        File malwareExecutableFile = new ExecutableFile("malware");

        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        System.out.println("Antivirus check:");
        textFile.accept(antivirus);
        bannedTextFile.accept(antivirus);
        executableFile.accept(antivirus);
        malwareExecutableFile.accept(antivirus);

        System.out.println("\nGenerating report:");
        textFile.accept(report);
        executableFile.accept(report);
    }
}
