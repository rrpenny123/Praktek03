package praktek03;

public class SepedaMotor extends Sepeda {
    private String jenisMotor;
    
    void throttle () {
        System.out.println("NGEEEEENGG............");
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
    
    
}
