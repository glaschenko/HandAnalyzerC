package com.company.handanalyzerc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.math.BigDecimal;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|nickname")
@Table(name = "HANDANALYZERC_PLAYER")
@Entity(name = "handanalyzerc$Player")
public class Player extends StandardEntity {
    private static final long serialVersionUID = 663358608161091221L;

    @Column(name = "NICKNAME")
    protected String nickname;

    @Column(name = "STAKE")
    protected BigDecimal stake;

    @Column(name = "POSITION_")
    protected Integer position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GAME_ID")
    protected Game game;

    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }


    public void setStake(BigDecimal stake) {
        this.stake = stake;
    }

    public BigDecimal getStake() {
        return stake;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position == null ? null : position.getId();
    }

    public PlayerPosition getPosition() {
        return position == null ? null : PlayerPosition.fromId(position);
    }


}