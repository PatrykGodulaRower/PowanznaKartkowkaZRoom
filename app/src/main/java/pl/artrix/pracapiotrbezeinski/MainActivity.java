package pl.artrix.pracapiotrbezeinski;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {
    kinematografiaDataBase kinematografiaDataBase1;

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

       kinematografiaDataBase1.zwrockinematografiaDAO().wstawDoBazyKine(
               new kinematografia("mroczny rycerz",2008,"akcja")
       );
    }



}