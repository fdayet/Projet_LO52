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
import androidx.lifecycle.ViewModelProvider;

import com.dayetfracso.codep25.R;
import com.dayetfracso.codep25.dao.AppDatabase;
import com.dayetfracso.codep25.repository.Coureur;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Button button = root.findViewById(R.id.saveRunnerButton);
        button.setOnClickListener(new View.OnClickListener() {
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
        return root;
    }
}