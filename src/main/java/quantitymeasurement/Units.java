package quantitymeasurement;

public enum Units {
    INCH(1.0), FEET_TO_INCH(1 * 12.0), YARD_TO_INCH(1 * 36.0), CM_TO_INCH(1 / 2.5),
    LITRE(1.0), GALLON_TO_LITRE(1 * 3.78), MILLILITER_TO_LITRE(1.0 / 1000);
    final Double unit;

    /**
     *
     * @param unit
     */
    Units(Double unit) {
        this.unit = unit;
    }
}
