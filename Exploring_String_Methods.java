public class Main {
	public static void main(String[] args) {
		String name = "Anupkumar Patil";
		//length
		int len = name.length();
		System.out.println(len);
		
		///indexof
		System.out.println(name.indexOf('p'));
		
		//char at
		System.out.println(name.charAt(4));
		
		//last index of
		System.out.println(name.lastIndexOf('a'));
		
		//to Upper and Lower
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//replace
		String new_name = name.replace('a','o');
		new_name = name.replace('A','O');
		System.out.println(new_name);
		
		//is Empty
		if(name.isEmpty()){
		    System.out.println("Your name is empty");
		}else{
		    System.out.println("Your name is not empty");
		}
		
		//contains Spaces
		if(name.contains(" ")){
		    System.out.println("Your name contains spaces");
		}else{
		    System.out.println("Your name does not contain spaces");
		}
		
		//String Equality
		if(name.equals("Anupkumar Patil")){
		    System.out.println("Hello "+ name);
		}else{
		    System.out.println("We dont remember you");
		}
		
		//String Equality Ingnoring Case Sensitivity
		if(name.equalsIgnoreCase("anupkumar patil")){
		    System.out.println("Hello "+ name);
		}else{
		    System.out.println("Who are you ");
		}
		
	}
}