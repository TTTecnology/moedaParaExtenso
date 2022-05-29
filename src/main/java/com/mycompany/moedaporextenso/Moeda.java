/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moedaporextenso;

/**
 *
 * @author erona
 */
public class Moeda {
    private int inteiro;
    private int fracionario;
    
    Moeda(int i, int f){
        this.setInteiro(i);
        this.setFracionario(f);
    }

    public String getInteiro() {
        return porExtenso(this.inteiro);
    }

    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

    public String getFracionario() {
        return porExtenso(this.fracionario);
    }

    public void setFracionario(int fracionario) {
        if(fracionario > 99) throw new Error("Forbidden Value");
        this.fracionario = fracionario;
    }
    
    private String porExtenso(int arg){
        String[] int2StringArr = String.valueOf(arg).split("");
        String[] reversedArr = new String[int2StringArr.length];
        String[] convertedValue = new String[int2StringArr.length];
        
        String[] valoresExtensos = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] entre10e20extenso = {"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenasExtensas = {"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] centenasExtensas = {"cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
        String[] outros = {"cento"};
        
        for(int i = 0; i < reversedArr.length;i++){
            reversedArr[reversedArr.length-i-1] = int2StringArr[i] ;
        }
                
        for(int i = 0; i < reversedArr.length; i++){
            switch(i){
                case 0:
                    if (reversedArr.length > 1 && Integer.parseInt(reversedArr[1]) == 1){
                        convertedValue[i] = entre10e20extenso[Integer.parseInt(reversedArr[i])-1];
                        i++;
                        break;
                    }
                    convertedValue[i] = valoresExtensos[Integer.parseInt(reversedArr[i])];
                    break;
                case 1:
                    convertedValue[i] = dezenasExtensas[Integer.parseInt(reversedArr[i])-1];
                    break;
                case 2:
                    if (Integer.parseInt(reversedArr[i]) == 1) {
                        convertedValue[i] = outros[0];
                        break;
                    }
                    convertedValue[i] = centenasExtensas[Integer.parseInt(reversedArr[i])-1];
                    break;
            }
        }
        
        String[] deversedValue = new String[convertedValue.length];
        
        for(int i = 0; i < deversedValue.length;i++){
            deversedValue[deversedValue.length-i-1] = convertedValue[i];
        }
                        
        String b4Output = String.join(" e ", deversedValue).replace("null e ", "");
        return b4Output;
    }
    
    public String getValorCompleto(){
        return null;
    }
}
