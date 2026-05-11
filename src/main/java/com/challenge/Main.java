package com.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "";
        System.out.println("  Anagram detector");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter the first word: ");
            word = scanner.nextLine(); 
        }catch (Exception e) {
            System.out.println("An error occurred " + e);
        }
        Word Word1 = new Word(word);
        Word1.validation();

    }
}


