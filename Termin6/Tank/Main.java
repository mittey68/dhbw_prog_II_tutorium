public class Main {

  public static void main(String[] args) {

    TankQueries queries = new TankQueries(Tanks.getTanks());

    queries.printAllTanksWithWeightBT25TonsByType();
    System.out.println();
    System.out.println(queries.getAveragePerformanceInHorsePower());
    System.out.println();
    System.out.println(queries.getAllNations());
    System.out.println();
    System.out.println(queries.isAllTanksMaxSpeedBE50KMH());
    System.out.println();
    queries.printLongestTankFromGermany();

  }

}
