package week9;

public class BoxFrame {
	public int height,length,width;
	public BoxFrame(int height, int length, int width) {
		this.height = height;
		this.length = length;
		this.width = width;
	}
	public String toString() {
		return "상자의 부피는 "+ (height*length*width);
	}
}
