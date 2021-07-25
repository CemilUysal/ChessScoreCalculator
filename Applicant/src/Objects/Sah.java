package Objects;

import java.util.ArrayList;

public class Sah implements I_piece {
	boolean Inthreat = false;
	float points = 100;
	public String color;
	ArrayList<Integer> list = new ArrayList<>();
	@Override
	public ArrayList move(int index) {
		// TODO Auto-generated method stub
		list.clear();
		// sah tahtanin sol tarafında ise sola dogru hiç bir hareket gercekleştiremez bu sebeple saga dogru olası olan hamleler listeye eklenir.
		if(index%8==0) {
			list.add(index-7);
			list.add(index-8);
			list.add(index+1);
			list.add(index+8);
			list.add(index+9);
		}
		// sah tahtanin sag tarafında ise saga dogru hiç bir hareket gercekleştiremez bu sebeple sola dogru olası olan hamleler listeye eklenir.
		else if(index%8==7) {
			list.add(index-9);
			list.add(index-8);
			list.add(index-1);
			list.add(index+7);
			list.add(index+8);
		}
		// sah ortada ise olası hamleler eklenir.
		else if(index-9>0 && index+9<63){
			list.add(index-9);
			list.add(index-8);
			list.add(index-7);
			list.add(index-1);
			list.add(index+1);
			list.add(index+7);
			list.add(index+8);
			list.add(index+9);
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
