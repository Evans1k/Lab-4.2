package it13.kuspismarian.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class UserDTO {
    private Long id;
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
    @NotNull


    public UserDTO() {
    }

    public UserDTO(final Long id, final String firstName, final String lastName, final LocalDate birthDay, final String userCountry, final String userCity,
                   final int userIndex, final int postOfficeNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.userCountry = userCountry;
        this.userCity = userCity;
        this.userIndex = userIndex;
        this.postOfficeNumber = postOfficeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
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