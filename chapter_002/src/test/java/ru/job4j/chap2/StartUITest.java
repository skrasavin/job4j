package ru.job4j.chap2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
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
}