package Objects;

import java.util.ArrayList;

import Manager.CreatePiece;

public class Vezir implements I_piece{
	boolean Inthreat = false;
	float points = 9;
	public String color;
	ArrayList<Integer> list = new ArrayList<>();
	private ArrayList<I_piece> table =  CreatePiece.getTable();
	@Override
	public ArrayList move(int index) {
		// TODO Auto-generated method stub
		int temp = index;
		list.clear();
		// vezir yatay olarak butun karelere gidebilir bu sebeple o yatay içinde sag ve sol hareket için iki while dongusu olusturdum.
		
		int yatay = index / 8;
		while(yatay== temp /8&&index!=63) {
			
			temp+=1;
			if(table.get(temp)!=null) {
				// vezir eger aynı renkten bir tasla karsılasırsa dongu durdurulur.
				if(table.get(temp).getColor()==table.get(index).getColor()) {
					break;
				}
				// vezir eger farkl renkten bir tasla karsılasırsa sıradakı hamle listeye eklenir ve dongu durdurulur.
				else {
					
					list.add(temp);
					break;
				}
			}
			// vezirin onu bossa harekete devam eder.
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
		// vezir dikey olarak butun karelere gidebilir bu sebeple o dikey içinde yukarı ve asagı hareket için iki while dongusu olusturdum.
		temp = index;
		while(temp<63) {
			temp+=8;
			if(temp>63) {
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
		temp=index;
		while(temp>0) {
			temp-=8;
			if(temp<0) {
				break;
			}
			if(table.get(temp)!=null) {		
				if(table.get(temp).getColor()==table.get(index).getColor()) {
					break;
				}
				else {
					list.add(temp);
				}
			}
			else {
				list.add(temp);
				break;
			}
			
		}
		//vezir capraz olarak butun karelere gidebilir bu sebeple o capraz içinde solasagı ve solyukarı hareket için iki while dongusu olusturdum.
		temp = index;
		while(temp<63) {
			temp+=9;
			if(temp>63||temp%8==0) {
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
		temp=index;
		while(temp>0) {
			temp-=9;
			if(temp<0||temp%8==0) {
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
		//vezir capraz olarak butun karelere gidebilir bu sebeple o capraz içinde sagasagı ve sagyukarı hareket için iki while dongusu olusturdum.
		
		temp=index;
		while(temp>0) {
			temp-=7;
			if(temp<0||temp%8==0) {
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
		temp=index;
		while(temp<63) {
			temp+=7;
			if(temp>63||temp%8==0) {
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
