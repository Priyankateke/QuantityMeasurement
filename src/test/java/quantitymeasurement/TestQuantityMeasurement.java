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
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(0.0);
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
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Equal Feet Values When Equal Should Return True
     */
    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getFeet(1.0);
        double value2 = quantityMeasurement.getFeet(1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 0 Inch and 0 Inch Should Return equal
     */
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getInch(0.0);
        double value2 = quantityMeasurement.getInch(0.0);
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
}
