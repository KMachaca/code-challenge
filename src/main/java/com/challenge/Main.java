package com.challenge;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      String firstEntry = "";
      String secondEntry = "";
      System.out.println("  Anagram detector");
      try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Please enter the first word: ");
          firstEntry = scanner.nextLine(); 
          Word firstWord = new Word(firstEntry);
          if(firstWord.isValidWord()){
            System.out.print("Please enter the second word: ");
            secondEntry = scanner.nextLine();
            Word secondWord = new Word(secondEntry);
            if(secondWord.isValidWord()){
              System.out.println("Processing ... ");
              firstWord.orderLetters();
              secondWord.orderLetters();
              Anagram anagram1 = new Anagram(firstWord, secondWord);
              anagram1.isAnagram();
            }
          }
      }catch (Exception e) {
        System.out.println("An error occurred " + e);
      }  
  }
}


