package com.example.orders;

public class OrderLine {
    private final String sku;
    private final int quantity;
    private final int unitPriceCents;

    private OrderLine(Builder builder) {
        this.sku = builder.sku;
        this.quantity = builder.quantity;
        this.unitPriceCents = builder.unitPriceCents;
    }

    public String getSku() { return sku; }
    public int getQuantity() { return quantity; }
    public int getUnitPriceCents() { return unitPriceCents; }

    public static class Builder {
        private String sku;
        private int quantity;
        private int unitPriceCents;

        public Builder sku(String sku) {
            this.sku = sku;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder unitPriceCents(int unitPriceCents) {
            this.unitPriceCents = unitPriceCents;
            return this;
        }

        public OrderLine build() {
            if (sku == null || sku.isEmpty()) throw new IllegalArgumentException("sku is required");
            if (quantity <= 0) throw new IllegalArgumentException("quantity must be positive");
            if (unitPriceCents < 0) throw new IllegalArgumentException("unitPriceCents must be non-negative");
            return new OrderLine(this);
        }
    }
}
