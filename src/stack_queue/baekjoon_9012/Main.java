package stack_queue.baekjoon_9012;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i < T; i++){
            String s = br.readLine();
            sb.append(isVps(s) ? "YES" : "NO").append("\n");
        }
        System.out.println(sb);
    }

    static boolean isVps(String s){
        int cnt = 0;
        for(int i = 0; i < s.length();i++){
            char c = s.charAt(i);
            if(c == '(') cnt++;
            else if (c == ')') {
                cnt--;
                if(cnt < 0) return false;
            }
        }
        return cnt == 0;
    }
}
