package test;

import java.util.Arrays;

public class TestSplit {
    public static void main(String[] args) {
        String input = "123 + 123";
        String[] hello = input.split("[+]");
        System.out.println(Arrays.toString(hello));
    }
}
