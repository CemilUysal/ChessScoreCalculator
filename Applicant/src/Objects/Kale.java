package Objects;

import java.util.ArrayList;

import Manager.CreatePiece;

public class Kale implements I_piece{
	boolean Inthreat = false;
	float points = 5;
	public String color;
	ArrayList<Integer> list = new ArrayList<>();
	private ArrayList<I_piece> table =  CreatePiece.getTable();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public ArrayList move(int index) {
		// TODO Auto-generated method stub
		int temp = index;
		list.clear();
		int yatay = index / 8;
		// kale yatay olarak butun karelere gidebilir bu sebeple o yatay içinde sag ve sol hareket için iki while dongusu olusturdum.
		while(yatay== temp /8&&index!=63) {
			
			temp+=1;
			if(table.get(temp)!=null) {
				// kale eger aynı renkten bir tasla karsılasırsa dongu durdurulur.
				if(table.get(temp).getColor()==table.get(index).getColor()) {
					break;
				}
				// kale eger farkl renkten bir tasla karsılasırsa sıradakı hamle listeye eklenir ve dongu durdurulur.
				else {
					list.add(temp);
					break;
				}
			}
			// kalenin onu bossa harekete devam eder.
			else {
				list.add(temp);
			}
		}
		temp = index;
		while(yatay== temp-1 /8&&index!=0) {
			temp-=1;
			if(table.get(temp)!=null) {
				if(table.get(temp).getColor()==table.get(index).getColor()) {
					break;
				}
				else {
					list.add(temp);
					break;
				}
			}
			else {
				list.add(temp);
			}
		}
		// kalenin dikey olarak yukarı ve asagı hareketının olusturulması.
		temp = index;
		while(temp<55) {
			temp+=8;
			if(table.get(temp)!=null) {
				if(table.get(temp).getColor()==table.get(index).getColor()) {
					break;
				}
				else {
					list.add(temp);
					break;
				}
			}
			else {
				list.add(temp);
			}
		}
		temp=index;
		while(temp>0) {
			temp-=8;
			if(temp<=0) {
				break;
			}
			if(table.get(temp)!=null) {		
				if(table.get(temp).getColor()==table.get(index).getColor()) {
					break;
				}
				else {
					list.add(temp);
					break;
				}
			}
			else {
				list.add(temp);
			}
			
		}
		return list;
	}
	public boolean isInthreat() {
		return Inthreat;
	}
	public void setInthreat(boolean inthreat) {
		Inthreat = inthreat;
	}
	public float getPoints() {
		return points;
	}
	public void setPoints(float points) {
		if(isInthreat()) {
			this.points = points/2;
		}
		else {
			this.points = points;
		}
	}
}
