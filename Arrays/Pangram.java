class Solution {
    public boolean checkIfPangram(String sentence) {
        String str = sentence.toLowerCase();

        HashSet <Character> set = new HashSet<>();

        for(char c: str.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                set.add(c);
            }
        }
        if(set.size() == 26){
            return true;
        } else{
            return false;
        }
    }
}
