class Solution {
    public String reverseWords(String s) {
        
        StringBuilder str = new StringBuilder();
        String newStr = "";
        for(int i=0; i<s.length(); i++){
            str.append(s.charAt(i));
            if(s.charAt(i) == ' '){
                str.deleteCharAt(str.length()-1);
                str.reverse();
                newStr += str+" ";
                str = new StringBuilder();
            }
        }

        newStr = newStr + str.reverse();
        return newStr;
    }
}
