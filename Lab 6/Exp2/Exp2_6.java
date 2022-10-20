//Write a program to make a package Balance. This has an Account class with Display_Balancemethod. Import Balance package in another program to access Display_Balance method of Account class.
package Exp2;

import Exp2.Balance.Account;

public class Exp2_6 {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.Display_Balance();
    }
}