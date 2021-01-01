package com.dayetfracso.codep25.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "runner")
public class Runner {
    @PrimaryKey(autoGenerate = true)
    private int runnerId;
    private int level;
    @ColumnInfo(name = "full_name")
    private String fullName;

    @ForeignKey
            (entity = Team.class,
                    parentColumns = "teamId",
                    childColumns = "teamIdFk"
            )
    public long teamIdFk;


    public int getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(int runnerId) {
        this.runnerId = runnerId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getTeamIdFk() { return teamIdFk; }

    public void setTeamIdFk(long teamIdFk) { this.teamIdFk = teamIdFk; }
}