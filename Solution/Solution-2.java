import java.util.*;

class flytriangle {
	public static void main (String[] args) 
	{
		int i,j,k=1, num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.format("%d ", k++);
			}
			System.out.print("\n");
		}
	}
}