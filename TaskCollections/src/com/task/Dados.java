package com.task;

public class Dados {
private String nome;
private char sexo;



public Dados(String nome, char sexo) {
	this.nome = nome;
	this.sexo = sexo;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}

@Override
public String toString() {
	return "Nome: "+ this.getNome() + " sexo: "+ this.getSexo();
}
}
