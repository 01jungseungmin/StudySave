package sj2.S1;

public interface ICalculator {
    public String returnFormula();
    public int[] returnOperator(String formula);
    public double calculatedValue(String formula, int[] operator);
}
