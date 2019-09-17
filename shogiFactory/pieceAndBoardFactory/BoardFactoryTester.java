package pieceAndBoardFactory;

public class BoardFactoryTester {

	public BoardFactoryTester() {
		// TODO Auto-generated constructor stub
		try {
			BoardFactory.getBoard().printBoard();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new BoardFactoryTester(); 
	}
}
