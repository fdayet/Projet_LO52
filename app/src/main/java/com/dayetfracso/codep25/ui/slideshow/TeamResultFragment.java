package com.dayetfracso.codep25.ui.slideshow;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dayetfracso.codep25.R;
import com.dayetfracso.codep25.dao.AppDatabase;
import com.dayetfracso.codep25.entity.Race;
import com.dayetfracso.codep25.entity.Runner;
import com.dayetfracso.codep25.entity.RunnerStats;
import com.dayetfracso.codep25.entity.Team;
import com.dayetfracso.codep25.entity.TeamWithRunners;
import com.dayetfracso.codep25.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class TeamResultFragment extends Fragment {
    AppDatabase database;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_team_result, container, false);

        database = AppDatabase.getDatabase(getContext());

        long raceID = getArguments().getLong("raceId");
        long teamID = getArguments().getLong("teamId");

        TeamWithRunners teamWithRunners = database.teamDao().getTeamWithRunners(teamID);
        Team team = teamWithRunners.team;
        List<Runner> runners = teamWithRunners.runners;
        Race race = database.raceDao().getRace(raceID);


        // Set action bar title
//        getSupportActionBar().setTitle(getResources().getString(R.string.results_of_team) + " \"" +team.getName()+"\"");

        LinearLayout bigContainer = root.findViewById(R.id.bigContainer);
        bigContainer.setOrientation(LinearLayout.VERTICAL);

        TextView tvBestSprint1 = null;
        long bestSprint1 = Long.MAX_VALUE;

        TextView tvBestFractionned1 = null;
        long bestFractionned1 = Long.MAX_VALUE;

        TextView tvBestSprint2 = null;
        long bestSprint2 = Long.MAX_VALUE;

        TextView tvBestPitStop = null;
        long bestPitStop = Long.MAX_VALUE;

        TextView tvBestFractionned2 = null;
        long bestFractionned2 = Long.MAX_VALUE;

        TextView tvBestGlobal = null;
        long bestGlobal = Long.MAX_VALUE;


        for (final Runner runner : runners) {

            // Runner Name
            TextView textViewRunnerName = new TextView(getContext());
            textViewRunnerName.setText(runner.getFullName() + " (" + runner.getLevel() + ")");
            bigContainer.addView(textViewRunnerName);
            textViewRunnerName.setGravity(Gravity.CENTER);

            // Grid for results
            GridLayout grid = new GridLayout(getContext());
            grid.setColumnCount(7);

            // Set headers
//            grid.addView(getTextViewHeaderCell(getResources().getString(R.string.Lap)));
//            grid.addView(getTextViewHeaderCell(getResources().getString(R.string.Sprint) + " 1"));
//            grid.addView(getTextViewHeaderCell(getResources().getString(R.string.Fract_) + " 1"));
//            grid.addView(getTextViewHeaderCell(getResources().getString(R.string.Pit_stop)));
//            grid.addView(getTextViewHeaderCell(getResources().getString(R.string.Sprint) + " 2"));
//            grid.addView(getTextViewHeaderCell(getResources().getString(R.string.Fract_) + " 2"));
//            grid.addView(getTextViewHeaderCell(getResources().getString(R.string.Total)));

            // Arrays to compute averages
            List<Long> listTimeSprint1 = new ArrayList<>();
            List<Long> listTimeFractionned1 = new ArrayList<>();
            List<Long> listTimePitStop = new ArrayList<>();
            List<Long> listTimeSprint2 = new ArrayList<>();
            List<Long> listTimeFractionned2 = new ArrayList<>();
            List<Long> listTimeGlobal = new ArrayList<>();
        }
        return root; // to remove
    }

