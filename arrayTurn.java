class arrayTurn{
	public String arrayTurns(String s)
		{
			int length = s.length();
			char intermediate;
			for(int i=0 ; i < length ; i ++){
				int j = length-i-1;
				intermediate=s.charAt(length-i-1);
				s.charAt(j)=s.charAt(i);
				s.charAt(i)=intermediate;
			}
			return s;
		}

	public static void main(String []args){
		String s = "qwertoipasdfadfadsfasdf";
		System.out.println("Original String" + s);
		System.out.println("Current String" + arrayTurns(s));
	}

}
				
