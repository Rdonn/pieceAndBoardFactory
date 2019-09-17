package pieceAndBoardFactory;

public class PieceFactoryTester {

	public PieceFactory pieceFactory; 
	public Piece myPiece; 
	public PieceFactoryTester() {
		// TODO Auto-generated constructor stub
		try {
			this.myPiece = PieceFactory.getGoldGeneral("down", "me");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.myPiece.printMoveset();
		System.out.println(this.myPiece);
	}
	public static void main(String[] args) {
		new PieceFactoryTester(); 
		
	}
}
