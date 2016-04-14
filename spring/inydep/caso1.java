
// CASE 1 before inydep
public class Messi 
{
	
	Barcelona bar = new Barcelona();

	public void mostrarEquipo()
	{
		bar.mostrar();
	}
}

public class Barcelona 
{
	public void mostrar()
	{
		System.out.println("BARCELONA FC");
	}
}


// CASE 1 after inydep SIMPLE
public class Messi 
{
	private Barcelona barcelona;

	// first way to do it with inydep
	public Messi(Barcelona bar)
	{
		this.barcelona = bar;
	}

	// second way to do it with inydep
	public void setBarcelona(Barcelona barcelona)
	{
		this.barcelona = barcelona;
	}

}

// Use 
Messi m = new Messi(new Barcelona());



// CASE 1 after inydep using INTERFAZ

public interface IEquipo
{
	public void mostrar();
}

public class Barcelona implements IEquipo
{
	public void mostrar()
	{
		System.out.println("BARCELONA FC");
	}
}

public class Messi 
{
	private IEquipo equipo;

	public Messi(IEquipo equipo)
	{
		this.equipo = equipo;
	}
	
	//other way inside the class
	public void setEquipo(IEquipo equipo)
	{
		this.equipo = equipo;
	}

	public void mostrarEquipo()
	{
		equipo.mostrar();
	}
}


// use 
Messi m = new Messi(new Barcelona());
m.mostrarEquipo();

Messi ms = new Messi(new Juventus());
ms.mostrarEquipo();



