package Command;

public class Television {
    private int volume = 10;
    private int channel = 1;

    public void powerOn() { 
        System.out.println("Television is ON");
    }

    public void powerOff() { 
        System.out.println("Television is OFF");
    }

    public void increaseVolume() { 
        if (volume < 100) {
            volume++;
            System.out.println("Volume is now: " + volume);
        } else {
            System.out.println("Volume is at maximum!");
        }
    }

    public void decreaseVolume() { 
        if (volume > 0) {
            volume--;
            System.out.println("Volume is now: " + volume);
        } else {
            System.out.println("Volume is at minimum!");
        }
    }

    public void channelUp() { 
        channel++;
        System.out.println("Channel is now: " + channel);
    }

    public void channelDown() { 
        if (channel > 1) {
            channel--;
            System.out.println("Channel is now: " + channel);
        } else {
            System.out.println("This is the first channel!");
        }
    }
}
