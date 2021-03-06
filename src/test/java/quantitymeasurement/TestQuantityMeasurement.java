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

    //Test Cases For Feet

    /**
     * Given 0 Feet and 0 Feet When Equal Should Return True
     */
    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Null Check
     */
    @Test
    public void givenNullFeetValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.FEET_TO_INCH, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
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
     * Given Two Different Feet Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentFeetValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Equal Feet Values When Equal Should Return True
     */
    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //Test cases For Inch

    /**
     * Given 0 Inch and 0 Inch Should Return equal
     */
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Null check For Inch
     */
    @Test
    public void givenNullInchValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.INCH, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
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
     * Given Two Different Inch Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentInchValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Equal Inch Values When Equal Should Return True
     */
    @Test
    public void givenTwoEqualInchValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 1.0);
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
     * Given 12In = 1Ft
     */
    @Test
    public void givenTwelveFeetAndOneInch_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 12.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //Test Cases For Yard

    /**
     * Given 0 Yard and 0 Yard When Equal Should Return True
     */
    @Test
    public void givenZeroYardAndZeroYardValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Different Yard Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentYardValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.YARD_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Yard Value Should Return False
     */
    @Test
    public void givenNullYardValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.YARD_TO_INCH, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
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
     * Given 1 Inch != 1 Yard
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

    /**
     * Given 0 Centimeter and 0 Centimeter When Equal Should Return True
     */
    @Test
    public void givenZeroCentimeterAndZeroCentimeterValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Different Centimeter Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentCentimeterValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Centimeter Should Return False
     */
    @Test
    public void givenNullCentimeterValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.CM_TO_INCH, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    /**
     * Given 2 Inch = 5 Centimeter
     */
    @Test
    public void givenTwoInchAndFiveCentimeter_WhenCompare_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //TestCases for addition of values in different units to inches

    /**
     * Given : 2 inch + 2 inch = 4 inch
     */
    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInch() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        Assert.assertEquals(4,value1 + value2, 0.0);
    }

    /**
     * Given : 1 Feet + 2 Inch = 14 Inch
     */
    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnFourteenInch() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        Assert.assertEquals(14,value1 + value2, 0.0);
    }

    /**
     * Given : 1 Feet + 1 Feet = 24 Inch
     */
    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnTwentyFourInch() {
        double value1 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.FEET_TO_INCH, 1.0);
        Assert.assertEquals(24,value1 + value2, 0.0);
    }

    /**
     * Given : 2 inch + 2.5 Cm = 3 inch
     */
    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenAdded_ShouldReturnThreeInch() {
        double value1 = quantityMeasurement.unitConversion(Units.INCH, 2.0);
        double value2 = quantityMeasurement.unitConversion(Units.CM_TO_INCH, 2.5);
        Assert.assertEquals(3,value1 + value2, 0.0);
    }

    //TestCases for equality check on Gallon

    /**
     * Given Zero Gallon and Zero Gallon Value When Equal should Return True
     */
    @Test
    public void givenZeroGallonAndZeroGallonValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Different Gallon Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentGallonValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Gallon Value Should Return False
     */
    @Test
    public void givenNullGallonValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Litre

    /**
     * Given 0 Litre And 0 Litre Value When Equal Should Return True
     */
    @Test
    public void givenZeroLitreAndZeroLitreValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.LITRE, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Different Litre Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentLitreValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.LITRE, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Litre Value Should Return False
     */
    @Test
    public void givenNullLitreValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.LITRE, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on MilliLitre

    /**
     * Given 0 Millilitre and 0 Millilitre Value When Equal Should Return True
     */
    @Test
    public void givenZeroMillilitreAndZeroMillilitreValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Two different Millilitre Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentMillilitreValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Millilitre Value Should Return False
     */
    @Test
    public void givenNullMillilitreValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Litre,MilliLitre and Gallon

    /**
     * Given : 1 Gallon = 3.78 Litres
     */
    @Test
    public void givenVolumeInGallonAndLitre_WhenEqualInVolume_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.LITRE, 3.78);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given : 1 Litre = 1000 ml
     */
    @Test
    public void givenOneLitreAndOneThousandMillilitreValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 1000.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 1 Gallon + 3.78 Litres = 7.57 Litres
     */
    @Test
    public void givenVolumesInDifferentUnits_WhenAdded_ShouldReturnVolumeInLitre() {
        double value1 = quantityMeasurement.unitConversion(Units.GALLON_TO_LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.LITRE, 3.78);
        Assert.assertEquals(7.56, value1 + value2, 0.0);
    }

    /**
     * Given 1 Litre + 1000 ml = 2 Litres
     */
    @Test
    public void givenOneLitreAndOneThousandMillilitre_WhenAdded_ShouldReturnTwoLitres() {
        double value1 = quantityMeasurement.unitConversion(Units.LITRE, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.MILLILITER_TO_LITRE, 1000.0);
        Assert.assertEquals(2, value1 + value2, 0.0);
    }

    //TestCases for equality check on Kilogram

    /**
     * given 0 Kilogram And 0 Kilogram Value When Equal Should Return True
     */
    @Test
    public void givenZeroKilogramAndZeroKilogramValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.KILOGRAM, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Different Kilogram Values When Not Equal Should Return False
     */
    @Test
    public void  givenTwoDifferentKilogramValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.KILOGRAM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Kilogram Value Should Return False
     */
    @Test
    public void givenNullKilogramValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.KILOGRAM, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Grams

    /**
     * Given 0 GramAnd 0 Gram Value When Equal Should Return True
     */
    @Test
    public void givenZeroGramAndZeroGramValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Different Gram Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentGramValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Gram Value Should Return False
     */
    @Test
    public void givenNullGramValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Tonne

    /**
     * Given 0 Tonne And 0 Tonne Value When Equal Should Return True
     */
    @Test
    public void givenZeroTonneAndZeroTonneValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Different Tonne Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentTonneValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Tonne Value Should Return False
     */
    @Test
    public void givenNullTonneValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Tonne,Kilogram and gram

    /**
     * Given One Kilogram And One Thousand Grams When Equal Should Return True
     */
    @Test
    public void givenOneKilogramAndOneThousandGrams_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.KILOGRAM, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 1000.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given One Tonne And One Thousand Kilograms When Equal Should Return True
     */
    @Test
    public void givenOneTonneAndOneThousandKilograms_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.KILOGRAM, 1000.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //TestCases for addition of weights in different units to litres
    /**
     * Given One Tonne And One Thousand Grams When Added Should Return One Thousand One Kilograms
     */
    @Test
    public void givenOneTonneAndOneThousandGrams_WhenAdded_ShouldReturnOneThousandOneKilograms() {
        double value1 = quantityMeasurement.unitConversion(Units.TONNE_TO_KILOGRAM, 1.0);
        double value2 = quantityMeasurement.unitConversion(Units.GRAMS_TO_KILOGRAM, 1000.0);
        Assert.assertEquals(1001, value1 + value2, 0.0);
    }

    /**
     * Given Zero Celsius And Zero Celsius Value When Equal Should Return True
     */
    //TestCases for equality check on Celsius
    @Test
    public void givenZeroCelsiusAndZeroCelsius_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.CELSIUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CELSIUS, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     *  Given Two Different Celsius Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentCelsiusValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.CELSIUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.CELSIUS, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Celsius Value Should Return False
     */
    @Test
    public void givenNullCelsiusValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.CELSIUS, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Fahrenheit

    /**
     * Given Zero Fahrenheit And Zero Fahrenheit Value When Equal Should Return True
     */
    @Test
    public void givenZeroFahrenheitAndZeroFahrenheitValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     *  Given Two Different Fahrenheit Values When Not Equal Should Return False
     */
    @Test
    public void givenTwoDifferentFahrenheitValues_WhenNotEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 0.0);
        double value2 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Null Fahrenheit Value Should Return False
     */
    @Test
    public void givenNullFahrenheitValue_ShouldReturnFalse() {
        try {
            quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, null);
        } catch (NullPointerException ex) {
            Assert.assertEquals(null, ex.getMessage());
        }
    }

    //TestCases for equality check on Fahrenheit and Celsius

    /**
     * Given Two Hundred And Twelve Fahrenheit And Hundred Celsius Value When Compare Should Return True
     */
    @Test
    public void givenTwoHundredAndTwelveFahrenheitAndHundredCelsiusValue_WhenCompare_ShouldReturnTrue() {
        double value1 = quantityMeasurement.unitConversion(Units.FAHRENHEIT_TO_CELSIUS, 212.0);
        double value2 = quantityMeasurement.unitConversion(Units.CELSIUS, 100.0);
        Assert.assertEquals(value1,value2, 0.0);
    }
}