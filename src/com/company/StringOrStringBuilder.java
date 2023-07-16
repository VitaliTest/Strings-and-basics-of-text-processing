package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class StringOrStringBuilder {

    public static void task2_1() {
        String str = "    too  many  spaces   ";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int count = 1;
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == ' ') {
                        count++;
                    } else break;
                }
                if (count > max) max = count;
            }
        }
        System.out.print("Максимальное количество пробелов: " + max);
    }

    public static void task2_2() {
        String str = "anyone, alright, abstract";
        System.out.print(str.replace("a", "ab"));
    }

    public static void task2_3() {
        String str = "заказ";
        StringBuilder sb = new StringBuilder(str).reverse();
        if (str.equalsIgnoreCase(sb.toString())) {
            System.out.print("Слово \"" + str + "\" является полиндромом");
        } else {
            System.out.print("Слово \"" + str + "\" не является полиндромом");
        }
    }

    public static void task2_4() {
        String str = "информатика";
        System.out.print("Полученное слово: " +str.charAt(7) + str.substring(3, 5) + str.charAt(7));
    }

    public static void task2_5() {
        String str = "adorable";
        char ch = 'a';
        System.out.print("Количество букв \"" + ch + "\" в слове \"" + str + "\": " + str.chars().filter(c -> c == ch).count());
    }

    public static void task2_6() {
        String str = "adorable";
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.print("новая строка: " + newStr);
    }

    public static void task2_7() {
        String str = "aaaabbbbc cddde dbbedfdeeeeffffdd";
        str = str.replaceAll(" ", "");
        StringBuilder newStr = new StringBuilder(str);
        for (int i = 0; i < newStr.length(); i++) {
            for (int j = newStr.length() - 1; j > i; j--) {
                if (newStr.charAt(i) == newStr.charAt(j)) {
                    newStr.deleteCharAt(j);
                }
            }
        }
        System.out.print("Новая строка: " + newStr);
    }

    public static void task2_8() {
        String str = "   longest   word  in this     sentence   ";
        str = str.trim().replaceAll("\\s+", " ");
        String[] strArr = str.split(" ");
        int max = 0, index = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > max) {
                max = strArr[i].length();
                index = i;
            }
        }
        int count = 0;
        for (String s : strArr) {
            if (max == s.length()) {
                count++;
            }
            if (count > 1) break;
        }
        if (count == 1) {
            System.out.print("Самое длинное слово в строке: " + strArr[index]);
        }
    }

    public static void task2_9() {
        String str = "VeRy NiCe DaY";
        int upperCount = 0, lowerCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upperCount++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                lowerCount++;
            }
        }
        System.out.print("Прописных: " + upperCount + "\nСтрочных: " + lowerCount);
    }

    public static void task2_10() {
        String str = "Hello! How are you? Fine.", punctuations = ".!?";
        String[] strArr = str.split("");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (punctuations.contains(strArr[i])) {
                count++;
            }
        }
        System.out.print("Количество предложений: " + count);
    }
}
