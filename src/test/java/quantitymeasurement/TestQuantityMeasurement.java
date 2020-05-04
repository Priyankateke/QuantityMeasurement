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

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = feetMeasurement.getFeet(0.0);
        double value2 = feetMeasurement.getFeet(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

}
