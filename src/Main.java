//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int cost = 15994;
        int rublesPerMile = 20;
        int bonusMiles;

        bonusMiles = cost / rublesPerMile;

        System.out.println("За билет стоимостью " + cost + " рублей начислено " + bonusMiles + " бонусных миль.");
    }
}