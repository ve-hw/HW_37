package core;
import static org.junit.Assert.*;
import org.junit.*;

public class TTTT_draws {

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
	@Test public void draw_1() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_2() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_3() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_4() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_5() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_6() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_7() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_8() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_9() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_10() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_11() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_12() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_13() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_14() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_15() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_16() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_17() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_18() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_19() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_20() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_21() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_22() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_23() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_24() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_25() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_26() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_27() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_28() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_29() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_30() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_31() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_32() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_33() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_34() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_35() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_36() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_37() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_38() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_39() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_40() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_41() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_42() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_43() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_44() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_45() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_46() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_47() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_48() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_49() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_50() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_51() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_52() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_53() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_54() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_55() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_56() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_57() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_58() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_59() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_60() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_61() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_62() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_63() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_64() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_65() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_66() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_67() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_68() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_69() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_70() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_71() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_72() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_73() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_74() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_75() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_76() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_77() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_78() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_79() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_80() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_81() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_82() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_83() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_84() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_85() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_86() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_87() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_88() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_89() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_90() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_91() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_92() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_93() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_94() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_95() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_96() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_97() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_98() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_99() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_100() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_101() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_102() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_103() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_104() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_105() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_106() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_107() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_108() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_109() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_110() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_111() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_112() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_113() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_114() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_115() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_116() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_117() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_118() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_119() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_120() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_121() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_122() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_123() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_124() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_125() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_126() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_127() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_128() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_129() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_130() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_131() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_132() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_133() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_134() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_135() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_136() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_137() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_138() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_139() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_140() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_141() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_142() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_143() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_144() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_145() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_146() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_147() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_148() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_149() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_150() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_151() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_152() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_153() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_154() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_155() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_156() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_157() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_158() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_159() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_160() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_161() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_162() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_163() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_164() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_165() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_166() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_167() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_168() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_169() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_170() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_171() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_172() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_173() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_174() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_175() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_176() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_177() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_178() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_179() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_180() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_181() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_182() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_183() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_184() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_185() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_186() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_187() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_188() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_189() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_190() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_191() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_192() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_193() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_194() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_195() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_196() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_197() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_198() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_199() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_200() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_201() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_202() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_203() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_204() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_205() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_206() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_207() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_208() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_209() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_210() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_211() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_212() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_213() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_214() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_215() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_216() {
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_217() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_218() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_219() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_220() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_221() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_222() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_223() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_224() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_225() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_226() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_227() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_228() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_229() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_230() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_231() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_232() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_233() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_234() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_235() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_236() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_237() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_238() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_239() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_240() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_241() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_242() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_243() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_244() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_245() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_246() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_247() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_248() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_249() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_250() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_251() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_252() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_253() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_254() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_255() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_256() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_257() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_258() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_259() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_260() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_261() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_262() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_263() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_264() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_265() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_266() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_267() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_268() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_269() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_270() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_271() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_272() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_273() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_274() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_275() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_276() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_277() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_278() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_279() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_280() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_281() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_282() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_283() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_284() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_285() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_286() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_287() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_288() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_289() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_290() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_291() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_292() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_293() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_294() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_295() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_296() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_297() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_298() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_299() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_300() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_301() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_302() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_303() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_304() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_305() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_306() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_307() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_308() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_309() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_310() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_311() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_312() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_313() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_314() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_315() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_316() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_317() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_318() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_319() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_320() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_321() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_322() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_323() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_324() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_325() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_326() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_327() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_328() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_329() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_330() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_331() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_332() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_333() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_334() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_335() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_336() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_337() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_338() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_339() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_340() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_341() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_342() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_343() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_344() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_345() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_346() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_347() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_348() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_349() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_350() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_351() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_352() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_353() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_354() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_355() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_356() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_357() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_358() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_359() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_360() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_361() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_362() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_363() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_364() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_365() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_366() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_367() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_368() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_369() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_370() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_371() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_372() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_373() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_374() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_375() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_376() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_377() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_378() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_379() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_380() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_381() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_382() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_383() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_384() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_385() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_386() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_387() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_388() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_389() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_390() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_391() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_392() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_393() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_394() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_395() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_396() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_397() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_398() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_399() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_400() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_401() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_402() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_403() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_404() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_405() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_406() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_407() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_408() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_409() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_410() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_411() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_412() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_413() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_414() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_415() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_416() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_417() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_418() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_419() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_420() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_421() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_422() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_423() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_424() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_425() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_426() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_427() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_428() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_429() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_430() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_431() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_432() {
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_433() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_434() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_435() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_436() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_437() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_438() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_439() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_440() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_441() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_442() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_443() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_444() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_445() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_446() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_447() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_448() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_449() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_450() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_451() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_452() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_453() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_454() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_455() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_456() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_457() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_458() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_459() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_460() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_461() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_462() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_463() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_464() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_465() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_466() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_467() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_468() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_469() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_470() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_471() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_472() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_473() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_474() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_475() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_476() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_477() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_478() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_479() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_480() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_481() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_482() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_483() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_484() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_485() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_486() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_487() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_488() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_489() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_490() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_491() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_492() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_493() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_494() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_495() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_496() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_497() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_498() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_499() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_500() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_501() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_502() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_503() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_504() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_505() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_506() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_507() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_508() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_509() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_510() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_511() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_512() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_513() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_514() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_515() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_516() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_517() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_518() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_519() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_520() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_521() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_522() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_523() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_524() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_525() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_526() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_527() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_528() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_529() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_530() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_531() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_532() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_533() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_534() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_535() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_536() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_537() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_538() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_539() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_540() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_541() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_542() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_543() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_544() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_545() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_546() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_547() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_548() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_549() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_550() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_551() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_552() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_553() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_554() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_555() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_556() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_557() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_558() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_559() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_560() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_561() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_562() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_563() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_564() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_565() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_566() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_567() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_568() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_569() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_570() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_571() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_572() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_573() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_574() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_575() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_576() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_577() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_578() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_579() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_580() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_581() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_582() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_583() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_584() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_585() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_586() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_587() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_588() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_589() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_590() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_591() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_592() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_593() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_594() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_595() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_596() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_597() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_598() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_599() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_600() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_601() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_602() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_603() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_604() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_605() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_606() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_607() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_608() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_609() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_610() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_611() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_612() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_613() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_614() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_615() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_616() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_617() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_618() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_619() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_620() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_621() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_622() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_623() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_624() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_625() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_626() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_627() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_628() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_629() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_630() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_631() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_632() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_633() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_634() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_635() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_636() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_637() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_638() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_639() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_640() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_641() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_642() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_643() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_644() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_645() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_646() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_647() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_648() {
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_649() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_650() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_651() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_652() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_653() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_654() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_655() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_656() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_657() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_658() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_659() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_660() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_661() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_662() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_663() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_664() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_665() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_666() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_667() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_668() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_669() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_670() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_671() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_672() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_673() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_674() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_675() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_676() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_677() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_678() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_679() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_680() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_681() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_682() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_683() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_684() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_685() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_686() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_687() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_688() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_689() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_690() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_691() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_692() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_693() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_694() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_695() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_696() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_697() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_698() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_699() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_700() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_701() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_702() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_703() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_704() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_705() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_706() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_707() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_708() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_709() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_710() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_711() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_712() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_713() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_714() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_715() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_716() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_717() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_718() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_719() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_720() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_721() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_722() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_723() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_724() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_725() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_726() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_727() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_728() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_729() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_730() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_731() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_732() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_733() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_734() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_735() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_736() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_737() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_738() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_739() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_740() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_741() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_742() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_743() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_744() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_745() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_746() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_747() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_748() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_749() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_750() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_751() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_752() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_753() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_754() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_755() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_756() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_757() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_758() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_759() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_760() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_761() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_762() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_763() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_764() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_765() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_766() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_767() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_768() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_769() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_770() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_771() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_772() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_773() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_774() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_775() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_776() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_777() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_778() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_779() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_780() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_781() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_782() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_783() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_784() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_785() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_786() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_787() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_788() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_789() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_790() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_791() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_792() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_793() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_794() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_795() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_796() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_797() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_798() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_799() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_800() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_801() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_802() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_803() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_804() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_805() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_806() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_807() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_808() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_809() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_810() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_811() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_812() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_813() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_814() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_815() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_816() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_817() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_818() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_819() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_820() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_821() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_822() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_823() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_824() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_825() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_826() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_827() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_828() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_829() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_830() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_831() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_832() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_833() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_834() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_835() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_836() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_837() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_838() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_839() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_840() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_841() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_842() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_843() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_844() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_845() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_846() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_847() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_848() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_849() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_850() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_851() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_852() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_853() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_854() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_855() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_856() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_857() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_858() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_859() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_860() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_861() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_862() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_863() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_864() {
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_865() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_866() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_867() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_868() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_869() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_870() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_871() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_872() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_873() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_874() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_875() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_876() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_877() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_878() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_879() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_880() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_881() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_882() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_883() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_884() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_885() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_886() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_887() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_888() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_889() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_890() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_891() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_892() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_893() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_894() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_895() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_896() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_897() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_898() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_899() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_900() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_901() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_902() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_903() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_904() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_905() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_906() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_907() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_908() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_909() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_910() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_911() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_912() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_913() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_914() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_915() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_916() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_917() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_918() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_919() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_920() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_921() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_922() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_923() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_924() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_925() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_926() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_927() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_928() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_929() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_930() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_931() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_932() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_933() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_934() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_935() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_936() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_937() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_938() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_939() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_940() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_941() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_942() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_943() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_944() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_945() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_946() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_947() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_948() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_949() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_950() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_951() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_952() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_953() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_954() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_955() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_956() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_957() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_958() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_959() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_960() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_961() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_962() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_963() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_964() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_965() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_966() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_967() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_968() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_969() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_970() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_971() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_972() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_973() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_974() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_975() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_976() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_977() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_978() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_979() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_980() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_981() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_982() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_983() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_984() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_985() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_986() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_987() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_988() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_989() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_990() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_991() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_992() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_993() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_994() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_995() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_996() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_997() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_998() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_999() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1000() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1001() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1002() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1003() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1004() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1005() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1006() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1007() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1008() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1009() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1010() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1011() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1012() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1013() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1014() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1015() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1016() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1017() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1018() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1019() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1020() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1021() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1022() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1023() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1024() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1025() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1026() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1027() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1028() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1029() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1030() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1031() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1032() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1033() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1034() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1035() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1036() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1037() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1038() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1039() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1040() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1041() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1042() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1043() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1044() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1045() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1046() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1047() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1048() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1049() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1050() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1051() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1052() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1053() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1054() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1055() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1056() {
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1057() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1058() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1059() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1060() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1061() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1062() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1063() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1064() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1065() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1066() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1067() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1068() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1069() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1070() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1071() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1072() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1073() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1074() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1075() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1076() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1077() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1078() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1079() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1080() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1081() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1082() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1083() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1084() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1085() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1086() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1087() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1088() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1089() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1090() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1091() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1092() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1093() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1094() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1095() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1096() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1097() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1098() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1099() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1100() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1101() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1102() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1103() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1104() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1105() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1106() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1107() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1108() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1109() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1110() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1111() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1112() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1113() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1114() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1115() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1116() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1117() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1118() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1119() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1120() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1121() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1122() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1123() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1124() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1125() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1126() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1127() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1128() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1129() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1130() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1131() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1132() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1133() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1134() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1135() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1136() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1137() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1138() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1139() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1140() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1141() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1142() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1143() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1144() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1145() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1146() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1147() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1148() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1149() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1150() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1151() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1152() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1153() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1154() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1155() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1156() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1157() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1158() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1159() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1160() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1161() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1162() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1163() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1164() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1165() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1166() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1167() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1168() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1169() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1170() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1171() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1172() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1173() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1174() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1175() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1176() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1177() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1178() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1179() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1180() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1181() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1182() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1183() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1184() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1185() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1186() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1187() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1188() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1189() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1190() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1191() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1192() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1193() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1194() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1195() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1196() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1197() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1198() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1199() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1200() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1201() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1202() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1203() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1204() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1205() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1206() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1207() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1208() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1209() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1210() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1211() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1212() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1213() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1214() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1215() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1216() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1217() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1218() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1219() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1220() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1221() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1222() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1223() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1224() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1225() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1226() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1227() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1228() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1229() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1230() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1231() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1232() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1233() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1234() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1235() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1236() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1237() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1238() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1239() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1240() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1241() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1242() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1243() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1244() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1245() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1246() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1247() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1248() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1249() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1250() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1251() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1252() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1253() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1254() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1255() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1256() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1257() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1258() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1259() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1260() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1261() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1262() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1263() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1264() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1265() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1266() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1267() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1268() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1269() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1270() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1271() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1272() {
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1273() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1274() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1275() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1276() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1277() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1278() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1279() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1280() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1281() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1282() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1283() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1284() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1285() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1286() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1287() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1288() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1289() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1290() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1291() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1292() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1293() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1294() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1295() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1296() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1297() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1298() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1299() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1300() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1301() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1302() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1303() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1304() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1305() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1306() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1307() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1308() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1309() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1310() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1311() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1312() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1313() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1314() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1315() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1316() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1317() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1318() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1319() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1320() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1321() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1322() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1323() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1324() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1325() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1326() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1327() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1328() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1329() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1330() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1331() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1332() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1333() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1334() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1335() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1336() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1337() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1338() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1339() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1340() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1341() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1342() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1343() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1344() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1345() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1346() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1347() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1348() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1349() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1350() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1351() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1352() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1353() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1354() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1355() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1356() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1357() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1358() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1359() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1360() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1361() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1362() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1363() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1364() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1365() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1366() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1367() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1368() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1369() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1370() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1371() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1372() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1373() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1374() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1375() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1376() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1377() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1378() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1379() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1380() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1381() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1382() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1383() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1384() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1385() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1386() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1387() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1388() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1389() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1390() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1391() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1392() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1393() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1394() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1395() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1396() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1397() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1398() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1399() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1400() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1401() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1402() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1403() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1404() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1405() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1406() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1407() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1408() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1409() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1410() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1411() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1412() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1413() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1414() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1415() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1416() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1417() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1418() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1419() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1420() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1421() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1422() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1423() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1424() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1425() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1426() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1427() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1428() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1429() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1430() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1431() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1432() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1433() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1434() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1435() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1436() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1437() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1438() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1439() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1440() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1441() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1442() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1443() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1444() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1445() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1446() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1447() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1448() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1449() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1450() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1451() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1452() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1453() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1454() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1455() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1456() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1457() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1458() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1459() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1460() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1461() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1462() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1463() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1464() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1465() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1466() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1467() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1468() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1469() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1470() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1471() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1472() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1473() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1474() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1475() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1476() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1477() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1478() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1479() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1480() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1481() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1482() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1483() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1484() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1485() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1486() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1487() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1488() {
		TicTacToe.board[6] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1489() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1490() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1491() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1492() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1493() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1494() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1495() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1496() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1497() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1498() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1499() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1500() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1501() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1502() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1503() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1504() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1505() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1506() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1507() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1508() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1509() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1510() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1511() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1512() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1513() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1514() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1515() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1516() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1517() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1518() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1519() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1520() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1521() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1522() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1523() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1524() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1525() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1526() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1527() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1528() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1529() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1530() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1531() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1532() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1533() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1534() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1535() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1536() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1537() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1538() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1539() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1540() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1541() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1542() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1543() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1544() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1545() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1546() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1547() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1548() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1549() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1550() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1551() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1552() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1553() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1554() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1555() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1556() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1557() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1558() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1559() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1560() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1561() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1562() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1563() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1564() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1565() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1566() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1567() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1568() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1569() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1570() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1571() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1572() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1573() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1574() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1575() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1576() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1577() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1578() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1579() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1580() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1581() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1582() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1583() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1584() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1585() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1586() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1587() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1588() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1589() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1590() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1591() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1592() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1593() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1594() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1595() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1596() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1597() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1598() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1599() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1600() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1601() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1602() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1603() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1604() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1605() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1606() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1607() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1608() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1609() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1610() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1611() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1612() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1613() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1614() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1615() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1616() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1617() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1618() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1619() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1620() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1621() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1622() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1623() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1624() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1625() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1626() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1627() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1628() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1629() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1630() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1631() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1632() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1633() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1634() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1635() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1636() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1637() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1638() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1639() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1640() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1641() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1642() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1643() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1644() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1645() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1646() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1647() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1648() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1649() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1650() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1651() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1652() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1653() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1654() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1655() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1656() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1657() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1658() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1659() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1660() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1661() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1662() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1663() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1664() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1665() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1666() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1667() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1668() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1669() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1670() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1671() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1672() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1673() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1674() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1675() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1676() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1677() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1678() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1679() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1680() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1681() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1682() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1683() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1684() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1685() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1686() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[8] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1687() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1688() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1689() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1690() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1691() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1692() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1693() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1694() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1695() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1696() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1697() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1698() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1699() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1700() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1701() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1702() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1703() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1704() {
		TicTacToe.board[7] = "X";
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1705() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1706() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1707() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1708() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1709() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1710() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1711() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1712() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1713() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1714() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1715() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1716() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1717() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1718() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1719() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1720() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1721() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1722() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1723() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1724() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1725() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1726() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1727() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1728() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1729() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1730() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1731() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1732() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1733() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1734() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1735() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1736() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1737() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1738() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1739() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1740() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1741() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1742() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1743() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1744() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1745() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1746() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1747() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1748() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1749() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1750() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1751() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1752() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1753() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1754() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1755() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1756() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1757() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1758() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1759() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1760() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1761() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1762() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1763() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1764() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1765() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1766() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1767() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1768() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1769() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1770() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1771() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1772() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1773() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1774() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1775() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1776() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1777() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1778() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1779() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1780() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1781() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1782() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1783() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1784() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1785() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1786() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1787() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1788() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1789() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1790() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1791() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1792() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1793() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1794() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1795() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1796() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1797() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1798() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1799() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1800() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1801() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1802() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1803() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1804() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1805() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1806() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1807() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1808() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1809() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1810() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1811() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1812() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1813() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1814() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1815() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1816() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1817() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1818() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1819() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1820() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1821() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1822() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1823() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1824() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1825() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1826() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1827() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1828() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1829() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1830() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1831() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1832() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1833() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1834() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1835() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1836() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1837() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1838() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1839() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1840() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1841() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1842() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1843() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1844() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1845() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1846() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1847() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1848() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1849() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1850() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1851() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1852() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1853() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1854() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1855() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1856() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1857() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1858() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1859() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1860() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1861() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1862() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1863() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1864() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1865() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1866() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1867() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1868() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1869() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1870() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1871() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1872() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1873() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1874() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1875() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1876() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1877() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1878() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1879() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1880() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1881() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1882() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1883() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1884() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1885() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1886() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1887() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1888() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1889() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1890() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1891() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1892() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1893() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1894() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1895() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1896() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1897() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1898() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1899() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1900() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1901() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1902() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[6] = "X";
		TicTacToe.board[5] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[2] = "O";
		TicTacToe.board[3] = "O";
		TicTacToe.board[7] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1903() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1904() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1905() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1906() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1907() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1908() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1909() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1910() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1911() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1912() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1913() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1914() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1915() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1916() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[4] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1917() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1918() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1919() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

		@Test public void draw_1920() {
		TicTacToe.board[8] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		assertEquals("Not correct", "draw", TicTacToe.checkWinner());}

}

