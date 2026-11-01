public class ArmstrongNo{
public static void main(String[] args){

int n = 159;
int rem;
int sum = 0;
while(n>0){
rem = n%10;
sum = sum+rem*rem*rem;
n=n/10;
}

System.out.print(sum);
}


}