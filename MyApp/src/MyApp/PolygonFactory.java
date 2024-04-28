package MyApp;

public class PolygonFactory {
	static public Polygon getInstance(int noOfSides) {
		if(noOfSides==3) {
			return new Triangle();
		}
		if(noOfSides==4) {
			return new Square();
		}
		if(noOfSides==5) {
			return new Pentagon();
		}
		return null;
		
	}
	

}
