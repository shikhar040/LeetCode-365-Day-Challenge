class Solution {
    public String[] divideString(String s, int k, char fill) {
        int totalGroups = (s.length() + k - 1) / k;
        String[] result = new String[totalGroups];
        int index = 0; 
        for (int i = 0; i < s.length(); i += k) {
            String group = "";
            for (int j = 0; j < k; j++) {
                if (i + j < s.length()) {
                    group += s.charAt(i + j); 
                } else {
                    group += fill; 
                }
            }

            result[index] = group;
            index++;
        }
        return result;
    }
}
