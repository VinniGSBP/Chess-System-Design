package chess;

import boardGame.BoardException;

public class ChessExecption extends BoardException{

	private static final long serialVersionUID = 1L;

	
	public ChessExecption(String msg) {
		super(msg);
	}
}
