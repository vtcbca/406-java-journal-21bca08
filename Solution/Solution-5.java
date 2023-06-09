class OddNumberOfDigitsException extends Exception {
	public OddNumberOfDigitsException(String message) {
		super(message);
	}
}

public class conodnum {
	public static void main(String[] args) {
		int numberString = Integer.parseInt(args[0]);
		int temp=numberString;
		int x;
		try {
			while(numberString>0){
				x=numberString%10;
				numberString=numberString/10;
				if (x % 2 != 0) {
					throw new OddNumberOfDigitsException("The number has an odd number of digits");
				}
			}
		}	 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide a number as a command-line argument.");
		} 
		catch (OddNumberOfDigitsException e) {
			System.out.println(e.getMessage());
		}
	}
}