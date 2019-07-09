package core;
import static org.junit.Assert.*;
import org.junit.*;

public class TTTT_no_win {

@Before public void before() {
TicTacToe.board[0] = "1";
TicTacToe.board[1] = "2";
TicTacToe.board[2] = "3";
TicTacToe.board[3] = "4";
TicTacToe.board[4] = "5";
TicTacToe.board[5] = "6";
TicTacToe.board[6] = "7";
TicTacToe.board[7] = "8";
TicTacToe.board[8] = "9";
}
@Test public void test_X_turn() {
TicTacToe.turn = "X";
TicTacToe.board[0] = "X";
TicTacToe.board[1] = "O";
assertEquals("Not correct", null, TicTacToe.checkWinner());
 }
@Test public void test_O_turn() {
TicTacToe.turn = "O";
TicTacToe.board[0] = "O";
TicTacToe.board[1] = "X";
assertEquals("Not correct", null, TicTacToe.checkWinner());
 }
 }