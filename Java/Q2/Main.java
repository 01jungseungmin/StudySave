package Q2;

public class Main {
    public static void main(String[] args) {
        UpgradeCalculator calculator = new UpgradeCalculator();

        System.out.print("계산할 식을 입력 하세요 : ");
        StringBuffer formula = new StringBuffer(calculator.returnFormula());

        System.out.println("값 : " + calculator.cal(formula));
    }
}
