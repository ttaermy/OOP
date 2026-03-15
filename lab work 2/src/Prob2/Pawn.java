package Prob2;

public class Pawn extends Piece {
//пешка
    public Pawn(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        return b.getColumn() == position.getColumn()
                && b.getRow() == position.getRow() + 1;
    }
}
