public class ReverseNo{
public static void main(String[] args){
int n = 121;
int ans=0;
int r;

while(n>0){
r = n%10;
ans=ans*10+r;
n=n/10;

}

System.out.println(ans);

}}