//            for (final RunnerStats lapTime : runner.getLapTimesForRace(getContext(), race.getRaceId())) {
//
//                // Lap number
//                grid.addView(getTextViewNormalCell(Integer.toString(lapTime.getLapNumber())));
//
//                TextView tv;
//
//                // Sprint 1
//                listTimeSprint1.add(lapTime.getTimeSprint1());
//                tv=getTextViewNormalCell(Utils.formatTime(lapTime.getTimeSprint1()));
//                if(lapTime.getTimeSprint1() < bestSprint1) {
//                    bestSprint1=lapTime.getTimeSprint1();
//                    tvBestSprint1=tv;
//                }
//                grid.addView(tv);
//
//                // Fractionned 1
//                listTimeFractionned1.add(lapTime.getTimeFractionated1());
//                tv=getTextViewNormalCell(Utils.formatTime(lapTime.getTimeFractionated1()));
//                if(lapTime.getTimeFractionated1() < bestFractionned1){
//                    bestFractionned1=lapTime.getTimeFractionated1();
//                    tvBestFractionned1=tv;
//                }
//                grid.addView(tv);
//
//                // Pit stop
//                listTimePitStop.add(lapTime.getTimePitStop());
//                tv=getTextViewNormalCell(Utils.formatTime(lapTime.getTimePitStop()));
//                if(lapTime.getTimePitStop() < bestPitStop) {
//                    bestPitStop=lapTime.getTimePitStop();
//                    tvBestPitStop=tv;
//                }
//                grid.addView(tv);
//
//                // Sprint 2
//                listTimeSprint2.add(lapTime.getTimeSprint2());
//                tv=getTextViewNormalCell(Utils.formatTime(lapTime.getTimeSprint2()));
//                if(lapTime.getTimeSprint2() < bestSprint2) {
//                    bestSprint2=lapTime.getTimeSprint2();
//                    tvBestSprint2=tv;
//                }
//                grid.addView(tv);
//
//                // Fractionned 2
//                listTimeFractionned2.add(lapTime.getTimeFractionated2());
//                tv=getTextViewNormalCell(Utils.formatTime(lapTime.getTimeFractionated2()));
//                if(lapTime.getTimeFractionated2() < bestFractionned2){
//                    bestFractionned2=lapTime.getTimeFractionated2();
//                    tvBestFractionned2=tv;
//                }
//                grid.addView(tv);
//
//                // Global
//                listTimeGlobal.add(lapTime.getGlobalTime());
//                tv=getTextViewNormalCell(Utils.formatTime(lapTime.getGlobalTime()));
//                if(lapTime.getGlobalTime() < bestGlobal){
//                    bestGlobal=lapTime.getGlobalTime();
//                    tvBestGlobal=tv;
//                }
//                grid.addView(tv);
//            }
//            if(runner.getLapTimesForRace(getContext(), race.getRaceId()).size()>0){
//                // Average
//                grid.addView(getTextViewNormalCell(getResources().getString(R.string.Avg_)));
//
//                // Average Sprint 1
//                grid.addView(getTextViewNormalCell(Utils.formatTime(Utils.average(listTimeSprint1))));
//
//                // Average Fractionned 1
//                grid.addView(getTextViewNormalCell(Utils.formatTime(Utils.average(listTimeFractionned1))));
//
//                // Average Pit stop
//                grid.addView(getTextViewNormalCell(Utils.formatTime(Utils.average(listTimePitStop))));
//
//                // Average Sprint 2
//                grid.addView(getTextViewNormalCell(Utils.formatTime(Utils.average(listTimeSprint2))));
//
//                // Average Fractionned 2
//                grid.addView(getTextViewNormalCell(Utils.formatTime(Utils.average(listTimeFractionned2))));
//
//                // Average Global
//                grid.addView(getTextViewNormalCell(Utils.formatTime(Utils.average(listTimeGlobal))));
//            }
//            bigContainer.addView(grid);
//        }
//
//        if(tvBestSprint1 != null)tvBestSprint1.setTextColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
//        if(tvBestFractionned1!= null)tvBestFractionned1.setTextColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
//        if(tvBestPitStop != null)tvBestPitStop.setTextColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
//        if(tvBestSprint2 != null)tvBestSprint2.setTextColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
//        if(tvBestFractionned2 != null)tvBestFractionned2.setTextColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
//        if(tvBestGlobal != null)tvBestGlobal.setTextColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
//
//        return root;
//    }
//
//    TextView getTextViewHeaderCell(String text)
//    {
//        TextView tv = new TextView(getContext());
//        tv.setText(text);
//        tv.setPadding(5,1,5,1);
//        tv.setBackgroundResource(R.layout.grid_items_border_with_bg);
//        tv.setGravity(Gravity.CENTER);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            tv.setLayoutParams(new GridLayout.LayoutParams(GridLayout.spec(GridLayout.UNDEFINED, 1f), GridLayout.spec(GridLayout.UNDEFINED, 1f)));
//        }
//        return tv;
//    }
//
//    TextView getTextViewNormalCell(String text)
//    {
//        TextView tv = new TextView(getContext());
//        tv.setText(text);
//        tv.setPadding(5,1,5,1);
//        tv.setBackgroundResource(R.layout.grid_items_border);
//        tv.setGravity(Gravity.CENTER);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            tv.setLayoutParams(new GridLayout.LayoutParams(GridLayout.spec(GridLayout.UNDEFINED, 1f), GridLayout.spec(GridLayout.UNDEFINED, 1f)));
//        }
//        return tv;
//    }
}