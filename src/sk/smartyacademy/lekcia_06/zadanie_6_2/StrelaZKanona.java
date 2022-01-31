package sk.smartyacademy.lekcia_06.zadanie_6_2;

/**
 * Trieda simuluje let strely z kanona
 *
 */
public class StrelaZKanona {

	public double deltaT = 0.01;
	public double gravitacneZrychlenie = 9.81;
	public double pociatocnaRychlost;
	public double aktualnaRychlost;
	public double aktualnaPozicia;
	public double drahaZoSimulacie;

	public double aktualnaPoziciaZoVzorca;
	public double draha;
	public double pociatocnaRychlostPreVzorec;

	/**
	 * Vytvara objekt strely z kanona na pociatocnej pozicii 0.
	 * 
	 * @param pociatocnaRychlost -> pociatocna rychlost strely z kanona
	 */
	public StrelaZKanona(double pociatocnaRychlost)
	{
		this.pociatocnaRychlost = pociatocnaRychlost;
		aktualnaRychlost = pociatocnaRychlost;
		pociatocnaRychlostPreVzorec = pociatocnaRychlost;

	}

	/**
	 * Upravuje drahu a rychlost strely z kanona po uplynuti casoveho useku deltaT.
	 * 
	 * @param deltaT -> casovy interval
	 */
	public void posun(double deltaT)
	{
		double sucet = 0;

		draha = draha + (-0.5 * gravitacneZrychlenie * deltaT * deltaT) + (pociatocnaRychlostPreVzorec * deltaT);
		aktualnaPoziciaZoVzorca = draha;
		sucet += aktualnaPoziciaZoVzorca;
		System.out.println("Draha z presneho vzorca: " + sucet);
		pociatocnaRychlostPreVzorec = pociatocnaRychlostPreVzorec - gravitacneZrychlenie * deltaT;
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		for (int i = 0; i < 100 * deltaT; i++)
		{

			drahaZoSimulacie = drahaZoSimulacie + pociatocnaRychlost * this.deltaT;
			pociatocnaRychlost = pociatocnaRychlost - gravitacneZrychlenie * this.deltaT;
			// System.out.println(drahaZoSimulacie);
		}

		aktualnaPozicia = drahaZoSimulacie;
		aktualnaRychlost = aktualnaRychlost - gravitacneZrychlenie * deltaT;

	}

	/**
	 * Vracia aktualnu rychlost strely z kanona.
	 * 
	 * @return aktualna rychlost
	 */
	public double getAktualnaRychlost()
	{
		return aktualnaRychlost;
	}

	/**
	 * Vracia aktualnu poziciu strely z kanona.
	 * 
	 * @return aktualnu (vertikalnu) poziciu
	 */
	public double getPozicia()
	{
		return aktualnaPozicia;
	}
}
