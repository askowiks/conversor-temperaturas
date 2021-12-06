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

        float tempF = conversorF(celsius);
        float tempK = conversorK(celsius);
        float tempRe = conversorRe(celsius);
        float tempRa = conversorRa(celsius);

        String mensagem = String.format("A conversão de %.2f °C: \nFahrenheit: %.2f. \nKelvin: %.2f. \nRéaumur: %.2f. \nRankine: %.2f.",
                celsius, tempF, tempK, tempRe, tempRa);
       showMessageDialog(null, mensagem);
    }

    public static float conversorF(float celsius){

        float tempConvertidaF = (celsius * 1.8f) + 32;
        return tempConvertidaF;
    }

    public static float conversorK(float celsius){

        float tempConvertidaK = celsius + 273.15f;
        return tempConvertidaK;
    }

    public static float conversorRe(float celsius){

        float tempConvertidaRe = celsius * 0.8f;
        return tempConvertidaRe;
    }

    public static float conversorRa(float celsius){

        float tempConvertidaRa = (celsius *1.8f) + 491;
        return tempConvertidaRa;
    }

}
