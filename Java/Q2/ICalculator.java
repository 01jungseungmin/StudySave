package Q2;

public interface ICalculator {
    public String returnFormula();
    public int[] returnOperator(String formula);
    public double calculatedValue(String formula, int[] operator);
}
