package com.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word {
  private String content;
  private List<Character> capitalLetters = new ArrayList<>();

  public Word(String word) {
    if (word == null) {
      throw new IllegalArgumentException("Word cannot be null");
    }
    if (word.isEmpty()) {
      throw new IllegalArgumentException("Word cannot be empty");
    }
    this.content = word;
  }

  public boolean containsOnlyLetters (){
    int letterCount = 0;
    for (int i = 0; i < content.length(); i++) {
      char character = content.charAt(i);
      if (Character.isLetter(character)) {
        letterCount++;
      }
    }
    if (letterCount == content.length()) {
      return true;
    }else{
      return false;
    }
  }

  public void stringToListConversion(){
    String capitalLettersContent = content.toUpperCase();
    for (char letter : capitalLettersContent.toCharArray()) {
      capitalLetters.add(letter);
    }
  }

  public boolean isValidWord(){
    if (containsOnlyLetters()) {
      stringToListConversion();
      return true;
    }else{
      System.out.println("You must enter a valid word (only with uppercase or lowercase letters, no spaces, no special characters).");
      return false;
    }
  }

  public void orderLetters(){
    Collections.sort(capitalLetters);
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<Character> getLetters() {
    return capitalLetters;
  }

  public int length() {
    return capitalLetters.size();
  }
}
