public class Main {
    public static void main(String[] args) {
        Plant t1 = new Tree(10, 100, 2, "Дуб");
        Plant f1 = new Flower(1, 0, 10, "Нарцисс");

        Plant[] plants = {t1, f1};
        int yearsGrow = 2;
        growPlantsYears(plants, yearsGrow);

    }

    public static void growPlantsYears(Plant[] plants, int years){
        for(int i = 0; i < years; i++){
            for(int j = 0; j < plants.length; j++){
                plants[j].growInSeasons();
            }
        }
    }
}
