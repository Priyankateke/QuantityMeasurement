package quantitymeasurement;

public class QuantityMeasurement {
    private double feet;
    private double inch;

    public double getFeet(Double inch) {
        return inch/12;
    }

    public double getInch(Double feet) {
        return feet*12;
    }

    /**
     * Object Equal Method
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(this == o) return true;
        if (this.getClass() == o.getClass()) return true;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feet, feet) == 0 &&
                Double.compare(that.inch, inch) == 0;
    }
}
