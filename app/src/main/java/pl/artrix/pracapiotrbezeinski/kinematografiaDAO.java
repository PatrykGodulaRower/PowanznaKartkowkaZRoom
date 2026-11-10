package pl.artrix.pracapiotrbezeinski;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface kinematografiaDAO {
    @Insert
    public void wstawDoBazyKine(kinematografia kinematografia);
    @Insert
    public void wstawListeKineDoBazy(kinematografia... kinematografia);
    @Delete
    public void usunZBazy(kinematografia kinematografia);
    @Update
    public void aktKineWBazie(kinematografia kinematografia);
    @Query("SELECT * FROM kinematografia")
    public List<kinematografia> zwrocWszystkieFilmyZBazy();
    @Query("SELECT tytul FROM kinematografia")
    public List<String> zwrocTytulKineODanymRoku();
}
