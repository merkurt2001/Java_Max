package groupStudies.EU7_Groups.BulkOperators;

import java.util.ArrayList;

public class TV  {

    int channel = 1;
    int volumeLevel = 0;
    boolean on = false;
    String brand = "undefined";
    ArrayList<String> channelList;




    public TV() {
        System.out.println("Creating TV object using no args-constructor");
        createChannelList();

    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        System.out.println("TV Channel: " + channel + "-> " + channelList.get(channel));
        return channel;
    }

    public void setChannel(int ch) {
        this.channel = ch;
        System.out.println("You are watching CH-" + channel);
    }

    public int getVolumeLevel() {
        System.out.println("TV Volume: " + volumeLevel);
        return channel;
    }

    public void setVolumeLevel(int vol) {
        this.volumeLevel = vol;
        if ((vol > 0 && vol < 7) && on == false) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
        System.out.println("VOL- " + volumeLevel);
    }

    public int channelUp() {
        channel += 1;
        if (channel > 120) {
            channel = 1;
        }
        System.out.println("TV CH- " + channel);
        return channel;
    }

    public int channelDown() {
        channel -= 1;
        if (channel < 1) {
            channel = 120;
        }
        System.out.println("TV CH- " + channel);
        return channel;
    }

    public int volumeUp() {
        volumeLevel += 1;
        if (volumeLevel > 7) {
            volumeLevel = 7;
        }
        System.out.println("VOL- " + volumeLevel);
        return volumeLevel;
    }

    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel < 0) {
            volumeLevel = 0;
        }
        System.out.println("VOL- " + volumeLevel);
        return volumeLevel;
    }

    public ArrayList<String> createChannelList() {
        ArrayList<String> channelList = new ArrayList<>(120);
        for (int j = 0; j < 120; j++) {
            channelList.add(brand);
        }
        this.channelList = channelList;
        return channelList;
    }
}