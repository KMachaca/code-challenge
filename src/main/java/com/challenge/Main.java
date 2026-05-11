package com.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "";
        String word2 = "";
        System.out.println("  Anagram detector");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter the first word: ");
            word = scanner.nextLine(); 
            Word Word1 = new Word(word);
            if(Word1.validation()){
                System.out.print("Please enter the second word: ");
                word2 = scanner.nextLine();
                Word Word2 = new Word(word2);
                if(Word2.validation()){
                    System.out.println("Processing ... ");
                    Word1.orderLetters();
                    Word2.orderLetters();
                    Anagram anagram1 = new Anagram(Word1, Word2);
                    anagram1.compareWords();
                }else {
                    //System.out.println("Not Processing ... ");
                }
            }else {
                //System.out.println("Not Processing ... ");
            }
        }catch (Exception e) {
            System.out.println("An error occurred " + e);
        }
        
    }
}


