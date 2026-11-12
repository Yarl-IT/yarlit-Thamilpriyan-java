class ArrayDoWhileLoopForward{
	public static void main(String[] args){
		int[] numbers = new int[]{10, 20, 30, 40, 50};
		
		int i = 0;
		do{
			System.out.println(numbers[i]);
			i++;
		}
		while(i<numbers.length);
	}
}