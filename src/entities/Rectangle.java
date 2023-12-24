package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double areaRectangle(double width, double heigth) {
		return this.width * this.heigth;
	}
	
	public double perimeteRectangle(double width, double heigth) {
		return 2 * (this.width + this.heigth);
	}
	
	public double diagonalRectangle(double width, double heigth) {
		double diagonal = (Math.sqrt(this.heigth) + Math.sqrt(this.heigth));
		return Math.sqrt(diagonal);
	}

}
