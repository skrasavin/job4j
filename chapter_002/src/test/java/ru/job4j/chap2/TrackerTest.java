package ru.job4j.chap2;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
	@Test
    public void  whenAddItemToItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("Igor", "Manager", 1220L);
        tracker.add(item);
        String name = "Igor";
        assertThat(name, is(tracker.items[0].getName()));
    }
    @Test
    public void  whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Igor", "Manager", 1220L);
        Item itemTest = new Item("Valeriy", "Builder", 1312L);
        tracker.add(item);
        tracker.replace("Igor", itemTest);
        String name = "Valeriy";
        assertThat(name, is(tracker.items[0].getName()));
    }
    @Test
    public void  whenItemDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("Igor", "Manager", 1220L);
        Item itemTest = new Item("Valeriy", "Builder", 1312L);
        tracker.add(item);
        tracker.add(itemTest);
        tracker.delete("Igor");
        String id = tracker.items[0].getId();
        assertThat(id, is(tracker.items[0].getId()));
    }
    @Test
    public void  findAllItems() {
        Tracker tracker = new Tracker();
        Item[] items = new Item[2];
        Item item = new Item("Igor", "Manager", 1220L);
        Item itemTest = new Item("Valeriy", "Builder", 1312L);
        tracker.add(item);
        tracker.add(itemTest);
        items = tracker.findAll();
        String name = "Valeriy";
        assertThat(name, is(items[1].getName()));
    }
    @Test
    public void  findItemByName() {
        Tracker tracker = new Tracker();
        Item[] items = new Item[2];
        Item item = new Item("Igor", "Manager", 1220L);
        Item itemTest = new Item("Valeriy", "Builder", 1312L);
        tracker.add(item);
        tracker.add(itemTest);
        items = tracker.findByName("Valeriy");
        String name = "Valeriy";
        assertThat(name, is(items[0].getName()));
    }
    @Test
    public void  findItemById() {
        Tracker tracker = new Tracker();
        Item[] items = new Item[2];
        Item item = new Item("Igor", "Manager", 1220L);
        Item itemTest = new Item("Valeriy", "Builder", 1312L);
        tracker.add(item);
        tracker.add(itemTest);
        items[0] = tracker.findById(tracker.items[0].getId());
        String id = tracker.items[0].getId();
        assertThat(id, is(items[0].getId()));
    }

}