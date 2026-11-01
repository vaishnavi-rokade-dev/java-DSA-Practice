public class primeNo{
public static void main(String[] args){

int num = 5;
int i;
int c = 1;
 for(i=1;i<=num;i++){

c=c*i;

}

if(c % c !=0){
System.out.println("The number is not prime");
}
else{
System.out.println("The number is prime");
}

}
}