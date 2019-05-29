package co.agenciaviajes.negocio;

/**
 * Clase abstracta de pagos
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public abstract class Pago {

    protected int valor;
    protected Cliente cliente;

    // Completar constructores 
    public void Pago(Cliente parCliente)
    {
        this.cliente = parCliente;
    }
    public void Pago()
    {
        
    }
    
    public abstract void registrarPago();

    // Completar getters and setters
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setValor(int i) {
        this.valor = i;
    }

    public Object getCliente() {
        return this.cliente;
    }

    public int getValor() {
        return this.valor;
    }
}
