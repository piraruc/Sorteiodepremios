package com.example.sorteiodeprmios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private String premio;
    private Button sortear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView4);
        sortear = findViewById(R.id.button);

        sortear.setOnClickListener(new View.OnClickListener(){

        public void onClick (View view){
            int n_random = new Random().nextInt(9);
            switch (n_random) {
                case 1:
                    premio = "R$ 1.000,00";
                    break;
                case 2:
                    premio = "R$ 2.000,00";
                    break;
                case 3:
                    premio = "R$ 100.000,00";
                    break;
                case 4:
                    premio = "Carro 0Km";
                    break;
                case 5:
                    premio = "Motocicleta";
                    break;
                case 6:
                    premio = "Casa";
                    break;
                case 7:
                    premio = "Viagem";
                    break;
                case 8:
                    premio = "Smartphone";
                    break;
                case 0:
                    premio = "Apartamento";
                    break;
                default:
                    premio = "Nada";
                    break;


            }

            txt.setText("Seu prêmio é : " + premio);
        }
        });

    }
}