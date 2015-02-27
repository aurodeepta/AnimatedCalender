package com.ithread.oriyacalender.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

	static {
		// Add 3 sample items.
		addItem(new DummyItem("1", "January"));//getResources().getIdentifier("com.example.com.ithread.oriyacalender:drawable/" + "", null, null));
		addItem(new DummyItem("2", "February"));//, null));
		addItem(new DummyItem("3", "March"));
		addItem(new DummyItem("4", "April"));
		addItem(new DummyItem("5", "May"));
		addItem(new DummyItem("6", "June"));
		addItem(new DummyItem("7", "July"));
		addItem(new DummyItem("8", "August"));
		addItem(new DummyItem("9", "September"));
		addItem(new DummyItem("10", "October"));
		addItem(new DummyItem("11", "November"));
		addItem(new DummyItem("12", "December"));
	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DummyItem {
		public String id;
		public String content;
		
	
		
		public DummyItem(String id, String content) {
			this.id = id;
			this.content = content;

		}

		@Override
		public String toString() {
			return content;
		}
	}
}
