package Prob2;

public class Queen extends Piece {
//как ладья + слон
    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int rowDiff = Math.abs(position.getRow() - b.getRow());
        int colDiff = Math.abs(position.getColumn() - b.getColumn());

        if (position.getRow() == b.getRow()) return true;

        if (position.getColumn() == b.getColumn()) return true;

        if (rowDiff == colDiff) return true;

        return false;
    }
}