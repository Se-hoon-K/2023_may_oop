package week9;

public class DeskLamp {
	private boolean pwr;

	public void turnOn() {
		pwr = true;
	}

	public void turnOff() {
		pwr = false;
	}
	
	public String toString() {
		return "현재 상태는 " + (pwr == true ? "켜짐" : "꺼짐");
	}
	
}
