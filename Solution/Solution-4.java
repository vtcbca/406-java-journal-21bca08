import java.io.*;

class overload {
	static boolean isNumber(String s) {
		for(int i=0;i<s.length();i++)
		if(Character.isDigit(s.charAt(i))==false)
		return false;
		return true;
	}	
	void add(int a, int b) {
		System.out.println("Result is : "+(a+b)) ;
	}
	void add(String a, String b) {
		System.out.println("Result is : "+(a+b));
	}
	public static void main(String[] args) {
		overload obj = new overload();
		if(isNumber(args[0])&&isNumber(args[1])) {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			obj.add(a,b);
		}
		else
		obj.add(args[0],args[1]);
	}
}