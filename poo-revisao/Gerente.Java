public class Gerente extends Funcionario{
    public String mandar;

    public Gerente(){}

    public Gerente(String mandar){
        this.mandar = mandar;
    }

    @Override
    private void receber(){
        System.out.println("Recebeu Y");
    }

    public String getMandar(){
        return this.mandar;
    }

    public void setMandar(String mandar){
        this.mandar = mandar;
    }
}