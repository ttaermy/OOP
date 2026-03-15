package Prob2;

public class Knight extends Piece {
//kon'
    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int rowDiff = Math.abs(position.getRow() - b.getRow());
        int colDiff = Math.abs(position.getColumn() - b.getColumn());

        return (rowDiff == 2 && colDiff == 1) ||
                (rowDiff == 1 && colDiff == 2);
    }
}