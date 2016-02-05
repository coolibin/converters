package convertors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinStr2int {

	public int convert(String _binStr) {
		
		Pattern p = Pattern.compile("^[0-1]+$");
		Matcher matcher = p.matcher(_binStr);
		int result = 0;

		if (!matcher.matches()) {
			System.out.println("it is not a binary: " + _binStr);
		} else {
			char[] input = _binStr.toCharArray();
			Integer currentDigit;

			for (int i = 1; i <= _binStr.length(); i++) {
				currentDigit = Integer.parseInt(String.valueOf(input[i - 1]));

				if (currentDigit == 1) {
					result += (int)Math.pow(2, _binStr.length() - i);
				}
			}
		}
		return result;
	}
}
