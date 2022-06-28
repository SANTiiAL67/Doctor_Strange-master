package com.example.doctorstrangedemo;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
      Partida p = new Partida();
      Jugador jugador1 = new Jugador();
      Jugador jugador2 = new Jugador();
      p.seleccion_escenario(jugador1, jugador2);
      p.crearEquipos(jugador1, jugador2);
        System.out.println("Jugador 1");
        jugador1.getEquipo().mostrarEquipo();
        System.out.println();
        System.out.println("Jugador 2");
        jugador2.getEquipo().mostrarEquipo();
        System.out.println();
        System.out.println("Campo de batalla");
      do {
          System.out.println("Monedas jugador1: " + jugador1.getNum_monedas_jugador());
          System.out.println("Monedas jugador2: " + jugador2.getNum_monedas_jugador());
          System.out.println("Jugador 1 superheroes");
          for (int i = 0; i < jugador1.getEquipo().getNumSuperheroes(); i++) {
              System.out.println(jugador1.getEquipo().getListaSuperheroe().get(i).getAliasSuperheroe());
              System.out.println(jugador1.getEquipo().getListaSuperheroe().get(i).getEnergiaVital());
              System.out.println(jugador1.getEquipo().getListaSuperheroe().get(i).getEnergiaLucha());
              System.out.println("");
          }
          System.out.println("Jugador 2 superheroes");
          for (int i = 0; i < jugador2.getEquipo().getNumSuperheroes(); i++) {
              System.out.println(jugador2.getEquipo().getListaSuperheroe().get(i).getAliasSuperheroe());
              System.out.println(jugador2.getEquipo().getListaSuperheroe().get(i).getEnergiaVital());
              System.out.println(jugador2.getEquipo().getListaSuperheroe().get(i).getEnergiaLucha());
              System.out.println("");
          }
          p.combate(jugador1, jugador2);
          p.combate(jugador2, jugador1);
      } while (jugador1.getEquipo().getNumSuperheroes()>0 && jugador2.getEquipo().getNumSuperheroes()>0);

    }
}
