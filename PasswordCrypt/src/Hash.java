//import java.security.DigestException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;




public class Hash {
	
	/**
	 * @return a random salt
	 */
	public static String createSalt(){
		Random rand = new Random();
		return String.valueOf(rand.nextInt(3000));
	}
	
	/**
	 * @param word
	 * @return the hash of word
	 */
	public static String hash(String word){
		byte[] hash;
		String result;
		
		try{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(word.getBytes());
			hash = md.digest();
			// digest creation and conversion to hex
			result = new BigInteger(1, hash).toString(16); 
		}catch(NoSuchAlgorithmException clr){
			clr.printStackTrace();
			result = "NoSuchAlgorithmException";
		}
		return result;
	}
	
	/**
	 * @param word
	 * @param salt
	 * @return the hash salted of word
	 */
	public static String hashSalted(String word, String salt){
		return hash(word+salt);
	}
	
	
}


