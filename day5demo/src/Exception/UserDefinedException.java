package Exception;

public class UserDefinedException {
	public static void main(String[] args) {
		System.out.println("main starts");
	
		int age = 10;
		try {
			vote(age);
		} catch (NotEligbleForVoteException e) {
			System.out.println(e.getMessage());	
			
		}
		System.out.println("main enda...");	
	}
static void vote(int age) throws NotEligbleForVoteException {
	if(age<18) {
		NotEligbleForVoteException ex = new NotEligbleForVoteException("not eligible for vote");
		
	throw ex;
	
	}
	
	System.out.println("Eligble for vote");	
}
}
