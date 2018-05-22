package ru.job4j.chap2;



public class MenuTracker {
	
	private Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[10];
	
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	public void fillActions(StartUI ui) {
		 this.actions[1] = new AddItem(1, "Add new Item");
		 this.actions[2] = new ShowItems(2, "Show all items");
		 this.actions[3] = new EditItem(3, "Edit the new Item");
		 this.actions[4] = new DeleteItem(4, "Delete Item");
		 this.actions[5] = new FindItemById(5, "Find item by Id");
		 this.actions[6] = new FindItemByName(6, "Find item by Name");
		 this.actions[7] = new ExitProgram(ui, 7, "Exit Program");
	}
	public void select(int key) {
		this.actions[key].execute(this.input, this.tracker);
	}
	public void show() {
		for (UserAction action : this.actions) {
			if (action != null) {
				System.out.println(action.info());
			}
		}
	}
	private class AddItem extends BaseAction {

		public AddItem(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Enter name:");
			String desc = input.ask("Enter description:");
			tracker.add(new Item(name, desc));
		}
	}
	private class ShowItems extends BaseAction {

		public ShowItems(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			for (Item item : tracker.findAll()) {
				System.out.println(String.format("%s %s", item.getId(), item.getName()));
			}
		}
	}
	private class EditItem extends BaseAction {

		public EditItem(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Please, enter the task's id");
			String name = input.ask("Please, enter the task's name: ");
			String desc = input.ask("Please, enter the task's desc: ");
			Item task = new Item(name, desc);
			task.setId(id);
			tracker.replace(id, task);

		}
	}
	private class DeleteItem extends BaseAction {

		public DeleteItem(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please, enter the task's name: ");
			tracker.delete(name);

		}
	}
	private class FindItemById extends BaseAction {

		public FindItemById(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Please, enter the task's id");
			Item item = tracker.findById(id);
			System.out.println(item.getId() + " " + item.getName() + " " + item.getDescription());
		}
	}
	private class FindItemByName extends BaseAction {

		public FindItemByName(int key, String name) {
			super(key, name);
		}

		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please, enter the task's name");
			Item[] item = tracker.findByName(name);
			System.out.println(item[0].getId() + " " + item[0].getName() + " " + item[0].getDescription());
		}
	}
	private class ExitProgram extends BaseAction {

		public final StartUI ui;

		ExitProgram(StartUI ui, int key, String name) {
			super(key, name);
			this.ui = ui;
		}
		@Override
		public void execute(Input input, Tracker tracker) {
			this.ui.stop();
		}
	}
}