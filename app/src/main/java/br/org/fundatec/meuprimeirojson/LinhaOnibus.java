package br.org.fundatec.meuprimeirojson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LinhaOnibus {

@SerializedName("id")
@Expose
public String id;
@SerializedName("codigo")
@Expose
public String codigo;
@SerializedName("nome")
@Expose
public String nome;

}