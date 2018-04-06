package com.company.class1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|description")
@Table(name = "CLASS1_ACTIVITY_CODES")
@Entity(name = "class1$ActivityCodes")
public class ActivityCodes extends StandardEntity {
    private static final long serialVersionUID = 5882587251640149437L;

    @NotNull
    @Column(name = "ACTIVITY_CODE", nullable = false, unique = true)
    protected Integer activityCode;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    @Column(name = "UNIT_OF_MEASURE")
    protected String unitOfMeasure;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    protected Double amount;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    protected Integer status;

    public void setActivityCode(Integer activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getActivityCode() {
        return activityCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }


}