public class Processor {
    private double freq;
    private double voltage;

    public Processor(double f, double v){
        freq = f;
        voltage = v;
    }

    public Processor(){
        freq = 3.5;
        voltage = 0.5;
    }


    public double getFreq(){
        return this.freq;
    }

    public double getVoltage(){
        return this.voltage;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
}
