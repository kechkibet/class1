package com.company.class1.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Table(name = "CLASS1_VALUATION_ROLL")
@Entity(name = "class1$ValuationRoll")
public class ValuationRoll extends StandardEntity {
    private static final long serialVersionUID = 1786613502776425768L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "ROLL_TYPE")
    protected String rollType;

    @Column(name = "SITE_VALUE")
    protected Double siteValue;

    @Column(name = "ANNUAL_RATE")
    protected Double annualRate;

    @Column(name = "EXEMPT")
    protected Double exempt;

    @Column(name = "RATABLE_VALUE")
    protected Double ratableValue;

    @Column(name = "SIZE_IN_HA")
    protected Double sizeInHa;

    public RollType getRollType() {
        return rollType == null ? null : RollType.fromId(rollType);
    }

    public void setRollType(RollType rollType) {
        this.rollType = rollType == null ? null : rollType.getId();
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSiteValue(Double siteValue) {
        this.siteValue = siteValue;
    }

    public Double getSiteValue() {
        return siteValue;
    }

    public void setAnnualRate(Double annualRate) {
        this.annualRate = annualRate;
    }

    public Double getAnnualRate() {
        return annualRate;
    }

    public void setExempt(Double exempt) {
        this.exempt = exempt;
    }

    public Double getExempt() {
        return exempt;
    }

    public void setRatableValue(Double ratableValue) {
        this.ratableValue = ratableValue;
    }

    public Double getRatableValue() {
        return ratableValue;
    }

    public void setSizeInHa(Double sizeInHa) {
        this.sizeInHa = sizeInHa;
    }

    public Double getSizeInHa() {
        return sizeInHa;
    }


}