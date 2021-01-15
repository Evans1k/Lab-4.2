package it13.kuspismarian.dto;

public class FootWearDTO {
    private Long id;
    private String modelName;
    private double price;
    private String brandName;

    public FootWearDTO() {
    }

    public FootWearDTO(final Long id, final String modelName, final double price, final String brandName) {
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
