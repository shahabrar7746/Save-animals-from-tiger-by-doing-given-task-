import java.util.*;
public class SaveAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Stack<String> st = new Stack();//This DS will store the animals which is going to be saved
		st.push("Dog");
		st.push("Hen");
		st.push("Bug");
		st.push("Cat");
		st.push("Frog");
		st.push("Ginny Pig");
		st.push("Fish");
		st.push("Rat");
		st.push("Bull");
		String ip1 = "123456789";//This will be used to take input for two numbers
		String op = "*+-/";//Will be used to chose to operation between numbers
		int ans = 0;//This will contain our System answer
		System.out.println("You have to save this animals from tiger roaming around them " + st);
		System.out.println("Press any key to enter in game");
		s.nextLine();//this store any pressed key while entering in the game 
		while(!st.isEmpty()) {
			Calendar cld = Calendar.getInstance();//this obj will be used to define start time for user
			System.out.print(st);
			for(int i = 0;i<st.size();i++) {
				System.out.print("_");
			}
			System.out.println("Tiger");
			
			Random rd = new Random();//This obj will be used to get numbers from System
			int nums = rd.nextInt(ip1.length());//to contain first number 
			int nums1 = rd.nextInt(ip1.length());//To contain SECOND number
			char sign = op.charAt(rd.nextInt(op.length()));//to contain operation sign
			System.out.println("Complete the task to save animals\n" + nums +  sign + nums1 + "=");
			System.out.println("You have 5s to complete");
			//this switch will be used to get correct answer while comparing it with user's answer
			switch(sign) {
			case '+' :
				ans = nums + nums1;
				break;
			case '-' : 
				ans = nums - nums1;
				break;
			case '/':
				ans = nums / nums1;
				break;
			case '*':
				ans = nums * nums1;
				break;
			default :
				System.out.println("Something is wrong");
				
			}
			System.out.println("Write answer below this ");
			int strt = cld.get(Calendar.SECOND);//To contain starting time of user
		
			int ans1 = s.nextInt();//To conatin user's answer
				Calendar cld1 = Calendar.getInstance();
			int end = cld1.get(Calendar.SECOND);//To contain ending time of user which will be used to see if the 
			//answer came in time or not 
			
			if(strt+5 >= end) {
				if(ans == ans1) {
				    //Top most animal will be removed from Stack if the answer is right
				    //if not then it will clear Stack ans say "You lost the game " or " You just lost all the animals"
					System.out.println("You just saved " + st.pop());
					if(st.isEmpty()){
					    System.out.println("You saved all animals");
					}
					
				}else {
				    //All the animals will be removed if the answer is wrong
					System.out.println("Your answer is not correct\nAnd you just lost all the animals ");
st.clear();
				}
				
			}else {
				System.out.println("You didn't complete your task on time\n And you just lost all the animals ");
			st.clear();
			}
			
		}

	}

}
