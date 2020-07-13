package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopChallenge {
public static void main(String[] args) {
	/*for (int i = 1; i < 101; i++) {
		System.out.println(i);
	}
	for (int i = 0; i < 100; i++) {
		System.out.println(100-i);
	}
	for (int i = 1; i < 101; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	for (int i = 0; i < 100; i++) {
		if (i%2==1) {
			System.out.println(i);
		}
	}
	for (int i = 0; i < 501; i++) {
		if(i%2==1) {
			System.out.println(i + " is odd");
		}else {
			System.out.println(i + " is even");
		}
	}
	for (int i = 0; i < 778; i++) {
		if (i%7==0) {
			System.out.println(i);
		}
	}
	for (int i = 0; i < 14; i++) {
		System.out.println("In " + (2006 + i) + " I was " + i + " years old.");
	}
	for (int i = 0; i < 3; i++) {
		
		for (int j = 0; j < 3; j++) {
			System.out.println(i +" " + j );
			
		}
for (int i = 1; i < 9; i+=3) {
	System.out.println((i) + " " + (i+1) + " " + (i+2));
	
}	
for (int i = 1; i < 9; i+=3) {
	for (int j = 0; j < 1; j++) {
		
	
	System.out.println((i) + " " + (i+1) + " " + (i+2));
	
}	}
for (int i= 1; i < 101; i+=10) {
	for (int j = i; j < i+10; j++) {
		System.out.print(j+" ");
	}
System.out.println();
}*/
for (int i = 0; i < 6; i++) {
	for (int j = 0; j < i+1; j++) {
		System.out.print("*");
	}
	System.out.println();
}
}
	
	
}

