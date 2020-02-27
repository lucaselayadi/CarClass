public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
         return length * width;
    }
    public double getDiagonal(){
        return Math.sqrt(length * width);
    }

    public boolean isSquare(){
        if(length == width) {
            return true;
        }else{
            return false;
        }


}

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

