package quantitymeasurement;

public class QuantityMeasurement {

    /**
     *
     * @param units
     * @param value
     * @return
     */
    public double unitConversion(Units units, Double value) {
        return value*units.unit;
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
        return super.equals(o);
    }
}
