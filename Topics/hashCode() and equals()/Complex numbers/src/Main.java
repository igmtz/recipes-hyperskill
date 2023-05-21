import java.util.Objects;

class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long reBits = Double.doubleToLongBits(re);
        long imBits = Double.doubleToLongBits(im);
        result = 31 * result + (int) Double.doubleToLongBits(im);
        result = 31 * result + (int) Double.doubleToLongBits(re);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        /* Check this and other refer to the same object */
        if (this == other) {
            return true;
        }

        /* Check other is Person and not null */
        if (!(other instanceof ComplexNumber)) {
            return false;
        }

        ComplexNumber obj = (ComplexNumber) other;

        /* Compare all required fields */
        return Objects.equals(re, obj.getRe()) &&
                Objects.equals(im, obj.getIm());
    }
}