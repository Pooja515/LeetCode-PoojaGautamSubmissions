// Last updated: 28/06/2026, 01:02:07
class Solution {
    public int maxVowels(String s, int k) {
        int l=0,maxi=0,cnt=0;
        for(int r=0;r<s.length();r++){
            if(isvowel(s.charAt(r)))  
                  cnt++;
            if((r-l+1)==k){
                maxi=Math.max(maxi,cnt);
                if(isvowel(s.charAt(l))) 
                        cnt--;
                l++;
            }
        }
        return maxi;
    }
         boolean isvowel(char c){
                 return c=='a'|| c=='e'|| c=='i'|| c=='o' || c=='u'; 
        }
}