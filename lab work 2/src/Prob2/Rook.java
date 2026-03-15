package Prob2;

public class Rook extends Piece {
//ладья(вертикально горизонтально)
    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {

        if (position.getRow() == b.getRow()) return true;

        if (position.getColumn() == b.getColumn()) return true;

        return false;
    }
}