package Khanal.Vidhan.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator){
		double answer = numerator/denominator;
		if (denominator == 0){
            throw new ArithmeticException("Can't divide by 0");};
        return answer;
        }
	
	public double multiply(double a, double b){
		double answer = a*b;
        return answer;
        }
	
	
}

