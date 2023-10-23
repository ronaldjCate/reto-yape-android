package comn;

import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class Util {


    public void esperarElementoClick(int intentos, WebElement elemento) {
        try {
            int contador=0;
            while (elemento.isEnabled()==false){
                contador++;
                if (elemento.isSelected()==true||contador==intentos){
                    System.out.println("Se encuentra elemento");
                    break;
                }else{
                    System.out.println("contador: " + contador);

                }
            }

        }catch (NoSuchElementException e){
            e.getMessage();
        }
    }

    /*
    public void esperarElementoClick(int intentos, WebElement elemento) {
        try{
            int contador=0;
            while(element(elemento).isEnabled()==false) {
                contador++;
                if(element(elemento).isClickable()==true||contador==intentos) {
                    System.out.println("Se encuentra elemento");
                    break;
                }else {
                    System.out.println("contador: " + contador);
                    esperarSegundos(1);
                }
            }
        }catch (NoSuchElementException e) {
            System.out.println("In catch block to handle no such element");
            e.printStackTrace();
        }
    }

     */
}
