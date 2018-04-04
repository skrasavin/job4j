package ru.job4j.chap2;

import java.util.*;

public class Tracker {
	
	private Item[] items = new Item[100];
	private int position = 0;
	public static final Random RN = new Random();
	
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}
	
	public void replace(String id, Item item) {
		for (int index = 0; index != this.position; index++) {
			if (items[index].getId().equals(id)) {
			items[index] = item;
			}
		}
	}
	public void delete(String id) {
		int unique = items.length;
		for (int out = 0; out < unique; out++) {
			for (int index = 0; index != this.position; index++) {
				if (items[index].getId().equals(id)) {
					items[index] = null;
					items[index] = items[unique - 1];
					unique--;
				}
			}
		}
		items = Arrays.copyOf(items, unique);	
	}
	public Item[] findAll() {
		Item[] result = new Item[this.position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
	public Item[] findByName(String key) {
		Item[] result = null;
		for (Item item : items) {
			if (item != null && item.getName().equals(key)) {
				result[position] = item;
				break;
			}
		}
		return result;
	}
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
	public String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
	
}