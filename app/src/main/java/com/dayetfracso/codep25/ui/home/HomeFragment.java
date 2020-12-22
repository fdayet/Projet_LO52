package com.dayetfracso.codep25.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.dayetfracso.codep25.R;
import com.dayetfracso.codep25.dao.AppDatabase;
import com.dayetfracso.codep25.repository.Coureur;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Button saveRunnerbutton = root.findViewById(R.id.saveRunnerButton);
        saveRunnerbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                EditText nameField = root.findViewById(R.id.nameInputField);
                EditText levelField = root.findViewById(R.id.levelInputField);

                String name = nameField.getText().toString();
                int level = Integer.parseInt(levelField.getText().toString());

                AppDatabase db = AppDatabase.getDatabase(getActivity().getApplicationContext());

                Coureur coureur = new Coureur();
                coureur.setNomComplet(name);
                coureur.setNiveau(level);

                db.coureurDao().insertRunner(coureur);

                Toast toast = new Toast(getContext());
                toast.setText("Profil du coureur sauvegardé!");
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final FragmentManager fragmentManager = getFragmentManager();
        final RunnersListFragment runnersListFragment = new RunnersListFragment();

        Button showAllRunnersbutton = root.findViewById(R.id.showRunnersButton);
        showAllRunnersbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                runnersListFragment.show(fragmentManager,"runners list fragment");
            }
        });


        return root;
    }
}