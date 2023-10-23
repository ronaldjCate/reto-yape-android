package com.bdd.view;

import com.bdd.xpath.ObtenerXpath;
import comn.Util;
import io.appium.java_client.AppiumClientConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.time.Duration;

public class BuscarHotelView {

    static AndroidDriver androidDriver;
    ObtenerXpath obtenerXpath = new ObtenerXpath();
    Util util = new Util();
    Actions actions = new Actions(androidDriver);


    public static void setAndroidDriver() throws MalformedURLException {



        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:automationName","uiautomator2");
        capabilities.setCapability("appium:platformVersion","12");
        capabilities.setCapability("appium:platformName","Android");
        capabilities.setCapability("appium:deviceName","sdk_gphone64_x86_64");
        capabilities.setCapability("appium:app","C:\\rutaAPP\\booking-com-32-9.apk");
        capabilities.setCapability("appium:appPackage","com.booking");
        capabilities.setCapability("appium:appActivity","com.booking.startup.HomeActivity");
        //capabilities.setCapability("appium:acceptInsecureCerts", true);
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
       androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));




    }

    public void clickIngrearLogin(){
        String ingresoLogin =obtenerXpath.ingresoLogin;
        By elementIngresoLogin = By.xpath(ingresoLogin);
        WebElement webElementIngresoLogin = androidDriver.findElement(elementIngresoLogin);
        util.esperarElementoClick(5,webElementIngresoLogin);
        webElementIngresoLogin.click();

    }
    public void clickSeleccionarCuenta(){
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
    }
    public void clickBuscarDestinoBooking(){
        androidDriver.findElement(By.xpath("//android.widget.Button[@content-desc='Enter your destination']")).click();
    }
    public void escribirDestinoBooking(String sDestino){

        String escribirDestino =obtenerXpath.buscadorDestino;
        actions.sendKeys(sDestino).perform();
        androidDriver.findElement(By.id(escribirDestino)).click();
    }
    public void seleccionarbuscarDestino(){
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String seleccionarDestino =obtenerXpath.seleccionarDestino;
        By elementSeleccionarDestino = By.xpath(seleccionarDestino);
        WebElement webElementSeleccionarDestino = androidDriver.findElement(elementSeleccionarDestino);
        util.esperarElementoClick(5,webElementSeleccionarDestino);
        webElementSeleccionarDestino.click();
    }


    public void seleccionarFechaReserva(){

        /*
        String xpathFechaIni ="//android.view.View[@content-desc='28 octubre 2023']";
        String xpathFechaFin = "//android.view.View[@content-desc='31 octubre 2023']";
        By elementoFechaIni = By.xpath(xpathFechaIni);
        By elementoFechaFin = By.xpath(xpathFechaFin);
        WebElement fechaIniElemento = androidDriver.findElement(elementoFechaIni);
        WebElement fechaFinElemento = androidDriver.findElement(elementoFechaFin);
        fechaIniElemento.click();
        fechaFinElemento.click();
*/

        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button")).click();
    }


    public void escogerCantidadNinnios(){

        String seleccionarPersonas =obtenerXpath.seleccionarPersona;
        By elementseleccionarPersonas = By.xpath(seleccionarPersonas);
        WebElement webElementSeleccionarPersonas = androidDriver.findElement(elementseleccionarPersonas);
        util.esperarElementoClick(3,webElementSeleccionarPersonas);
        webElementSeleccionarPersonas.click();

        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
       // androidDriver.findElement(By.xpath("//android.view.View[@content-desc=\"Accommodation search box\"]/android.view.View/android.widget.Button")).click();
      //  androidDriver.findElement(By.xpath("//javaClass[@content-desc='Child 1 required']/android.widget.LinearLayout/android.widget.ImageView")).click();
      //  androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.NumberPicker/android.widget.EditText")).click();
      //  androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
    }

    public void buscarReserva(){
        androidDriver.findElement(By.xpath("//android.view.View[@content-desc='Accommodation search box']/android.view.View/android.widget.Button")).click();
    }

    public void seleccionoHotelDestino(){
        androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.ViewGroup/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]")).click();
    }

    public void seleccionoHabitacion(){
        String seleecionarHotel =obtenerXpath.seleecionarHotel;
        By elementSeleecionarHotel = By.xpath(seleecionarHotel);
        WebElement webElementSeleccionarHotel = androidDriver.findElement(elementSeleecionarHotel);
        util.esperarElementoClick(3,webElementSeleccionarHotel);
        webElementSeleccionarHotel.click();
    }

    public void seleccionarReservaHabitacion(){
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String mensaje = obtenerXpath.mensajeSeleccionReserva;
        By elementMensajeSeleccionReserva=By.xpath(mensaje);
        WebElement webElemenMensaje = androidDriver.findElement(elementMensajeSeleccionReserva);
        if(webElemenMensaje.isDisplayed()){
            String reservarHabitacion =obtenerXpath.reservarHabitacion;
            By elementReservarHabitacion = By.xpath(reservarHabitacion);
            WebElement webElementRreservarHabitacion = androidDriver.findElement(elementReservarHabitacion);
            webElementRreservarHabitacion.click();
        }else {
            seleccionarReservaHabitacion();
        }




    }
    
    public void seleccionarEstancia(){
        String seleccionaEstancia = obtenerXpath.seleccionarEstancia;
        By elementSeleccionaEstancia= By.xpath(seleccionaEstancia);
        WebElement webElementSeleccionaHabitacion = androidDriver.findElement(elementSeleccionaEstancia);
        webElementSeleccionaHabitacion.click();
    }

    public void reservaEstancia(){
        String reservarEstancia = obtenerXpath.reservarEstancia;
        By elementReservarEstancia= By.xpath(reservarEstancia);
        WebElement webElementReservarEstancia = androidDriver.findElement(elementReservarEstancia);
        webElementReservarEstancia.click();
    }

    public void completarDatosReserva(){
        actions.sendKeys("987987987").perform();
        androidDriver.findElement(By.xpath(obtenerXpath.telefonoDatoReserva)).click();
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String seleccionaSiguiente = obtenerXpath.seleccionarEstancia;
        By elementSeleccionaSiguiente= By.xpath(seleccionaSiguiente);
        WebElement webElementSeleccionaSiguiente = androidDriver.findElement(elementSeleccionaSiguiente);
        webElementSeleccionaSiguiente.click();
    }






    public void completarDatos(){
        String resultadoEsperado = "February 2023";
        String resultadoActual= androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.TextView")).getText();
        Assert.assertEquals(resultadoEsperado,resultadoActual);

    }



    public void clicBuscador(){
        androidDriver.findElement(By.id("com.airbnb.android:id/start_button")).click();
    }

    public void clicbuscarDestino(){
        androidDriver.findElement(By.id("com.airbnb.android:id/search_input")).click();
    }

    public void escribirDestino(String sDestino){
        Actions actions = new Actions(androidDriver);
        actions.sendKeys(sDestino).perform();
        androidDriver.findElement(By.id("com.airbnb.android:id/icon")).click();
    }

    public void validarPantalla(){
        String resultadoEsperado = "February 2023";
        String resultadoActual= androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.TextView")).getText();
        Assert.assertEquals(resultadoEsperado,resultadoActual);

    }

}
