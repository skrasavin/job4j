
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InnerArrayTest {
	@Test
	public  void  seachWordIntoWord() {
		InnerArray ia = new InnerArray();
		boolean expect = ia.startWith("Hello", "ell");
		assertThat(true, is(expect));
	}
	@Test
	public  void  seachWordIntoWords() {
		InnerArray ia = new InnerArray();
		boolean expect = ia.startWith("Hello", "ells");
		assertThat(false, is(expect));
	}
}