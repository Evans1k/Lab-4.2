package it13.kuspismarian.entity;

public class FootWear {
    private Long id;
    private String modelName;
    private double price;
    private String brandName;

    public FootWear() {
    }

    public FootWear(final Long id, final String title, final double price, final String authorName) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(final String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(final String brandName) {
        this.brandName = brandName;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
