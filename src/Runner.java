public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car(2000, "BMW", 20000, "M5");
        System.out.println(myCar.toString());
        myCar.drive(4000);
        System.out.println(myCar.toString());


        Rectangle myRectangle = new Rectangle(2,4);
        System.out.println( myRectangle.toString());
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getDiagonal());
        System.out.println(myRectangle.isSquare());
        
    }


}

