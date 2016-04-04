
public class StringSerialize {

	String serialize(String[] a){
		String result = "";
		for (String s: a){
			result = result + s + ":";
		}
		
		return result.substring(0, result.length() - 1);
	}
	String[] deserialize(String a){
		String[] result = a.split(":");
		return result; 
	}

	public static void main(String args[]){
		StringSerialize ss = new StringSerialize();
		String[] arr = {"Anurag","Agrawal", "Google"};
		System.out.println(ss.serialize(arr));
		String[] result = ss.deserialize(ss.serialize(arr));
		for(String in: result){
			System.out.println(in);
		}
	}

}
