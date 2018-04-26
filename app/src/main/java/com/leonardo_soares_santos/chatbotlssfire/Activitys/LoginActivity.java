package com.leonardo_soares_santos.chatbotlssfire.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import com.leonardo_soares_santos.chatbotlssfire.R;

public class LoginActivity extends AppCompatActivity {



    public static final String NOME = "com.leonardo_soares_santos.chatbotlssfire.NOME";
    public static final String EMAIL = "com.leonardo_soares_santos.chatbotlssfire.EMAIL";
    private String nome;
    private String email;
    private EditText txt_email;
    private EditText txt_nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt_nome = (EditText)findViewById(R.id.txt_nome);
        txt_email = (EditText)findViewById(R.id.txt_email);
    }

    private void validaCampos(){

        String nome= txt_nome.getText().toString();
        String email= txt_email.getText().toString();
        // Boolean res = false;
        if (isCampoVazio(nome)){
            txt_nome.requestFocus();
            txt_nome.setError("Preencha o campo nome!!");

        }else if ( !isEmailValido(email)){
            txt_email.requestFocus();
            txt_email.setError("Email nulo ou invalido!!");

        }


    }

    private  boolean isCampoVazio(String valor){

        boolean resultado = (TextUtils.isEmpty(valor)|| valor.trim().isEmpty() );

        return resultado;

    }
    private boolean isEmailValido(String email ){
        boolean resultado = (!isCampoVazio(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());

        return resultado;


    }
    public void enviarUsu(View view) {

        Intent intent = new Intent(this, ChatActivity.class);
        nome = txt_nome.getText().toString();
        email = txt_email.getText().toString();
        intent.putExtra(NOME, nome);
        intent.putExtra(EMAIL, email);


        // validaCampos();
        //  startActivity(intent);

        if (isCampoVazio(nome)){
            txt_nome.requestFocus();
            txt_nome.setError("Preencha o campo NOME!");

        }else
        if ( !isEmailValido(email)){
            txt_email.requestFocus();
            txt_email.setError("Email Nulo ou Invalido!");

        }else {
            startActivity(intent);

        }


    }

}
