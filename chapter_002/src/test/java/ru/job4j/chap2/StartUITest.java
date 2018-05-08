/**

package ru.job4j.chap2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).start();
        assertThat(tracker.items[0].getName(), is("test name"));
    }
    @Test
    public void whenRemoveFirstItemAfterAddNewItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "2", "test name", "test2", "desc", "6"});
        new StartUI(input, tracker).start();
        assertThat(tracker.items[0].getName(), is("test2"));
    }
    @Test
    public void whenDeleteItemIntoArrayItems() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "0", "test name 2", "desc", "3", "test name", "6" });
        new StartUI(input, tracker).start();
        assertThat(tracker.items[0].getName(), is("test name 2"));
    }
    @Test
    public void whenUserSetFirstItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "1", "6"});
        new StartUI(input, tracker).start();
        assertThat(new String(this.out.toByteArray()), is("test name desc " + tracker.items[0].getId() + "\r\n"));
    }
    @Test
    public void whenUserSetSecondItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "0", "test2", "desc", "1", "6"});
        new StartUI(input, tracker).start();
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("test name desc " + tracker.items[0].getId() + "\r\n")
                                .append("test2 desc " + tracker.items[1].getId())
                                .append(System.lineSeparator())
                                .toString()
                )
        );
    }
    @Test
    public void whenUserReplaceFirstItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "2", "test name", "test2", "desc", "1", "6"});
        new StartUI(input, tracker).start();
        assertThat(new String(this.out.toByteArray()), is("test2 desc " + tracker.items[0].getId() + "\r\n"));
    }
}
 */