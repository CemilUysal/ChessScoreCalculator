package Objects;

import java.util.ArrayList;

public class BeyazPiyon implements I_piece{
	boolean Inthreat = false;
	float points = 1;
	public String color="white";
	ArrayList<Integer> list = new ArrayList<>();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public ArrayList<Integer> move(int index) {
		// TODO Auto-generated method stu
		list.clear();
		// eğer tahtanın en solunda ise bir piyon sadece sağına bir tehdit oluşturabilir.
		if(index%8==0) {
			list.add(index-7);
		}
		// eğer tahtanın en sağında ise bir piyon sadece soluna bir tehdit oluşturabilir.
		else if(index%8==7) {
			list.add(index-9);
		}
		// sag ve sol capraz kontrol edilir.
		else {
			list.add(index-9);
			list.add(index-7);
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
