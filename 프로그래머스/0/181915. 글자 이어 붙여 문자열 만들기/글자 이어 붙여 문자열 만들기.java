class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder result = new StringBuilder();
        
        for (int index : index_list) {
            result.append(my_string.charAt(index));
        }
        
        return result.toString();
    }

    // 테스트를 위한 main 메서드
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 테스트 케이스 1
        String str1 = "cvsgiorszzzmrpaqpe";
        int[] indices1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(sol.solution(str1, indices1)); // "programmers"
        
        // 테스트 케이스 2
        String str2 = "zpiaz";
        int[] indices2 = {1, 2, 0, 0, 3};
        System.out.println(sol.solution(str2, indices2)); // "pizza"
    }
}