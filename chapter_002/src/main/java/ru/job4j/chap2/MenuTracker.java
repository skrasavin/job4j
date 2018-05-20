package ru.job4j.chap2;


class EditItem implements UserAction {
	public int key() {
		return 3;
	}
	public void execute(Input input, Tracker tracker) {
		String id = input.ask("Please, enter the task's id");
		String name = input.ask("Please, enter the task's name: ");
		String desc = input.ask("Please, enter the task's desc: ");
		Item task = new Item(name, desc);
		task.setId(id);
		tracker.replace(id, task);

	}
	public String info() {
		return String.format("%s. %s.", this.key(), "Edit the new Item");
	}
}
class DeleteItem implements UserAction {
	public int key() {
		return 4;
	}
	public void execute(Input input, Tracker tracker) {
		String name = input.ask("Please, enter the task's name: ");
		tracker.delete(name);

	}
	public String info() {
		return String.format("%s. %s.", this.key(), "Delete Item");
	}
}

public class MenuTracker {
	
	private Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[10];
	
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	public void fillActions(StartUI ui) {
		 this.actions[1] = this.new AddItem();
		 this.actions[2] = new MenuTracker.ShowItems();
		 this.actions[3] = new EditItem();
		 this.actions[4] = new DeleteItem();
		 this.actions[5] = this.new FindItemById();
		 this.actions[6] = this.new FindItemByName();
		 this.actions[7] = new MenuTracker.ExitProgram(ui);
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
	private class AddItem implements UserAction {
		public int key() {
			return 1;
		}
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please, enter the task' s name");
			String desc = input.ask("Please, enter the task' s desc");
			tracker.add(new Item(name, desc));
			
		}
		public String info() {
			return String.format("%s. %s.", this.key(), "Add new Item");
		}
	}
	private class FindItemById implements UserAction {
		public int key() {
			return 5;
		}
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Please, enter the task's id");
			Item item = tracker.findById(id);
			System.out.println(item.getId() + " " + item.getName() + " " + item.getDescription());
		}
		public String info() {
			return String.format("%s. %s.", this.key(), "Find item by Id");
		}
	}
	private class FindItemByName implements UserAction {
		public int key() {
			return 6;
		}
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please, enter the task's name");
			Item[] item = tracker.findByName(name);
			System.out.println(item[0].getId() + " " + item[0].getName() + " " + item[0].getDescription());
		}
		public String info() {
			return String.format("%s. %s.", this.key(), "Find item by Name");
		}
	}
	private static class ShowItems implements UserAction {
		public int key() {
			return 2;
		}
		public void execute(Input input, Tracker tracker) {
			for (Item item : tracker.findAll()) {
				System.out.println(String.format("%s. %s.", item.getId(), item.getName()));
			}
		}
		public String info() {
			return String.format("%s. %s.", this.key(), "Show all items");
		}
	}
	private static class ExitProgram implements UserAction {

		public final StartUI ui;

		ExitProgram(StartUI ui) {
			this.ui = ui;
		}
		public int key() {
			return 7;
		}
		public void execute(Input input, Tracker tracker) {
			this.ui.stop();
		}
		public String info() {
			return String.format("%s. %s.", this.key(), "Exit Program");
		}
	}
}