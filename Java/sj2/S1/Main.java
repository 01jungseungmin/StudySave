package sj2.S1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.print("계산할 식을 입력 하세요 : ");
        String formula = calculator.returnFormula();

        int[] operatorArray = calculator.returnOperator(formula);

        System.out.println("값 : " + calculator.calculatedValue(formula, operatorArray));
    }
}
