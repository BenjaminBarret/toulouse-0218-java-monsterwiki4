package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagepass1 = findViewById(R.id.main_firelion);
        imagepass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passerelle1 = new Intent(MainActivity.this, FicheActivity.class);
                //Pour envoyer une image faire  :
                // Bundle bundle1 = new Bundle();
                //bundle1.putInt("image1",R.drawable.firelionone);
                //passerelle1.putExtras(bundle1);
                TextView monster = findViewById(R.id.text_firelion);
                String namefirelion = monster.getText().toString();
                passerelle1.putExtra("monstername", namefirelion);
                startActivity(passerelle1);
            }
        });
        ImageView imagepass2 = findViewById(R.id.main_rockilla);
        imagepass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passerelle2 = new Intent(MainActivity.this, FicheActivity.class);
                TextView monster = findViewById(R.id.text_rockilla);
                String namerockilla = monster.getText().toString();
                passerelle2.putExtra("monstername", namerockilla);
                startActivity(passerelle2);
            }
        });
        ImageView imagepass3 = findViewById(R.id.main_turtle);
        imagepass3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passerelle3 = new Intent(MainActivity.this, FicheActivity.class);
                TextView monster = findViewById(R.id.text_turtle);
                String nameturtle = monster.getText().toString();
                passerelle3.putExtra("monstername", nameturtle);
                startActivity(passerelle3);
            }
        });
        ImageView imagepass4 = findViewById(R.id.main_panda);
        imagepass4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passerelle4 = new Intent(MainActivity.this, FicheActivity.class);
                TextView monster = findViewById(R.id.text_panda);
                String namepanda = monster.getText().toString();
                passerelle4.putExtra("monstername", namepanda);
                startActivity(passerelle4);
            }
        });
        ImageView imagepass5 = findViewById(R.id.main_eagle);
        imagepass5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passerelle5 = new Intent(MainActivity.this, FicheActivity.class);
                TextView monster = findViewById(R.id.text_eagle);
                String nameeagle = monster.getText().toString();
                passerelle5.putExtra("monstername", nameeagle);
                startActivity(passerelle5);
            }
        });
        ImageView imagepass6 = findViewById(R.id.main_spirit);
        imagepass6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passerelle6 = new Intent(MainActivity.this, FicheActivity.class);
                TextView monster = findViewById(R.id.text_spirit);
                String namespirit = monster.getText().toString();
                passerelle6.putExtra("monstername", namespirit);
                startActivity(passerelle6);
            }
        });








    }
}
