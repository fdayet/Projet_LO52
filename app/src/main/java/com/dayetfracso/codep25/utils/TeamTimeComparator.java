package com.dayetfracso.codep25.utils;

import android.content.Context;

import com.dayetfracso.codep25.entity.Team;

import java.util.Comparator;

public class TeamTimeComparator implements Comparator<Team>{
    private Context c;
    public TeamTimeComparator(Context c) {
        this.c = c;
    }

    @Override
    public int compare(Team a, Team b){
//        int diffAdvencement = a.getAdvancement(c)-b.getAdvancement(c);
//        if(diffAdvencement>0)return -1;
//        else if(diffAdvencement<0) return 1;
//        else return (int)(a.getGlobalTime(c)-b.getGlobalTime(c));
        return 1;
    }
}

