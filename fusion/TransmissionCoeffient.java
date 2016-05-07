package fusion;

public class TransmissionCoeffient {
	//Reduced Planck Constant for joules
public static float ReducedPlanckConstant = (float) (1.054571800 * Math.pow(10, -34));
public static float ElemtaryCharge = (float) (1.6021766208 * Math.pow(10, -19));
public static long ColumbConstant = (long) (8.98755 * Math.pow(10, 9));
/**
 * 
 * @param mass in kilograms
 * @param enegry in joules
 * @param proton1 in atom 1
 * @param proton2 in atom 2
 * @param r1 radius of the nucleus of atom 1 in meters
 * @param r2 radius of the nucleus of atom 2 in meters
 * @return the Transmission Coeffient
 */
	public static double IntegralTransmissionCoeffientforFusion(double mass, double enegry, int proton1, int proton2, double r1, double r2){
		double integralpart = 0; 
		for(double i = r1; i < r2; i++){
			double difE = BarrierHeight(i, proton1, proton2) - enegry;
			integralpart += Math.sqrt(difE*mass);
		}
		double difE = BarrierHeight(r2, proton1, proton2) - enegry;
		
		integralpart += Math.sqrt(difE*mass);
		
		double exponetpar1 = integralpart * -2 * r1;
	
		double exponetpar2 = exponetpar1 / ReducedPlanckConstant;
		
		return Math.exp(exponetpar2);
		
	}
	public static double BarrierHeight(double r, int proton1, int proton2) {
		double top = ColumbConstant * Math.pow(ElemtaryCharge, proton1 + proton2);
		
		double bottom = r;
		
		return top/bottom;
	}
	
	public static double TransmissionCoeffientforFusion(double mass, double enegry, int protons, double r) {
		double difE =  BarrierHeight(r, protons/2, protons/2);
		
		double root = Math.sqrt(difE * mass);
		double top = root * -2 * r;
		
		double topAndBottom = top / ReducedPlanckConstant;
		return Math.exp(topAndBottom);
	}
}
