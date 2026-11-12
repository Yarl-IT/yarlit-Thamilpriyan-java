class TwoArrays{
	public static void main(String[] args){
		int[][] marks = new int[5][2];
		
		marks[0][0]=10;
		marks[0][1]=20;
		
		marks[1][0]=30;
		marks[1][1]=40;
		
		marks[2][0]=50;
		marks[2][1]=60;
		
		marks[3][0]=70;
		marks[3][1]=80;
		
		marks[4][0]=90;
		marks[4][1]=100;
		
		for(int i = 0; i < marks.length; i++){
			for(int j = 0; j < marks[i].length; j++){
				System.out.println(marks[i][j]);
			}
			System.out.println();
		}
	}
}