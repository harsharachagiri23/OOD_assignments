package neu.edu.csye6200;

public class ConvertUtility {

	public static int stringToInt(String s) {
		int n = 0;
		try {
			n = Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			System.out.println("INVALID STRING FORMAT:'" + s + "'");
			e.printStackTrace();
		}
		return n;
	}
	
	public static double stringToDouble(String s) {
		double m = 0;
		try {
			m = Double.parseDouble(s);
		} catch (NumberFormatException e) {
			System.out.println("INVALID DOUBLE FORMAT:'" + s + "'");
			e.printStackTrace();
		}
		return m;
	}
	
}
