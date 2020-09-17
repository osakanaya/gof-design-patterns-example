package uk.me.uohiro.gof.flyweight;

public class Main2 {
	private static BigString[] bigStringArray = new BigString[1000];
	
	public static void main(String[] args) {

		System.out.println("���L�����ꍇ");
		testAllocation(true);
		
		System.out.println("���L���Ȃ��ꍇ");
		testAllocation(false);

	}
	
	private static void testAllocation(boolean shared) {
		for (int i = 0; i < bigStringArray.length; i++) {
			bigStringArray[i] = new BigString("1234567890", shared);
		}
		
		showMemoryAllocation();
	}

	private static void showMemoryAllocation() {
		Runtime.getRuntime().gc();
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		System.out.println("�g�p������: " + usedMemory);
	}
}

