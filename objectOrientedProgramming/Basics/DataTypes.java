package Basics;

public class DataTypes {
    public static void main(String[] args) {
        // Integer between 2,147,483,647 and -2,147,483,648
        int integer = 2147483647;
        System.out.println(integer);
        // Long - Integer between 9,223,372,036,854,775,807 and
        // -9,223,372,036,854,775,808
        long longInteger = 9223372036854775807l;
        System.out.println(longInteger);
        // Float - Decimal number up to 7 decimal places
        float floatDecimal = .1383247f;
        System.out.println(floatDecimal);
        // Double - Decimal number up to 15 decimal places
        double doubleDecimal = .431239479142540;
        System.out.println(doubleDecimal);
        // Boolean - True or False
        boolean True = true;
        System.out.println(True);
        boolean False = false;
        System.out.println(False);
        // Char - A single character
        char c = 'c';
        System.out.println(c);
        // String - Multiple or List of characters
        String string = "string";
        System.out.println(string);

        // integer = 21474836472;
        integer = 2147483647 + 1;
        System.out.println(integer);

        longInteger = -9223372036854775808l - 1;
        System.out.println(longInteger);

        floatDecimal = .13832471f + .000000008f;
        System.out.println(floatDecimal);

        floatDecimal = .13832473f;
        System.out.println(floatDecimal);

        doubleDecimal = .431239479145402 + .00000000000000002;
        System.out.println(doubleDecimal);

        doubleDecimal = .43123947914540393;
        System.out.println(doubleDecimal);

        c = '+';
        System.out.println(c);
    }
}
