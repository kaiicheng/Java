
public class ParseDouble {

	public static void main(String[] args) {
		
		String pi = "3.1415926";
		Double doubleValue1 = Double.valueOf(pi);
		Double doubleParse1 = Double.parseDouble(pi);
		System.out.println(String.format("doubleValue1 = %s, doubleParse1 = %s",doubleValue1, doubleParse1));
		
		Double piOfDouble = 3.1415926;
		Double doubleValue2 = Double.valueOf(piOfDouble);
		Double doubleParse2 = Double.parseDouble(piOfDouble.toString());
		System.out.println(String.format("doubleValue2 = %s, doubleParse2 = %s",doubleValue2, doubleParse2));
		
		Float piOfFloat = Float.valueOf(pi);
		Double doubleValue3 = Double.valueOf(piOfFloat);
		Double doubleParse3 = Double.parseDouble(piOfFloat.toString());
		System.out.println(String.format("doubleValue3 = %s, doubleParse3 = %s",doubleValue3, doubleParse3));

	}
}
