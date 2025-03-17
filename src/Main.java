public class Main {

    public static void main(String[] args) {

        byte byteVar = Input.readByte("Enter a byte value");
        System.out.println("Byte: " + byteVar);

        int intVar = Input.readInteger("Enter an integer value");
        System.out.println("Integer: " + intVar);

        float floatVar = Input.readFloat("Enter a float value");
        System.out.println("Float: " + floatVar);

        double doubleVar = Input.readDouble("Enter a double value");
        System.out.println("Double: " + doubleVar);

        char charVar = Input.readChar("Enter a char value");
        System.out.println("Char: " + charVar);

        String stringVar = Input.readString("Enter String value");
        System.out.println("String: " + stringVar);

        boolean booleanVar = Input.readBoolean("Enter 's' for true or 'n' for false");
        System.out.println("Boolean: " + booleanVar);


    }
}