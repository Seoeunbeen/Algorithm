import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      // 입력 도구 준비
        int T = Integer.parseInt(sc.nextLine());  // 테스트 케이스 개수 입력

        while (T-- > 0) {
            String input = sc.nextLine();         // 한 줄 입력 받기

            LinkedList<Character> list = new LinkedList<>();       // 문자 저장할 리스트
            ListIterator<Character> cursor = list.listIterator();  // 커서 역할

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch == '<') {
                    if (cursor.hasPrevious()) {
                        cursor.previous();  // 커서 왼쪽 이동
                    }
                } else if (ch == '>') {
                    if (cursor.hasNext()) {
                        cursor.next();      // 커서 오른쪽 이동
                    }
                } else if (ch == '-') {
                    if (cursor.hasPrevious()) {
                        cursor.previous();  // 커서 왼쪽 이동
                        cursor.remove();    // 해당 글자 삭제
                    }
                } else {
                    cursor.add(ch);         // 나머지는 전부 커서 위치에 삽입
                }
            }

            // 출력하기 (리스트에 있는 문자 전부 이어 붙이기)
            StringBuilder result = new StringBuilder();
            for (char c : list) {
                result.append(c);
            }

            System.out.println(result.toString());
        }
    }
}
