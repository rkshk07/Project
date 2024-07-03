package org.personal;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;
        String sortedStr1 = str1.toLowerCase()
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        String sortedStr2 = str2.toLowerCase()
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        return sortedStr1.equals(sortedStr2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        boolean result = areAnagrams(str1,str2);

        if(result)
            System.out.println(str1 + " & "+ str2 +" are ANAGRAMS.");
        else
            System.out.println("Given words are not ANAGRAMS");
    }


}
