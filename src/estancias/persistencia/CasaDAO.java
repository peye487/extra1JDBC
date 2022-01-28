
package estancias.persistencia;

import estancias.entidades.Casa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public final class CasaDAO extends DAO {
    
    
    public Collection<Casa>listarporFecha() throws Exception{
        
        
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde >= '2020-08-01' AND fecha_hasta<= '2020-08-31';";
        
        consultarBase(sql);
        
        Casa casa = null;
        
        Collection<Casa> casas= new ArrayList();
        
        while (resultado.next()) {
        
            casa = new Casa();
            
            casa.setId_casa(resultado.getInt(1));
            casa.setCalle(resultado.getString(2));
            casa.setNumero(resultado.getInt(3));
            casa.setCodigo_postal(resultado.getString(4));
            casa.setCiudad(resultado.getString(5));
            casa.setPais(resultado.getString("pais"));
            casa.setFecha_desde(resultado.getDate(7));
            casa.setDecha_hasta(resultado.getDate(8));
            casa.setTiempo_minimo(resultado.getInt(9));
            casa.setTiempo_maximo(resultado.getInt(10));
            casa.setPrecio(resultado.getDouble(11));
            casa.setTipo_vivienda(resultado.getString(12));
            
            casas.add(casa);      
        }
        desconectarBase();
        return casas;          
            
        } catch (Exception e) {
            
            throw e;
        }    
}
    
    public Collection<Casa>listarPorFechaYDias(Date fecha, int dias) throws Exception{
    
        try {
            
            String sql = "SELECT * FROM casas WHERE fecha_desde >= '" + fecha + "' AND tiempo_minimo < " + dias + " AND tiempo_maximo>=" + dias +";";
    
            consultarBase(sql);
        
            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
        
            while (resultado.next()) {
                
                casa = new Casa();
                
                casa.setId_casa(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigo_postal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString("pais"));
                casa.setFecha_desde(resultado.getDate(7));
                casa.setDecha_hasta(resultado.getDate(8));
                casa.setTiempo_minimo(resultado.getInt(9));
                casa.setTiempo_maximo(resultado.getInt(10));
                casa.setPrecio(resultado.getDouble(11));
                casa.setTipo_vivienda(resultado.getString(12));
                
                casas.add(casa);                    
        }
            
            desconectarBase();
            return casas;
            
        } catch (Exception e) {
            
            throw e;
        }
        
        
    }
    
    
    
}
