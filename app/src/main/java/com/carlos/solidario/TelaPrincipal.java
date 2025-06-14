package com.carlos.solidario;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaPrincipal extends AppCompatActivity {
    public ImageButton ibPrincipal;
    public ImageButton ibMenu;
    public ImageButton ibMensagem;
    public ImageButton ibAdicionar;
    public ImageButton ibVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ibPrincipal.findViewById(R.id.ib_principal);
        ibMenu.findViewById(R.id.ib_menu);
        ibMensagem.findViewById(R.id.ib_mensagem);
        ibAdicionar.findViewById(R.id.ib_adicionar);

        ibVoltar.findViewById(R.id.ib_voltar);

        //Métod0s dos botões para as outras telas

        ibMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, TelaMenu.class);
                startActivity(intent);
            }
        });

        ibMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, TelaMensagens.class);
                startActivity(intent);
            }
        });

        ibAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, TelaAdicionarProduto.class);
                startActivity(intent);
            }
        });

        // Botão para voltar a tela anterior
        ibVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaPrincipal.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}