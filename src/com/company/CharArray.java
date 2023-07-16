package com.company;

public class CharArray {

    public static void task1_1() {
        String[] camelCase = {"epamTraining", "maximAgapitov", "vitebskaiaOblast"}, snakeCase = new String[camelCase.length];
        for (int i = 0; i < camelCase.length; i++) {
            char[] charArr = camelCase[i].toCharArray();
            int index = 0;
            for (int j = 0; j < charArr.length; j++) {
                if(Character.isUpperCase(charArr[j])) {
                    index = j;
                    charArr[j] = Character.toLowerCase(charArr[j]);
                }
            }
            char[] charArrNew = new char[charArr.length + 1];
            for (int j = 0; j < charArrNew.length; j++) {
                if (j < index) {
                    charArrNew[j] = charArr[j];
                } else if (j == index) {
                    charArrNew[j] = '_';
                } else {
                    charArrNew[j] = charArr[j - 1];
                }
            }
            snakeCase[i] = new String(charArrNew);
        }
        for (String strings : snakeCase) {
            System.out.print(strings + "; ");
        }
    }

    public static void task1_2() {
        String str = "wordjavaepam wor d w0rd woord thisisword", newStr;
        char[] charArr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'w' && charArr[i + 1] == 'o' && charArr[i + 2] == 'r' && charArr[i + 3] == 'd') {
                count++;
                i = i + 3;
            }
        }
        char[] charArrNew = new char[charArr.length + (count * 2)];
        int j = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'w' && charArr[i + 1] == 'o' && charArr[i + 2] == 'r' && charArr[i + 3] == 'd') {
                charArrNew[j] = 'l';
                charArrNew[j + 1] = 'e';
                charArrNew[j + 2] = 't';
                charArrNew[j + 3] = 't';
                charArrNew[j + 4] = 'e';
                charArrNew[j + 5] = 'r';
                i = i + 3;
                j = j + 5;
            } else {
                charArrNew[j] = charArr[i];
            }
            j++;
        }
        newStr = new String(charArrNew);
        System.out.println(newStr);
    }

    public static void task1_3() {
        String str = "this is letter about numbers: 35, 21, 888";
        char[] charArr = str.toCharArray();
        int count = 0;
        for (char c : charArr) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        System.out.print("Количество цифр: " + count);
    }

    public static void task1_4() {
        String str = "this is letter about numbers: 35, 21, 888";
        char[] charArr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isDigit(charArr[i])) {//начало числа
                count++;
                for (int j = i + 1; j < charArr.length; j++) {//находим конец числа
                    if (Character.isDigit(charArr[j])) {
                        i = j;
                    } else break;
                }
            }
        }
        System.out.print("Количество чисел: " + count);
    }

    public static void task1_5() {
        String str = "   too    many    spaces    ";
        char[] charArr = str.trim().toCharArray();
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                while (charArr[i + 1] == ' ') {
                    count++;
                    i++;
                }
            }
        }
        char[] charArrNew = new char[charArr.length - count];
        int j = 0;
        for (int i = 0; i < charArr.length; i++) {
            charArrNew[j] = charArr[i];
            if (charArr[i] == ' ') {
                while (charArr[i + 1] == ' ') {
                    i++;
                }
            }
            j++;
        }
        str = new String(charArrNew);
        System.out.print(str);
    }
}
