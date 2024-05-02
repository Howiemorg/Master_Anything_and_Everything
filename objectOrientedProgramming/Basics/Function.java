package Basics;

public class Function {
    // "Public" is a keyword, we'll get into that later
    // "int" is the return type of the function/method
    // "add" is the name of the method
    // "int x" and "float y" are the parameters and types of the parameters
    // the parameters are values passed into the functions
    public double add(int x, float y){
        // "return" is a keyword that sends what comes after it back to the function caller
        // so x + y gets sent back to what calls the function
        return x + y;
    }
    public static void main(String[] args) {
        int integer = 2;
        float floatDecimal = -3.45f;

        Function func = new Function();
        double returnValue = func.add(integer, floatDecimal);
        System.out.println(returnValue);

        Clock clock = new Clock(13, 02, 8);
        System.out.println(clock.seconds);
    }
}
