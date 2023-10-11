public class FloatAndDouble {
    public static void main(String[] args){
        // int
        // -2147483648~2147483647

        // long integer wtih L at the end
        // -9223372036854775805~9223372036854775807
        long x=200000000L;
        System.out.println(x);

        // float: 32 digit, single digit presicion with F at the end
        // accurate to 7th decimal places
        float z=3.14159268F;  // 3.1415927
        System.out.println(z);

        // float: 64 digit
        // accurate to 15th decimal places
        double y=3.14159268;  // 3.14159268
        System.out.println(y);
    }
} 
