
package estancias.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Casa {
   
    private int id_casa;
    private String calle;
    private int numero;
    private String codigo_postal;
    private String ciudad;
    private String pais;
    private Date fecha_desde;
    private Date fecha_hasta;
    private int tiempo_minimo;
    private int tiempo_maximo;
    private double precio;
    private String tipo_vivienda;
    private ArrayList<Estancia> estancias;
    private ArrayList<Familia> familias;      // ???????????????????????
    private ArrayList<Comentario>comentarios;

    public Casa(int id_casa, String calle, int numero, String codigo_postal, String ciudad, String pais, Date fecha_desde, Date decha_hasta, int tiempo_minimo, int tiempo_maximo, double precio, String tipo_vivienda, ArrayList<Estancia> estancias, ArrayList<Familia> familias, ArrayList<Comentario> comentarios) {
        this.id_casa = id_casa;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = decha_hasta;
        this.tiempo_minimo = tiempo_minimo;
        this.tiempo_maximo = tiempo_maximo;
        this.precio = precio;
        this.tipo_vivienda = tipo_vivienda;
        this.estancias = estancias;
        this.familias = familias;
        this.comentarios = comentarios;
    }

    public Casa() {
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getDecha_hasta() {
        return fecha_hasta;
    }

    public void setDecha_hasta(Date decha_hasta) {
        this.fecha_hasta = decha_hasta;
    }

    public int getTiempo_minimo() {
        return tiempo_minimo;
    }

    public void setTiempo_minimo(int tiempo_minimo) {
        this.tiempo_minimo = tiempo_minimo;
    }

    public int getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(int tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    public ArrayList<Estancia> getEstancias() {
        return estancias;
    }

    public void setEstancias(ArrayList<Estancia> estancias) {
        this.estancias = estancias;
    }

    public ArrayList<Familia> getFamilias() {
        return familias;
    }

    public void setFamilias(ArrayList<Familia> familias) {
        this.familias = familias;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Casa{" + "id_casa=" + id_casa + ", calle=" + calle + ", numero=" + numero + ", codigo_postal=" + codigo_postal + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha_desde=" + fecha_desde + ", decha_hasta=" + fecha_hasta + ", tiempo_minimo=" + tiempo_minimo + ", tiempo_maximo=" + tiempo_maximo + ", precio=" + precio + ", tipo_vivienda=" + tipo_vivienda + ", estancias=" + estancias + ", familias=" + familias + ", comentarios=" + comentarios + '}';
    }
    
    
}
