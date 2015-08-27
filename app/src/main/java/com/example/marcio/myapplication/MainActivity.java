package com.example.marcio.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    double Valor1;
    double Valor2;
    double Resultado;

    // variáveis dos widgets
    public EditText edtValor1;
    public EditText edtValor2;
    public EditText edtResultado;

    public Button btnSomar;
    public Button btnSubtrair;
    public Button btnMultiplicar;
    public Button btnDividir;

    private void PegarValores(){
        Valor1 = Double.parseDouble(edtValor1.getText().toString());
        Valor2 = Double.parseDouble(edtValor2.getText().toString());
    }

    View.OnClickListener btnSomarClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            PegarValores();

            Resultado = Valor1 + Valor2;

            edtResultado.setText(String.valueOf(Resultado));
        }
    };

    View.OnLongClickListener btnSomarLongClick = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {

            edtResultado.setText("Esperando Operação");

            return false;

        }
    };

    View.OnClickListener btnSubtrairClick = new View.OnClickListener(){
        @Override
        public void onClick(View v){

            PegarValores();

            Resultado = Valor1 - Valor2;

            edtResultado.setText(String.valueOf(Resultado));

        }
    };

    View.OnClickListener btnMultiplicarClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            PegarValores();

            Resultado = Valor1 * Valor2;

            edtResultado.setText(String.valueOf(Resultado));
        }
    };

    View.OnClickListener btnDividirClick = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            PegarValores();

            Resultado = Valor1 / Valor2;

            edtResultado.setText(String.valueOf(Resultado));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // referência os widgets as variáveis
        edtValor1       = (EditText) findViewById(R.id.edtValor1);
        edtValor2       = (EditText) findViewById(R.id.edtValor2);
        edtResultado    = (EditText) findViewById(R.id.edtResultado);
        btnSomar        = (Button) findViewById(R.id.btnSomar);
        btnSubtrair     = (Button) findViewById(R.id.btnSubtrair);
        btnMultiplicar  = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir      = (Button) findViewById(R.id.btnDividir);

        // atribui os métodos aos widgets
        btnSomar.setOnClickListener(btnSomarClick);
        btnSomar.setOnLongClickListener(btnSomarLongClick);

        btnSubtrair.setOnClickListener(btnSubtrairClick);

        btnMultiplicar.setOnClickListener(btnMultiplicarClick);

        btnDividir.setOnClickListener(btnDividirClick);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
