package ru.job4j.chap2;
/**
 * класс для создания заявки.
 * @author  - skrasavin.
 * @since - 6.05.2018.
 */
public class Item {
	/**
	 * поля класса характеризиующие заявку.
     */
	private String name;
	public String description;
	public long create;
	public String id;
	public Item() {
	}

	public Item(String name, String description) {
		this.name = name;
		this.description = description;
		this.create = create;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public long getCreate() {
		return create;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(String id) {
		this.id = id;
	}
}