public class OverloadingRule2{
public static void main(String[] args){

fun(25,43);
fun(26);
}
static void fun(int a,int b){
System.out.println(b);
}
static void fun(int a){
System.out.println(a);;
}

}
//same parameters but different size of the parameter is used
//When the same functios but the different size of the parameters hence method overloading works       