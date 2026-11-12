class ArrayWhileLoopReverse{
	public static void main(String[] args){
		int[] numbers = new int[]{10, 20, 30, 40, 50};
		
		int i = numbers.length;
		
		while(i>=0){
			System.out.println(numbers[i]);
			i--;
		}
	}
}
