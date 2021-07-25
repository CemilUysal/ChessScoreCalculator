package Objects;

import java.util.ArrayList;

public interface I_piece {
	
	ArrayList<Integer>  move(int index);
	float getPoints();
	boolean isInthreat();
	void setInthreat(boolean inthreat);
	void setPoints(float points);
	String getColor();
	void setColor(String color);
	
}
