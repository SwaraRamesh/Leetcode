package Easy;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman = "MCMXCIV";
		System.out.println(romanToInt("roman") + "is the Integer value of the roman numeral " + roman + ".");
	}
    public static int romanToInt(String s) {
        int val = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        while (s.length() > 1) {
            if (map.get(s.substring(0, 1)) < map.get(s.substring(1, 2))) {
                val += map.get(s.substring(1, 2)) - map.get(s.substring(0, 1));
                s = s.substring(2);
            }
            else {
                val += map.get(s.substring(0, 1));
                s = s.substring(1);
            }
        }
        if (s.length() == 1) {
            val += map.get(s.substring(0, 1));
        }
        return val;
	}

}
