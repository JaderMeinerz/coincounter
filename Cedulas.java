public class Cedulas {

    String cedula;
    Integer valor;

    public Cedulas(String cedula, Integer valor){
        this.cedula = cedula;
        this.valor = valor;
    }

    public Cedulas(){

    }

    public String getCedula() {
        return this.cedula;
    }
    
    public Integer getValor() {
        return this.valor;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
