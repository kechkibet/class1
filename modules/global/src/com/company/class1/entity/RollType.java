package com.company.class1.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RollType implements EnumClass<String> {

    Private_Land("private_Land"),
    Public_Institution("publicInstitution"),
    Government_Of_Kenya("governmentOfKenya"),
    Kenya_Railways("kenyaRailways"),
    This_Local_Authorities("thisLocalAuthorities"),
    Other_Local_Authorities("otherLocalAuthorities"),
    otherOrganization("otherOrganizations");

    private String id;

    RollType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static RollType fromId(String id) {
        for (RollType at : RollType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}