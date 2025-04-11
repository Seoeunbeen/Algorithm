import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException { // main 함수 시작, 입력 중 예외 발생 가능성 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 사용자 입력을 한 줄씩 읽기 위한 준비
       
        int K = Integer.parseInt(br.readLine()); // 첫 줄 입력(문자열)을 정수로 변환 → 앞으로 입력받을 숫자 개수
        Stack<Integer> stack = new Stack<>(); // 숫자들을 저장할 스택 생성
        
        for (int i = 0; i < K; i++) { // K번 반복하면서 숫자를 입력받아 처리
            int num = Integer.parseInt(br.readLine());
            
            if (num == 0) {
                if (!stack.isEmpty()) {
                    stack.pop(); // 0이 입력되면 가장 최근 숫자 제거
                }
            } else {
                stack.push(num); // 0이 아니면 스택에 숫자 저장
            }
        }

        // 스택에 남은 숫자들의 총합 계산
        int sum = 0;
        for (int n : stack) {
            sum += n;
        }

        System.out.println(sum); // 결과 출력
    }
}
