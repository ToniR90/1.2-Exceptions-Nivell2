import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte byteVar = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                byteVar = scanner.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("The value entered is not valid, try again");
                scanner.next(); //Buffer cleaner
            }
        }
        return byteVar;
    }

    public static int readInteger(String message) {
        int intVar = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                intVar = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("The value entered is not valid, try again");
                scanner.next();
            }
        }
        return intVar;
    }

    public static float readFloat(String message) {
        float intFloat = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                intFloat = scanner.nextFloat();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("The value entered is not valid, try again");
                scanner.next();
            }

        }
        return intFloat;
    }

    public static double readDouble(String message) {
        double doubleVar = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            try {
                doubleVar = scanner.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("The value entered is not valid, try again");
                scanner.next();
            }
        }
        return doubleVar;
    }

    public static char readChar(String message) {
        char charVar = '\0';
        String input = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            input = scanner.next();
            try {
                if (input.length() == 1) {
                    charVar = input.charAt(0);
                    valid = true;
                } else {
                    throw new MyException("Invalid char, try again");
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
                scanner.next();
            }
        }
        return charVar;
    }

    public static String readString(String message) {
        String stringVar = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            stringVar = scanner.nextLine();
            try {
                if (!stringVar.isEmpty()) {
                    valid = true;
                } else {
                    throw new MyException("The String cannot be empty, try again");
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
                scanner.next();
            }
        }
        return stringVar;
    }

    public static boolean readBoolean(String message) {
        boolean booleanVar = false;
        String input = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(message);
            input = scanner.next();
            try {
                if (input.equalsIgnoreCase("s")) {
                    booleanVar = true;
                    valid = true;
                } else if (input.equalsIgnoreCase("n")) {
                    valid = true;
                } else {
                    throw new MyException("The value entered is not valid, try again");
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
                scanner.next();
            }
        }
        return booleanVar;
    }
}
