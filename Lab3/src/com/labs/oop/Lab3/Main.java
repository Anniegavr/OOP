package com.labs.oop.Lab3;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    Stringy wow = new Stringy("Hallo? What_do_you! What is this? Is this your idea, I am sure it is");
		System.out.println("Number of sentences: " + wow.sentences());
		System.out.println(("Number of words: " + wow.words()));
		System.out.println("Number of letters: " + wow.letters());
		System.out.println("Number of vowels: "+ wow.vowels());
		System.out.println("Number of consonants: "+wow.consonants());
		System.out.println("The longest word: " + wow.topLong());
		System.out.println("The five most common words are: " + wow.topFive());

    }
}
