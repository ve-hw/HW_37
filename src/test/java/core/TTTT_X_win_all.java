package core;
import static org.junit.Assert.*; 
import org.junit.*;

public class TTTT_X_win_all {

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
		@Test public void test_win_X_1() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		assertEquals("Not correct", "X", TicTacToe.checkWinner());}

		@Test public void test_win_X_2() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		assertEquals("Not correct", "X", TicTacToe.checkWinner());}

		@Test public void test_win_X_3() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		assertEquals("Not correct", "X", TicTacToe.checkWinner());}

		@Test public void test_win_X_4() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		assertEquals("Not correct", "X", TicTacToe.checkWinner());}

		@Test public void test_win_X_5() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		assertEquals("Not correct", "X", TicTacToe.checkWinner());}

		@Test public void test_win_X_6() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		assertEquals("Not correct", "X", TicTacToe.checkWinner());}

		@Test public void test_win_X_7() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		assertEquals("Not correct", "X", TicTacToe.checkWinner());}

		@Test public void test_win_X_8() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		assertEquals("Not correct", "X", TicTacToe.checkWinner());}
}
