//Implemented by Jonny Ironside
//18/01/2021

import java.util.*;
import java.math.*;

public class strtoint {

    public static String intToStr(long num) {
        StringBuilder result = new StringBuilder();
        while (num > 10) {
            long digit = num % 10;
            num -= digit;
            num = num / 10;
            String temp = charConvertor(digit); //single character convertor 
            System.out.println(num +"-"+digit+"-"+result);
            result.append(temp);
        }
        result.append(charConvertor(num)); //convert and adds first digit to string
        return result.reverse().toString();
    }

    public static String charConvertor(long digit) {
        String temp = "";
        if (digit == 1) { temp = "1"; }
            else if (digit == 2) {temp = "2"; }
            else if (digit == 3) {temp = "3"; }
            else if (digit == 4) {temp = "4"; }
            else if (digit == 5) {temp = "5"; }
            else if (digit == 6) {temp = "6"; }
            else if (digit == 7) {temp = "7"; }
            else if (digit == 8) {temp = "8"; }
            else if (digit == 9) {temp = "9"; }
            else if (digit == 0) {temp = "0"; }
            else {System.out.println("error");}
        return temp;
    }


    public static long strToInt(String str) {
        long result = 0;
        long temp = 0; 
        int pow = 0;
        for (int i=str.length()-1; i>=0; i--) { //for each lettr of the string
            Character c = str.charAt(i); //get single character of string
            //single digit convertor
            if (c.equals('1')) {temp = 1; } 
            else if (c.equals('2')) { temp = 2; }
            else if (c.equals('3')) { temp = 3; } 
            else if (c.equals('4')) { temp = 4; } 
            else if (c.equals('5')) { temp = 5; } 
            else if (c.equals('6')) { temp = 6; } 
            else if (c.equals('7')) { temp = 7; } 
            else if (c.equals('8')) { temp = 8; }
            else if (c.equals('9')) { temp = 9; }
            else if (c.equals('0')) { temp = 0; }
            else {System.out.println("error"); }
            result += Math.pow(10, pow) * temp; //add to result
            System.out.println("result: " + result);
            pow ++; //increment placement value
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("string => int");
        long intresult = strToInt("123456789");
        System.out.println("the string to integer number is: " + intresult);

        System.out.println();

        System.out.println("int => string");
        String strnum = intToStr(123456789);
        System.out.println("the integer to string number is: " + strnum);
    }
}
