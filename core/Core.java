package core;



public class Core {
public static double deuteronRadius =  1.64 * Math.pow(10, -15);
public static double deuteronMass =  6.690 * Math.pow(10, -27);
public static double tritiumMass =  5.008270942 * Math.pow(10, -27);
public static double inputJoules = 4.8 * Math.pow(10, -16);
public static double tritiumRadius =  1.87 * Math.pow(10, -15);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DD");
System.out.println(fission.TransmissionCoeffient.TransmissionCoeffientOfTwoWells(5.80, 2.45, .95, 7.75, .6, 0.0028));

System.out.println(fusion.TransmissionCoeffient.IntegralTransmissionCoeffientforFusion(deuteronMass, inputJoules, 1,1 , deuteronRadius,  deuteronRadius));
double j = fusion.TransmissionCoeffient.IntegralTransmissionCoeffientforFusion(deuteronMass, inputJoules, 1,1 , deuteronRadius,  deuteronRadius) * fission.TransmissionCoeffient.TransmissionCoeffientOfTwoWells(5.80, 2.45, .95, 7.75, .6, 0.0028) * .25;
System.out.println(j);
//System.out.println(fusion.TransmissionCoeffient.TransmissionCoeffientforFusion(deuteronMass, inputJoules, 2, deuteronRadius));
System.out.println("TD");
System.out.println(fission.TransmissionCoeffient.TransmissionCoeffientOfTwoWells(5.80, 14.1 , .95, 7.75, .6, 0.0028));
System.out.println(fusion.TransmissionCoeffient.IntegralTransmissionCoeffientforFusion(tritiumMass, inputJoules, 1,1 , deuteronRadius, tritiumRadius)+fusion.TransmissionCoeffient.IntegralTransmissionCoeffientforFusion(deuteronMass, inputJoules, 1,1 , deuteronRadius, tritiumRadius));
double u = fusion.TransmissionCoeffient.IntegralTransmissionCoeffientforFusion(tritiumMass, inputJoules, 1,1 , deuteronRadius, tritiumRadius)+fusion.TransmissionCoeffient.IntegralTransmissionCoeffientforFusion(deuteronMass, inputJoules, 1,1 , deuteronRadius, tritiumRadius) * fission.TransmissionCoeffient.TransmissionCoeffientOfTwoWells(5.80, 14.1 , .95, 7.75, .6, 0.0028); 
System.out.println(u);
	}

}
