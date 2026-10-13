public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder(){
        super();
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String colour){
        super(radius,colour);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }
    //Q3
    @Override
    public double getArea() {
        return (2*3.14*super.getRadius()*height)+(2*super.getArea());
    }
    //Q6

    @Override
    public String toString() {
        return "Cylinder: subclass of :"+super.toString()+"height: "+ height;
    }
}
