package com.dayetfracso.codep25.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.dayetfracso.codep25.repository.Coureur;

import java.util.List;

@Dao
public interface CoureurDao {
    //@Query("SELECT * FROM coureur")
    //List<Coureur> getAll();

    //@Query("SELECT * FROM coureur WHERE uid IN (:coureurIds)")
    //List<Coureur> loadAllByIds(int[] coureurIds);

    //@Query("SELECT * FROM coureur WHERE first_name LIKE :first AND " +    "last_name LIKE :last LIMIT 1")
    //Coureur findByName(String first, String last);

    @Insert
    void insertAll(Coureur coureur);

    @Insert
    void insertRunner(Coureur... coureurs);

    @Delete
    void delete(Coureur coureur);
}
