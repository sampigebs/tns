package comtnsday1;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte minByte = -128;
        byte maxByte = 127;
       
        short minShort = -32768; // Short
        short maxShort = 32767;
        
        int minInt = -2147483648; // Integer
        int maxInt = 2147483647;
       
        long minLong = -9223372036854775808L; // Long
        long maxLong = 9223372036854775807L;

        float minFloat = 1.4E-45f; // Float
        float maxFloat = 3.4028235E38f;

        
        double minDouble = 4.9E-324; // Double
        double maxDouble = 1.7976931348623157E308;

        
        char minChar = 0; // Character
        char maxChar = 65535;

        
        boolean trueValue = true; // Boolean
        boolean falseValue = false;

        
        System.out.println("Byte Min: " +minByte+" | Max: " + maxByte); // Printing values
        System.out.println("Short Min: " +minShort + " | Max: " + maxShort);
        System.out.println("Integer Min: " + minInt + " | Max: " + maxInt);
        System.out.println("Long Min: " + minLong + " | Max: " + maxLong);
        System.out.println("Float Min: " + minFloat + " | Max: " + maxDouble);
        System.out.println("Double Min: " + minDouble + " | Max: " + Double.MAX_VALUE);
        System.out.println("Character Min: " + minChar + " | Max: " + maxChar);
        System.out.println("Boolean values: " + trueValue + " and " + falseValue);

	}

}
