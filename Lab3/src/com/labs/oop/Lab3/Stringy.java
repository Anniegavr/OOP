package com.labs.oop.Lab3;

import java.util.*;

public class Stringy {
    String urS;

    public Stringy(String urS) {
        this.urS = urS;
    }

    public int sentences() {    //REPAIR: if the last char in the string is '.', the if statement forces it to look for I=1 and i+2,
        char[] charS = urS.toCharArray();     // and the index goes out of range
        int numS = 0;
        for (int i = 0; i < urS.length(); i++) {
            if (charS[i] == '?' || (charS[i] == '.' && charS[i + 1] != '.' && charS[i - 1] != '.') || charS[i] == '!' || (charS[i] == '.' && charS[i + 1] == '.' && charS[i + 2] == '.') || (charS[i] == '?' && charS[i + 1] == '!')) {
                numS += 1;
            }
        }
        return numS;
    }

    public int words() {
        char[] charS = urS.toCharArray();
        int wordsS = 0;
        if (!urS.isEmpty()) {
            wordsS = 1;
        }
        for (int i = 0; i < urS.length(); i++) {
            if (charS[i] == ' ') {
                wordsS += 1;
            }
        }
        return wordsS;
    }

    public int letters() {
        char[] lettersS = urS.toCharArray();
        int letS = 0;
        for (int i = 0; i < urS.length(); i++) {
            if (lettersS[i] == ' ') {
                letS += 1;
            }
        }
        return urS.length() - letS;
    }

    public int vowels() {
        char[] charS = urS.toCharArray();
        char[] vowels = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        int numV = 0;
        int numC = 0;
        for (int i = 0; i < urS.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (charS[i] == vowels[j]) {
                    numV += 1;
                } else numC += 1;
                if (charS[i] == ' ' || charS[i] == '?' || (charS[i] == '.' && charS[i + 1] != '.' && charS[i - 1] != '.') || charS[i] == '!' || (charS[i] == '.' && charS[i + 1] == '.' && charS[i + 2] == '.') || (charS[i] == '?' && charS[i + 1] == '!')) {
                    numC -= 1;
                }
            }
        }
        return numV;
    }

    public int consonants() {
        char[] charS = urS.toCharArray();
        //char[] cons = {}
        int numC = 0;
        for (int i = 0; i < urS.length(); i++) {
            if ((charS[i] >= 'a' && charS[i] <= 'z') || (charS[i] >= 'A' && charS[i] <= 'Z')) {
                numC += 1;
            }
        }
        return numC;
    }

    public String topLong() {
        //ArrayList<String> words = new ArrayList<String>();
        String[] wordsS = urS.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[...]]");

        String top_longWord = "";
        //int longestLen = words.indexOf();
        for (int i = 0; i < wordsS.length - 1; i++) {
            for (int j = i + 1; j < wordsS.length; j++) {
                if (wordsS[i].length() < wordsS[j].length()) {
                    top_longWord = wordsS[j];

                } else if (wordsS[j].length() < wordsS[i].length()) {
                    top_longWord = wordsS[i];
                }
            }
        }
        return top_longWord;
    }

    public LinkedList<String> topFive(){
        String[] wordsS = urS.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[...]]");
        //Dictionary reapWords = new Hashtable();
        HashMap<String, Integer> reapWords = new HashMap<>();
        int reaps = 1;  //The words have to exist, so at least 1 repetition is set 4 each
        for (int i=0; i<wordsS.length-1; i++) {
            for (int j = i + 1; j < wordsS.length; j++) {
                if (wordsS[i] == wordsS[j]) {
                    reapWords.put(wordsS[i], reaps);
                }
            }
        }
        for (String word : wordsS) {       // Let's count the # of occurrences of each word

            if (reapWords.containsKey(word)) {
                reaps = reapWords.get(word);
                reapWords.put(word, reaps + 1);
            } else {
                reapWords.put(word, 1);
            }
        }

        LinkedList<String> topFives = new LinkedList<String>();
        for (int i=reapWords.size(); i>1; i--) {
            for (Map.Entry en : reapWords.entrySet()) {
                if (en.getValue().equals(reaps))
                    topFives.push((String) en.getKey());
                if (topFives.size() >= 5) break;
            }
            reaps--;
            if (topFives.size() >= 5) break;
        }

        return topFives;

        //ArrayList<String> tops = new ArrayList<>();
        //*for (String i : reapWords.keySet()) {
    }

}
