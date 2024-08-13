public class Exercise {

  public static void main(String[] args) {
    FootballerQueries queries = new FootballerQueries(DataProvider.getFootballers());
    queries.getAllFootballersByBirthyear().values().stream().forEach(System.out::println);
    // add more queries as you wish
  }
}
