// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int sum = Integer.parseInt(args[0]);
		double percent = Double.parseDouble(args[1]);
		int yrs = Integer.parseInt(args[2]);
		double futureVal = sum * Math.pow(percent/100.0 + 1, yrs);
		System.out.println("After " + yrs  + " years, $" + sum + " saved at " + percent + 
		                    "% will yield $" + ( (int) futureVal));
	}
}