import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        if (100 <= A && 100 <= B && 100 <= C && A < 1000 && B < 1000 && C < 1000) {
            int result = A * B * C;
            // System.out.println(result);  ← 이 줄은 주석 처리 또는 삭제!
            
            String resultStr = Integer.toString(result);
            int[] count = new int[10];  // 0~9까지 숫자 개수 저장
            
            for (int i = 0; i < resultStr.length(); i++) {
                char ch = resultStr.charAt(i);     // 한 글자씩 가져오기
                int digit = ch - '0';              // 문자 -> 숫자 변환
                count[digit]++;                    // 해당 숫자 카운트 증가
            }

            // 결과 출력 (0부터 9까지)
            for (int i = 0; i < 10; i++) {
                System.out.println(count[i]);
            }
        }
        
        scanner.close(); // Scanner 닫아주기
    }
}
