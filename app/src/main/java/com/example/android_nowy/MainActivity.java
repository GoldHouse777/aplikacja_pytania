package com.example.android_nowy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView textViewPytanie;
    private Button buttonT;
    private Button buttonN;
    private Button buttonNastepny;
    private Button buttonPodpowiedz;
    private ArrayList<Pytanie> pytania = new ArrayList<>();
    private int numerWyswietlanegoPytania = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewPytanie = findViewById(R.id.textViewPytanie);
        buttonT = findViewById(R.id.button1);
        buttonN = findViewById(R.id.button2);
        buttonNastepny = findViewById(R.id.button5);
        buttonPodpowiedz = findViewById(R.id.button4);

        pytania.add(new Pytanie("Czy niedźwiedź polarny je pingwiny?", false, "Zastanów się gdzie każde zwierze żyje"));
        pytania.add(new Pytanie("Czy żyrafy mogą polizać się po uchu?", false, "Mają bardzo długi język"));
        pytania.add(new Pytanie("Czy zebry śpią na leżąco?", false, "Z???"));

        textViewPytanie.setText("Czy jesteś gotowy na szybki Quiz?");
        buttonT.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Wybrano tak", Toast.LENGTH_SHORT).show();
                    }
                }

        );

        buttonNastepny.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        numerWyswietlanegoPytania++;
                        if (numerWyswietlanegoPytania == pytania.size()) {
                            buttonT.setVisibility(View.INVISIBLE);
                            buttonN.setVisibility(View.INVISIBLE);
                            buttonNastepny.setVisibility(View.INVISIBLE);
                            buttonPodpowiedz.setVisibility(View.INVISIBLE);
                            textViewPytanie.setText("Dziękujemy za rozwiażanie testu, wyniki podamy za chwile");
                        } else {
                            textViewPytanie.setText(pytania.get(numerWyswietlanegoPytania).getTresc());
                        }
                    }
                }
        );

    }
}