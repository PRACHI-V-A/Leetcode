class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";  // If the array is empty or null, return an empty string
        }
        
        String commonPrefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                
                if (commonPrefix.isEmpty()) {
                    return "";  // If the common prefix becomes empty, return immediately
                }
            }
        }
        
        return commonPrefix;
    }
}
