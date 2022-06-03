class Solution {
    public String reverseWords(String s) {
      int i,k=0;
        String z="";
       s=s.trim();
        String wordArrays[]=s.split(" ");
        for(i=wordArrays.length-1;i>0;i--)
        {
            if(wordArrays[i]!="")
            {
                z=z+wordArrays[i]+" ";
            }
        }
        z=z+wordArrays[0];
        return z;
    }
}