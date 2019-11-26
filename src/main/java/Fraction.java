public class Fraction implements Comparable{
    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("The Denominator cannot be 0. The fraction will now be 1/0");
                numerator = 0;
                denominator = 1;
        }
        else if (denominator > Integer.MAX_VALUE || denominator < Integer.MIN_VALUE) {
            System.out.println("The Denominator cannot this size. The fraction will now be 1/0");
            numerator = 0;
            denominator = 1;
        }
        else if (numerator > Integer.MAX_VALUE || numerator < Integer.MIN_VALUE) {
            System.out.println("The Numerator cannot be this size. The fraction will now be 1/0");
            numerator = 0;
            denominator = 1;
        }
        this.numerator = Math.abs(numerator);
        this.denominator = Math.abs(denominator);

    }

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public double getRealValue (int numerator, int denominator) {
        double decimal = numerator/denominator;
        return decimal;
    }

    public Fraction reduceFraction (int num1, int num2) {
        int num1Copy = num1;
        int num2Copy = num2;
        int remainder = 0;

        while (num2 != 0) {
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        return new Fraction(num1Copy/num1, num2Copy/num2);
    }

    public Fraction addFraction (Fraction that) {
        int sumN = this.denominator * that.numerator + this.numerator * that.denominator;
        int sumD = this.denominator * that.denominator;
        return reduceFraction(sumN,sumD);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

