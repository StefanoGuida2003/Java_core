public class HelloWorld{
	
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		if(n % 2 == 0) {
			System.out.println(args[0] + " is even");	 
		}
		else {
			System.out.println(args[0] + " is odd");
		}
	}
}