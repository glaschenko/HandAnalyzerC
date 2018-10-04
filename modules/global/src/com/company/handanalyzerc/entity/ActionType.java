package com.company.handanalyzerc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ActionType implements EnumClass<Integer> {

    FOLD(30),
    CALL(10),
    RAISE(20);

    private Integer id;

    ActionType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static ActionType fromId(Integer id) {
        for (ActionType at : ActionType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}