package com.bdd.stepdefinition;

import com.bdd.view.BuscarHotelView;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class BuscarHotelStepDefinition {

    private BuscarHotelView buscarHotelView() {
        return new BuscarHotelView();
    }
    @Given("ingreso a la aplicacion de booking")
    public void ingreso_a_la_aplicacion_de_booking() throws MalformedURLException {
        // Write code here that turns the phrase above into concrete actions
        BuscarHotelView.setAndroidDriver();
    }
    @When("doy clic a ingresar por gmail")
    public void doy_clic_a_ingresar_por_gmail() {
        // Write code here that turns the phrase above into concrete actions
        /*
        buscarHotelView().clickIngrearLogin();
        buscarHotelView().clickSeleccionarCuenta();

         */
    }
    @When("ingreso destino {string}")
    public void ingreso_destino(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Ingreso destino: "+string);
/*
        buscarHotelView().clickBuscarDestinoBooking();
        buscarHotelView().escribirDestinoBooking(string);
        buscarHotelView().seleccionarbuscarDestino();
        buscarHotelView().seleccionarFechaReserva();
        buscarHotelView().escogerCantidadNinnios();
        buscarHotelView().buscarReserva();

 */



    }
    @When("selecciono el hotel destino")
    public void selecciono_el_hotel_destino() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("selecciono el hotel detino ");
       //buscarHotelView().seleccionoHotelDestino();
    }
    @When("selecciono la habitacion")
    public void selecciono_la_habitacion() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("selecciono el hotel detino ");
        //buscarHotelView().seleccionoHabitacion();
    }
    @When("selecciono la estancia")
    public void selecciono_la_estancia() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("selecciono la estancia ");
        /*
       buscarHotelView().seleccionarReservaHabitacion();
       buscarHotelView().seleccionarEstancia();
       buscarHotelView().reservaEstancia();

         */

    }
    @When("completo los datos de reserva")
    public void completo_los_datos_de_reserva() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("completo los datos de reserva ");
        //buscarHotelView().completarDatosReserva();
    }


    @Then("se debe mostrar la pagina de reserva")
    public void se_debe_mostrar_la_pagina_de_reserva() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Página de reserva");
    }



}
