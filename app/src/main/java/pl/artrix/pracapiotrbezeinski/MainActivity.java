package pl.artrix.pracapiotrbezeinski;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    kinematografiaDataBase kinematografiaDataBase1;
   List<kinematografia> listaKinowa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
       kinematografiaDataBase1 = Room.databaseBuilder(
                getApplicationContext(),
                kinematografiaDataBase.class,
                "kine_db"
        ).allowMainThreadQueries().build();
listaKinowa = kinematografiaDataBase1.zwrockinematografiaDAO().zwrocWszystkieFilmyZBazy();
       kinematografiaDataBase1.zwrockinematografiaDAO().wstawDoBazyKine(
               new kinematografia("mroczny rycerz",2008,"akcja")
       );
        ListView lista = findViewById(R.id.lista);
        ArrayAdapter<kinematografia> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, listaKinowa
        );
        lista.setAdapter(adapter);//wtsawianie do listy
    }



}