package cl.awakelab.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intitListener();

    }

    private void intitListener() {

        Button btnToast = findViewById(R.id.toatsButton);
        Button btnContador = findViewById(R.id.countButton);
        TextView textContador = findViewById(R.id.countTextView);
        
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Hello Toast", Toast.LENGTH_SHORT).show();
            }
        });

        btnContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer numero = Integer.parseInt(textContador.getText().toString()) ;
                numero++;
                textContador.setText(numero.toString());
            }
        });

       
    }
}