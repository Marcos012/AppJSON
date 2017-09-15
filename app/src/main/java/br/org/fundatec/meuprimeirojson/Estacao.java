package br.org.fundatec.meuprimeirojson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Estacao {

@SerializedName("id")
@Expose
public Integer id;
@SerializedName("data")
@Expose
public String data;
@SerializedName("endereco")
@Expose
public String endereco;
@SerializedName("bairro")
@Expose
public String bairro;
@SerializedName("temperaturaInterna")
@Expose
public Float temperaturaInterna;
@SerializedName("umidadeInterna")
@Expose
public Integer umidadeInterna;
@SerializedName("temperaturaExterna")
@Expose
public Float temperaturaExterna;
@SerializedName("umidadeExterna")
@Expose
public Integer umidadeExterna;
@SerializedName("chuvaDiaria")
@Expose
public Float chuvaDiaria;
@SerializedName("pressao")
@Expose
public Float pressao;
@SerializedName("velocidadeVento")
@Expose
public Object velocidadeVento;
@SerializedName("direcaoVento")
@Expose
public Object direcaoVento;
@SerializedName("velocidadeVentoRajada")
@Expose
public Object velocidadeVentoRajada;
@SerializedName("direcaoVentoRajada")
@Expose
public Object direcaoVentoRajada;
@SerializedName("quadranteVento")
@Expose
public String quadranteVento;
@SerializedName("sensacaoTermica")
@Expose
public Object sensacaoTermica;
@SerializedName("pontoOrvalho")
@Expose
public Float pontoOrvalho;
@SerializedName("alturaNuvens")
@Expose
public Object alturaNuvens;
@SerializedName("estacao")
@Expose
public String estacao;
@SerializedName("idRessonare")
@Expose
public Integer idRessonare;
@SerializedName("latitude")
@Expose
public Float latitude;
@SerializedName("longitude")
@Expose
public Float longitude;
@SerializedName("iconePrevisao")
@Expose
public String iconePrevisao;
@SerializedName("temperaturaMinimaPrevisao")
@Expose
public Float temperaturaMinimaPrevisao;
@SerializedName("temperaturaMaximaPrevisao")
@Expose
public Float temperaturaMaximaPrevisao;

}
