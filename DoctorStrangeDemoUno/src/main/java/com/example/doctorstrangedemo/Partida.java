package com.example.doctorstrangedemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {
    private Escenario escenario;
    Scanner teclado = new Scanner(System.in);
    Jugador jugador1;
    Jugador jugador2;
    Equipo equipo1;
    Equipo equipo2;
    Superheroe superheroe;
    ArrayList<Superheroe> superheroes;
    private int num_monedas_jugador;

    public void seleccion_escenario() {
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
                jugador1 = new Jugador(escenario, equipo1);
                jugador2 = new Jugador(escenario, equipo2);
                System.out.println(escenario.getNombreEscenario());
                int monedasEscenario1 = escenario.getEscenarioAtributosList().get(0);
                jugador1.setNum_monedas_jugador(monedasEscenario1);
                jugador2.setNum_monedas_jugador(monedasEscenario1);
                break;
            case 2:
                escenario = new Escenario("Stark Tower");
                jugador1 = new Jugador(escenario, equipo1);
                jugador2 = new Jugador(escenario, equipo2);
                System.out.println(escenario.getNombreEscenario());
                int monedasEscenario2 = escenario.getEscenarioAtributosList().get(0);
                jugador1.setNum_monedas_jugador(monedasEscenario2);
                jugador2.setNum_monedas_jugador(monedasEscenario2);
                break;
            case 3:
                escenario = new Escenario("Massachusetts Academy");
                jugador1 = new Jugador(escenario, equipo1);
                jugador2 = new Jugador(escenario, equipo2);
                System.out.println(escenario.getNombreEscenario());
                int monedasEscenario3 = escenario.getEscenarioAtributosList().get(0);
                jugador1.setNum_monedas_jugador(monedasEscenario3);
                jugador2.setNum_monedas_jugador(monedasEscenario3);
        }
    }

    public void crear_equipo1() {
        int opcion = 0;
        superheroes = new ArrayList<>();
        equipo1 = new Equipo();
        jugador1 = new Jugador(escenario, equipo1);
        System.out.println("Jugador 1");
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
                        superheroes.add(superheroe);
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
                        superheroes.add(superheroe);
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
                        superheroes.add(superheroe);
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
                    superheroes.add(superheroe);
                    equipo1.añadirSuperheroe(superheroe);
                }
                case 5 -> {
                    superheroe = new Superheroe("Iron Man", escenario);
                    System.out.println("Iron Man coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo1.añadirSuperheroe(superheroe);
                }
                case 6 -> {
                    superheroe = new Superheroe("Wolverine", escenario);
                    System.out.println("Wolverine coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo1.añadirSuperheroe(superheroe);
                }
                case 7 -> {
                    superheroe = new Superheroe("Hulk", escenario);
                    System.out.println("Hulk coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo1.añadirSuperheroe(superheroe);
                }
                case 8 -> {
                    superheroe = new Superheroe("The Punisher", escenario);
                    System.out.println("The Punisher coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo1.añadirSuperheroe(superheroe);
                }
                case 9 -> {
                    superheroe = new Superheroe("Black Panter", escenario);
                    System.out.println("Black Panter coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo1.añadirSuperheroe(superheroe);
                }
                case 10 -> {
                    superheroe = new Superheroe("Capitan América", escenario);
                    System.out.println("Capitan América coste: " + superheroe.getCoste());
                    superheroes.add(superheroe);
                    equipo1.añadirSuperheroe(superheroe);
                }
                default -> {
                }
            }
        }

        while (superheroes.size() < escenario.getEscenarioAtributosList().get(1));
        System.out.println("");
        System.out.println("Jugador 1 tu equipo es: ");
        equipo1.mostrarEquipo();
        System.out.println("");
    }

    public void crear_equipo2() {
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
    }


    public void combate() {
        System.out.println("Jugador 1");
        equipo1.mostrarEquipo();
        System.out.println();
        System.out.println("Jugador 2");
        equipo2.mostrarEquipo();
        System.out.println();
        int ataque = 0;
        int defensa = 0;

        //JUGADOR 1

        String jugador1SuperheroeUnoNombre = jugador1.getEquipo().getListaSuperheroe().get(0).getAliasSuperheroe();
        String jugador1SuperheroeDosNombre = jugador1.getEquipo().getListaSuperheroe().get(1).getAliasSuperheroe();
        String jugador1SuperheroeTresNombre = jugador1.getEquipo().getListaSuperheroe().get(2).getAliasSuperheroe();
        int proyeccionDeEnergia =jugador1.getEquipo().getListaSuperheroe().get(0).getParrillaPoderes().get(0);
        int energiaInicial = jugador1.getEquipo().getListaSuperheroe().get(0).getEnergiaInicial();

        String jugador1Superheroe1Ataque1 = jugador1.getEquipo().getListaSuperheroe().get(0).getMovimientos().get(0);
        String jugador1Superheroe1Ataque2 = jugador1.getEquipo().getListaSuperheroe().get(0).getMovimientos().get(1);
        String jugador1Superheroe1Def1 = jugador1.getEquipo().getListaSuperheroe().get(0).getMovimientos().get(2);
        String jugador1Superheroe1Def2 = jugador1.getEquipo().getListaSuperheroe().get(0).getMovimientos().get(3);



        //JUGADOR 2
        String jugador2superheroeUnoNombre = jugador2.getEquipo().getListaSuperheroe().get(0).getAliasSuperheroe();
        String jugador2superheroeDosNombre = jugador2.getEquipo().getListaSuperheroe().get(1).getAliasSuperheroe();
        String jugador2superheroeTresNombre = jugador2.getEquipo().getListaSuperheroe().get(2).getAliasSuperheroe();

        String jugador2superheroe1Ataque1 = jugador2.getEquipo().getListaSuperheroe().get(0).getMovimientos().get(0);
        String jugador2superheroe1Ataque2 = jugador2.getEquipo().getListaSuperheroe().get(0).getMovimientos().get(1);
        String jugador2superheroe1Def1 = jugador2.getEquipo().getListaSuperheroe().get(0).getMovimientos().get(2);
        String jugador2superheroe1Def2 = jugador2.getEquipo().getListaSuperheroe().get(0).getMovimientos().get(3);


        int opcion = 0;
        System.out.println("Campo de batalla");
        System.out.println("Empieza el jugador 1");
        System.out.println("Con cual personaje desea atacar en su primer turno?");
        System.out.println("1. " + jugador1SuperheroeUnoNombre);
        System.out.println("2. " + jugador1SuperheroeDosNombre);
        System.out.println("3. " + jugador1SuperheroeTresNombre);
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado a " + jugador1SuperheroeUnoNombre);
                System.out.println("JUGADOR 1: " + jugador1SuperheroeUnoNombre + " vs " + jugador2superheroeUnoNombre + " : JUGADOR 2");
                System.out.println("");

                System.out.println("su lista de movimientos es: ");
                System.out.println("Ataque: " + jugador1Superheroe1Ataque1 + " | " + jugador1Superheroe1Ataque2);
                System.out.println("Defensa: " + jugador1Superheroe1Def1 + " | " + jugador1Superheroe1Def2);
                System.out.println("");
// ENTRANDO EN EL MENU DE ATAQUE
                int opcion1 = 0;
                System.out.println("Que ataque desea realizar? ");
                System.out.println("1. " + jugador1Superheroe1Ataque1);
                System.out.println("2. " + jugador1Superheroe1Ataque2);
                System.out.println("3. " + jugador1Superheroe1Def1);
                System.out.println("4. " + jugador1Superheroe1Def2);

                opcion1 = teclado.nextInt();

                switch (opcion1) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }

// SALIENDO DEL MENU DE ATAQUE

            case 2:
                System.out.println("Ha seleccionado a " + jugador1SuperheroeDosNombre);
                break;
            case 3:
                System.out.println("Ha seleccionado a" + jugador1SuperheroeTresNombre);
                break;
        }

    }


    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
}
