public class Choices {

    public static void main(String[] args) {
        int number = 80;

        if (number > 99) {
            System.out.println("The value is greater than 99");
        } else if (number == 0) {
            System.out.println("The value is zero");
        } else {
            System.out.println("The value is less than 99 or equal to 99");
        }

        double value = 15;
        if ((value % 3) == 0) {
            System.out.println("foo");
        }
        if ((value % 5) == 0) {
            System.out.println("bar");
        }
        if (((value % 3) == 0) && ((value % 5) == 0)) {
            System.out.println("foobar");
        }

    }

}
