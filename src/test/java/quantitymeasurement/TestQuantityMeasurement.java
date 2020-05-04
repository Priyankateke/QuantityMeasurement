package quantitymeasurement;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQuantityMeasurement {
    static FeetMeasurement feetMeasurement;

    @BeforeClass
    public static void beforeClass() {
        feetMeasurement = new FeetMeasurement();
    }

    /**
     * Given 0 Feet and 0 Feet Should Return equal
     */
    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = feetMeasurement.getFeet(0.0);
        double value2 = feetMeasurement.getFeet(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Null Check
     */
    @Test
    public void givenNullFeetValue_ShouldReturnFalse() {
        Assert.assertFalse(feetMeasurement.equals(null));
    }

    /**
     * Reference Check
     */
    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        FeetMeasurement feetMeasurement2 = new FeetMeasurement();
        Assert.assertEquals(feetMeasurement, feetMeasurement2);
    }
}
