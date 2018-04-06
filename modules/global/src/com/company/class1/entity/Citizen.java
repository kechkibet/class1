package com.company.class1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|idNumber")
@Table(name = "CLASS1_CITIZEN")
@Entity(name = "class1$Citizen")
public class Citizen extends StandardEntity {
    private static final long serialVersionUID = -6680610318958590220L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    protected String firstName;

    @Composition
    @OnDelete(DeletePolicy.DENY)
    @OneToMany(mappedBy = "contactPerson")
    protected List<Business> businesses;

    @NotNull
    @Column(name = "GENDER", nullable = false)
    protected String gender;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String lastName;

    @NotNull
    @Column(name = "ID_NUMBER", nullable = false, unique = true)
    protected String idNumber;

    @Email(message = "Email not valid!")
    @Column(name = "EMAIL")
    protected String email;

    @Pattern(message = "Invalid Phone Number", regexp = "\\+(254)\\d{9}")
    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false)
    protected String phoneNumber;

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }


    public void setGender(Gender gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public Gender getGender() {
        return gender == null ? null : Gender.fromId(gender);
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}