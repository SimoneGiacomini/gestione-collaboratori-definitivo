
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu 
{
	private String titolo;
	private String[] vociMenu;
	private int numeroVociMenu;
	/**
	 * * Metodo costruttore che istanza un nuovo Menu.
	 * @param titolo-> rappresenta il titolo che si da al Menu
	 * @param elencoVoci-> rappresenta l'array di stringhe che si passa al menu
	 */
	public Menu(String titolo,String[] elencoVoci)
	{
		this.titolo=titolo;
		numeroVociMenu=elencoVoci.length;
		vociMenu=new String[numeroVociMenu];
		for (int i = 0; i < elencoVoci.length; i++) 
		{
			vociMenu[i]=elencoVoci[i];
		}
	}
	
	/**
	 * Metodo che consente di visualizzare il menu
	 */
	public void visualizza()
	{
		System.out.println(titolo);
		for (int i = 0; i < numeroVociMenu; i++) 
		{
			System.out.println(i+"-->"+vociMenu[i]);
		}
	}
	
	public int scelta()
	{
		int scelta=-1;
		ConsoleInput tastiera=new ConsoleInput();
		while(scelta<0||scelta>=numeroVociMenu)
		{
			visualizza();
			System.out.println("scegli dunque");
			try 
			{
				scelta=tastiera.ReadInt();
			} 
			catch (NumberFormatException e) 
			{
			System.out.println("Formato inserito non corretto...REINSERIRE");
			} 
			catch (IOException e) 
			{
			System.out.println("Impossibile leggere il numero dal dispositivo di input..REINSERIRE");
			}
		}
		return scelta;
		
	}
}
