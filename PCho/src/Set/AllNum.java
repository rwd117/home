package Set;

import java.util.ArrayList;
import java.util.Arrays;

import Db.CardDb;
import Db.PCSeatDb;

public class AllNum {

	public static ArrayList<String> CardNum(ArrayList<String> cardNum) {
		String card[]={ "ī�� ��ȣ�� ����ּ���", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20" };
		
		ArrayList<String> Card= new ArrayList<String>(Arrays.asList(card)); 
		
		//�� �迭�� �����ͺ��̽����� �޾Ƽ� �ϳ��ϳ� üũ�ؼ� ��� ���ΰ��� �迭���� ���ܽ��Ѽ� �迭�� ��迭
		System.out.println("card��"+Card);
		
		ArrayList<String> noCard= CardDb.CardNumDb(card);
		
		
		System.out.println("nocard��"+noCard);

		
		for(int i=0;i<Card.size();i++) {
			for(int j=0;j<noCard.size();j++) {
				if(Card.get(i).equals(noCard.get(j))) {
					Card.remove(i);
				}
			}
		}
		
		
		return Card ;
	}
	
	public static ArrayList<String> PCNum(ArrayList<String> a) {
		String pc[]= {"�¼��� ����ּ���","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48"};
		
		ArrayList<String> PC= new ArrayList<String>(Arrays.asList(pc)); 
		System.out.println("pc��"+PC);
		
		ArrayList<String> noPC=PCSeatDb.PCNum(pc);
		System.out.println("nopc��"+noPC);
		
		for(int i=0;i<PC.size();i++) {
			for(int j=0;j<noPC.size();j++) {
				if(PC.get(i).equals(noPC.get(j))) {
					PC.remove(i);
				}
			}
		}
		
		return PC;
	}
	
	
	
	
}
