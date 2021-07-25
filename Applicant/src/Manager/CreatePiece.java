package Manager;

import java.util.ArrayList;

import Objects.At;
import Objects.Fil;
import Objects.I_piece;
import Objects.Kale;
import Objects.BeyazPiyon;
import Objects.Sah;
import Objects.SiyahPiyon;
import Objects.Vezir;

public class CreatePiece {
	
	static ArrayList<I_piece> table = new ArrayList<I_piece>();
	 
	public void creatingPiece(ArrayList<String> pieces) {
		I_piece piece = null ;
		String color;
		// okunan tahtadaki stringlerin ikinci harfine göre color ozelligi değiştirilir ve ilk harfine göre ise oluşturulacak tas değişir.
		for(int i = 0; i<pieces.size(); i++) {
			color = "black";
			// Siyah taşların oluşturulması
			if(pieces.get(i).charAt(1) =='s') {
				// Tas sah ise sah objesi oluşturulacak
				if(pieces.get(i).charAt(0) == 's') {
					piece = new Sah();
				}
				// Tas vezir ise vezir objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'v') {
					piece = new Vezir();
				}
				// Tas kale ise kale objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'k') {
					piece = new Kale();
				}
				// Tas fil ise fil objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'f') {
					piece = new Fil();
				}
				// Tas at ise at objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'a') {
					piece = new At();
				}
				// Tas sah ise sah objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'p') {
					piece = new SiyahPiyon();
				}
			}
			// Beyaz taşların oluşturulması
			else if (pieces.get(i).charAt(1) =='b') {
				color="white";
				// Tas sah ise sah objesi oluşturulacak
				if(pieces.get(i).charAt(0) == 's') {
					piece = new Sah();
				}
				// Tas vezir ise vezir objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'v') {
					piece = new Vezir();
				}
				// Tas kale ise kale objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'k') {
					piece = new Kale();
				}
				// Tas fil ise fil objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'f') {
					piece = new Fil();
				}
				// Tas at ise at objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'a') {
					piece = new At();
				}
				// Tas sah ise sah objesi oluşturulacak
				else if(pieces.get(i).charAt(0) == 'p'){
					piece = new BeyazPiyon();
				}
			}
			if(piece !=null) {
				piece.setColor(color);
			}
			table.add(piece);
			piece = null;
		}
		
	}
	
	public static ArrayList<I_piece> getTable() {
		return table;
	}

	
	
}
