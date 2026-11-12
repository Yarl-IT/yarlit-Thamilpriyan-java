class ArrayForLoopReverse{
	public static void main(String[] args){
		int[] numbers = new int[]{10, 20, 30, 40, 50};
		
		for(int i = numbers.length -1; i>=0; i--){
			System.out.println(numbers[i]);
		}
	}
}
