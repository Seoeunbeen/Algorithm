public class assignment1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10, 5)); // 출력: 2
        System.out.println(sol.solution(7, 2)); // 출력: 3
    }
}

class Solution {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }
}
