/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author va-an
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho= new Automovil();
        //miBocho,marca="Volk Waken";
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println( miBocho );
        
        Automovil miAcura= new Automovil ();
        miAcura.setMarca("Acura");
        miAcura.setSubMarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.gray);
        System.out.println( miAcura);
        
        Automovil miMustan= new Automovil();
        miMustan.setMarca("Ford");
        miMustan.setSubMarca("Mustan");
        miMustan.setModelo(2010);
        miMustan.setColor(Color.yellow);
        System.out.println( miMustan );
        

    }
    
    //TAREA.- programar los objetos miAcura y mi Mustang
}