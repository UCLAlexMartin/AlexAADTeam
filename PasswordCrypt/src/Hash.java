//import java.security.DigestException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;




public class Hash {
	
	/*public static void main(String[] args) {
		String n = "";
		byte[] bn;
		Hash hs = new Hash();
		
		
	System.out.println(hs.Input(n,"myPassword"));
}*/
	
	private byte[] result;
	private String result1;
	private String result2;
	public static String salt1;
	public String salt;
	
	public String hashInputPassword(String username, String pw){
		try{
			Random rand = new Random();
			salt = String.valueOf(rand.nextInt(3000));
			salt1 = salt;
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			//String salt = "salt";
			md.update((salt+pw).getBytes());
			result = md.digest();
			
			// digest creation and conversion to hex
			result2 = new BigInteger(1, result).toString(16); 
		}catch(NoSuchAlgorithmException clr){
			clr.printStackTrace();
		}
		return result2;
	}
	
	
	
	public String hashSavedPassword(String username, String pw){
		//an object of type user could be passed instead of strings 
		//class should return boolean?
		//returns hash for testing purposes
		
			try{
				MessageDigest md = MessageDigest.getInstance("SHA-256");
				//String salt = "salt";
				md.update((salt1+pw).getBytes());
				result = md.digest();
				
				result1 = new BigInteger(1, result).toString(16); // digest creation
			}catch(NoSuchAlgorithmException clr){
				clr.printStackTrace();
			}
			return result1;
	}
	
	
	
	

	
}


