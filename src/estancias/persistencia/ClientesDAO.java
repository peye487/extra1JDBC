
package estancias.persistencia;

import estancias.entidades.Cliente;
import java.util.Collection;

public final class ClientesDAO extends DAO{
  
    public void guardarCliente (Cliente cliente) throws Exception{
    
        try {
            if(cliente == null){
            
            throw new Exception ("Debe indicar un Cliente");
            }
           
            String sql = "INSERT INTO clientes (id_cliente,nombre,calle,numero,codigo_postal,ciudad,pais,email)"
                    + "VALUES ( '" + cliente.getId_cliente() + "' , '" + cliente.getNombre() +"' , '"+ cliente.getCalle() + "' , '" + 
                    cliente.getNumero()+ "' , '" + cliente.getCodigo_postal() + "' , '" + cliente.getCiudad() + "' , '" + 
                    cliente.getPais() + "' , '" + cliente.getEmail() + "' );";
            
            insertarModificarEliminar(sql);
           
            
        } catch (Exception e) {
            throw e;
        } finally{
          desconectarBase();
        }
    }
    
    public void modificarCliente (Cliente cliente) throws Exception{
    
       try {
            if (cliente == null) {
                throw new Exception("Debe indicar el Cliente que desea modificar");
            }

            String sql = "UPDATE cliente SET "
                    + "nombre = '" + cliente.getNombre() + "' WHERE ??????? = '" + cliente.getCalle() + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    
    }
    
    public void eliminarCliente (String nombre) throws Exception {
        try {

            String sql = "DELETE FROM cliente WHERE nombre = '" + nombre + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    // e) Listar los datos de todos los clientes que en algún momento realizaron una estancia
    //    y la descripción de la casa donde la realizaron.  
    
//    public Collection<Cliente>clientesConEstancia(){       // VER COMO HACERLO??? PARA LOS DATOS DE LAS CASAS, POR QUE PUEDO RELACIONAR LAS 3 TABLAS
//                                                           // Y BUSCAR LOS CLIENTES QUE HICIERON ESTANCIAS, TAMBIEN PUEDO BUSCAR EN FUNCION DE ESAS ESTANCIAS
//                                                           // LOS DATOS DE LAS CASAS EN LAS QUE ESTUVIERON O LAS QUE EL ID CASA DE ESTANCIA SE RELACIONA
//                                                           // CON EL ID CASA DE "casas". PERO COMO GUARDO POR QUE EL RETURN ES UN ARRAYLIST DE TIPO
//                                                           // CLIENTE Y EN CLIENTE NO TENGO ATRIBUTO DE TIPO CASA.
//                                                           
//        String sql = "SELECT c.* FROM clientes c, estancias e WHERE c.id_cliente = e.id_cliente; ";
//    
//    
//    }
    
}
