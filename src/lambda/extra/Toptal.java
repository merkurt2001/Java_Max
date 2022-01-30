package lambda.extra;

public class Toptal {
    public static void main(String[] args) {
//firstRepeatedWord("java java had a a good sol");
        firstRepeated("java selenium selenium is fun");
    }

    public static String firstRepeatedWord(String sentence){
        sentence=sentence.replaceAll("  "," ");
        String []s= sentence.split(" ");
        String a=null;
        for(int i=0;i<s.length;i++){
            for(int j=1;j<i;j++){
                if(s[i].equals(s[j])){
                    a=s[j];
                    System.out.println(a);
                    return a;

                }
            }
        }
        return s[0];
    }

    public static String firstRepeated(String sentece){
        String []str=sentece.split(" ");
        String firstWord=null;
        for(int i=0;i<str.length;i++){
         for(int j=1;j<i;j++){
             if(str[i].equals(str[j])){
                 firstWord=str[j];
                 System.out.println("firstWord = " + firstWord);
                 return firstWord;
             }
         }
        }
        return str[0];
    }
}
