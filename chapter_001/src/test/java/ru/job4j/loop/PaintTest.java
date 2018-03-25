package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author skrasavin.
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
	
	@Test
	public void buildPiramidFour() {
		Paint paint = new Paint();
		String rst = paint.piramid(4);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
								.add("   ^   ")
								.add("  ^^^  ")
								.add(" ^^^^^ ")
								.add("^^^^^^^")
								.toString()
				)
		);
	}
	@Test
	public void buildPiramidFive() {
		Paint paint = new Paint();
		String rst = paint.piramid(5);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
								.add("    ^    ")
								.add("   ^^^   ")
								.add("  ^^^^^  ")
								.add(" ^^^^^^^ ")
							    .add("^^^^^^^^^")
								.toString()
				)
		);
	}
}