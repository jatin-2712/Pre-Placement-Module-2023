class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }

    private String compare(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : str.toCharArray()) {

            if (c != '#') {
                stack.push(c);

            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.toString();
    }
}
