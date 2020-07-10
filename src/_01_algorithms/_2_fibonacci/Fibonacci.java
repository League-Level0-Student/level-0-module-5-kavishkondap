package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
int one  = 0;
int two = 1;

System.out.println(one);
System.out.println(two);
for (int i = 0; i < 10; i++) {
	int sum = one + two;
	System.out.println(sum);
	one = two;
	two = sum;
}
	
//0,1,1,2,3,5,8,13,21,34,55,89,	
}
}
