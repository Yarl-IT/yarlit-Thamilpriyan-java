import java.util.Scanner;

class StudentMarks2D{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] subject = new String[]{"ICT", "Tamil", "Maths"};
		int[][] marks = new int[4][subject.length];
		
		for(int i = 0; i< marks.length; i++){
			System.out.println("Enter marks for Student " + (i+1));
			for(int j = 0; j < marks[i].length; j++){
				System.out.print(subject[j] + ": " );
				marks[i][j] = input.nextInt();	
			}
			System.out.println();
		}
		
		
		System.out.println("Student\tICT\tTamil\tMaths\tTotal\tAverage");
		
		for(int i = 0; i < marks.length; i++){
			int total=0;
			System.out.print("S" + (i+1) +"\t");
			for(int j =0; j < marks[i].length; j++){
				System.out.print(marks[i][j] + "\t");
				total += marks[i][j];
			}
			
			double average = (double)total / subject.length;
			System.out.println(total + "\t" + average);
		}
		input.close();
	}
}