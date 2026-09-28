//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public void main(String[] args) {

    String[]cities={"Cape Town","Port Elizabeth","Pretoria"};
    String[]consoles={"PS5","XBOX","SWITCH"};

    int[][] sales={{1000,2000,3000};{2000,3000,4000};{1500,1100,1200}};

    int[]cityTotals = new int [cities.length];

    System.out.println("--------------------------------------------------");
    System.out.println("Gaming console report");
    System.out.println("---------------------------------------------------");
    System.out.println("%-20s %-10s %-10s %-10s%n,"",consoles[0],consoles[1],consoles[2]);"

    for (int j = 0;j < consoles.length,j++)

    {
        System.out.println("%-10d",sales[i][j]);
        cityTotals[i] + sales[i][j];
    }

    System.out.println();
    System.out.println("------------------------------------------------");
    System.out.println("Console sales totals for each city");
    System.out.println("---------------------------------------------------");

    for (int i = 0; i <cities.length;i++){
        System.out.println(cities[i] + "\t" + cityTotals[i]);
        }
    int highestSales + cityTotals[0];
    int highestCityIndex = 0;

    for (int i = 1;i <cityTotals.length,++){

        if (cityTotals[i] > highestSales){
            highestSales = cityTotals[i];
            highestCityIndex = i;
        }
    }

    System.out.println();
    System.out.println("City With The Most Sales: + cities[highestCityIndex]");
    System.out.println("---------------------------------------------------------------------");


}
















