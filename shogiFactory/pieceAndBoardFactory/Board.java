package pieceAndBoardFactory;

public class Board {
	private Piece[][] board;
	private String topPlayer; 
	private String bottomPlayer; 
	
	public Board() throws Exception {
		this.board = new Piece[][] {
				{ PieceFactory.getLance("down", ""), PieceFactory.getKnight("down", ""),
						PieceFactory.getSilverGeneral("down", ""), PieceFactory.getGoldGeneral("down", ""),
						PieceFactory.getKing("down", ""), PieceFactory.getGoldGeneral("down", ""),
						PieceFactory.getSilverGeneral("down", ""), PieceFactory.getKnight("down", ""),
						PieceFactory.getLance("down", "") },
				{ null, PieceFactory.getBishop("down", ""), null, null, null, null, null,
						PieceFactory.getRook("down", ""), null },
				{ PieceFactory.getPawn("down", ""), PieceFactory.getPawn("down", ""), PieceFactory.getPawn("down", ""),
						PieceFactory.getPawn("down", ""), PieceFactory.getPawn("down", ""),
						PieceFactory.getPawn("down", ""), PieceFactory.getPawn("down", ""),
						PieceFactory.getPawn("down", ""), PieceFactory.getPawn("down", "") },
				{ null, null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null, null },
				{ PieceFactory.getPawn("up", ""), PieceFactory.getPawn("up", ""), PieceFactory.getPawn("up", ""),
						PieceFactory.getPawn("up", ""), PieceFactory.getPawn("up", ""), PieceFactory.getPawn("up", ""),
						PieceFactory.getPawn("up", ""), PieceFactory.getPawn("up", ""),
						PieceFactory.getPawn("up", "") },
				{ null, PieceFactory.getBishop("up", ""), null, null, null, null, null, PieceFactory.getRook("up", ""),
						null },
				{ PieceFactory.getLance("up", ""), PieceFactory.getKnight("up", ""),
						PieceFactory.getSilverGeneral("up", ""), PieceFactory.getGoldGeneral("up", ""),
						PieceFactory.getKing("up", ""), PieceFactory.getGoldGeneral("up", ""),
						PieceFactory.getSilverGeneral("up", ""), PieceFactory.getKnight("up", ""),
						PieceFactory.getLance("up", "") } };
	}

	public void printBoard() {
		for (Piece[] pieces : board) {
			for (Piece piece : pieces) {
				if (piece != null) {
					System.out.print(piece.getId().charAt(0) + " ");
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();
		}
	}

	public void initializeTopPlayer(String topPlayer) {
		this.topPlayer = topPlayer; 
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				if (this.board[i][j] != null) {
					this.board[i][j].setOwner(topPlayer);
				}
			}
		}
	}
	
	public void  initializeBottonPlayer(String bottomPlayer) {
		this.bottomPlayer = bottomPlayer; 
		for(int i = 6; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (this.board[i][j] != null) {
					this.board[i][j].setOwner(bottomPlayer);
				}
			}
		}
	}
	
	public void movePiece(int startY, int startX, int endY, int endX) {
		
	}
	
	public Piece[][] getStaticBoard(){
		Piece[][] copyBoard = new Piece[this.board.length][this.board[0].length]; 
		for(int i = 0; i < this.board.length; i++) {
			copyBoard[i] = this.board[i].clone(); 
		}
		return copyBoard; 
	}
	
	public Piece[][] getBoard() {
		return board;
	}

}
