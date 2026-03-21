public class Main {
	public static void main(String[] args) {
		
		Student student1 = new Student("Spongebob",18,7.3);
		Student student2 = new Student("Patrik", 19, 8.85);
		
		//System.out.println(student1.name);
//		System.out.println(student1.age);
//		System.out.println(student1.gpa);
//		System.out.println();
//		
//		System.out.println(student2.name);
//		System.out.println(student2.age);
//		System.out.println(student2.gpa);

		student1.study();
		student2.study();
		
	}
}