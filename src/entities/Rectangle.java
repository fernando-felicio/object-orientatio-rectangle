package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double areaRectangle(double width, double heigth) {
		return this.width * this.heigth;
	}
	
	public double perimeterRectangle(double width, double heigth) {
		return 2 * (this.width + this.heigth);
	}
	
	public double diagonalRectangle(double width, double heigth) {
		double diagonal = (this.width *= width) + (this.heigth *= heigth);
		return Math.sqrt(diagonal);
	}
	
	public void showResult() {
		System.out.printf("AREA = %.2f%n"
				+ "PERIMETER = %.2f%n"
				+ "DIAGONAL = %.2f%n",
				areaRectangle(width, heigth),
				perimeterRectangle(width, heigth),
				diagonalRectangle(width, heigth));
	}

}
