import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         // 입력받기 위한 Scanner
        String roomNumber = sc.next();               // 방 번호 입력 받기
        int[] count = new int[10];                   // 0~9 숫자 각각 몇 개 필요한지 저장할 배열

        // 각 숫자의 개수 세기
        for (int i = 0; i < roomNumber.length(); i++) {
            char ch = roomNumber.charAt(i);          // i번째 문자 꺼내기
            int digit = ch - '0';                    // 문자 → 숫자로 변환
            count[digit]++;                          // 해당 숫자 카운트 증가
        }

        // 6과 9는 서로 바꿔쓸 수 있으니까 합쳐서 처리
        int sixNineCount = count[6] + count[9];
        count[6] = count[9] = (sixNineCount + 1) / 2;

        // 가장 많이 필요한 숫자의 개수 찾기 (세트 개수 = 가장 큰 숫자 카운트)
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        System.out.println(max);  // 필요한 세트의 최소 개수 출력
    }
}
