import java.util.ArrayList;
import java.util.Scanner;


public class Ans {
	public Ans(){
		
	}
	
	//第一題
	public String questionOne(String words){
		String opposite = new StringBuffer(words).reverse().toString();
		return opposite;
	}
	
	public String questionOne2(String words){
		String concat = "";
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String word = in.next();
			concat = concat + questionOne(word);
			
		}
		
		return concat;
		
		
	}
	
	//第二題
	public int questionTwo(int num){
		int sum = 0;
		for(int i=1; i<= num; i++){
			if(i%5 != 0 || i%3 != 0 || i%15 == 0){
				sum = sum + 1;
			}
		}
		return sum;
	}
	
	
	//第三題

	/* 選擇標示混合的袋子，因為標示都是錯的，所以混合的袋子一定是裝鉛筆或原子筆(2種可能)。
	 * 如果今天拿出來的是鉛筆，代表另外兩個袋子裝的是原子筆跟混合，且因為標示皆為錯，所以標示原子筆袋子
	 * 的裡面裝的一定不是原子筆而是混合。三袋分別為混合袋(裝鉛筆)、原子筆袋(裝混合)、鉛筆袋(裝原子筆)
	 * 反之，如果今天拿出來的是原子筆，代表另外兩個袋子裝的是鉛筆跟混合，且因為標示皆為錯，所以標示鉛筆袋子
	 * 的裡面裝的一定不是鉛筆而是混合。三袋分別為混合袋(裝原子筆)、原子筆袋(裝鉛筆)、鉛筆袋(裝混合)。
	 */
	
	//第四題
	/* 750 + 150 = 750 + (90+60) = 900 = 270*3 + 30*3
	 * 問題的計算邏輯有錯誤，因為服務生拿走的$60本來就不應該加在三個人付的錢之上。
	 * 計算總額$900的時候不應該 以300-30，而應該將其加回。
	 */

}
