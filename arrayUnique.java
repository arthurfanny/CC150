public class arrayUnique{
	
	public static boolean isUnique(String array){
		boolean []uniqueQueue = new boolean[1000];
		int length = array.length();
		for(int i=0;i<length;i++){
			int v = (int)array.charAt(i);
			if(uniqueQueue[v]){return false;};
			uniqueQueue[v]=true;
			}
		return true;
	}

	public static void main(String args[]){
		String a = "abcdefg";
		boolean result = isUnique(a);
		System.out.println(result);
	}
}


