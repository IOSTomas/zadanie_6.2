package sk.smartyacademy.lekcia_06.zadanie_6_2;

public class SimulaciaStrelyZKanona {

	public static void main(String[] args)
	{
		StrelaZKanona strela = new StrelaZKanona(100);  // 100m/sekundu
		strela.posun(1);                               // posunieme strelu o sekundu
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n1. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 95.144");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: " + (100 - 9.81));
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n2. Aktualna pozicia: " + strela.getPozicia());

		System.out.println("Ocakavana hodnota dráhy zo simulácie: 180.478");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 80.38");
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n3. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 256.002");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 70.57");
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n4. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 321.716");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 60.76");
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n5. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 377.62");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 50.95");
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n6. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 423.714");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 41.14");
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n7. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 459.99");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 31.33");
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n8. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 486.47");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 21.52");
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n9. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 503.13");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 11.71");
		System.out.println("------------------------------------");
		strela.posun(1);
		System.out.println("\nDraha zo SIMULACIE: ");
		System.out.println("\n10. Aktualna pozicia: " + strela.getPozicia());
		System.out.println("Ocakavana hodnota dráhy zo simulácie: 509.99");
		System.out.println("\nAktualna rychlosť: " + strela.getAktualnaRychlost());
		System.out.println("Ocakavana hodnota: 1.90");

	}

}
