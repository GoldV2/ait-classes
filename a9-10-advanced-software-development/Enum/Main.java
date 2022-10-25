import java.time.LocalDate; // import the LocalDate class

enum Months {
  jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec
}

public class Main {
  public static void main(String[] args) {

    
    LocalDate date = LocalDate.now();

    System.out.println("Current month value: " + date.getMonthValue());

    switch(date.getMonthValue()) {
      case 1:
      printMonth(Months.jan);
      break;
      case 2:
      printMonth(Months.feb);
      break;
      case 3:
      printMonth(Months.mar);
      break;
      case 4:
      printMonth(Months.apr);
      break;
      case 5:
      printMonth(Months.may);
      break;
      case 6:
      printMonth(Months.jun);
      break;
      case 7:
      printMonth(Months.jul);
      break;
      case 8:
      printMonth(Months.aug);
      break;
      case 9:
      printMonth(Months.sep);
      break;
      case 10:
      printMonth(Months.oct);
      break;
      case 11:
      printMonth(Months.nov);
      break;
      case 12:
      printMonth(Months.dec);
      break;
    }

  }

  public static void printMonth(Months month) {
    System.out.println("Current months is: " + month);
  }

}