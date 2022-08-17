/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador;

import static co.gov.minambiente.controlador.Utils.loadMunicipalities;
import co.gov.minambiente.modelo.AttorneyModel;
import co.gov.minambiente.modelo.DepartmentModel;
import co.gov.minambiente.modelo.InterestedModel;
import co.gov.minambiente.modelo.RequestModel;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Andrés Güiza
 */
public class Controlador {

    public static void main(String[] args) throws FileNotFoundException, IOException, FontFormatException {
        PdfWorkspace generatedDoc = new PdfWorkspace("Prueba.pdf", 10, "src\\co\\gov\\minambiente\\fonts\\");
        generatedDoc.allPAgesHeader();
        
        
        /*RequestModel form1 = new RequestModel("1");
        ArrayList <String> a = new ArrayList<> ();
        a.add("1200000");
        a.add("Doce millones de pesos");
        
        InterestedModel interested = new InterestedModel("Natural",
                "Propietario", a, false, "bob_esponja@gmail.com", "304446985", "Bob Esponja", "cc", "1101760080");
        
        AttorneyModel attorney = new AttorneyModel("856413T", "Patricio Estrella",
                "CC", "552116447");
        
        interested.setAttorney(attorney);
        
        form1.setTypeRequest("nueva");
        form1.setInterested(interested);

        loadMunicipalities(new File("resources\\MunicipiosDepartamentosColombia.txt"));

        PdfController.generateCheckBoxes(generatedDoc, new DeviceRgb(212,216,210));
        PdfController.fillDocument(generatedDoc, form1);*/
    }
}
