public class BonusMilesService {
    public int calculate(int cost) { // иниициализируем функцию расчета мили
        int bonusmiles = 20;
        int miles = cost / bonusmiles;
        return miles;

    }
}
