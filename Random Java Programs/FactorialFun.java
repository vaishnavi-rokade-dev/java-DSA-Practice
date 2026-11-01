public class FactorialFun{

public static void main(String[] args){

int output = Fact(5);
System.out.println(output);
}
static int Fact(int num){
int result = 1;
 num = 5;
for(int i = 1;i<=num;i++){

result = result*i;
}
return result;

}
}
