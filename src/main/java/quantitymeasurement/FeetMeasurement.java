package quantitymeasurement;

public class FeetMeasurement {
    private double feet;

    public double getFeet(Double feet) {
        return feet;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(this == o) return true;
        if (this.getClass() == o.getClass()) return true;
        FeetMeasurement that = (FeetMeasurement) o;
        return Double.compare(that.feet, feet) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
