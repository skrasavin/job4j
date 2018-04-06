/**package ru.job4j.chap2;

public class StartUI {

	public static void main(String[] args) {
		Tracker tracker = new Tracker();
        //Item[] collect = new Item[10];
		Item item = new Item("Igor", "Manager", 1220L);
        Item itemEd = new Item("Eduard", "Economist", 1701L);
        Item itemLe = new Item("Leonid", "Static Manager", 5204L);
        Item itemRep = new Item("Ziburg", "Security", 1504L);
		tracker.add(item);
        tracker.add(itemEd);
        tracker.add(itemLe);
        tracker.add(itemRep);

        Item testItem = tracker.findById("Static Manager");

        //tracker.getUnit();


        System.out.println(testItem.getName() + " " + testItem.getDescription() + " " + testItem.getCreate());
    }
}
 */