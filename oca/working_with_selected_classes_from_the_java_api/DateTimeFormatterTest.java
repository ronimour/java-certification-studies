import java.time.*;
import java.time.format.*;
public class DateTimeFormatterTest {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.now();


    System.out.println("LocalDate -->");
    //System.out.println("short: "+DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(localDate));
    System.out.println("short: "+localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
    System.out.println("long: "+localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
    System.out.println("medium: "+localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
    System.out.println("full: "+localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

    System.out.println("LocalTime -->");
    System.out.println("short: "+localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
    //System.out.println("long: "+localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
    //DateTimeException raised
    System.out.println("medium: "+localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
    //System.out.println("full: "+localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));
    //DateTimeException raised

    System.out.println("LocalDateTime -->");
    System.out.println("short: "+localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
    //System.out.println("long: "+localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
    //DateTimeException raised
    System.out.println("medium: "+localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
    //System.out.println("full: "+localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
    //DateTimeException raised
  }
}
