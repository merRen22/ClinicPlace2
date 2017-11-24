package com.example.anthony.clinicplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterClinicActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText descripcion;
    private EditText direccionPrincipal;
    private EditText numeroTelefono;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_clinic);



        nombre = (EditText)(findViewById(R.id.nombreClinica));
        descripcion = (EditText)(findViewById(R.id.descripcionClinica));
        direccionPrincipal =(EditText)(findViewById(R.id.direccionPrincipalClinica));
        numeroTelefono = (EditText)(findViewById(R.id.numeroTelefonicoClinica));
        enviar = (Button)(findViewById(R.id.crearClinica));

        final MapperHelper helper;
        helper = new MapperHelper(getApplicationContext());

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Clinica objClinica = new Clinica();

                objClinica.setNombre(nombre.getText().toString());
                objClinica.setDescripcion(descripcion.getText().toString());
                objClinica.setDireccionPrincipal(direccionPrincipal.getText().toString());
                objClinica.setNumeroTelefonico(numeroTelefono.getText().toString());
                objClinica.setUserId("1");

                helper.mapper.save(objClinica);
                Intent signInIntent = new Intent(RegisterClinicActivity.this, AdminProfileActivity.class);
                startActivity(signInIntent);

            }
        });



    }
}