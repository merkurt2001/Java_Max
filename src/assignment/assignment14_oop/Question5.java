package assignment.assignment14_oop;

public class Question5 {

	public static void main(String[] args) { }
	
}


class TV{
	
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;
	private String brand = "undefined";
		
	public TV() {
		System.out.println("Creating TV object using no Args- constructor.");
	}

	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor.");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel<=0 || channel>120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else {
			this.channel = channel;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
		
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void  channelUp() {
		channel++;
	}
	
	public void  channelDown() {
		channel--;
	}
	
	public void  volumeUp() {
		if(on && volumeLevel<7) {
			volumeLevel++;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
	
	public void  volumeDown() {
		if(on && volumeLevel>2) {
			volumeLevel--;
		} else { 
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}
		
	public void turnOn() {
		if(on==true) {
			System.out.println("TV is already ON");
		} else {
			on=true; 
		}
	}
		
	public void turnOff() {
		if(on==false) {
			System.out.println("TV is already OFF");
		} else {
			on=false; 
		}
	}	
		
}
