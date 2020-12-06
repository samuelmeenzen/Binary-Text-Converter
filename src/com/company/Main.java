package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        StringBuilder output = new StringBuilder();

        System.out.println("Please input the message to convert:");
        input = scanner.nextLine();

        String[] characters = input.split("\\s"); // much regex, wow

        for (String character : characters) {
            output.append((char) Integer.parseInt(character, 2)); // do the magic
        }

        System.out.println("Converted message:");
        System.out.println(output.toString());
    }
}
