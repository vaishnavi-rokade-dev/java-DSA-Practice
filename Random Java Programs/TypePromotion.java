public class TypePromotion{

public static void main(String[] args){

int a= 257;
byte b = (byte)(a);
System.out.println(b);

}
}
//In that only byte value stored is 256 but 257 is greater than the 256 hence 257/256 remains 1 hence 1 is the output