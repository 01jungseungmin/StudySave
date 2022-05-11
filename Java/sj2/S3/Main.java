package sj2.S3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = scanner.nextLine();
        StringTokenizer token = new StringTokenizer(str);

        System.out.println("단어 갯수 : " + token.countTokens());

        String[] array = new String[token.countTokens()];

        for (int i = 0; i < array.length; i++) {
            array[i] = token.nextToken();
        }

        Arrays.sort(array);

        System.out.print("정리된 토큰 : ");
        for (String string : array) {
            System.out.print(string + ", ");
        }
    }
}
