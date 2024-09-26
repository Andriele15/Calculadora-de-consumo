package br.ulbra.calculandoconsumo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
     EditText edtPotencia, edtHoras, edtPreco;
     TextView txtResultado;
     Button btnCalcular;
     ImageView iconResultado,iconResultado2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Referências aos componentes da interface com os novos IDs
        edtPotencia = findViewById(R.id.edtPotencia);
        edtHoras = findViewById(R.id.edtHoras);
        edtPreco = findViewById(R.id.edtPreco);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcular = findViewById(R.id.btnCalcular);
        iconResultado = findViewById(R.id.iconResultado);
        iconResultado2 = findViewById(R.id.iconResultado2);

        // Definir ação do botão de cálculo
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // Pegar os valores inseridos pelo usuário
                String potenciaStr = edtPotencia.getText().toString();
                String horasStr = edtHoras.getText().toString();
                String precoStr = edtPreco.getText().toString();

                // Verificar se os campos estão preenchidos
                if (!potenciaStr.isEmpty() && !horasStr.isEmpty() && !precoStr.isEmpty()) {
                    try {
                        // Converter os valores para números
                        double potencia = Double.parseDouble(potenciaStr);
                        double horas = Double.parseDouble(horasStr);
                        double precoKwh = Double.parseDouble(precoStr);

                        // Cálculo do consumo (CE = P * H / 1000)
                        double consumoEnergia = (potencia * horas) / 1000;

                        // Cálculo do custo (C = CE * Pkwh)
                        double custoEnergia = consumoEnergia * precoKwh;

                        // Formatar o resultado e exibir no mesmo TextView
                        String resultado = String.format("Consumo: %.2f kWh\n\n\nCusto: R$ %.2f", consumoEnergia, custoEnergia);

                        // Tornar o ícone visível após o cálculo
                        iconResultado.setVisibility(View.VISIBLE);

                        // Tornar o ícone visível após o cálculo
                        iconResultado2.setVisibility(View.VISIBLE);

                        // Exibir o resultado no TextView
                        txtResultado.setText(resultado);
                    } catch (NumberFormatException e) {
                        // Se houver erro na conversão, mostrar mensagem de erro
                        txtResultado.setText("Insira valores válidos.");
                        iconResultado.setVisibility(View.GONE); // Ocultar ícone se houver erro
                        iconResultado2.setVisibility(View.GONE); // Ocultar ícone se houver erro
                    }
                } else {
                    // Caso os campos estejam vazios, exibir uma mensagem de erro
                    txtResultado.setText("Preencha todos os campos corretamente.");
                    iconResultado.setVisibility(View.GONE); // Ocultar ícone se os campos estiverem vazios
                    iconResultado2.setVisibility(View.GONE); // Ocultar ícone se os campos estiverem vazios
                }


            }
        });



    }
}