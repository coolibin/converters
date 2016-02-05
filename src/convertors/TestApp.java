package convertors;

public class TestApp {

	public static void main(String[] args) {
		
		System.out.println("Result: " + new BinStr2int().convert("10"));
		System.out.println("Result: " + new BinStr2int().convert("101"));
		System.out.println("Result: " + new BinStr2int().convert("1111"));
		System.out.println("Result: " + new BinStr2int().convert("100000000"));
	}

}
