import java.util.ArrayList;
import java.util.Scanner;


public class Ans {
	public Ans(){
		
	}
	
	//�Ĥ@�D
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
	
	//�ĤG�D
	public int questionTwo(int num){
		int sum = 0;
		for(int i=1; i<= num; i++){
			if(i%5 != 0 || i%3 != 0 || i%15 == 0){
				sum = sum + 1;
			}
		}
		return sum;
	}
	
	
	//�ĤT�D

	/* ��ܼХܲV�X���U�l�A�]���Хܳ��O�����A�ҥH�V�X���U�l�@�w�O�˹]���έ�l��(2�إi��)�C
	 * �p�G���Ѯ��X�Ӫ��O�]���A�N��t�~��ӳU�l�˪��O��l����V�X�A�B�]���ХܬҬ����A�ҥH�Хܭ�l���U�l
	 * ���̭��˪��@�w���O��l���ӬO�V�X�C�T�U���O���V�X�U(�˹]��)�B��l���U(�˲V�X)�B�]���U(�˭�l��)
	 * �Ϥ��A�p�G���Ѯ��X�Ӫ��O��l���A�N��t�~��ӳU�l�˪��O�]����V�X�A�B�]���ХܬҬ����A�ҥH�Хܹ]���U�l
	 * ���̭��˪��@�w���O�]���ӬO�V�X�C�T�U���O���V�X�U(�˭�l��)�B��l���U(�˹]��)�B�]���U(�˲V�X)�C
	 */
	
	//�ĥ|�D
	/* 750 + 150 = 750 + (90+60) = 900 = 270*3 + 30*3
	 * ���D���p���޿観���~�A�]���A�ȥͮ�����$60���ӴN�����ӥ[�b�T�ӤH�I�������W�C
	 * �p���`�B$900���ɭԤ����� �H300-30�A�����ӱN��[�^�C
	 */

}
