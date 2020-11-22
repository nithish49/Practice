package com.hackerRank;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^([a-zA-Z])+([A-Za-z0-9_]{7,30})+$";//"/^[a-zA-Z]{1}[A-Za-z0-9_]{8,30}$/";
}

public class Java_Valid_Username_Regular_Expression {
private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
