package com.dayetfracso.codep25.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class RaceWithTeams {
    @Embedded
    public Race race;

    @Relation(
            parentColumn = "raceId",
            entityColumn = "raceId",
            entity = Team.class
    )
    public List<Team> teams;
}


