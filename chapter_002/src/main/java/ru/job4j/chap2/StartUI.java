package ru.job4j.chap2;

public class StartUI {

	public void start() {
		Tracker tracker = new Tracker();
		ConsoleInput ci = new ConsoleInput();
		boolean exit = true;
		while (exit) {
			String num = ci.ask(new StartUI().showActions());
			switch (num) {
     			case "0":
						tracker.add(new Item());
						break;
				case "1":
						for (int count = 0; count != tracker.position; count++) {
							System.out.println(tracker.items[count].getName() + " "
									  + tracker.items[count].getDescription() + " "
									  + tracker.items[count].getId());
						}
						break;
				case "2":
						System.out.println("Please, enter delete name");
						tracker.replace(ci.ask(), tracker.createItem(new Item()));
						break;
				case "3":
						System.out.println("Please, enter delete name");
						tracker.delete(ci.ask());
						break;
				case "4":
						System.out.println("Please, enter description");
						Item itTest = tracker.findById(ci.ask());
						System.out.println(itTest.getName() + " " + itTest.getDescription() + " " + itTest.getId());
						break;
				case "5":
						System.out.println("Please, enter name");
						Item[] it = tracker.findByName(ci.ask());
						for (Item item : it) {
							System.out.println(item.getName() + " " + item.getDescription() + " " + item.getId());
						}
						break;
				case "6":
						exit = false;
						break;
				default:break;
			}
		}

	}

	public static void main(String[] args) {
		new StartUI().start();
    }
    public String showActions() {
		String select = "0. Add new Item " + "\n" + "1. Show all items" + "\n" + "2. Edit item"
		+ "\n" + "3. Delete item" + "\n" + "4. Find item by Id" + "\n" + "5. Find items by name" + "\n"
		+ "6. Exit Program" + "\n" + "Select:";
		return select;
	}
}