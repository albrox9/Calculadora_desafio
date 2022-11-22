package org.abrox.t5_ejemplos.desafio_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

    }

    private void calcular() {

        tv.getText().toString();

    }


    public void boton1(View view) {
        String num1 = getResources().getText(R.string._1).toString();
        tv.setText(tv.getText() + num1);

    }

    public void boton2(View view) {
        String num2 = getResources().getText(R.string._2).toString();
        tv.setText(tv.getText() +num2);
    }

    public void boton3(View view) {
        String num3 = getResources().getText(R.string._3).toString();
        tv.setText(tv.getText() +num3);
    }

    public void boton4(View view) {
        String num4 = getResources().getText(R.string._4).toString();
        tv.setText(tv.getText() +num4);
    }

    public void boton5(View view) {
        String num5 = getResources().getText(R.string._5).toString();
        tv.setText(tv.getText() +num5);
    }

    public void boton6(View view) {
        String num6 = getResources().getText(R.string._6).toString();
        tv.setText(tv.getText() +num6);
    }

    public void boton7(View view) {
        String num7 = getResources().getText(R.string._7).toString();
        tv.setText(tv.getText() +num7);
    }

    public void boton8(View view) {
        String num8 = getResources().getText(R.string._8).toString();
        tv.setText(tv.getText() +num8);
    }

    public void boton9(View view) {
        String num9 = getResources().getText(R.string._9).toString();
        tv.setText(tv.getText() +num9);
    }

    public void restar(View view) {
        String restar = getResources().getText(R.string.resta).toString();
        tv.setText(tv.getText() + restar);
    }

    public void dividir(View view) {
        String dividir = getResources().getText(R.string.divi).toString();
        tv.setText(tv.getText() + dividir);
    }

    public void multiplicar(View view) {
        String multiplicar = getResources().getText(R.string.multi).toString();
        tv.setText(tv.getText() + multiplicar);
    }

    public void sumar(View view) {
        String sumar = getResources().getText(R.string.suma).toString();
        tv.setText(tv.getText() + sumar);
    }

    public void resultado(View view) {
        String resultado = getResources().getText(R.string.igual).toString();
        tv.setText(tv.getText() + resultado);
        calcular();
    }

    public void borrar(View view) {

        String borrar = getResources().getText(R.string.ce).toString();
        tv.setText("");
    }
}