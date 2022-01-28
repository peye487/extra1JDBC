
package estancias.entidades;

import java.util.Date;

public class Estancia {
    private int id_estancia;
    private int id_cliente;
    private int id_casa;
    private String nombre_huesped;
    private Date fecha_desde;
    private Date fecha_hasta;
    private Cliente cliente;
    private Casa casa;

    public Estancia(int id_estancia, int id_cliente, int id_casa, String nombre_huesped, Date fecha_desde, Date fecha_hasta, Cliente cliente, Casa casa) {
        this.id_estancia = id_estancia;
        this.id_cliente = id_cliente;
        this.id_casa = id_casa;
        this.nombre_huesped = nombre_huesped;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.cliente = cliente;
        this.casa = casa;
    }

    public Estancia() {
    }

    public int getId_estancia() {
        return id_estancia;
    }

    public void setId_estancia(int id_estancia) {
        this.id_estancia = id_estancia;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getNombre_huesped() {
        return nombre_huesped;
    }

    public void setNombre_huesped(String nombre_huesped) {
        this.nombre_huesped = nombre_huesped;
    }

    public Date getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(Date fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public Date getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(Date fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Estancia{" + "id_estancia=" + id_estancia + ", id_cliente=" + id_cliente + ", id_casa=" + id_casa + ", nombre_huesped=" + nombre_huesped + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + ", cliente=" + cliente + ", casa=" + casa + '}';
    }

    
    
}
