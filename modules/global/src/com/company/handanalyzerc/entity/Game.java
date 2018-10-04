package com.company.handanalyzerc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@Table(name = "HANDANALYZERC_GAME")
@Entity(name = "handanalyzerc$Game")
public class Game extends StandardEntity {
    private static final long serialVersionUID = 8316284183528201704L;

    @Column(name = "GAME_ID", precision = 19, scale = 0)
    protected BigDecimal gameId;


    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "game")
    protected List<PlayerAction> actions;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "game")
    protected List<Player> players;

    public void setActions(List<PlayerAction> actions) {
        this.actions = actions;
    }

    public List<PlayerAction> getActions() {
        return actions;
    }


    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }


    public void setGameId(BigDecimal gameId) {
        this.gameId = gameId;
    }

    public BigDecimal getGameId() {
        return gameId;
    }


}