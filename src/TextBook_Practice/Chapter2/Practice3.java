package TextBook_Practice.Chapter2;

import java.io.*;

public class Practice3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください＞");
        String name = br.readLine();
        System.out.print("あなたの年齢を入力してください＞");
        String age = br.readLine();
        System.out.println("占いの結果が出ました！");
        double randomNum = Math.random() * 4;
        int fortune = (int)randomNum + 1;
        System.out.println(age + "歳の" + name +"さん、あなたの運気番号は" + fortune + "です。");
        System.out.println("(1:大吉　2:中吉　3:小吉　4:凶)");
    }
}
