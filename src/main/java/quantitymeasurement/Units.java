package quantitymeasurement;

public enum Units {
    //Enums for conversions according to lengths
    INCH(1.0), FEET_TO_INCH(1 * 12.0), YARD_TO_INCH(1 * 36.0), CM_TO_INCH(1 / 2.5),
    //Enums for conversions according to volumes
    LITRE(1.0), GALLON_TO_LITRE(1 * 3.78), MILLILITER_TO_LITRE(1.0 / 1000),
    //Enums for conversions according to weights
    KILOGRAM(1.0), GRAMS_TO_KILOGRAM(1.0/1000), TONNE_TO_KILOGRAM(1.0*1000),
    //Enums for conversions according to temperature
    CELSIUS(1.0*2.12), FAHRENHEIT_TO_CELSIUS(1.0);;

    final Double unit;

    /**
     *
     * @param unit
     */
    Units(Double unit) {
        this.unit = unit;
    }
}
