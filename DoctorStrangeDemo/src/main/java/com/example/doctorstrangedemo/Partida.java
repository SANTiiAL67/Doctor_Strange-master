package com.example.doctorstrangedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partida {
    private Escenario escenario;
    Scanner teclado = new Scanner(System.in);

    Superheroe superheroe;
    ArrayList<Superheroe> superheroes;
    private int num_monedas_jugador;

    // Seleccion del escenario, creación del jugador con limitaciones del escenario y monedas
    public void seleccion_escenario(Jugador jugador1, Jugador jugador2) {
        System.out.println("Selecciona el escenario");
        System.out.println("1. Sanctum Sanctorum");
        System.out.println("   maximo de miembros por jugador 3");
        System.out.println("");
        System.out.println("2. Stark Tower");
        System.out.println("   maximo de miembros por jugador 5");
        System.out.println("");
        System.out.println("3. Massachusetts Academy");
        System.out.println("   maximo de miembros por jugador 7");
        System.out.println("");
        int opcion = this.teclado.nextInt();

        switch (opcion) {
            case 1:
                escenario = new Escenario("Sanctum Sanctorum");
                System.out.println(escenario.getNombreEscenario());
                int monedasEscenario1 = escenario.getEscenarioAtributosList().get(0);
                jugador1.setNum_monedas_jugador(monedasEscenario1);
                jugador2.setNum_monedas_jugador(monedasEscenario1);
                jugador1.setEscenario(escenario);
                jugador2.setEscenario(escenario);
                jugador1.setAlias_jugador("Jugador 1");
                jugador2.setAlias_jugador("Jugador 2");
                break;
            case 2:
                escenario = new Escenario("Stark Tower");
                System.out.println(escenario.getNombreEscenario());
                int monedasEscenario2 = escenario.getEscenarioAtributosList().get(0);
                jugador1.setNum_monedas_jugador(monedasEscenario2);
                jugador2.setNum_monedas_jugador(monedasEscenario2);
                jugador1.setEscenario(escenario);
                jugador2.setEscenario(escenario);
                jugador1.setAlias_jugador("Jugador 1");
                jugador2.setAlias_jugador("Jugador 2");
                break;
            case 3:
                escenario = new Escenario("Massachusetts Academy");
                System.out.println(escenario.getNombreEscenario());
                int monedasEscenario3 = escenario.getEscenarioAtributosList().get(0);
                jugador1.setNum_monedas_jugador(monedasEscenario3);
                jugador2.setNum_monedas_jugador(monedasEscenario3);
                jugador1.setEscenario(escenario);
                jugador2.setEscenario(escenario);
                jugador1.setAlias_jugador("Jugador 1");
                jugador2.setAlias_jugador("Jugador 2");
        }
    }

    public void crearEquipos(Jugador jugador1, Jugador jugador2) {
        jugador1.setEquipo(crear_equipo(jugador1));
        jugador2.setEquipo(crear_equipo(jugador2));
    }


    public Equipo crear_equipo(Jugador jugador1) {
        int opcion = 0;
        Equipo equipo1 = new Equipo();
        System.out.println(jugador1.getAlias_jugador());
        System.out.println("Tienes " + jugador1.getNum_monedas_jugador() + " monedas");
        System.out.println("1. Doctor Strange");
        System.out.println("2. Thor");
        System.out.println("3. Spiderman");
        System.out.println("4. DeadPool");
        System.out.println("5. Iron Man");
        System.out.println("6. Wolverine");
        System.out.println("7. Hulk");
        System.out.println("8. The Punisher");
        System.out.println("9. Black Panther");
        System.out.println("10. Capitán América");

        do {
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1 -> {
                    superheroe = new Superheroe("Doctor Strange", escenario);
                    System.out.println("Doctor Strange coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        System.out.println("Superheroe agregado correctamente");
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 2 -> {
                    superheroe = new Superheroe("Thor", escenario);
                    System.out.println("Thor coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 3 -> {
                    superheroe = new Superheroe("Spiderman", escenario);
                    System.out.println("Spiderman coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 4 -> {
                    superheroe = new Superheroe("Deadpool", escenario);
                    System.out.println("Deadpool coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 5 -> {
                    superheroe = new Superheroe("Iron Man", escenario);
                    System.out.println("Iron Man coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 6 -> {
                    superheroe = new Superheroe("Wolverine", escenario);
                    System.out.println("Wolverine coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 7 -> {
                    superheroe = new Superheroe("Hulk", escenario);
                    System.out.println("Hulk coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 8 -> {
                    superheroe = new Superheroe("The Punisher", escenario);
                    System.out.println("The Punisher coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 9 -> {
                    superheroe = new Superheroe("Black Panter", escenario);
                    System.out.println("Black Panter coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 10 -> {
                    superheroe = new Superheroe("Capitan América", escenario);
                    System.out.println("Capitan América coste: " + superheroe.getCoste());
                    if (jugador1.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        equipo1.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador1.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador1.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador1.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                default -> {
                }
            }
        } while (equipo1.getNumSuperheroes() < escenario.getEscenarioAtributosList().get(1));
        System.out.println("");
        System.out.println(jugador1.getAlias_jugador() + " tu equipo es: ");
        equipo1.mostrarEquipo();
        System.out.println("");
        return equipo1;
    }

  /*  public void crear_equipo2() {
        int opcion = 0;
        superheroes = new ArrayList<>();
        equipo2 = new Equipo();
        jugador2 = new Jugador(escenario, equipo2);
        System.out.println("Jugador 2");
        System.out.println("Tienes " + jugador2.getNum_monedas_jugador() + " monedas");
        System.out.println("1. Doctor Strange");
        System.out.println("2. Thor");
        System.out.println("3. Spiderman");
        System.out.println("4. DeadPool");
        System.out.println("5. Iron Man");
        System.out.println("6. Wolverine");
        System.out.println("7. Hulk");
        System.out.println("8. The Punisher");
        System.out.println("9. Black Panther");
        System.out.println("10. Capitán América");

        do {
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1 -> {
                    superheroe = new Superheroe("Doctor Strange", escenario);
                    System.out.println("Doctor Strange coste: " + superheroe.getCoste());
                    if (jugador2.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        superheroes.add(superheroe);
                        equipo2.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador2.getNum_monedas_jugador() - superheroe.getCoste();
                        System.out.println("Superheroe agregado correctamente");
                        jugador2.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("el numero de monedas restantes es de: " + jugador2.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 2 -> {
                    superheroe = new Superheroe("Thor", escenario);
                    System.out.println("Thor coste: " + superheroe.getCoste());
                    if (jugador2.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        superheroes.add(superheroe);
                        equipo2.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador2.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador2.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador2.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 3 -> {
                    superheroe = new Superheroe("Spiderman", escenario);
                    System.out.println("Spiderman coste: " + superheroe.getCoste());
                    if (jugador2.getNum_monedas_jugador() >= superheroe.getCoste()) {
                        superheroes.add(superheroe);
                        equipo2.añadirSuperheroe(superheroe);
                        num_monedas_jugador = jugador2.getNum_monedas_jugador() - superheroe.getCoste();
                        jugador2.setNum_monedas_jugador(num_monedas_jugador);
                        System.out.println("Superheroe agregado correctamente");
                        System.out.println("el numero de monedas restantes es de: " + jugador2.getNum_monedas_jugador());
                    } else {
                        System.out.println("Monedas insuficientes");
                    }
                }
                case 4 -> {
                    superheroe = new Superheroe("Deadpool", escenario);
                    System.out.println("Deadpool coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo2.añadirSuperheroe(superheroe);
                }
                case 5 -> {
                    superheroe = new Superheroe("Iron Man", escenario);
                    System.out.println("Iron Man coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo2.añadirSuperheroe(superheroe);
                }
                case 6 -> {
                    superheroe = new Superheroe("Wolverine", escenario);
                    System.out.println("Wolverine coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo2.añadirSuperheroe(superheroe);
                }
                case 7 -> {
                    superheroe = new Superheroe("Hulk", escenario);
                    System.out.println("Hulk coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo2.añadirSuperheroe(superheroe);
                }
                case 8 -> {
                    superheroe = new Superheroe("The Punisher", escenario);
                    System.out.println("The Punisher coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo2.añadirSuperheroe(superheroe);
                }
                case 9 -> {
                    superheroe = new Superheroe("Black Panter", escenario);
                    System.out.println("Black Panter coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo2.añadirSuperheroe(superheroe);
                }
                case 10 -> {
                    superheroe = new Superheroe("Capitan América", escenario);
                    System.out.println("Capitan América coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo2.añadirSuperheroe(superheroe);
                }
                default -> {
                }
            }
        }

        while (superheroes.size() < escenario.getEscenarioAtributosList().get(1));
        System.out.println("");
        System.out.println("Jugador 2 tu equipo es: ");
        System.out.println("");
    }*/

    public void combate(Jugador jugador1, Jugador jugador2) {


        String ataqueSeleccionado = null;
        String defensaSeleccionada = null;
        Superheroe aux = new Superheroe();
        Superheroe aux2 = new Superheroe();
        int opcion = 0;
        int opcion1 = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        Double energia1, energia2, energialucha1, energialucha2;


        System.out.println("Ataca: " + jugador1.getAlias_jugador());
        System.out.println("Con cual personaje desea atacar en su turno?");
        for (int i = 0; i < jugador1.getEquipo().getNumSuperheroes(); i++) {
            System.out.println(i + 1 + ". " + jugador1.getEquipo().getListaSuperheroe().get(i).getAliasSuperheroe());
        }
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                aux = jugador1.getEquipo().getListaSuperheroe().get(0);

                System.out.println("Ha seleccionado a " + aux.getAliasSuperheroe());
                System.out.println("");

                System.out.println("Su lista de movimientos es: ");
                System.out.println("Ataque: " + aux.getMovimientos().get(0) + " | " + aux.getMovimientos().get(1));
                System.out.println("Defensa: " + aux.getMovimientos().get(2) + " | " + aux.getMovimientos().get(3));
                System.out.println("");
                // ENTRANDO EN EL MENU DE ATAQUE
                System.out.println("Que ataque desea realizar? ");
                System.out.println("1. " + aux.getMovimientos().get(0));
                System.out.println("2. " + aux.getMovimientos().get(1));
                System.out.println("3. " + aux.getMovimientos().get(2));
                System.out.println("4. " + aux.getMovimientos().get(3));
                opcion1 = teclado.nextInt();

                ataqueSeleccionado = aux.getMovimientos().get(opcion1 - 1);

                System.out.println("Selecciona al personaje que quiere atacar:");
                for (int i = 0; i < jugador2.getEquipo().getNumSuperheroes(); i++) {
                    System.out.println(i + 1 + ". " + jugador2.getEquipo().getListaSuperheroe().get(i).getAliasSuperheroe());
                }
                opcion2 = teclado.nextInt();
                switch (opcion2) {
                    case 1:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(0);
                        System.out.println("");
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                    case 2:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(1);
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                    case 3:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(2);
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                }
                break;
            case 2:
                aux = jugador1.getEquipo().getListaSuperheroe().get(1);

                System.out.println("Ha seleccionado a " + aux.getAliasSuperheroe());
                System.out.println("");

                System.out.println("Su lista de movimientos es: ");
                System.out.println("Ataque: " + aux.getMovimientos().get(0) + " | " + aux.getMovimientos().get(1));
                System.out.println("Defensa: " + aux.getMovimientos().get(2) + " | " + aux.getMovimientos().get(3));
                System.out.println("");
                // ENTRANDO EN EL MENU DE ATAQUE
                System.out.println("Que ataque desea realizar? ");
                System.out.println("1. " + aux.getMovimientos().get(0));
                System.out.println("2. " + aux.getMovimientos().get(1));
                System.out.println("3. " + aux.getMovimientos().get(2));
                System.out.println("4. " + aux.getMovimientos().get(3));
                opcion1 = teclado.nextInt();

                ataqueSeleccionado = aux.getMovimientos().get(opcion1 - 1);

                System.out.println("Selecciona al personaje que quiere atacar:");
                for (int i = 0; i < jugador2.getEquipo().getNumSuperheroes(); i++) {
                    System.out.println(i + 1 + ". " + jugador2.getEquipo().getListaSuperheroe().get(i).getAliasSuperheroe());
                }
                opcion2 = teclado.nextInt();
                switch (opcion2) {
                    case 1:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(0);
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                    case 2:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(1);
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                    case 3:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(2);
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                }
                break;
            case 3:
                aux = jugador1.getEquipo().getListaSuperheroe().get(2);

                System.out.println("Ha seleccionado a " + aux.getAliasSuperheroe());
                System.out.println("");
                System.out.println("Su lista de movimientos es: ");
                System.out.println("Ataque: " + aux.getMovimientos().get(0) + " | " + aux.getMovimientos().get(1));
                System.out.println("Defensa: " + aux.getMovimientos().get(2) + " | " + aux.getMovimientos().get(3));
                System.out.println("");
                // ENTRANDO EN EL MENU DE ATAQUE
                System.out.println("Que ataque desea realizar? ");
                System.out.println("1. " + aux.getMovimientos().get(0));
                System.out.println("2. " + aux.getMovimientos().get(1));
                System.out.println("3. " + aux.getMovimientos().get(2));
                System.out.println("4. " + aux.getMovimientos().get(3));
                opcion1 = teclado.nextInt();

                ataqueSeleccionado = aux.getMovimientos().get(opcion1 - 1);

                System.out.println("Selecciona al personaje que quiere atacar:");
                for (int i = 0; i < jugador2.getEquipo().getNumSuperheroes(); i++) {
                    System.out.println(i + 1 + ". " + jugador2.getEquipo().getListaSuperheroe().get(i).getAliasSuperheroe());
                }
                opcion2 = teclado.nextInt();
                switch (opcion2) {
                    case 1:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(0);
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                    case 2:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(1);
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                    case 3:
                        aux2 = jugador2.getEquipo().getListaSuperheroe().get(2);
                        System.out.println(jugador2.getAlias_jugador());
                        System.out.println("Su lista de movimientos es: ");
                        System.out.println("Ataque: " + aux2.getMovimientos().get(0) + " | " + aux2.getMovimientos().get(1));
                        System.out.println("Defensa: " + aux2.getMovimientos().get(2) + " | " + aux2.getMovimientos().get(3));
                        System.out.println("");
                        System.out.println("¿Qué movimiento desea realizar? ");
                        System.out.println("1. " + aux2.getMovimientos().get(0));
                        System.out.println("2. " + aux2.getMovimientos().get(1));
                        System.out.println("3. " + aux2.getMovimientos().get(2));
                        System.out.println("4. " + aux2.getMovimientos().get(3));
                        opcion3 = teclado.nextInt();
                        defensaSeleccionada = aux2.getMovimientos().get(opcion3 - 1);
                        break;
                }
                break;
        }
        ArrayList<Integer> parrilla1 = aux.getParrillaPoderes();
        ArrayList<Integer> parrilla2 = aux2.getParrillaPoderes();

        energialucha1 = jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).getEnergiaLucha();
        energialucha2 = jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).getEnergiaLucha();

        if (opcion1 < 3) {
            if (opcion3 < 3) {
                // Ambos jugadores atacan

                energia1 = 0.8 * parrilla1.get(4) + 0.25 * parrilla1.get(3) + 0.75 * parrilla1.get(0) + parrilla1.get(1);
                energia2 = 0.8 * parrilla2.get(4) + 0.25 * parrilla2.get(3) + 0.75 * parrilla2.get(0) + parrilla2.get(1);


                // Comprobación de energía de lucha y seteación de energía
                if (energialucha1 > energia1) {
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaLucha(energialucha1 - energia1);
                } else {
                    energia1 = energialucha1;
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaLucha(0.0);
                }
                if (energialucha2 > energia2) {
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaLucha(energialucha2 - energia2);
                } else {
                    energia2 = energialucha2;
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaLucha(0.0);
                }

                // Comparación de energías
                if (energia1 >= energia2) {
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaVital(jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).getEnergiaVital() - energia1 + energia2);
                    jugador1.setNum_monedas_jugador(jugador1.getNum_monedas_jugador() + (int) (0.1 * jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).getRecompensa()));
                } else {
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaVital(jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).getEnergiaVital() - energia2 + energia1);
                    jugador2.setNum_monedas_jugador(jugador2.getNum_monedas_jugador() + (int) (0.1 * jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).getRecompensa()));
                }
            } else {
                //Jugador 1 ataca y jugador 2 defiende
                energia1 = 0.8 * parrilla1.get(4) + 0.25 * parrilla1.get(3) + 0.75 * parrilla1.get(0) + parrilla1.get(1);
                energia2 = parrilla2.get(5) + 0.75 * parrilla2.get(3) + 0.25 * parrilla2.get(0) + 0.2 * parrilla2.get(4);


                // Comprobación de energía de lucha y seteación de energía
                if (energialucha1 > energia1) {
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaLucha(energialucha1 - energia1);
                } else {
                    energia1 = energialucha1;
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaLucha(0.0);
                }
                if (energialucha2 > energia2) {
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaLucha(energialucha2 - energia2);
                } else {
                    energia2 = energialucha2;
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaLucha(0.0);
                }

                // Comparación de energías
                if (energia1 >= energia2) {
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaVital(jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).getEnergiaVital() - energia1 + energia2);
                } else {
                    jugador2.setNum_monedas_jugador(jugador2.getNum_monedas_jugador() + (int) (0.2 * jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).getRecompensa()));
                }
            }
        } else {
            if (opcion3 < 3) {
                // Jugador 1 defiende y jugador 2 ataca

                energia2 = 0.8 * parrilla2.get(4) + 0.25 * parrilla2.get(3) + 0.75 * parrilla2.get(0) + parrilla2.get(1);
                energia1 = parrilla1.get(5) + 0.75 * parrilla1.get(3) + 0.25 * parrilla1.get(0) + 0.2 * parrilla1.get(4);


                // Comprobación de energía de lucha y seteación de energía
                if (energialucha1 > energia1) {
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaLucha(energialucha1 - energia1);
                } else {
                    energia1 = energialucha1;
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaLucha(0.0);
                }
                if (energialucha2 > energia2) {
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaLucha(energialucha2 - energia2);
                } else {
                    energia2 = energialucha2;
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaLucha(0.0);
                }

                // Comparación de energías
                if (energia1 >= energia2) {
                    jugador1.setNum_monedas_jugador(jugador1.getNum_monedas_jugador() + (int) (0.2 * jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).getRecompensa()));
                } else {
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaVital(jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).getEnergiaVital() - energia2 + energia1);
                    jugador2.setNum_monedas_jugador(jugador2.getNum_monedas_jugador() + (int) (0.1 * jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).getRecompensa()));
                }
            } else {
                //Ambos defienden
                energia1 = parrilla1.get(5) + 0.75 * parrilla1.get(3) + 0.25 * parrilla1.get(0) + 0.2 * parrilla1.get(4);
                energia2 = parrilla2.get(5) + 0.75 * parrilla2.get(3) + 0.25 * parrilla2.get(0) + 0.2 * parrilla2.get(4);


                // Comprobación de energía de lucha y seteación de energía
                if (energialucha1 > energia1) {
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaLucha(energialucha1 - energia1);
                } else {
                    energia1 = energialucha1;
                    jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).setEnergiaLucha(0.0);
                }
                if (energialucha2 > energia2) {
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaLucha(energialucha2 - energia2);
                } else {
                    energia2 = energialucha2;
                    jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).setEnergiaLucha(0.0);
                }

                // Comparación de energías
                if (energia1 >= energia2) {
                    jugador1.setNum_monedas_jugador(jugador1.getNum_monedas_jugador() + (int) (0.2 * jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).getRecompensa()));
                } else {
                    jugador2.setNum_monedas_jugador(jugador2.getNum_monedas_jugador() + (int) (0.2 * jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).getRecompensa()));
                }
            }
        }

        if (jugador1.getEquipo().getListaSuperheroe().get(opcion - 1).getEnergiaVital() <= 0) {
            jugador2.setNum_monedas_jugador(jugador2.getNum_monedas_jugador() +  jugador1.getEquipo().getListaSuperheroe().get(opcion-1).getRecompensa());
            jugador1.getEquipo().getListaSuperheroe().remove(opcion - 1);
        }
        if (jugador2.getEquipo().getListaSuperheroe().get(opcion2 - 1).getEnergiaVital() <= 0) {
            jugador1.setNum_monedas_jugador(jugador1.getNum_monedas_jugador() +  jugador2.getEquipo().getListaSuperheroe().get(opcion-2).getRecompensa());
            jugador2.getEquipo().getListaSuperheroe().remove(opcion2 - 1);
        }

    }


    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

}
