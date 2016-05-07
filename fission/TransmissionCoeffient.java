package fission;

public class TransmissionCoeffient {
/**
 * 
 * @param barrierheighta in mega electron-volts
 * @param enegry in mega electron-volts
 * @param wa curvature of barrier A
 * @param barrierheightb in mega electron-volts
 * @param wb curvature of barrier B
 * @param gamma transmission coeffient of gamma rays
 * @return Transmission Coeffient
 */
	public static double TransmissionCoeffientOfTwoWells(double barrierheighta, double enegry, double wa, double barrierheightb, double wb, double gamma) {
		double a = InversedPenetrabilityOfBarrier(barrierheighta, enegry, wa);
		double b = InversedPenetrabilityOfBarrier(barrierheightb, enegry, wb);
		double combinedpentrability = a + b;
		double gammaterm = a * b * gamma;
		double bottom = combinedpentrability + gammaterm;
		return 1/bottom;
	}
	public static double PenetrabilityOfBarrier(double barrierheight, double enegry, double w){
		double difE = barrierheight - enegry;
		double anglething1 = 2*Math.PI;
		double anglething2 = anglething1 /w;
		double answerInversed = 1 + Math.exp(difE * anglething2);
		return Math.pow(answerInversed, -1);
	}
	public static double InversedPenetrabilityOfBarrier(double barrierheight, double enegry, double w){
		double difE = barrierheight - enegry;
		double anglething1 = 2*Math.PI;
		double anglething2 = anglething1 /w;
	
		return 1 + Math.exp(difE * anglething2);
	}
}
