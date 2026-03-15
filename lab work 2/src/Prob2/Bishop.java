package Prob2;

public class Bishop extends Piece {
//слон (диагонально)
    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int rowDiff = Math.abs(position.getRow() - b.getRow());
        int colDiff = Math.abs(position.getColumn() - b.getColumn());

        return rowDiff == colDiff;
    }
}
