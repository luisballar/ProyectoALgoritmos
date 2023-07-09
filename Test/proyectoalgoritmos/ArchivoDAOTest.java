
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.ArchivoDAO;

import java.io.File;


class ArchivoDAOTest {

    ArchivoDAO archivoDAO = new ArchivoDAO();
    String nuevoPath = "fragmentos.txt";

    @Test
    public void generaArchivo(){
        archivoDAO.generaArchivo(nuevoPath);

        File archivo = new File(nuevoPath);
        Assert.assertTrue("El archivo se creó correctamente", archivo.exists());

    }


}
