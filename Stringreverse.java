package janani;
import java.util.Arrays;
import java.util.Scanner;
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
char []a=new char[100];
int i,l;
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.next();
a=str.toCharArray();
Arrays.sort(a);
l=a.length;
for(i=0;i<l;i++){
	System.out.print(a[i]);
}
	}

}
