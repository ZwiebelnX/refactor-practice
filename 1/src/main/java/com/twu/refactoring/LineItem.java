package com.twu.refactoring;

public class LineItem {
	private final String description;
	private final double prize;
	private final int quantity;

	public LineItem(String description, double prize, int quantity) {
		super();
		this.description = description;
		this.prize = prize;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return prize;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return prize * quantity;
    }
}