import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        int n = sc.nextInt(); // 카드의 개수 n을 입력받음

        Queue<Integer> queue = new LinkedList<>(); // 큐(Queue) 생성, FIFO 구조

        // 1부터 n까지 카드를 큐에 순서대로 삽입
        for (int i = 1; i <= n; i++) {
            queue.offer(i); // 큐의 맨 뒤에 i를 삽입
        }

        // 카드가 한 장 남을 때까지 반복
        while (queue.size() > 1) {
            queue.poll(); // 첫 번째 카드를 버림
            queue.offer(queue.poll()); // 그 다음 카드를 큐의 맨 뒤로 보냄
        }

        // 마지막으로 남은 카드 출력
        System.out.println(queue.poll());
    }
}
