/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Random;

/**
 *
 * @author JDANIEL
 */
public class PrincipalController {

    public int determinaCantidadEmoji(String emoji, int usuarioRespuesta, String[][] m) {

        int contador = 0;

        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 4; c++) {

                if (m[f][c] == emoji) {

                    contador++;
                }
            }

        }

        return contador;
    }

    public void imprimeMatriz(String[][] matriz) {

        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 4; c++) {

                System.out.print(matriz[f][c]);

            }

            System.out.println("");
        }

    }

    public String[][] rellenarMatriz() {

        String[][] matriz = new String[4][4];

        String[] emojis = {"🎅", "🎁", "🎄", "⭐"};
        Random rd = new Random();

        for (int f = 0; f < 4; f++) {

            for (int c = 0; c < 4; c++) {

                matriz[f][c] = emojis[rd.nextInt(emojis.length)];

            }

        }

        return matriz;
    }
}
