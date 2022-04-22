package com.javaex.ex08;

public class TV {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	
	
	//생성자
	public TV() {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = 7;
		this.volume = 20;
		this.power = power;
	}
	

	
	//gs 메서드
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	
	
	// 메서드
	
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}
	
	
	
	public void channel(int channel) {
		if (this.power == true) {
			if (channel >= 255) {
				this.channel = 255;
			} else if (channel <= 1) {
				this.channel = 1;
			} else {
				this.channel = channel;
			}
		}
	}
	
	
	void channel(boolean up) {
		if (this.power == true) {
			if (up == true) {
				channel(this.channel + 1);
			} else {
				channel(this.channel - 1);
			}
		}
	}
	
	
	
	
	public void volume(int volume) {
		if (this.power == true) {
			if (volume >= 100) {
				this.volume = 100;
			} else if (volume <= 0) {
				this.volume = 0;
			} else {
				this.volume = volume;
			}
		}
	}
	
	
	public void volume(boolean up) {
		if (this.power = true) {
			if (up == true) {
				volume(this.volume + 1);
			} else {
				volume(this.volume - 1);
			}
		}
	}
	
	
	
	
	public void status() {
		if (this.power == true) {
			System.out.println("채널: " + channel + ", 볼륨: " + volume);
		} else {
			System.out.println("TV가 꺼져있습니다.");
		}
	}
}
