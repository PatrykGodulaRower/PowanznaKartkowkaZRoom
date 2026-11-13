package pl.artrix.pracapiotrbezeinski;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {kinematografia.class}, version = 1)
public  abstract class kinematografiaDataBase extends RoomDatabase{
    public abstract  kinematografiaDAO zwrockinematografiaDAO();
}
