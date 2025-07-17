import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class KeyboardInput {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a value ");
        String input = keyboard.nextLine();
        System.out.println(input);
    }
}
