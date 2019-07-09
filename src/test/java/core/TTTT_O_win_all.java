package core;
import static org.junit.Assert.*; 
import org.junit.*;

public class TTTT_O_win_all {

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
	    @Test public void test_win_O_1() {
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		assertEquals("Not correct", "O", TicTacToe.checkWinner());}

		@Test public void test_win_O_2() {
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		assertEquals("Not correct", "O", TicTacToe.checkWinner());}

		@Test public void test_win_O_3() {
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "O", TicTacToe.checkWinner());}

		@Test public void test_win_O_4() {
		TicTacToe.board[0] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "O", TicTacToe.checkWinner());}

		@Test public void test_win_O_5() {
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "O", TicTacToe.checkWinner());}

		@Test public void test_win_O_6() {
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "O", TicTacToe.checkWinner());}

		@Test public void test_win_O_7() {
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "O", TicTacToe.checkWinner());}

		@Test public void test_win_O_8() {
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "O", TicTacToe.checkWinner());}
}
