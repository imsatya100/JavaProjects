package json.demo;
public class PrimePosition {
	public static boolean isPrime(int num){
		if(num<=1) {
			return false;
		}//if
		boolean prime=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				prime=false;
			}//if
		}//for_loop
		return prime;
	}//isPrime()
	public static String getPrimePosition(String st){
		if(st==null){
			return null;
		}//if
		else{
			String str="";
			for(int i=1;i<=st.length();i++){
				if(isPrime(i)){
					str+=st.charAt(i-1);
				}//if
			}//1st_for_loop
			
			for(int i=1;i<st.length();i++){
				if(!isPrime(i)){
					str+=st.charAt(i-1);
				}
			}//2nd_for_loop
			
			return str;
		}//else
		
	}//getPrimePosition()
	public static void main(String[] args) {
		String st="winfo";
		System.out.println(getPrimePosition(st));
	}//main()
}//Class
