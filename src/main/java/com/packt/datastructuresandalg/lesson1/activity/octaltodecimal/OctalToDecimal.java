package com.packt.datastructuresandalg.lesson1.activity.octaltodecimal;

public class OctalToDecimal {
    public int convertToDecimal(String octal) {
        return 999;
    }

    public static int convertBinaryNumbersToDecimal(String binary) {
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(binary.length() - i - 1) == '1') {
                result += Math.pow(2, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertBinaryNumbersToDecimal("10110"));
    }

}
