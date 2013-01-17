
public class User {
	private String username;
	private String pwd;
	private String salt;
	
	public User(String username, String pwd){
		this.username = username;
		this.salt = Hash.createSalt();
		this.pwd = Hash.hashSalted(pwd, this.salt);
	}
	
	boolean usernameCorrect(String username){
		return (this.username.compareTo(username)==0);
	}
	
	boolean passwordCorrect(String p){
		return (this.pwd.compareTo(Hash.hashSalted(p, this.salt))==0);
	}
	
	public static void main (String [] arg){
		String username = "test";
		String pwd = "mypassword";
		String wrongPwd = "wrongpassword";
		User test = new User(username, pwd);
		
		if(test.usernameCorrect(username) && test.passwordCorrect(wrongPwd)){
			System.out.println("Welcome "+username);
		}
		else{
			System.out.println("Your username or password is wrong.");
		}
		if(test.usernameCorrect(username) && test.passwordCorrect(pwd)){
			System.out.println("Welcome "+username);
		}
		else{
			System.out.println("Your username or password is wrong.");
		}
		 
	}
}
