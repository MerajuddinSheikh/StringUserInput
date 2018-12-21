package stringpro;

import java.util.Scanner;

public class lesson {

    public static void main(String[] args) {
        //programme on string.

        String java, name1, name2, name3, name4;

        //class to use for user to enter the names.
        Scanner scan = new Scanner(System.in);
        System.out.println("enter four names");
        name1 = scan.nextLine();
        name2 = scan.nextLine();
        name3 = scan.nextLine();
        name4 = scan.nextLine();

        System.out.println("enterd names are " + name1 + " " + name2 + " " + name3 + " " + name4);


    }
}
