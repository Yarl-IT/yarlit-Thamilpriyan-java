class IrregularArray{
	public static void main(String[] args){
		int[][] studentMarks = new int[4][];
		
		studentMarks[0] = new int[3];
		studentMarks[1] = new int[4];
		studentMarks[2] = new int[2];
		studentMarks[3] = new int[1];
	
	
		studentMarks[0][0] = 10;
		studentMarks[0][1] = 20;
		studentMarks[0][2] = 30;
		
		studentMarks[1][0] = 40;
		studentMarks[1][1] = 50;
		studentMarks[1][2] = 60;
		studentMarks[1][3] = 70;
		
		studentMarks[2][0] = 80;
		studentMarks[2][1] = 90;
		
		studentMarks[3][0] = 100;
		
		for(int i = 0; i < studentMarks.length; i++){
			System.out.println("Student " + (i+1));
			for(int j = 0; j < studentMarks[i].length; j++){
				System.out.println("Marks " + (j+1) + " : " + studentMarks[i][j]);
			}
			System.out.println("********");
		}
	}
}