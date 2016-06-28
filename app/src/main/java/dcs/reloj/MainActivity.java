package dcs.reloj;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salida = (TextView) findViewById(R.id.textViewSalida);

        tareaLarga();
    }

    private void tareaLarga() {
        this.salida.append("Inicia");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        this.salida.append("Termina");
    }

    //mensajes
    public void mostrarcasoderrror(String titulo, String cuerpo) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(titulo);
        builder.setMessage(cuerpo);
        builder.setPositiveButton("OK", null);
        builder.create();
        builder.show();

    }

    public void mensaje(String men) {
        Toast.makeText(this, men, Toast.LENGTH_SHORT).show();
    }

    private void IniciarReloj() {
        try {
        } catch (Exception ex) {
            mostrarcasoderrror(ex.toString(), ex.getMessage());
        }

    }


}
