package joninunes.com.exercicio02_imc_android;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edPeso;
    EditText edAltura;
    Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapeamentoComponentes();

    }

    public void MapeamentoComponentes(){

        edAltura = (EditText) findViewById(R.id.edAltura);
        edPeso   = (EditText) findViewById(R.id.edPeso);
        btCalcular = (Button) findViewById(R.id.btCalcular);
    }


    public void Calcular(View v){
        Context c = getApplicationContext();
        Toast t = Toast.makeText(c, "Seu IMC é: " + Formula(), Toast.LENGTH_LONG);
        t.show();
    }

    public Double Formula(){
        double peso = 0, altura = 0, resultado = 0;

        peso = Double.parseDouble(String.valueOf(edPeso.getText()));
        altura = Double.parseDouble(String.valueOf(edAltura.getText()));
        resultado = peso / (altura * altura);
        //resultado = 95 / (3.6);
        return resultado;
    }
}
