package it13.kuspismarian.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class OrderDTO {
    private Long id;
    @NotNull
    private LocalDate orderDate;
    @NotNull
    private Long userId;
    @NotNull
    @Size(min = 3, max = 12)
    private String some;

    public OrderDTO() {
    }

    public OrderDTO(final Long id, @NotNull final LocalDate orderDate, final Long userId) {
        this.id = id;
        this.orderDate = orderDate;
        this.userId = userId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(final LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(final Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getSome() {
        return some;
    }

    public void setSome(final String some) {
        this.some = some;
    }
}
