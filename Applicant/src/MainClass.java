import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Manager.CreatePiece;
import Objects.I_piece;

import java.util.ArrayList;

public class MainClass {
	static float blackPoints = 0;
	static float whitePoints = 0;
	static ArrayList<String> pieces = new ArrayList<String>();
	static CreatePiece createPiece = new CreatePiece();
	static ArrayList<I_piece> table =  createPiece.getTable();
	public static void main(String[] args) throws FileNotFoundException {
		// Dosya okuma
		File file = new File("src/applicant/board3.txt");
		Scanner sc = new Scanner(file);
						
		while(sc.hasNextLine()) {
			String data = sc.next();
			pieces.add(data);
		}
		sc.close();
		
		// Tahta üzerindeki tasların oluşturulması
		createPiece.creatingPiece(pieces);
		// bir tasın tehdit altında olup olmadıgının kontrolu
		threatControl("black","white");
		threatControl("white","black");
		// puan hesaplama
		calculatePoints();
		
	}
	public static void threatControl(String hamleColor, String tehditColor) {
		for(int i = 0; i<table.size();i++ ) {
			if(table.get(i) != null) {
				ArrayList<Integer> hamle = table.get(i).move(i);
				if(hamle != null) {
					// hamleColor: Hamle yapacak olan tasın rengi
					// tehditColor: Tehdit edilen tasın rengi
					if(table.get(i).getColor()==hamleColor) {
						// hamle yapan tas move metodu ile olası hareketlerinin listesini alır ve bu hareketlerin olduğu indexte diğe
						// renge ait bir tas varsa bu tasın inthreat degeri doğru olur ve puanı yarıya indirilir.
						// eger bir tasın inthreat değeri true ise yarıya indirme işlemi gercekleştirilmez.
						for(int j = 0; j<hamle.size();j++) {
							if(table.get(hamle.get(j))!=null) {
								if(table.get(hamle.get(j)).getColor()==tehditColor && !table.get(hamle.get(j)).isInthreat()) {
									table.get(hamle.get(j)).setInthreat(true);
									table.get(hamle.get(j)).setPoints(table.get(hamle.get(j)).getPoints());
									System.out.println(table.get(i)+" "+table.get(i).getColor()+" "+table.get(hamle.get(j)).getPoints());
								}
							}
						}
					}
				}
			}
		}
	}
	// puanlar tek tek renge göre toplanır.
	public static void calculatePoints() {
		for(int i = 0; i<table.size();i++) {
			if(table.get(i) != null) {
				if(table.get(i).getColor()=="black") {
					blackPoints += table.get(i).getPoints();
				}
				else if(table.get(i).getColor()=="white") {
					whitePoints += table.get(i).getPoints();
				}
			}
		}
		System.out.println("Siyah Puan: "+blackPoints+"\nBeyaz Puan: "+whitePoints);
		
	}

}
