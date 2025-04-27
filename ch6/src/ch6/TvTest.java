package ch6;

import java.util.Scanner;

class Tv {
	String color;
	boolean power;
	int channel;
	int vol;
	
	public void power() {
		power = !power;
	}
	public void channelUp() {
		if(power) {
			
			channel++;
		}
	}
	public void channelDown() {
		if(power) {
			channel--;			
		}
	}
	public void volUp() {
		if(power) {
			vol++;			
		}
	}
	public void volDown() {
		if(power) {
			vol--;			
		}
	}
}


class TvTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Tv tv = new Tv();
		System.out.println("======== TV ========");
		while(true) {
			System.out.println("[ 전원 : " + (tv.power ? "ON ]," : "OFF ],") + " [ 채널 : " + tv.channel + " ], [ 볼륨 : " + tv.vol + " ]");
			System.out.println("1.전원 On/Off  2.채널 Up  3.채널 Down  4.볼륨 Up  5.볼륨 Down");
			int input = scanner.nextInt();
		
				switch(input) {
					case 1:{
						tv.power();
						if(!tv.power) {
							tv.channel = 0;
							tv.vol = 0;
						}
						break;
					}
					case 2:{
						tv.channelUp();
						break;
					}
					case 3:{
						tv.channelDown();
						break;
					}
					case 4:{
						tv.volUp();
						break;
					}
					case 5:{
						tv.volDown();
						break;
					}
				}	
			
			
		}
	}
}
	
	


