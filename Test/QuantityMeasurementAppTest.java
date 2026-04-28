import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality() {
        Length feet1 = new Length(1.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(1.0, Length.LengthUnit.FEET);

        assertEquals(feet1, feet2);
    }

    @Test
    public void testInchesEquality() {
        Length inches1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length inches2 = new Length(1.0, Length.LengthUnit.INCHES);

        assertEquals(inches1, inches2);
    }

    @Test
    public void testFeetInchesComparison() {
        Length oneFoot = new Length(1.0, Length.LengthUnit.FEET);
        Length twelveInches = new Length(12.0, Length.LengthUnit.INCHES);

        assertEquals(oneFoot, twelveInches);
    }

    @Test
    public void testFeetInequality() {
        Length feet1 = new Length(1.0, Length.LengthUnit.FEET);
        Length feet2 = new Length(2.0, Length.LengthUnit.FEET);

        assertNotEquals(feet1, feet2);
    }

    @Test
    public void testInchesInequality() {
        Length inches1 = new Length(5.0, Length.LengthUnit.INCHES);
        Length inches2 = new Length(10.0, Length.LengthUnit.INCHES);

        assertNotEquals(inches1, inches2);
    }

    @Test
    public void testCrossUnitInequality() {
        Length oneFoot = new Length(1.0, Length.LengthUnit.FEET);
        Length tenInches = new Length(10.0, Length.LengthUnit.INCHES);

        assertNotEquals(oneFoot, tenInches);
    }

    @Test
    public void testMultipleFeetComparison() {
        Length twoFeet = new Length(2.0, Length.LengthUnit.FEET);
        Length twentyFourInches = new Length(24.0, Length.LengthUnit.INCHES);

        assertEquals(twoFeet, twentyFourInches);
    }
}
