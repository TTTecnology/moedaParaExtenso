/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.moedaporextenso;

/**
 *
 * @author erona
 */
public class MoedaPorExtenso {

    public static void main(String[] args) {
        Moeda moeda = new Moeda(445,99);
        System.out.println(moeda.getFracionario());
        System.out.println(moeda.getInteiro());
    }
}
