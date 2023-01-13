public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculo = new Veiculo[4];
        veiculo[0] = new Veiculo("GDB-8574",1997);
        veiculo[1] = new Onibus("JVG-2588",1997,60);
        veiculo[2] = new Onibus("JVG-2588",2010,70);
        veiculo[3] = new Caminhao("LKJ-9922",2006,105);
        for (Veiculo veic: veiculo) {
            System.out.println(veic);
        }
        veiculo[0].mostraDados();
        veiculo[1].mostraDados();
        veiculo[2].mostraDados();
        veiculo[3].mostraDados();
    }
}
public class Veiculo {
    private String placa;
    private int ano;
    public Veiculo(){
    }
    public Veiculo(String veiculo, int ano){
        this.placa = veiculo;
        this.ano = ano;
    }
        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }
        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
    public void mostraDados(){
        System.out.println("-------Dados Veiculos--------\n"+"placa:"+ placa + "\n Ano:" + ano );
    }
}

public class Onibus extends Veiculo {
    private int passageiros;
    public Onibus(){

    }
    public Onibus(String placa,int ano, int passageiros){
        super(placa, ano);
        this.passageiros = passageiros;
    }
    public int getPassageiros() {
        return passageiros;
    }
    public String toString() {
        return "Onibus{" +
                "placa = "+ getPlaca()+
                "Ano = " + getAno() +
                " passageiros = " + passageiros +
                '}';
    }
    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
    public void mostraDados() {
        System.out.println("-------Dados Onibus--------\n" + "placa:" + getPlaca() + "\n Ano:" + getAno()
                +"\n"+  "passageiros: "+ passageiros);
    }
}
public class Caminhao extends Veiculo {
    private int pesoCarga;
    public Caminhao(){
    }
    public Caminhao(String placa,int ano, int pesoCarga){
        super(placa, ano);
        this.pesoCarga = pesoCarga;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }
    public String toString() {
        return "Caminhao {" +
                "placa = " + getPlaca()+
                "ano = " + getAno() +
                " pesoCarga = " + pesoCarga +
                '}';
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }
    public void mostraDados() {
        System.out.println("-------Dados Caminhão--------\n" + "placa:" + getPlaca() + "\n Ano:" + getAno()
        +"\n"+ "pesoCarga: " + pesoCarga);
    }
}
