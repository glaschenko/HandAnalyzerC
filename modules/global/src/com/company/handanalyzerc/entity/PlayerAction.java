package com.company.handanalyzerc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s %s|player,actionType,size")
@Table(name = "HANDANALYZERC_PLAYER_ACTION")
@Entity(name = "handanalyzerc$PlayerAction")
public class PlayerAction extends StandardEntity {
    private static final long serialVersionUID = -1831620202028650321L;

    @Column(name = "INDEX_")
    protected String index;

    @Column(name = "ACTION_TYPE")
    protected Integer actionType;

    @Column(name = "SIZE_")
    protected BigDecimal size;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAYER_ID")
    protected Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GAME_ID")
    protected Game game;

    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }


    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType == null ? null : actionType.getId();
    }

    public ActionType getActionType() {
        return actionType == null ? null : ActionType.fromId(actionType);
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }


}