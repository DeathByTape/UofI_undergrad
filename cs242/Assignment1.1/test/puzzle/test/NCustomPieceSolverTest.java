/**
 * @author Dennis J. McWherter, Jr.
 * @version 1.0
 */
package puzzle.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import puzzle.Board;
import puzzle.NCustomPieceSolver;
import puzzle.Piece;

/**
 * Test class for NCustomPieceSolver
 * 
 * @author Dennis J. McWherter, Jr.
 * @version 1.0
 */
public class NCustomPieceSolverTest {

	/**
	 * Test the solver method
	 */
	@Test
	public void testSolve() {
		Board board = new Board(5);
		NCustomPieceSolver solver = new NCustomPieceSolver(board);
		
		List<Piece> solns = new ArrayList<Piece>();
		
		assertEquals(4, solver.solve(solns));
		solns.clear();
		
		board  = new Board(8);
		solver = new NCustomPieceSolver(board);
		assertEquals(7, solver.solve(solns));
	}

}