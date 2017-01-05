package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private TextView result;
    private EditText idade;
    private String entrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoId);
        result = (TextView) findViewById(R.id.resultadoId);
        idade = (EditText) findViewById(R.id.idadeId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entrada = idade.getText().toString();

                if (entrada.isEmpty()) {
                    idade.setError("Campo obrigatorio.");
                } else if (entrada.length() > 2){
                    idade.setError("Valor inválido.");
                } else {
                    int idadeDigitada = Integer.parseInt(entrada);
                    int resultado = idadeDigitada * 7;

                    result.setText("A idade é: " + resultado + " anos.");
                }
            }
        });
    }
}
