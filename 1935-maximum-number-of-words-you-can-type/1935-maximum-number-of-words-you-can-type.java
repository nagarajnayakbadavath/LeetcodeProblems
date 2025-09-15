class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String textArr[]=text.split(" ");
        String brokenArr[]=brokenLetters.split("");


        if(brokenLetters.length()==0) return textArr.length;
        int ans=textArr.length;

        for(int i=0;i<textArr.length;i++){

            for(int j=0;j<brokenArr.length;j++){
                if(textArr[i].contains(brokenArr[j])){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}