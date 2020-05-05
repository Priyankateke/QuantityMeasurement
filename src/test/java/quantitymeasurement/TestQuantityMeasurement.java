package quantitymeasurement;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQuantityMeasurement {
    static QuantityMeasurement quantityMeasurement;

    @BeforeClass
    public static void beforeClass() {
        quantityMeasurement = new QuantityMeasurement();
    }

    /**
     * Given 0 Feet and 0 Feet Should Return equal
     */
    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Null Check
     */
    @Test
    public void givenNullFeetValue_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    /**
     * Reference Check
     */
    @Test
    public void givenReferenceObjectOfFeet_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement2);
    }

    @Test
    public void givenSameClassObjectOfFeet_WhenEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    /**
     * Given Two Different Feet Values When Equal Should Return False
     */
    @Test
    public void givenTwoDifferentFeetValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Equal Feet Values When Equal Should Return True
     */
    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH,1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 0 Inch and 0 Inch Should Return equal
     */
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH,0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH,0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Null check For Inch
     */
    @Test
    public void givenNullInchValue_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    /**
     * Reference Check for Inch
     */
    @Test
    public void givenReferenceObjectOfInch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement2);
    }

    /**
     * Given Two Different Inch Values When Equal Should Return False
     */
    @Test
    public void givenTwoDifferentInchValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH,0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Equal Inch Values When Equal Should Return True
     */
    @Test
    public void givenTwoEqualInchValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH,1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH,1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 0 Feet and 0 Inch Should Return equal
     */
    @Test
    public void giveZeroInchAndZeroFeet_WhenZero_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double feetValue = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        Assert.assertEquals(feetValue, inchValue, 0.0);
    }

    /**
     * Given 1Feet != 1Inch
     */
    @Test
    public void givenOneFeetAndOneInch_WhenEqualInLength_ShouldReturnTrue() {
        double feetValue = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double inchValue = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        Assert.assertNotEquals(feetValue, inchValue, 0.0);
    }

    /**
     * Given 1Inch != 1Feet
     */
    @Test
    public void givenOneInchAndOneFeet_WhenEqualInLength_ShouldReturnFalse() {
        double feetValue = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double inchValue = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertNotEquals(feetValue, inchValue, 0.0);
    }

    /**
     * Given 1 ft = 12 in
     */
    @Test
    public void givenOneFeetAndTwelveInch_ShouldReturnTrue() {
        double inchValue = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(12, inchValue, 0.0);
    }

    /**
     *  Given 12In = 1Ft
     */
    @Test
    public void givenTwelveFeetAndOneInch_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 12.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 3 Feet = 1 Yard
     */
    @Test
    public void givenThreeFeetAndOneYard_WhenCompare_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 3.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 1 Ft != 1 Yard
     */
    @Test
    public void givenOneFeetAndOneYard_WhenEqualInLength_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     *  Given 1 Inch != 1 Yard
     */
    @Test
    public void givenOneInchAndOneYard_WhenEqualInLength_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given 1 Yard = 36 Inch
     */
    @Test
    public void givenOneYardAndThirtySixInch_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 36 Inch = 1 Yard
     */
    @Test
    public void givenThirtySixInchAndOneYard_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 36.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 1 Yard = 3 Feet
     */
    @Test
    public void givenOneYardAndThreeFeet_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 3.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
}
