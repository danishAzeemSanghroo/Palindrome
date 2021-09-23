import java.util.*;
class Palindrome{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter the size of numbers you wana input ");
	int size = ob.nextInt();
	double numbers[] = readinputs(size);
	double numbers2[]= reverse(numbers);
		if(numbers==reverse(numbers))
			System.out.println("Yes it is palindrome");
		else 
			System.out.println("No it is not palindrome");
	}
	
	public static double[] readinputs(int s)
	{
		System.out.println("***Enter "+s+" Numbers***");
	double[] inputs = new double[s];
	for(int i = 0; i<inputs.length; i++)
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter " + (i+1) + " number : ");
			inputs[i] = ob.nextDouble();
	}//forr loop end
	return inputs;
	}
	public static double[] reverse(double[] values)
	{
		double[] array= new double[values.length];
		for(int i = values.length-1; i>=0; i--)
		{
			array[i]=values[i];
			
		}
		return array;
	}
}