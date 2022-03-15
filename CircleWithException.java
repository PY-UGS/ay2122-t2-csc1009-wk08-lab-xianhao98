package tutorial8;

public class CircleWithException {
    private double radius;
    private double area;

    public CircleWithException(){

    }

    public CircleWithException(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        if(this.radius < 0){
            throw new IllegalArgumentException("Radius value entered is negative");
        }
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea() throws Exception{
        area = Math.pow(this.radius,2)*Math.PI;
        if(area > 1000){
            throw new Exception("Area is larger than 1000");
        }
        return area;
    }

    public double getDiameter(){
        return 2 * this.radius;
    }
}
