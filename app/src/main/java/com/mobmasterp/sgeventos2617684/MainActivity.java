package com.mobmasterp.sgeventos2617684;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.mobmasterp.sgeventos2617684.Interfaces.AutenticacionAPI;
import com.mobmasterp.sgeventos2617684.Modelos.Autenticacion.AutenticacionLoginModel;
import com.mobmasterp.sgeventos2617684.Modelos.Autenticacion.AutenticacionLoginResModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    EditText eTuser, eTpass;
    CheckBox chbGuardar;
    Button btnLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTuser = (EditText)findViewById(R.id.eTuser);
        eTpass = (EditText)findViewById(R.id.eTpass);
        chbGuardar = (CheckBox)findViewById(R.id.chbGuardar);
        btnLog = (Button)findViewById(R.id.btnLog);

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = eTuser.getText().toString();
                String password = eTpass.getText().toString();
                if(!correo.isEmpty() && !password.isEmpty()){
                    // realizar la peticion
                    AutenticacionAPI autenticacionAPI = new ClienteAPI().getClient().create(AutenticacionAPI.class);
                    AutenticacionLoginModel loginModel = new AutenticacionLoginModel();
                    loginModel.setCorreo(correo);
                    loginModel.setPassword(password);
                    Call<AutenticacionLoginResModel> resModelCall = autenticacionAPI.postLogin(loginModel);
                    resModelCall.enqueue(new Callback<AutenticacionLoginResModel>() {
                        @Override
                        public void onResponse(Call<AutenticacionLoginResModel> call, Response<AutenticacionLoginResModel> response) {
                            if(response.isSuccessful()){
                                // Logica para Login aceptado
                                Log.i("PRUEBA", "Respuesta: " + response.body().getNombre());
                                startActivity(new Intent(MainActivity.this, Principal.class));
                            }else{
                                Log.i("PRUEBA", "ERROR ::: " + response.errorBody().source());
                            }
                        }

                        @Override
                        public void onFailure(Call<AutenticacionLoginResModel> call, Throwable t) {
                            Log.i("PRUEBA", "ERROR : " + t.getMessage());
                        }
                    });
                }else{
                    Toast.makeText(MainActivity.this, "ERROR: Los campos son obligatorios", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}