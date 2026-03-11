class Solution {
    public int bitwiseComplement(int n) {
        
        String s = Integer.toBinaryString(n);
        String comp = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                comp += '1'+"";
            }else{
                comp +='0'+"";
            }
        }
        return Integer.parseInt(comp,2);
    }
}