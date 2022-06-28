package com.example.doctorstrangedemo;
import java.util.ArrayList;
import java.util.List;

public class Escenario implements ListaEscenario{
    private String nombreEscenario;
    ArrayList<Integer> escenarioAtributosList= new ArrayList<Integer>();

    public Escenario() {
    }

    public Escenario(String nombreEscenario) {
        this.nombreEscenario=nombreEscenario;
        crearEscenario();
    }

    public void crearEscenario(){
        switch (nombreEscenario) {
            case SANCTUM:
                setDatos("Sanctum Sanctorum", sanctumEsc);
                break;
            case STARK:
                setDatos("Stark Tower", starkEsc);
                break;
            case ACADEMY:
                setDatos("Massachusetts Academy", academyEsc);
                break;
        }
    }

    public void setDatos(String nombreEscenario,List<Integer> escenarioList) {
        this.nombreEscenario=nombreEscenario;
        escenarioAtributosList.addAll(escenarioList);
    }

    public String getNombreEscenario() {
        return nombreEscenario;
    }

    public void setNombreEscenario(String nombreEscenario) {
        this.nombreEscenario = nombreEscenario;
    }

    public ArrayList<Integer> getEscenarioAtributosList() {
        return escenarioAtributosList;
    }

    public void setEscenarioAtributosList(ArrayList<Integer> escenarioAtributosList) {
        this.escenarioAtributosList = escenarioAtributosList;
    }
}
