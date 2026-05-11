package com.challenge;

public class Anagram {
  private Word firstOrderedWord; 
  private Word secondOrderedWord; 

  public Anagram (Word orderedWord1, Word orderedWord2){
    this.firstOrderedWord = orderedWord1;
    this.secondOrderedWord = orderedWord2;
  }

  public boolean sameLength (){
    if (firstOrderedWord.length() == secondOrderedWord.length()) {
      return true;
    } else {
      return false;
    }
  }

  public void compareEachLetter (){
    boolean sameLetter = false;
      for (int i = 0; i < firstOrderedWord.length(); i++) {
        char characterFirstWord = firstOrderedWord.getLetters().get(i);
        char characterSecondWord = secondOrderedWord.getLetters().get(i);
        if (Character.compare(characterFirstWord, characterSecondWord) != 0) {
          sameLetter = true;
          break;
        }
    }
    if (!sameLetter) {
      System.out.println("Result: The words are anagrams.");
    } else {
      System.out.println("Result: The words are not anagrams.");
    }
  }

  public void isAnagram (){
    if (sameLength()) {
      compareEachLetter();
    } else {
      System.out.println("Result: The words are not anagrams.");
    }
  }
}
