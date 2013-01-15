
public class CompareHash {
	
	CompareHash(){
		
	}
	
	public Boolean loginAttempt(String password, String savedPassword){
		String name = "blogg";
		String res;
		String hashres;
		//n = "myPassword";
		Hash h = new Hash();
		hashres = h.hashInputPassword(name, password);
		res = h.hashSavedPassword(name, savedPassword);
		 // because we have no database
		//to compare hashes with, i hash two passwords and compare them for now
	
		System.out.println("login hash: " + res);
		System.out.println("saved hash: " + hashres);
		System.out.println("salt 1: "+ h.salt);
		System.out.println("salt 2: "+ Hash.salt1);
		
		//if (hasres == res) did not work so had to use CompareTo function
		if ( res.compareTo(hashres) == 0){
			System.out.println("login success");
		}
		else{
			System.out.println("login unsuccessful");
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		CompareHash ch = new CompareHash();
		// for debugging purposes, the method takes in the arguments
		// login attempt password and the supposedly 'saved' password in a database
		try{
			System.out.println("suplied pw  : " + args[0]);
			System.out.println("pw in datab : " + args[1]);
			ch.loginAttempt(args[0], args[1]);
		}catch(Exception e){
			
		}
	}

}