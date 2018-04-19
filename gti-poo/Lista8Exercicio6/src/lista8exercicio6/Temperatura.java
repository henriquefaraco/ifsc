
package lista8exercicio6;


public class Temperatura {

    private double tempFahrenheit;
    
    public Temperatura(double tempf){
        tempFahrenheit = tempf;
    }
    public void setTempF(double temp_f){
        tempFahrenheit = temp_f;
    }
    public double getTempF(){
        return tempFahrenheit;
    }
    public double converterParaKelvin(){
        double tempK = (tempFahrenheit-32)*5.0/9+273;
        return tempK;
    }
    
    public double converterParaCelsius(){
        double tempC = (tempFahrenheit-32)*5.0/9;
        return tempC;
    }
    
}
