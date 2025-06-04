package TextBook_Practice.Chapter3;

import java.io.*;
public class Practice6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double randomNum = Math.random() * 9;
        int ans = (int)randomNum + 1;
        System.out.println("【数当てゲーム】");
        for (int i = 0; i < 5; i++) {
            System.out.println("1～9の数字を入力してください");
            int num = Integer.parseInt(br.readLine());
            if (num == ans) {
                System.out.println("アタリ！");
                break;
            }else{
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
