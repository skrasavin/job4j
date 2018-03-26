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
public class PaintTestOne {
	
	@Test
	public void buildPiramidFourOne() {
		PaintOne paint = new PaintOne();
		String rst = paint.pyramid(4);
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
	public void buildPiramidFiveOne() {
		PaintOne paint = new PaintOne();
		String rst = paint.pyramid(5);
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