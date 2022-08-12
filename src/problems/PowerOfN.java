package problems;

public class PowerOfN {
	static double  result = 1;
	
	public static void main(String[] args) {
		double x = 2;
		int y = -2;
		double power = myPow(x, y);
		System.out.println(x +"to the power of "+ y +" -----> "+power);
	}
	
	public static double myPow(double x, int n) {
        if(n == 0) {
        	return 1;
        }
        double xmin1 = myPow(x, n-1);
        double xn = x * xmin1;
        return xn;
        
	}
}
