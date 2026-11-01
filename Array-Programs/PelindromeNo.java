public class PelindromeNo{
public static void main(String[] args){

int num =123;
int rem;
int ans=0	;
while(num>0){
rem = num%10;
ans = ans*10+rem;
num =num/10;
}
System.out.print(ans);

}


}