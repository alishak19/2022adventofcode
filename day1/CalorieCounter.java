public class CalorieCounter {
  
  // finds max of elve's summed calorie count
  static int calculateMaxCals(String inputList) {
    IntStream calTotals = getSums(inputList);
    return calTotals.max().orElse(0);
  }
  
  static IntStream getSums(String inputList) {
    String[] arr = inputList.split("\\n\\n");
    return Arrays.stream(arr).mapToInt(CalorieCounter::sum);
  }
  
  static int sum(String inputLisr) {
    return inputList.lines().mapToInt(Integer::parseInt).sum();
  }
  
  private static final String ELFINPUT =
      """
          """;
  
  public static void main(String[] args) {
    System.out.println(calculateMaxCals(ELFINPUT));
  }
  
  
}
