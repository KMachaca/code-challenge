package com.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word {
    public String content;
    List<Character> letters = new ArrayList<>();

    public Word(String word) {
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
        String contentCapitalLetters = content.toUpperCase();
        for (char letter : contentCapitalLetters.toCharArray()) {
            letters.add(letter);
        }
        //System.out.println(letters);
    }

    public boolean validation(){
        if (containsOnlyLetters()) {
            stringToListConversion();
            return true;
        }else{
            System.out.println("You must enter a valid word (only with uppercase or lowercase letters, no spaces, no special characters).");
            return false;
        }
    }

    public void orderLetters(){
        Collections.sort(letters);
        //System.out.println("Word Ordered " + letters);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Character> getLetters() {
        return letters;
    }

    public int length() {
        return letters.size();
    }

}
