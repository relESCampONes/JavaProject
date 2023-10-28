package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

//		Instant begin = Instant.now();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Instant d00 = Instant.now();
		LocalDate d01 = LocalDate.now(); // only date
		System.out.println(d01);
		System.out.println(d01.atTime(22, 22, 22));
		System.out.println(d01.atStartOfDay());
		System.out.println("Day: " + d01.getDayOfWeek().name());
		System.out.println("Day: " + d01.getDayOfWeek().ordinal());
		System.out.println("Day number: " + d01.getDayOfMonth());
		System.out.println("Day of the Year: " + d01.getDayOfYear());
		System.out.println("Month: " + d01.getMonthValue());
		System.out.println("Month: " + d01.getMonth().name());
		System.out.println("Year: " + d01.getYear());
		System.out.println("Plus 5 Years: " + d01.plusYears(5));
		System.out.println("Minus 10 Years: " + d01.minusYears(10));
		System.out.println("Is leap Year? " + d01.isLeapYear());
		System.out.println("Numbers of days of the month: " + d01.lengthOfMonth());
		System.out.println("Numbers of days of the year: " + d01.lengthOfYear());
		System.out.println(d00);
		System.out.println("Plus Days: " + d00.plus(7, ChronoUnit.DAYS));
		Instant globalDate = Instant.parse("2023-09-29T01:30:26Z");
		LocalDateTime localDate = LocalDateTime.ofInstant(globalDate, ZoneId.systemDefault());
		System.out.println(globalDate);
		System.out.println(localDate);
		LocalDateTime d02 = LocalDateTime.now(); // date with time
		LocalDateTime hourWish = LocalDateTime.of(1992, Month.JUNE, 18, 16, 22);
		ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
		LocalDateTime instantSaoPaulo = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Sao_Paulo"));
		ZonedDateTime hourSaoPaulo = ZonedDateTime.of(instantSaoPaulo, saoPaulo);
		System.out.println(hourSaoPaulo);
		ZoneId london = ZoneId.of("UTC"); // UTC+0 or Zulu or GMT(Greenwich Mean Time)
		LocalDateTime instantLondon = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC")); // UTC - Coordinated
																								// Universal Time
		ZonedDateTime hourLondon = ZonedDateTime.of(instantLondon, london);
		System.out.println(hourLondon);
		ZoneId paris = ZoneId.of("Europe/Paris");
		LocalDateTime instantParis = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Paris"));
		ZonedDateTime hourParis = ZonedDateTime.of(instantParis, paris);
		System.out.println(hourParis);
		Duration hourDiference = Duration.between(instantSaoPaulo, instantParis);
		System.out.println("Hours difference: "
				+ ((hourDiference.toHours() < 0) ? (hourDiference.toHours() * -1) : hourDiference.toHours())
				+ " hours");
		System.out.println("Hour wish: " + hourWish);
		Instant d03 = Instant.now(); // GMT(Greenwich mean time) time London ground zero
		LocalDate d04 = LocalDate.parse("2022-07-20"); // Format ISO 8601
		System.out.printf("Format ISO 8601: %s%n", d04);
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

		LocalDateTime d12 = LocalDateTime.now();
		Instant d13 = Instant.now();
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;
		DateTimeFormatter fmt7 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("UTC"));
// An object of the Instant class that is global does not have the format method, I will have to specify the time zone

		LocalDateTime r1 = LocalDateTime.ofInstant(d13, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d13, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d13, ZoneId.of("UTC"));

		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println();
		System.out.println(d04.format(fmt3));
		System.out.println(fmt3.format(d04));
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d05.format(fmt3));
		System.out.println(d06);
		System.out.println(d05.format(fmt4));
		System.out.println(fmt5.format(d06));
		System.out.println("aqui");
		Instant d50 = Instant.now();
		System.out.println(d50);
		System.out.println(d12.format(fmt4));
		System.out.println(fmt7.format(d13));
		System.out.println(fmt6.format(d13));
		System.out.println(d13);
		System.out.println(d13.toString());
		System.out.println(r1);
		System.out.println(r3);
		System.out.println(r2);
		System.out.println();
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		System.out.println();

//		for (String string : ZoneId.getAvailableZoneIds()) {
//			System.out.println(string);
//		}

//		Instant end = Instant.now();
//		Duration duration = Duration.between(begin, end);
//		long durationMillis = duration.toMillis();
//		System.out.println(durationMillis);
	}

}
