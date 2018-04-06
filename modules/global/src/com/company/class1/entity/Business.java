package com.company.class1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "CLASS1_BUSINESS")
@Entity(name = "class1$Business")
public class Business extends StandardEntity {
    private static final long serialVersionUID = -1370342734283170867L;

    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CONTACT_PERSON_ID")
    protected Citizen contactPerson;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "BUSINESS_REGISTRATION_NUMBER", unique = true)
    protected String businessRegistrationNumber;

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }


    public void setContactPerson(Citizen contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Citizen getContactPerson() {
        return contactPerson;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
        this.businessRegistrationNumber = businessRegistrationNumber;
    }

    public String getBusinessRegistrationNumber() {
        return businessRegistrationNumber;
    }


}