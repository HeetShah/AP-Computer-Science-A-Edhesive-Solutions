public class RightTriangle {

    private double base;
    private double height;
    private double hypotenuse;
    private double length;

    // this is the default constructor
    public RightTriangle() {
        base = 1;
        height = 1;
    }

    // this constructor includes 2 parameters that can be manipulated by the user
    public RightTriangle(double bs, double ht) {
        if (bs > 0) {
            base = bs;
        } else {
            base = 1;
        }

        if (ht > 0) {
            height = ht;
        } else {
            height = 1;
        }
    }

    // getters
    public boolean equals(RightTriangle other) {
        if (base == other.getBase() && height == other.getHeight()) {
            return true;
        }
        return false;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        double hyp = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        hypotenuse = hyp;
        return hypotenuse;
    }

    public double getPerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hypotenuse;
    }

    // setters

    public void setBase(double bs) {
        if (bs > 0) {
            base = bs;
        }
    }

    public void setHeight(double ht) {
        if (ht > 0) {
            height = ht;
        }
    }

    public String toString() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return "right triangle with base " + base + ", height " + height + ", hypotenuse " + hypotenuse;
    }

}