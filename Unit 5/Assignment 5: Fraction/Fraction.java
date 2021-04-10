public class Fraction {
    /* Implement your Fraction class here */

    private int numerator;
    private int denominator;

    private static int count = 0;

    // constructors

    public Fraction() {
        numerator = 1;
        denominator = 1;

        count++;
        ;
    }

    public Fraction(int n, int d) {
        if (n > 0) {
            numerator = n;
        } else {
            numerator = 1;
        }

        if (d > 0) {
            denominator = d;
        } else {
            denominator = 1;
        }

        count++;

    }

    // accessors

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public static int getNumFractions() {
        return count;

    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public String mixedNumber() {

        if (numerator < denominator) {
            return numerator + "/" + denominator;
        }

        if (numerator % denominator == 0) {
            return "" + numerator / denominator;
        }

        return numerator / denominator + " " + numerator % denominator + "/" + denominator;
    }

    // Mutators
    public void setNumerator(int n) {
        if (n > 0) {
            numerator = n;
        }
    }

    public void setDenominator(int d) {
        if (d > 0) {
            denominator = d;
        }
    }

    public void add(int n, int d) {
        if (n > 0 && d > 0) {
            numerator = (numerator * d) + (n * denominator);
            denominator = denominator * d;
        }
    }

    public void add(Fraction other) {
        numerator = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);
        denominator = denominator * other.getDenominator();
    }

    public void multiply(int n, int d) {
        if (n > 0 && d > 0) {
            numerator = numerator * n;
            denominator = denominator * d;
        }
    }

    public void multiply(Fraction other) {
        numerator = numerator * other.getNumerator();
        denominator = denominator * other.getDenominator();
    }

}
