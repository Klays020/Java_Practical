
public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season + ": Лето — одно из четырёх времён года, между весной и осенью, характеризующееся наиболее высокой температурой окружающей среды. \nВ день летнего солнцестояния дни самые длинные, а ночи самые короткие.\n");
        print(Season.SUMMER);
        printAllValues();
    }

    public static void print(Season season){
        switch (season){
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
        }

    }

    public static void printAllValues(){
        for (Season s : Season.values()){
            System.out.println(s + " " + s.get_temp() + " " + s.getDescription());
        }
    }

}
