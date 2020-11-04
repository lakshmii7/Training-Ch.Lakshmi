package com.jnit;

import java.util.Scanner;

public class Ifelseladder
{
    public static void main(String[] args)
    {
        char ch = 'o';
 
        if (ch == 'a' || ch == 'A')
            System.out.println(ch + " is vowel.");
        else if (ch == 'e' || ch == 'E')
            System.out.println(ch + " is vowel.");
        else if (ch == 'i' || ch == 'I')
            System.out.println(ch + " is vowel.");
        else if (ch == 'o' || ch == 'O')
            System.out.println(ch + " is vowel.");
        else if (ch == 'u' || ch == 'U')
            System.out.println(ch + " is vowel.");
        else
            System.out.println(ch + " is a consonant.");
	}
}