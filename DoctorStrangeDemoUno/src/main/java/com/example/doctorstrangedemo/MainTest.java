package com.example.doctorstrangedemo;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
      Partida p = new Partida();
      p.seleccion_escenario();
      p.crear_equipo1();
      p.crear_equipo2();
      p.combate();
    }
}
