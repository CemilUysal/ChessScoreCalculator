package Objects;

import java.util.ArrayList;

public class At implements I_piece{
	boolean Inthreat = false;
	float points = 3;
	public String color;
	ArrayList<Integer> list = new ArrayList<>();
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public ArrayList<Integer> move(int index) {
		// TODO Auto-generated method stub
		list.clear();
		// tahtada bulunan atın konumuna göre yapışabilicek hamlelerin sayısı değişir ve bu hamlelerin özelliği değişir bu
		// sebeple tek tek bu hamleleri elle girdim.
		if(index == 0) {
			list.add(index+10);
			list.add(index+17);
		}
		
		else if(index ==7) {
			list.add(index+6);
			list.add(index+15);
		}
		
		else if(index==56) {
			list.add(index-6);
			list.add(index-15);
		}
		else if(index == 63) {
			list.add(index-10);
			list.add(index-17);
		}
		else if(index == 1 ) {
			list.add(index+11);
			list.add(index+15);
			list.add(index+17);
		}
		else if(index == 6 ) {
			list.add(index+6);
			list.add(index+15);
			list.add(index+17);
		}
		else if(index ==8) {
			list.add(index-6);
			list.add(index+10);
			list.add(index+17);
		}
		else if(index ==15) {
			list.add(index+6);
			list.add(index-10);
			list.add(index+15);
		}
		else if(index ==48) {
			list.add(index-6);
			list.add(index+10);
			list.add(index-15);
		}
		else if(index ==55) {
			list.add(index+6);
			list.add(index-10);
			list.add(index-17);
		}
		else if(index ==57) {
			list.add(index-6);
			list.add(index-15);
			list.add(index-17);
		}
		else if(index ==62) {
			list.add(index-10);
			list.add(index-15);
			list.add(index-17);
		}
		else {
			list.add(index-6);
			list.add(index-10);
			list.add(index-15);
			list.add(index-17);
			list.add(index+6);
			list.add(index+10);
			list.add(index+15);
			list.add(index+17);
		}
		
		return list;
	}
	@Override
	public boolean isInthreat() {
		return Inthreat;
	}
	@Override
	public void setInthreat(boolean inthreat) {
		Inthreat = inthreat;
	}
	@Override
	public float getPoints() {
		return points;
	}
	@Override
	public void setPoints(float points) {
		if(isInthreat()) {
			this.points = points/2;
		}
		else {
			this.points = points;
		}
	}
}
