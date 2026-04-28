public class QuantityMeasurementApp {
    static class Feet{
        private final double value;

        Feet(double value){

            this.value = value;
        }

        @Override
        public boolean equals(Object obj){
            if(this==obj){
                return true;
            }
            if(obj==null){
                return false;
            }
            if(getClass() != obj.getClass()){
                return false;
            }
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }
    static class Inch{
        private final double value;

        Inch(double value){

            this.value = value;
        }

        @Override
        public boolean equals(Object obj){
            if(this==obj){
                return true;
            }
            if(obj==null){
                return false;
            }
            if(getClass() != obj.getClass()){
                return false;
            }
            Inch other = (Inch) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }
    public static void main(String[] args){
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        Inch I1 = new Inch(1.0);
        Inch I2 = new Inch(1.0);

        boolean result = f1.equals(f2);
        boolean result_1 = I1.equals(I2);

        System.out.println("Input: " +I1.value+ " inch and " +f2.value+ " inch");
        System.out.println("Output: Equals (" +result+ ")");
        System.out.println("Input: " +f1.value+ " ft and " +f2.value+ " ft");
        System.out.println("Output: Equals (" +result+ ")");
    }
}

