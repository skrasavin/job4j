package ru.job4j.chap2;

import java.util.*;

/**
 * хранилище заявок.
 * @author  - skrasavin.
 * @since  - 6.04.2018.
 */
public class Tracker {
	/**
	 * массив для хранения заявок.
	 * счетчик.
	 * класс для определения рандомного значения id.
     */
	public Item[] items = new Item[100];
	private int position = 0;
	public static final Random RN = new Random();

	/**
	 *добавления заявки.
     */
	public void add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
	}
	/**
	 *смена заявки на другую после ввовда имени и новой заявки.
	 */
	public void replace(String name, Item item) {
		for (int index = 0; index != this.position; index++) {
			if (items[index].getName().equals(name)) {
			items[index] = item;
			}
		}
	}
	/**
	 *удаления заявки.
	 */
	public void delete(String id) {
		int unique = position;
			for (int inner = 0; inner < unique; inner++) {
				if (items[inner].getId().equals(id)) {
					items[inner] = items[unique - 1];
					items[unique - 1] = null;
					break;
				}
			}
			this.position--;
	}
	/**
	 *показать все заявки.
	 */
	public Item[] findAll() {
		Item[] result = new Item[this.position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
	/**
	 *найти заявку по имени.
	 */
	public Item[] findByName(String key) {
		Item[] result = new Item[this.position];
		int count = 0;
		for (int index = 0; index != this.position; index++) {
			if (items[index].getName().equals(key)) {
				result[count++] = items[index];
			}
		}
		return Arrays.copyOf(result, count);
	}
	/**
	 *найти заявку по Id.
	 */
	public Item	findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
	/**
	 *сгенерировать случайный номер для Id..
	 */
	public String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
}