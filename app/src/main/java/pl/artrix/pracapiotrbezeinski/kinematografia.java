package pl.artrix.pracapiotrbezeinski;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Kinematografia")
public class kinematografia{

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String tytul;
    @ColumnInfo(name = "rok")
    private int rokProdukcji;
    private String kategoria;

    public kinematografia(String tytul, int rokProdukcji, String kategoria) {
        this.tytul = tytul;
        this.rokProdukcji = rokProdukcji;
        this.kategoria = kategoria;
    }
    public kinematografia(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
}