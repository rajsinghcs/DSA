// import java.math.BigInteger;
// class Solution {
//     public int numSteps(String s) {
//         BigInteger bi = new BigInteger(s,2);
//         int num = bi.intValue();

//         int ans = 0;
//         while(num > 1){
//             if(num % 2 == 0){
//                 num/=2;
//                 ans+=1;
//             }else{
//                 num+=1;
//                 ans+=1;
//             }
//         }
//         return ans;
//     }
// }




import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s,2);
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.TWO;

        int ans = 0;
        while(!num.equals(one)){
            if(num.mod(two).equals(BigInteger.ZERO)){
                num = num.divide(two);
                ans+=1;
            }else{
                num = num.add(one);
                ans+=1;
            }
        }
        return ans;
    }
}