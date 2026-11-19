import java.util.Scanner;

class StudentMarksArray{
	public static void main(String[] args){
		int[] marks = new int[5];

	
		int total = 0;
		Scanner input = new Scanner(System.in);
	
		for(int i=0; i<marks.length; i++){
			System.out.print("Enter marks for subject " +(i+1) + ": ");
			marks[i]=input.nextInt();
			total += marks[i];
		}
	
		double average = (double)total/marks.length;
		System.out.println("Total Marks: " + total);
		System.out.println("Average Marks: " + average);
		input.close();
	}
}