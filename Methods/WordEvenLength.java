public class WordEvenLength{

public static boolean IsWordEvenLength(String word){

return word.length() % 2 == 0;

}
public static void main(String[] args){

boolean result = IsWordEvenLength("Programming");
System.out.println(result);
}

}