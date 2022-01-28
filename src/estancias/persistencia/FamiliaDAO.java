package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

public final class FamiliaDAO extends DAO {
  
    public Collection<Familia>listarPorHijoYEdad(int num,int edad) throws Exception{
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos>=" + num + " AND edad_maxima<" + edad +";";
        
        consultarBase(sql);
        
        Familia familia = null;
        Collection familias = new ArrayList();
        while (resultado.next()) {

           familia = new Familia();
           
           familia.setId_familia(resultado.getInt(1));
           familia.setNombre(resultado.getString("nombre"));
           familia.setEdad_minima(resultado.getInt(3));
           familia.setEdad_maxima(resultado.getInt(4));
           familia.setNum_hijos(resultado.getInt(5));
           familia.setEmail(resultado.getString("email"));
           familia.setId_casa_familia(resultado.getInt(7));
           
           familias.add(familia);
           
        }
    
        desconectarBase();
        return familias;
            
        } catch (Exception e) {
            throw e;
        }
    }
        
    public Collection<Familia>listarPorEmail() throws Exception{
        try {
            String sql = "SELECT * FROM familias WHERE email LIKE '%hotmail%'";
            
            consultarBase(sql);
            
            Familia familia = null;
            Collection <Familia> familias = new ArrayList();
            
            while (resultado.next()) {

                familia.setId_familia(resultado.getInt(1));
                familia.setNombre(resultado.getString("nombre"));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString("email"));
                familia.setId_casa_familia(resultado.getInt(7));
                
                familias.add(familia);
                              
            }
            
            desconectarBase();
            return familias;
        } catch (Exception e) {
            throw e;
        }        
        }
    
    
    
    
}
