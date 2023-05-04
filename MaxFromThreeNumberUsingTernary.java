package day2;
//wap to find max number out of three number
public class MaxFromThreeNumberUsingTernary {

	public static void main(String[] args) {
		int a=11;
		int b=22;
		int c=23;
		//nested ternary operator 
		int max= (a>b ?  (a>c?a:c)    : (b>c?b:c));
		System.out.println(max);
		 
			
	}

}
