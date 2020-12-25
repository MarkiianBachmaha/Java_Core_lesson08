package task01;

import java.util.Scanner;

public class Menu {

	static void menu() {
		System.out.println("Натисніть 1, щоб перевірити, чи є такий місяць");
		System.out.println("Натисніть 2, щоб вивести місяці, які належать одній і тій самій порі року");
		System.out.println("Натисніть 3, щоб вивести місяці з однаковою кількістю днів");
		System.out.println("Натисніть 4, щоб вивести місяці, які мають меншу кількість днів");
		System.out.println("Натисніть 5, щоб вивести місяці, які мають більшу кількість днів");
		System.out.println("Натисніть 6, щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 7, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 8, щоб вивести на екран місяці, які мають парну кількість днів");
		System.out.println("Натисніть 9, щоб вивести на екран місяці, які мають непарну кількість днів");
		System.out.println("Натисніть 10, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Seasons[] masSea = Seasons.values();
		Months[] masMon = Months.values();

		while (true) {
			menu();

			switch (scanner.next()) {

			case "1": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = isMonthPresent(masMon, month);

				if (!flag) {
					System.out.println("Month doesn`t exist");
				}
				System.out.println();

				break;
			}
			case "2": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : masMon) {

					if (m.getSeasons().name().equals(season)) {

						flag = true;
					}
				}

				if (flag) {
					Seasons se = Seasons.valueOf(season);
				}
				for (Months mo : masMon) {
					if (mo.getSeasons().name().equalsIgnoreCase(season)) {
						System.out.println(mo);
					}
				}

				if (!flag) {
					System.out.println("Season doesn`t exist");
				}
				System.out.println();

				break;
			}
			case "3": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : masMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : masMon) {
						if (mb.getDays() == m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				if (!flag) {
					System.out.println("Month doesn`t exist");
				}
				System.out.println();

				break;
			}
			case "4": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : masMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : masMon) {
						if (mb.getDays() < m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				if (!flag) {
					System.out.println("Month doesn`t exist");
				}
				System.out.println();

				break;
			}
			case "5": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : masMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : masMon) {
						if (mb.getDays() > m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				if (!flag) {
					System.out.println("Month doesn`t exist");
				}
				System.out.println();

				break;
			}
			case "6": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = isSeasonPresent(masSea, season);

				if (flag) {
					Seasons seas = Seasons.valueOf(season);
					int ordinal = seas.ordinal();

					if (ordinal == (masSea.length - 1)) {
						ordinal = 0;
						System.out.println(masSea[ordinal]);
					} else {
						System.out.println(masSea[ordinal + 1]);
					}
				}

				if (!flag) {
					System.out.println("Season doesn`t exist");
				}
				System.out.println();

				break;
			}
			case "7": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = isSeasonPresent(masSea, season);

				if (flag) {
					Seasons seas = Seasons.valueOf(season);
					int ordinal = seas.ordinal();

					if (ordinal == 0) {
						ordinal = (masSea.length - 1);
						System.out.println(masSea[ordinal].name());
					} else {
						System.out.println(masSea[ordinal - 1].name());
					}
				}

				if (!flag) {
					System.out.println("Season doesn`t exist");
				}
				System.out.println();

				break;
			}
			case "8": {

				for (Months m : masMon) {
					if ((m.getDays() % 2) == 0) {
						System.out.println(
								"This month has an even number of days: " + m.name() + " - " + m.getDays() + " days");
					}
				}
				System.out.println();

				break;

			}
			case "9": {
				for (Months m : masMon) {
					if ((m.getDays() % 2) != 0) {
						System.out.println(
								"This month has an odd number of days: " + m.name() + " - " + m.getDays() + " days");
					}
				}
				System.out.println();

				break;
			}
			case "10": {
				System.out.println("Enter the month");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : masMon) {
					if (ma.name().equals(month)) {
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					if ((m.getDays() % 2) == 0) {
						System.out.println("Month " + month + " has an even number of days;");

					} else {
						System.out.println("Month " + month + " has an odd number of days;");
					}

				}

				if (!flag) {
					System.out.println("Month doesn`t exist");
				}
				System.out.println();

				break;
			}

			}
		}
	}

	private static boolean isSeasonPresent(Seasons[] masSea, String season) {

		boolean flag = false;

		for (Seasons s : masSea) {

			if (s.name().equals(season)) {
				System.out.println("Season exist");
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isMonthPresent(Months[] masMon, String month) {

		boolean flag = false;

		for (Months m : masMon) {

			if (m.name().equals(month)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}
}