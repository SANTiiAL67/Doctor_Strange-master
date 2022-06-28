package com.example.doctorstrangedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PersonajeController extends EscenarioController implements Initializable {
    private Parent root;
    private Scene scene;
    private Escenario escenario = new Escenario("Sanctum Sanctorum") ;

    private Superheroe doctor_strange = new Superheroe("Doctor Strange", this.escenario);
    private Superheroe thor = new Superheroe("Thor", this.escenario);
    private Superheroe spiderman = new Superheroe("Spiderman", this.escenario);
    private Superheroe deadpool = new Superheroe("Deadpool", this.escenario);
    private Superheroe iron_man = new Superheroe("Iron Man", this.escenario);
    private Superheroe daredevil = new Superheroe("Daredevil", this.escenario);
    private Superheroe hulk = new Superheroe("Hulk", this.escenario);
    private Superheroe the_punisher = new Superheroe("The Punisher", this.escenario);
    private Superheroe black_panther = new Superheroe("Black Panther", this.escenario);
    private Superheroe capitan_america = new Superheroe("Capitan America", this.escenario);


    private final int maxSuperheroes = 2;
    private Equipo equipo1 = new Equipo();
    private Equipo equipo2 = new Equipo();

    private final Jugador jugador1 = new Jugador(escenario,equipo1);
    private final Jugador jugador2 = new Jugador(escenario,equipo2);

    private int monedasJugador = jugador1.getNum_monedas_jugador();
    private int monedasJugador2 = jugador2.getNum_monedas_jugador();



    final Image docStrangeImg = new Image("assets/img/docStrange.png");
    final Image thorImg = new Image("assets/img/thor.png");
    final Image spiderImg = new Image("assets/img/spider.png");
    final Image punishImg = new Image("assets/img/punish.png");
    final Image ironImg = new Image("assets/img/iron.png");
    final Image deadpoolImg = new Image("assets/img/deadpool.png");
    final Image darImg = new Image("assets/img/darevil.png");
    final Image hulkImg = new Image("assets/img/hulk.png");
    final Image blackPantherImg = new Image("assets/img/bp.png");
    final Image capiImg = new Image("assets/img/capi.png");

    @FXML
    ComboBox<String> comboBoxPersonajes;

    @FXML
    private Pane statsPane;

    @FXML
    private Button btnEliminar1, btnEliminar2, btnSeleccion1, btnSeleccion2;

    @FXML
    private TextField inteliTxt, origenTxt, identidadSecretaTxt, proDeEnergTxt, resisTxt, veloTxt, vidaTxt, fuerzaTxt, afiliTxt, fieldCoste, habilidadLuchaTxt, fieldMonedasJugador;

    @FXML
    private ImageView imgPersonaje, imgTeam1Center, imgTeam1Left, imgTeam1Right, imgTeam2Center, imgTeam2Left, imgTeam2Right;

    @FXML
    private Label superheroeName, jugardorTxt,jugadorStats;


    private void mostrarAlertInfo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        if (equipo1.getNumSuperheroes() == 3 && equipo2.getNumSuperheroes() == 0) {
            alert.setTitle("Jugador 1");
            alert.setContentText("Equipo 1 creado");
            alert.showAndWait();
        }

        if (equipo2.getNumSuperheroes() == 3) {
            alert.setTitle("Jugador 2");
            alert.setContentText("Equipo 2 creado");
            alert.showAndWait();
        }
    }

    private void alertaPesonajes(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Jugador 1");
        alert.setContentText("Superheroe ya existente");
        alert.showAndWait();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        fieldMonedasJugador.setText(String.valueOf(monedasJugador));
        comboBoxPersonajes.getItems().addAll(doctor_strange.getAliasSuperheroe(), thor.getAliasSuperheroe(), spiderman.getAliasSuperheroe(), deadpool.getAliasSuperheroe(), iron_man.getAliasSuperheroe(), daredevil.getAliasSuperheroe(), the_punisher.getAliasSuperheroe(), black_panther.getAliasSuperheroe(), capitan_america.getAliasSuperheroe(), hulk.getAliasSuperheroe());
        comboBoxPersonajes.setOnAction(this::getSuperheroe);
    }

