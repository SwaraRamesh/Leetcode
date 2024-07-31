package Medium;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123;
		System.out.println(reverse(x) + " is the reverse of " + x + ".");
	}
	
    public static int reverse(int x) {
        int og=x;
        Long num = 0L;   
        while (x != 0){
            num = num * 10 + x%10;
            x = x/10;
        }    
        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE)
            num = 0L;
        return num.intValue();
	}

}
