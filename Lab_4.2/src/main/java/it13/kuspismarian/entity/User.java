package it13.kuspismarian.entity;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private LocalDate birthDay;
    @NotNull
    private String userCountry;
    @NotNull
    private String userCity;
    @NotNull
    private int userIndex;
    @NotNull
    private int postOfficeNumber;


    private List<Order> orders = new ArrayList<>();

    public User() {
    }

    public User(final Long id, final String firstName, final String lastName, final LocalDate birthDay, final List<Order> orders, final String userCountry, final String userCity,
                final int userIndex, final int postOfficeNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.orders = orders;
        this.userCountry = userCountry;
        this.userCity = userCity;
        this.userIndex = userIndex;
        this.postOfficeNumber = postOfficeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(final LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(final List<Order> orders) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(final String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(final String userCity) {
        this.userCity = userCity;
    }

    public int getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }

    public int getPostOfficeNumber() {
        return postOfficeNumber;
    }

    public void setPostOfficeNumber(int postOfficeNumber) {
        this.postOfficeNumber = postOfficeNumber;
    }
}
