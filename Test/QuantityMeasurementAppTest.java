import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {
    @Test
    public void testFeetEquality_SameValue() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f2));
    }
    @Test
    public void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(2.0);

        assertFalse(f1.equals(f2));
    }
    @Test
    public void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertFalse(f1.equals(null));
    }
    @Test
    public void testFeetEquality_DifferentClass() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        String other = "Not Feet";

        assertFalse(f1.equals(other));
    }
    @Test
    public void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = f1;

        assertTrue(f1.equals(f2));
    }
    @Test
    public void testInchEquality_SameValue() {
        QuantityMeasurementApp.Inch I1 = new QuantityMeasurementApp.Inch(1.0);
        QuantityMeasurementApp.Inch I2 = new QuantityMeasurementApp.Inch(1.0);

        assertTrue(I1.equals(I2));
    }
    @Test
    public void testInchEquality_DifferentValue() {
        QuantityMeasurementApp.Inch I1 = new QuantityMeasurementApp.Inch(1.0);
        QuantityMeasurementApp.Inch I2 = new QuantityMeasurementApp.Inch(2.0);

        assertFalse(I1.equals(I2));
    }
    @Test
    public void testInchEquality_NullComparison() {
        QuantityMeasurementApp.Inch I1 = new QuantityMeasurementApp.Inch(1.0);

        assertFalse(I1.equals(null));
    }
    @Test
    public void testInchEquality_DifferentClass() {
        QuantityMeasurementApp.Inch I1 = new QuantityMeasurementApp.Inch(1.0);
        String other = "Not Inch";

        assertFalse(I1.equals(other));
    }
    @Test
    public void testInchEquality_SameReference() {
        QuantityMeasurementApp.Inch I1 = new QuantityMeasurementApp.Inch(1.0);
        QuantityMeasurementApp.Inch I2 = I1;

        assertTrue(I1.equals(I2));
    }
}