/*
    public void crearSuperheroe(Escenario escenario){
        this.escenario = escenario;
        if (escenario.getNombreEscenario().equals("Sanctum Sanctorum")){

            this.escenario = new Escenario("Sanctum Sanctorum");
            this.doctor_strange = new Superheroe("Doctor Strange",this.escenario);
            this.thor= new Superheroe("Thor",this.escenario);
            this.spiderman= new Superheroe("Spiderman",this.escenario);
            this.deadpool= new Superheroe("Deadpool",this.escenario);
            this.iron_man= new Superheroe("Iron Man",this.escenario);
            this.daredevil= new Superheroe("Daredevil",this.escenario);
            this.hulk= new Superheroe("Hulk",this.escenario);
            this.the_punisher= new Superheroe("The Punisher",this.escenario);
            this.black_panther= new Superheroe("Black Panther",this.escenario);
            this.capitan_america= new Superheroe("Capitan America",this.escenario);
        }else if (escenario.getNombreEscenario().equals("Stark Tower")){

            this.escenario = new Escenario("Stark Tower");
            this.doctor_strange = new Superheroe("Doctor Strange",this.escenario);
            this.thor= new Superheroe("Thor",this.escenario);
            this.spiderman= new Superheroe("Spiderman",this.escenario);
            this.deadpool= new Superheroe("Deadpool",this.escenario);
            this.iron_man= new Superheroe("Iron Man",this.escenario);
            this.daredevil= new Superheroe("Daredevil",this.escenario);
            this.hulk= new Superheroe("Hulk",this.escenario);
            this.the_punisher= new Superheroe("The Punisher",this.escenario);
            this.black_panther= new Superheroe("Black Panther",this.escenario);
            this.capitan_america= new Superheroe("Capitan America",this.escenario);

        }else if (escenario.getNombreEscenario().equals("Massachusetts Academy")){

            this.escenario = new Escenario("Massachusetts Academy");
            this.doctor_strange = new Superheroe("Doctor Strange",this.escenario);
            this.thor= new Superheroe("Thor",this.escenario);
            this.spiderman= new Superheroe("Spiderman",this.escenario);
            this.deadpool= new Superheroe("Deadpool",this.escenario);
            this.iron_man= new Superheroe("Iron Man",this.escenario);
            this.daredevil= new Superheroe("Daredevil",this.escenario);
            this.hulk= new Superheroe("Hulk",this.escenario);
            this.the_punisher= new Superheroe("The Punisher",this.escenario);
            this.black_panther= new Superheroe("Black Panther",this.escenario);
            this.capitan_america= new Superheroe("Capitan America",this.escenario);

        }

        System.out.println(this.escenario.getNombreEscenario());
    }

 */

    public void getSuperheroe(ActionEvent actionEvent) {
        String superheroe = comboBoxPersonajes.getValue();
        if (superheroe.equals("Doctor Strange")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = doctor_strange.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = doctor_strange.getCoste();

            superheroeName.setText(doctor_strange.getAliasSuperheroe());
            imgPersonaje.setImage(docStrangeImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(doctor_strange.getIdentidadSecreta());
            origenTxt.setText(doctor_strange.getOrigen());
            vidaTxt.setText(String.valueOf(doctor_strange.getEnergiaVital()));
            afiliTxt.setText(doctor_strange.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));


        }
        if (superheroe.equals("Thor")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = thor.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = thor.getCoste();

            superheroeName.setText(this.thor.getAliasSuperheroe());
            imgPersonaje.setImage(thorImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(this.thor.getIdentidadSecreta());
            origenTxt.setText(this.thor.getOrigen());
            vidaTxt.setText(String.valueOf(this.thor.getEnergiaVital()));
            afiliTxt.setText(this.thor.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));

        }
        if (superheroe.equals("Spiderman")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = spiderman.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = spiderman.getCoste();

            superheroeName.setText(spiderman.getAliasSuperheroe());
            imgPersonaje.setImage(spiderImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(spiderman.getIdentidadSecreta());
            origenTxt.setText(spiderman.getOrigen());
            vidaTxt.setText(String.valueOf(spiderman.getEnergiaVital()));
            afiliTxt.setText(spiderman.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));

        }
        if (superheroe.equals("Deadpool")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = deadpool.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = deadpool.getCoste();

            superheroeName.setText(deadpool.getAliasSuperheroe());
            imgPersonaje.setImage(deadpoolImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(deadpool.getIdentidadSecreta());
            origenTxt.setText(deadpool.getOrigen());
            vidaTxt.setText(String.valueOf(deadpool.getEnergiaVital()));
            afiliTxt.setText(deadpool.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));

        }
        if (superheroe.equals("Daredevil")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = daredevil.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = daredevil.getCoste();

            superheroeName.setText(daredevil.getAliasSuperheroe());
            imgPersonaje.setImage(darImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(daredevil.getIdentidadSecreta());
            origenTxt.setText(daredevil.getOrigen());
            vidaTxt.setText(String.valueOf(daredevil.getEnergiaVital()));
            afiliTxt.setText(daredevil.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));


        }
        if (superheroe.equals("Hulk")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = hulk.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = hulk.getCoste();

            superheroeName.setText(hulk.getAliasSuperheroe());
            imgPersonaje.setImage(hulkImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(hulk.getIdentidadSecreta());
            origenTxt.setText(hulk.getOrigen());
            vidaTxt.setText(String.valueOf(hulk.getEnergiaVital()));
            afiliTxt.setText(hulk.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));


        }
        if (superheroe.equals("Iron Man")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = iron_man.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = iron_man.getCoste();

            superheroeName.setText(iron_man.getAliasSuperheroe());
            imgPersonaje.setImage(ironImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(iron_man.getIdentidadSecreta());
            origenTxt.setText(iron_man.getOrigen());
            vidaTxt.setText(String.valueOf(iron_man.getEnergiaVital()));
            afiliTxt.setText(iron_man.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));

        }
        if (superheroe.equals("The Punisher")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = the_punisher.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = the_punisher.getCoste();

            superheroeName.setText(the_punisher.getAliasSuperheroe());
            imgPersonaje.setImage(punishImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(the_punisher.getIdentidadSecreta());
            origenTxt.setText(the_punisher.getOrigen());
            vidaTxt.setText(String.valueOf(the_punisher.getEnergiaVital()));
            afiliTxt.setText(the_punisher.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));

        }
        if (superheroe.equals("Black Panther")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = black_panther.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = black_panther.getCoste();
            superheroeName.setText(black_panther.getAliasSuperheroe());
            imgPersonaje.setImage(blackPantherImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(black_panther.getIdentidadSecreta());
            origenTxt.setText(black_panther.getOrigen());
            vidaTxt.setText(String.valueOf(black_panther.getEnergiaVital()));
            afiliTxt.setText(black_panther.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));

        }
        if (superheroe.equals("Capitan America")) {
            ArrayList<Integer> listaPoderes;
            listaPoderes = capitan_america.getParrillaPoderes();
            int habilidadDeLucha = listaPoderes.get(0);
            int proyeccionDeEnergia = listaPoderes.get(1);
            int resistencia = listaPoderes.get(2);
            int velocidad = listaPoderes.get(3);
            int fuerza = listaPoderes.get(4);
            int inteligencia = listaPoderes.get(5);
            int coste = capitan_america.getCoste();
            superheroeName.setText(capitan_america.getAliasSuperheroe());
            imgPersonaje.setImage(capiImg);
            imgPersonaje.setVisible(true);
            statsPane.setVisible(true);
            identidadSecretaTxt.setText(capitan_america.getIdentidadSecreta());
            origenTxt.setText(capitan_america.getOrigen());
            vidaTxt.setText(String.valueOf(capitan_america.getEnergiaVital()));
            afiliTxt.setText(capitan_america.getAfiliacion());
            inteliTxt.setText(String.valueOf(inteligencia));
            fuerzaTxt.setText(String.valueOf(fuerza));
            veloTxt.setText(String.valueOf(velocidad));
            resisTxt.setText(String.valueOf(resistencia));
            proDeEnergTxt.setText(String.valueOf(proyeccionDeEnergia));
            habilidadLuchaTxt.setText(String.valueOf(habilidadDeLucha));
            fieldCoste.setText(String.valueOf(coste));
        }

    }

    public void agregarSuperheroe(ActionEvent event) {
        String superheroe = comboBoxPersonajes.getValue();
        if (equipo1.getNumSuperheroes() > maxSuperheroes) {
            System.out.println("Maximo de Superheroes en un equipo es 3");
        } else if (superheroe == null) {
            System.out.println("Seleciona un Superheroe");
        } else {
            switch (superheroe) {
                case "Doctor Strange" -> {
                    if (equipo1.getNumSuperheroes() == 0 && monedasJugador >= doctor_strange.getCoste()) {
                        equipo1.añadirSuperheroe(doctor_strange);
                        imgTeam1Left.setImage(docStrangeImg);
                        imgTeam1Left.setVisible(true);
                        monedasJugador = jugador1.getNum_monedas_jugador() - doctor_strange.getCoste();
                        jugador1.setNum_monedas_jugador(monedasJugador);
                        fieldMonedasJugador.setText(String.valueOf(monedasJugador));

                    } else if (equipo1.getNumSuperheroes() == 1 && monedasJugador >= doctor_strange.getCoste()) {
                        if (!equipo1.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Doctor Strange")) {
                            equipo1.añadirSuperheroe(doctor_strange);
                            imgTeam1Right.setImage(docStrangeImg);
                            imgTeam1Right.setVisible(true);
                            monedasJugador = jugador1.getNum_monedas_jugador() - doctor_strange.getCoste();
                            jugador1.setNum_monedas_jugador(monedasJugador);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador));
                        } else {
                            alertaPesonajes(event);
                        }
                    } else if (equipo1.getNumSuperheroes() == 2 && monedasJugador >= doctor_strange.getCoste()) {
                        if (!equipo1.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Doctor Strange") && !equipo1.getListaSuperheroe().get(1).getAliasSuperheroe().equals("Doctor Strange")) {
                            equipo1.añadirSuperheroe(doctor_strange);
                            imgTeam1Center.setImage(docStrangeImg);
                            imgTeam1Center.setVisible(true);
                            monedasJugador = jugador1.getNum_monedas_jugador() - doctor_strange.getCoste();
                            jugador1.setNum_monedas_jugador(monedasJugador);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador));
                        } else {
                            alertaPesonajes(event);
                        }
                    }
                }
                case "Thor" -> {
                    System.out.println(equipo1.getNumSuperheroes());
                    if (equipo1.getNumSuperheroes() == 0 && monedasJugador >= thor.getCoste()) {
                        equipo1.añadirSuperheroe(thor);
                        imgTeam1Left.setImage(thorImg);
                        imgTeam1Left.setVisible(true);
                        monedasJugador = jugador1.getNum_monedas_jugador() - thor.getCoste();
                        jugador1.setNum_monedas_jugador(monedasJugador);
                        fieldMonedasJugador.setText(String.valueOf(monedasJugador));


                    } else if (equipo1.getNumSuperheroes() == 1 && monedasJugador >= thor.getCoste()) {
                        if (!equipo1.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Thor")) {
                            equipo1.añadirSuperheroe(thor);
                            imgTeam1Right.setImage(thorImg);
                            imgTeam1Right.setVisible(true);
                            monedasJugador = jugador1.getNum_monedas_jugador() - thor.getCoste();
                            jugador1.setNum_monedas_jugador(monedasJugador);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador));


                        } else {
                            alertaPesonajes(event);
                        }


                    } else if (equipo1.getNumSuperheroes() == 2 && monedasJugador >= thor.getCoste()) {
                        if (!equipo1.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Thor") && !equipo1.getListaSuperheroe().get(1).getAliasSuperheroe().equals("Thor")) {
                            equipo1.añadirSuperheroe(thor);
                            imgTeam1Center.setImage(thorImg);
                            imgTeam1Center.setVisible(true);

                            monedasJugador = jugador1.getNum_monedas_jugador() - thor.getCoste();
                            jugador1.setNum_monedas_jugador(monedasJugador);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador));
                            System.out.println(equipo1.getNumSuperheroes());
                        } else {
                            alertaPesonajes(event);
                        }
                    }
                }
                case "Spiderman" -> {
                    if (equipo1.getNumSuperheroes() == 0 && monedasJugador >= spiderman.getCoste()) {
                        equipo1.añadirSuperheroe(spiderman);
                        imgTeam1Left.setImage(spiderImg);
                        imgTeam1Left.setVisible(true);
                        monedasJugador = jugador1.getNum_monedas_jugador() - spiderman.getCoste();
                        jugador1.setNum_monedas_jugador(monedasJugador);
                        fieldMonedasJugador.setText(String.valueOf(monedasJugador));
                        System.out.println(equipo1.getNumSuperheroes());

                    } else if (equipo1.getNumSuperheroes() == 1 && monedasJugador >= spiderman.getCoste()) {
                        if (!equipo1.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Spiderman")) {
                            equipo1.añadirSuperheroe(spiderman);
                            imgTeam1Right.setImage(spiderImg);
                            imgTeam1Right.setVisible(true);
                            monedasJugador = jugador1.getNum_monedas_jugador() - spiderman.getCoste();
                            jugador1.setNum_monedas_jugador(monedasJugador);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador));
                        } else {
                            alertaPesonajes(event);
                        }

                    } else if (equipo1.getNumSuperheroes() == 2 && monedasJugador >= spiderman.getCoste()) {
                        if (!equipo1.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Spiderman") && !equipo1.getListaSuperheroe().get(1).getAliasSuperheroe().equals("Spiderman")) {
                            equipo1.añadirSuperheroe(spiderman);
                            imgTeam1Center.setImage(spiderImg);
                            imgTeam1Center.setVisible(true);
                            monedasJugador = jugador1.getNum_monedas_jugador() - spiderman.getCoste();
                            jugador1.setNum_monedas_jugador(monedasJugador);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador));
                        } else {
                            alertaPesonajes(event);

                        }
                    }
                }
                case "Deadpool" -> {
                    if (equipo1.getNumSuperheroes() == 0) {
                        equipo1.añadirSuperheroe(deadpool);
                        imgTeam1Left.setImage(deadpoolImg);
                        imgTeam1Left.setVisible(true);
                    } else if (equipo1.getNumSuperheroes() == 1) {
                        equipo1.añadirSuperheroe(deadpool);
                        imgTeam1Right.setImage(deadpoolImg);
                        imgTeam1Right.setVisible(true);
                    } else if (equipo1.getNumSuperheroes() == 2) {
                        equipo1.añadirSuperheroe(deadpool);
                        imgTeam1Center.setImage(deadpoolImg);
                        imgTeam1Center.setVisible(true);
                    }
                }
                case "The Punisher" -> {
                    if (equipo1.getNumSuperheroes() == 0) {
                        equipo1.añadirSuperheroe(the_punisher);
                        imgTeam1Left.setImage(punishImg);
                        imgTeam1Left.setVisible(true);
                    } else if (equipo1.getNumSuperheroes() == 1) {
                        equipo1.añadirSuperheroe(the_punisher);
                        imgTeam1Right.setImage(punishImg);
                        imgTeam1Right.setVisible(true);
                    } else if (equipo1.getNumSuperheroes() == 2) {
                        equipo1.añadirSuperheroe(the_punisher);
                        imgTeam1Center.setImage(punishImg);
                        imgTeam1Center.setVisible(true);
                    }
                }
                case "Iron Man" -> {
                    if (equipo1.getNumSuperheroes() == 0) {
                        equipo1.añadirSuperheroe(iron_man);
                        imgTeam1Left.setImage(ironImg);
                        imgTeam1Left.setVisible(true);
                    } else if (equipo1.getNumSuperheroes() == 1) {
                        equipo1.añadirSuperheroe(iron_man);
                        imgTeam1Right.setImage(ironImg);
                        imgTeam1Right.setVisible(true);
                    } else if (equipo1.getNumSuperheroes() == 2) {
                        equipo1.añadirSuperheroe(iron_man);
                        imgTeam1Center.setImage(ironImg);
                        imgTeam1Center.setVisible(true);
                    }
                }
            }
        }
    }

    public void agregarSuperheroe2(ActionEvent event) {
        String superheroe = comboBoxPersonajes.getValue();

        if (equipo2.getNumSuperheroes() > maxSuperheroes) {
            System.out.println("Maximo de Superheroes en un equipo es 3");
        } else if (superheroe == null) {
            System.out.println("Seleciona un Superheroe");
        } else {
            switch (superheroe) {
                case "Doctor Strange" -> {
                    if (equipo2.getNumSuperheroes() == 0 && monedasJugador2 >= doctor_strange.getCoste()) {
                        equipo2.añadirSuperheroe(doctor_strange);
                        imgTeam2Left.setImage(docStrangeImg);
                        imgTeam2Left.setVisible(true);
                        monedasJugador2 = jugador2.getNum_monedas_jugador() - doctor_strange.getCoste();
                        jugador2.setNum_monedas_jugador(monedasJugador2);
                        fieldMonedasJugador.setText(String.valueOf(monedasJugador2));

                    } else if (equipo2.getNumSuperheroes() == 1  && monedasJugador2 >= doctor_strange.getCoste()) {
                        if (!equipo2.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Doctor Strange")) {
                            equipo2.añadirSuperheroe(doctor_strange);
                            imgTeam2Right.setImage(docStrangeImg);
                            imgTeam2Right.setVisible(true);
                            monedasJugador2 = jugador2.getNum_monedas_jugador() - doctor_strange.getCoste();
                            jugador2.setNum_monedas_jugador(monedasJugador2);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));
                        }else {
                            alertaPesonajes(event);
                        }
                    } else if (equipo2.getNumSuperheroes() == 2) {
                        if (!equipo2.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Doctor Strange") && !equipo2.getListaSuperheroe().get(1).getAliasSuperheroe().equals("Doctor Strange")) {
                            equipo2.añadirSuperheroe(doctor_strange);
                            imgTeam2Center.setImage(docStrangeImg);
                            imgTeam2Center.setVisible(true);
                            monedasJugador2 = jugador2.getNum_monedas_jugador() - doctor_strange.getCoste();
                            jugador2.setNum_monedas_jugador(monedasJugador2);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));
                        }else {
                            alertaPesonajes(event);
                        }
                    }
                }
                case "Thor" -> {
                    if (equipo2.getNumSuperheroes() == 0  && monedasJugador2 >= thor.getCoste()) {
                        equipo2.añadirSuperheroe(thor);
                        imgTeam2Left.setImage(thorImg);
                        imgTeam2Left.setVisible(true);
                        monedasJugador2 = jugador2.getNum_monedas_jugador() - thor.getCoste();
                        jugador2.setNum_monedas_jugador(monedasJugador2);
                        fieldMonedasJugador.setText(String.valueOf(monedasJugador2));

                    } else if (equipo2.getNumSuperheroes() == 1 && monedasJugador2 >= thor.getCoste()) {
                        if (!equipo2.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Thor")) {
                            equipo2.añadirSuperheroe(thor);
                            imgTeam2Right.setImage(thorImg);
                            imgTeam2Right.setVisible(true);
                            monedasJugador2 = jugador2.getNum_monedas_jugador() - thor.getCoste();
                            jugador2.setNum_monedas_jugador(monedasJugador2);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));
                        }else{
                            alertaPesonajes(event);
                        }
                    } else if (equipo2.getNumSuperheroes() == 2) {
                        if (!equipo2.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Thor") && !equipo2.getListaSuperheroe().get(1).getAliasSuperheroe().equals("Thor")) {
                            equipo2.añadirSuperheroe(thor);
                            imgTeam2Center.setImage(thorImg);
                            imgTeam2Center.setVisible(true);
                            monedasJugador2 = jugador2.getNum_monedas_jugador() - thor.getCoste();
                            jugador2.setNum_monedas_jugador(monedasJugador2);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));
                        }else {
                            alertaPesonajes(event);
                        }
                    }
                }
                case "Spiderman" -> {
                    if (equipo2.getNumSuperheroes() == 0  && monedasJugador2 >= spiderman.getCoste()) {
                        equipo2.añadirSuperheroe(spiderman);
                        imgTeam2Left.setImage(spiderImg);
                        imgTeam2Left.setVisible(true);
                        monedasJugador2 = jugador2.getNum_monedas_jugador() - spiderman.getCoste();
                        jugador2.setNum_monedas_jugador(monedasJugador2);
                        fieldMonedasJugador.setText(String.valueOf(monedasJugador2));
                    } else if (equipo2.getNumSuperheroes() == 1) {
                        if (!equipo2.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Spiderman")) {
                            equipo2.añadirSuperheroe(spiderman);
                            imgTeam2Right.setImage(spiderImg);
                            imgTeam2Right.setVisible(true);
                            monedasJugador2 = jugador2.getNum_monedas_jugador() - spiderman.getCoste();
                            jugador2.setNum_monedas_jugador(monedasJugador2);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));
                        }else {
                            alertaPesonajes(event);
                        }
                    } else if (equipo2.getNumSuperheroes() == 2) {
                        if (!equipo2.getListaSuperheroe().get(0).getAliasSuperheroe().equals("Spiderman") && !equipo2.getListaSuperheroe().get(1).getAliasSuperheroe().equals("Spiderman")) {
                            equipo2.añadirSuperheroe(spiderman);
                            imgTeam2Center.setImage(spiderImg);
                            imgTeam2Center.setVisible(true);
                            monedasJugador2 = jugador2.getNum_monedas_jugador() - spiderman.getCoste();
                            jugador2.setNum_monedas_jugador(monedasJugador2);
                            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));
                        }else {
                            alertaPesonajes(event);
                        }
                    }
                }
                case "Deadpool" -> {
                    if (equipo2.getNumSuperheroes() == 0) {
                        equipo2.añadirSuperheroe(deadpool);
                        imgTeam2Left.setImage(deadpoolImg);
                        imgTeam2Left.setVisible(true);
                    } else if (equipo2.getNumSuperheroes() == 1) {
                        equipo2.añadirSuperheroe(deadpool);
                        imgTeam2Right.setImage(deadpoolImg);
                        imgTeam2Right.setVisible(true);
                    } else if (equipo2.getNumSuperheroes() == 2) {
                        equipo2.añadirSuperheroe(deadpool);
                        imgTeam2Center.setImage(deadpoolImg);
                        imgTeam2Center.setVisible(true);
                    }
                }
                case "The Punisher" -> {
                    if (equipo2.getNumSuperheroes() == 0) {
                        equipo2.añadirSuperheroe(the_punisher);
                        imgTeam2Left.setImage(punishImg);
                        imgTeam2Left.setVisible(true);
                    } else if (equipo2.getNumSuperheroes() == 1) {
                        equipo2.añadirSuperheroe(the_punisher);
                        imgTeam2Right.setImage(punishImg);
                        imgTeam2Right.setVisible(true);
                    } else if (equipo2.getNumSuperheroes() == 2) {
                        equipo2.añadirSuperheroe(the_punisher);
                        imgTeam2Center.setImage(punishImg);
                        imgTeam2Center.setVisible(true);
                    }
                }
                case "Iron Man" -> {
                    if (equipo2.getNumSuperheroes() == 0) {
                        equipo2.añadirSuperheroe(iron_man);
                        imgTeam2Left.setImage(ironImg);
                        imgTeam2Left.setVisible(true);
                    } else if (equipo2.getNumSuperheroes() == 1) {
                        equipo2.añadirSuperheroe(iron_man);
                        imgTeam2Right.setImage(ironImg);
                        imgTeam2Right.setVisible(true);
                    } else if (equipo2.getNumSuperheroes() == 2) {
                        equipo2.añadirSuperheroe(iron_man);
                        imgTeam2Center.setImage(ironImg);
                        imgTeam2Center.setVisible(true);
                    }
                }
            }
        }
    }

    public void quitarSuperheroe(ActionEvent actionEvent) {
        if (equipo1.getNumSuperheroes() == 3) {
            monedasJugador = jugador1.getNum_monedas_jugador() + equipo1.getListaSuperheroe().get(2).getCoste();
            jugador1.setNum_monedas_jugador(monedasJugador);
            fieldMonedasJugador.setText(String.valueOf(monedasJugador));

            equipo1.borrarSuperheroe(equipo1.getListaSuperheroe().get(2));
            imgTeam1Center.setVisible(false);
        } else if (equipo1.getNumSuperheroes() == 2) {
            monedasJugador = jugador1.getNum_monedas_jugador() + equipo1.getListaSuperheroe().get(1).getCoste();
            jugador1.setNum_monedas_jugador(monedasJugador);
            fieldMonedasJugador.setText(String.valueOf(monedasJugador));

            equipo1.borrarSuperheroe(equipo1.getListaSuperheroe().get(1));
            imgTeam1Right.setVisible(false);
        } else if (equipo1.getNumSuperheroes() == 1) {
            monedasJugador = jugador1.getNum_monedas_jugador() + equipo1.getListaSuperheroe().get(0).getCoste();
            jugador1.setNum_monedas_jugador(monedasJugador);
            fieldMonedasJugador.setText(String.valueOf(monedasJugador));

            equipo1.borrarSuperheroe(equipo1.getListaSuperheroe().get(0));
            imgTeam1Left.setVisible(false);
        }
    }

    public void quitarSuperheroe2(ActionEvent actionEvent) {
        if (equipo2.getNumSuperheroes() == 3) {
            monedasJugador2 = jugador2.getNum_monedas_jugador() + equipo2.getListaSuperheroe().get(2).getCoste();
            jugador2.setNum_monedas_jugador(monedasJugador2);
            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));

            equipo2.borrarSuperheroe(equipo2.getListaSuperheroe().get(2));
            imgTeam2Center.setVisible(false);
        } else if (equipo2.getNumSuperheroes() == 2) {
            monedasJugador2 = jugador2.getNum_monedas_jugador() + equipo2.getListaSuperheroe().get(1).getCoste();
            jugador2.setNum_monedas_jugador(monedasJugador2);
            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));

            equipo2.borrarSuperheroe(equipo2.getListaSuperheroe().get(1));
            imgTeam2Right.setVisible(false);
        } else if (equipo2.getNumSuperheroes() == 1) {
            monedasJugador2 = jugador2.getNum_monedas_jugador() + equipo2.getListaSuperheroe().get(0).getCoste();
            jugador2.setNum_monedas_jugador(monedasJugador2);
            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));

            equipo2.borrarSuperheroe(equipo2.getListaSuperheroe().get(0));
            imgTeam2Left.setVisible(false);
        }
        if (equipo2.getNumSuperheroes() == 0) {
            jugardorTxt.setText("JUGADOR 1");
            jugadorStats.setText("JUGADOR 1");
            fieldMonedasJugador.setText(String.valueOf(monedasJugador));
            btnSeleccion1.setVisible(true);
            btnSeleccion2.setVisible(false);
            btnEliminar1.setVisible(true);
            btnEliminar2.setVisible(false);
        }
    }

    public void crearEquipo(ActionEvent actionEvent) throws IOException {

        if (equipo1.getNumSuperheroes() == 3) {
            mostrarAlertInfo(actionEvent);
            jugardorTxt.setText("JUGADOR 2");
            jugadorStats.setText("JUGADOR 2");
            fieldMonedasJugador.setText(String.valueOf(monedasJugador2));
            btnSeleccion1.setVisible(false);
            btnSeleccion2.setVisible(true);
            btnEliminar1.setVisible(false);
            btnEliminar2.setVisible(true);
        }
    }

    public void atrasPersonaje(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/doctorstrangedemo/escenarios.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void jugar(ActionEvent event) throws IOException {
        sendData(event);
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/doctorstrangedemo/partida.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    private void sendData(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/doctorstrangedemo/partida.fxml"));
            stage.setUserData(jugador1);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.err.println(String.format("Error: %s", e.getMessage()));
        }
    }

    private void recibirDatos(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        escenario = (Escenario) stage.getUserData();
    }


    public Escenario getEscenario() {
        return escenario;
    }
    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }
    public Equipo getEquipo1() {
        return equipo1;
    }
    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }
    public Equipo getEquipo2() {
        return equipo2;
    }
    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    public Jugador getJugador1() {
        return jugador1;
    }
    public Jugador getJugador2() {
        return jugador2;
    }
}
