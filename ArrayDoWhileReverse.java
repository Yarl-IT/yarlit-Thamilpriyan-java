class ArrayDoWhileReverse{
	public static void main(String[] args){
		int[] numbers = new int[]{10, 20, 30, 40, 50};
		
		int i = numbers.length-1;
		
		do{
			System.out.println(numbers[i]);
			i--;
		}
		while(i>=0);
	}
}