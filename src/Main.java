public class Main {

    public static void main(String[] args) {

        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        int[] cityTotals = new int[cities.length];

        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");

        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "", consoles[0], consoles[1], consoles[2]);


        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s", cities[i]);

            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);

                cityTotals[i] += sales[i][j];
            }

            System.out.println();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t" + cityTotals[i]);
        }


        int highestSales = cityTotals[0];
        int highestCityIndex = 0;

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                highestCityIndex = i;
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: "
                + cities[highestCityIndex]);

        System.out.println("--------------------------------------------------");
    }

}
















