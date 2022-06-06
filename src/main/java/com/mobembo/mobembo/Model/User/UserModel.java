package com.mobembo.mobembo.Model.User;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mobembo.mobembo.Model.Enum.GenreEnum;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")

public class UserModel {

    @Id
    @GeneratedValue
    private UUID Id;

    public UUID getId() {
        return Id;
    }
    public void setId(UUID id) {
        Id = id;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }

    public Date getUpdateDate() {
        return UpdateDate;
    }
    public void setUpdateDate(Date updateDate) {
        UpdateDate = updateDate;
    }

    public GenreEnum getGenre() {
        return Genre;
    }
    public void setGenre(GenreEnum genre) {
        Genre = genre;
    }

    public Date getCreateDate() {
        return CreateDate;
    }
    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    private String FirstName;
    private String LastName;
    private String PhoneNumber;  
    private String Email;
    private String Country;
    private GenreEnum Genre;

    private Date CreateDate;
    private Date UpdateDate;
}
