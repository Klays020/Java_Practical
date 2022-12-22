
public enum Season
{
    WINTER(-10), SPRING(12), SUMMER(30){
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    }, AUTUMN(5);

    private double temp;

    Season(double temp){
        this.temp = temp;
    }

    public double get_temp(){
        return temp;
    }

    public String getDescription(){
        return "Холодное время года";
    }
}
