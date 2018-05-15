package ru.job4j.chap2;

public class StartUI {

	private int[] ranges = new int[] {1, 2, 3, 4, 5, 6, 7};
	private Input input;

	public StartUI(Input input) {
		this.input = input;
	}
	public void init() {
		Tracker tracker = new Tracker();
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillActions();
		do {
			menu.show();
			//int key = Integer.valueOf(input.ask("Select:"));
			//menu.select(key);
			menu.select(input.ask("select", ranges));
		} while (!"y".equals(this.input.ask("Exit?(y):")));
	}
	public static void main(String[] args) {
		Input input = new ValidateInput();
		new StartUI(input).init();
	}




}


















/**	final String ADD = "0";
	final String SHOWITEMS = "1";
	final String EDIT = "2";
	final String DELETE = "3";
	final String FINDID = "4";
	final String FINDNAME = "5";
	final String EXIT = "6";

	private Input input;
	private Tracker tracker;
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}



	public void start() {
		boolean exitProgram = true;
		while (exitProgram) {
			//String num = ci.ask(new StartUI().showActions());
			String num = input.ask(showActions());
			switch (num) {
     			case ADD:
						Item unit = createItems();
						tracker.add(unit);
						break;
				case SHOWITEMS:
						for (int count = 0; count != tracker.position; count++) {
							System.out.println(tracker.items[count].getName() + " "
									  + tracker.items[count].getDescription() + " "
									  + tracker.items[count].getId());
						}
						break;
				case EDIT:
						//System.out.println("Please, enter delete name");
						tracker.replace(input.ask(""), createItems());
						break;
				case DELETE:
						//System.out.println("Please, enter delete name");
						//tracker.delete(ci.ask());
						tracker.delete(input.ask(""));
						break;
				case FINDID:
						System.out.println("Please, enter description");
						Item itTest = tracker.findById(input.ask(""));
						System.out.println(itTest.getName() + " " + itTest.getDescription() + " " + itTest.getId());
						break;
				case FINDNAME:
						System.out.println("Please, enter name");
						Item[] it = tracker.findByName(input.ask(""));
						for (Item item : it) {
							System.out.println(item.getName() + " " + item.getDescription() + " " + item.getId());
						}
						break;
				case EXIT:
						exitProgram = false;
						break;
				default:break;
			}
		}

	}


    private String showActions() {
		String select = "0. Add new Item " + "\n" + "1. Show all items" + "\n" + "2. Edit item"
		+ "\n" + "3. Delete item" + "\n" + "4. Find item by Id" + "\n" + "5. Find items by name" + "\n"
		+ "6. Exit Program" + "\n" + "Select:";
		return select;
	}
	private Item createItems() {
		String name = input.ask("Please, enter name");
		String description = input.ask("Please, enter description");
		return new Item(name, description);
	}
	public static void main(String[] args) {
		new StartUI(new ConsoleInput(), new Tracker()).start();
	}
}
 */