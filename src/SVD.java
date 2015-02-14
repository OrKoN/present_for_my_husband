import java.util.Scanner;

public class SVD {

	static Scanner userinput = new Scanner(System.in);
	
	

	public static void main(String[] args) {
System.out.println("Hi! I'm a program written by your wife. Let's see what i can. Enter any number you want.");
int ui=userinput.nextInt();
System.out.println("You entered "+ui+"!!!"+"Did you see that?? I'm smart!\n"+"Ok,just kidding. Let's go further.\n"+"Enter two or more numbers separated by commas.");
String userinp=userinput.next();
String[]str=userinp.split(",");
int[] ints = new int[str.length];
for(int i=0;i<str.length;i++){
	 ints[i] = Integer.parseInt(str[i]);
}
int max=0;
for(int j=0;j<ints.length;j++){
	if(ints[j]>max){
		max=ints[j];
	}
}
int min=ints[0];
for(int k=1;k<ints.length;k++){
	if(min>ints[k]){
		min=ints[k];
	}
}
System.out.println("The biggest number you entered: "+max+"\nThe smallest number you entered: "+min);


		System.out
				.println("\nNow let's see how good you know the most important information about your wife!You should complete the sentences.\n"
				+ "Please pay attention at the number of underscores,they denote the number of letters in the word.\n"+"It will help you to find the right answer!"
						+ "Write in English.The first sentence:\n"+"The full name of my wife is _ _ _ _ _ _ _ _ _");
		int numGuess=0;
		String u = userinput.next();
		while (!"Anastasia".equals(u)) {
			System.out.println("Either you don't know that the first letter of the name should be capital letter\n"+"or you don't know the name of your wife...Try again:");
			u = userinput.next();
			numGuess++;
		}
			System.out
					.println("Great! You and Anastasia had a beautiful _ _ _ _ _ _ _ on the 31 of October.");
		
		
			u = userinput.next();
	while (!"wedding".equals(u)) {
			System.out.println("Don't you know the word 'wedding'? Or you are trying to use capital letters in the middle of the sentence? Try again:");
			u = userinput.next();
			numGuess++;
		}
			System.out
					.println("That's amazing! You and Anastasia live in the _ _ _ _ _ _ _ _ _-city.");
			u = userinput.next();
		while(!"Stuttgart".equals(u)){
			System.out.println("Don't you know the word 'Stuttgart'? Or you forgot about capital letter? Try again:");
			u = userinput.next();
			numGuess++;
		}
			System.out
					.println("How nice! Anastasia was born on the 2nd of _ _ _ _ _ _ _ .");
		
			u = userinput.next();
		while (!"October".equals(u) ) {
			System.out.println("Don't you know the word 'October'? Or you forgot about capital letter? Try again:");
			u = userinput.next();
			numGuess++;
		}
			System.out
					.println("That's right! Anastasia's family lives in the _ _ _ _ _ _-city.");
		
			u = userinput.next();
		while (!"Moscow".equals(u)) {
			System.out.println("Don't you know the word 'Moscow'? Or you forgot about capital letter? Try again:");
			u = userinput.next();
			numGuess++;
		}
			System.out
					.println("Your and Anastasia's story will last forever and have a happy _ _ _ _ _ _. ");
		
			u = userinput.next();
		while (!"ending".equals(u)){
			System.out.println("Don't you know the word 'ending'? Try again:");
			u = userinput.next();
			numGuess++;
		}
			 
			System.out.println("Oh,man! It's awesome!\n" + " A nastasia\n" + " WE dding\n" + " S tuttgart\n"+" O ctober\n"+" M oscow\n"+" E nding ^-^");
		} 
	}


