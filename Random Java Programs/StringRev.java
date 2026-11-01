public class StringRev{
      public static void main(String[] args){
       String str = "abc";
       String RevStr = " ";
       char ch;
       
        for(int i=0;i<str.length();i++){
             
             ch = str.charAt(i);
             RevStr = ch + RevStr;

           }
           System.out.println("Reverse String is "+"  "RevStr);

          }

          }