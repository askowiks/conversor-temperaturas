package com.santander.test;
import static javax.swing.JOptionPane.*;

//    Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em
//    Kelvin (K), Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:
//
//    F = (C * 1.8) + 32
//    K = C + 273.15
//    Re = C * 0.8
//    Ra = (C * 1.8) + 491
//
//    Considere a conversão de 18 ºC e a precisão de duas casas decimais

public class Main {

    public static void main(String[] args) {
        String tempInput = showInputDialog("Digite a temperatura em Celsius");

        float celsius = Float.parseFloat(tempInput);

        final float CONVERT_F = (float) ((celsius * 1.8) + 32);
        final float CONVERT_K = (float) (celsius + 273.15);
        final float CONVERT_RE = (float) (celsius * 0.8);
        final float CONVERT_RA = (float) ((celsius *1.8) + 491);

       String mensagem = String.format("A conversão de %.2f °C: \nFahrenheit: %.2f.\nKelvin: %.2f.\nRéaumur: %.2f.\nRankine: %.2f.",
                celsius, CONVERT_F, CONVERT_K, CONVERT_RE, CONVERT_RA);
       showMessageDialog(null, mensagem);
    }
}
