//Author : Gauri Chalak
//Program is Generate the Bank password

package com.question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_Generation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Generate your Password");
        String code = sc.next();
        String regex = "[A-Za-z0-9@*#]{8}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(code);
        boolean matchFound = m.find();
        if(matchFound)
        System.out.println("Password Generated Successfully");
        else
        System.out.println("Invalid Password, Try Again!");
    

	}

}
