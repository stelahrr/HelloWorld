/**
 * my first program
 * @author stella
 *
 * Converting f to c : (f-32) * (5/9)
 * converting c to f : ((c * 9/5) + 32)
 * convertin c to k : ( c + 273.15)
 * convert f to k:
 */

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int number  = 0;
        double doubleNumber = 10.1;
        double celsius = 0;
        float floatNumber = 10.1f;
        long longNumber = 1l;
        String tag = "the value is ";
        System.out.println("the number is " + (number + 10));
        System.out.println("The length of the string is " + tag.length());
        System.out.println(returnValue(5));
        number = returnValue(15);
        System.out.println("The number is now " + number);
        celsius = returnCelsius(32);
        System.out.println(celsius);
        System.out.println(returnFtoKelvin(32));
        System.out.println(returnKelvin(0));
        System.out.println(returnFarenheit(0));

    }

    public static int returnValue(int n){
        return n*2;
    }

    public static double returnCelsius(double farenheit){
        return (farenheit - 32) * 5/9;


    }
    public static double returnFarenheit(double celsius){
        return ((celsius * 9/5) + 32);
    }
    public static double returnKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double returnFtoKelvin(double farenheit) {
        double celsius = returnCelsius(farenheit);
        double kevin = returnKelvin(celsius);
        return kevin;
    }
}
