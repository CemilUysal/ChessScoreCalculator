package Objects;

import java.util.ArrayList;

import Manager.CreatePiece;

public class Fil implements I_piece{
	boolean Inthreat = false;
	float points = 3;
	ArrayList<Integer> list = new ArrayList<>();
	public String color;
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
}
