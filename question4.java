//Write a programm to replace all the spaces in a string with '%20'

class question4{
	public static String  stringReplace(String a){
		int lenght = a.length();
		String j = "";
		for(int i = 0; i < lenght ; i++){
			char x = a.charAt(i);
			String y = String.valueOf(x);
			System.out.println(y);
			if( y == " " ){
				a  = a.substring(0,i) + "%20" + a.substring(i+1);			}
		}
		System.out.println(j);
		return j;
	}
	
	public static void main(String []args){
		String a = "a s dfas dfa ds fad sf";
		stringReplace(a);
	}
}


		
