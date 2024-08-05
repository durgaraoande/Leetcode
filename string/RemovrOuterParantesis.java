class RemovrOuterParantesis {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int opened = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (opened > 0) {
                    ans.append(c);
                }
                opened++;
            } else {
                opened--;
                if (opened > 0) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}
