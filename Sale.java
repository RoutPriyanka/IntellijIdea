package com.rout.category.model;

public class Sale {

    private Integer productId;
    private Integer leaafCategoryId;
    private Integer primaryCategoryId;
    private Double amount;
    private Long quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getLeaafCategoryId() {
        return leaafCategoryId;
    }

    public void setLeaafCategoryId(Integer leaafCategoryId) {
        this.leaafCategoryId = leaafCategoryId;
    }

    public Integer getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public void setPrimaryCategoryId(Integer primaryCategoryId) {
        this.primaryCategoryId = primaryCategoryId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Sale(Integer productId, Integer leaafCategoryId, Integer primaryCategoryId, Double amount, Long quantity) {
        this.productId = productId;
        this.leaafCategoryId = leaafCategoryId;
        this.primaryCategoryId = primaryCategoryId;
        this.amount = amount;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productId=" + productId +
                ", leaafCategoryId=" + leaafCategoryId +
                ", primaryCategoryId=" + primaryCategoryId +
                ", amount=" + amount +
                ", quantity=" + quantity +
                '}';
    }
}
