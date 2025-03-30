public class Assignment1_3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 테스트 케이스 1
        System.out.println(sol.solution(60, 2, 3)); // 1
        
        // 테스트 케이스 2
        System.out.println(sol.solution(55, 10, 5)); // 0
    }
}

class Solution {
    public int solution(int number, int n, int m) {
        // number가 n의 배수이면서 m의 배수인지 확인
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}