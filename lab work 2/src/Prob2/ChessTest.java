package Prob2;

public class ChessTest {

    public static void main(String[] args) {

        Position start = new Position(1,1);

        Piece rook = new Rook(start);
        Piece bishop = new Bishop(start);
        Piece knight = new Knight(start);

        Position move1 = new Position(1,5);
        Position move2 = new Position(4,4);
        Position move3 = new Position(3,7);

        System.out.println("Rook move: " + rook.isLegalMove(move1));
        System.out.println("Bishop move: " + bishop.isLegalMove(move2));
        System.out.println("Knight move: " + knight.isLegalMove(move3));

    }
}
