class question3{
	public static String stringOperation(String a){
		boolean []judgement = new boolean[1000];
		int length = a.length();
		for (int i=0;i<length;i++){
			int value = (int)a.charAt(i);
			if(judgement[value]){
				a = a.substring(0,i-1) + a.substring(i+1,length-1);
			}
			judgement[value]=true;
		}
		return a;		
	}
	
	public static void main(String []args){
		String a="dafasdfadfadsfasdfasdf";
		System.out.println("newly edited string is" + stringOperation(a));
}
}



				
				
