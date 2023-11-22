package com.mobmasterp.sgeventos2617684.Interfaces;

import com.mobmasterp.sgeventos2617684.Modelos.Autenticacion.AutenticacionLoginModel;
import com.mobmasterp.sgeventos2617684.Modelos.Autenticacion.AutenticacionLoginResModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AutenticacionAPI {
    @POST("auth/login")
    Call<AutenticacionLoginResModel> postLogin(@Body AutenticacionLoginModel credenciales);
}
