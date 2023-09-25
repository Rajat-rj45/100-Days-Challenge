public class ReverseSTR {

    public static String reverseWord(String str)
    {
        // Reverse the string str
      String rev="";
      char ch;
      for (int i=0;i<str.length();i++){
          ch=str.charAt(i);
          rev=ch+rev;
      }
      return rev;
    }

    public static void main(String[] args) {
    String str="Rajat_Kumar";
     String rev=reverseWord(str);
     System.out.print(rev);
    }
}

