package com.company.handanalyzerc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PlayerPosition implements EnumClass<Integer> {

    EP(10),
    MP(20),
    CO(30),
    BTN(40),
    SB(50),
    BB(60);

    private Integer id;

    PlayerPosition(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static PlayerPosition fromId(Integer id) {
        for (PlayerPosition at : PlayerPosition.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}