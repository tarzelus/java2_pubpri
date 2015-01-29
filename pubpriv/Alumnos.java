package pubpriv;
public class Alumnos extends Escuela
{

	private int idAlumno;
	private String cursoAlumno, nombreAlumno, dniAlumno;

    
	// getter y sets

        public int getIdAlumno()
		{
			return idAlumno;
		}
		
		public void  setIdAlumno(int idAlumno1)
		{
			idAlumno=idAlumno1;
		}

		
		
		public String getCursoAlumno()
		{
			return cursoAlumno;
		}
		
		public void  setCursoAlumno(String cursoAlumno1)
		{
			cursoAlumno=cursoAlumno1;
		}
		
		
		public String getNombreAlumno()
		{
			return nombreAlumno;
		}
		
		public void  setNombreAlumno(String nombreAlumno1)
		{
			nombreAlumno=nombreAlumno1;
		}

		public String getDniAlumno()
		{
			return dniAlumno;
		}
		
		public void  setDniAlumno(String dniAlumno1)
		{
			dniAlumno=dniAlumno1;
		}

		@Override
		protected void imprimir()
		{
		super.imprimir();
	    System.out.print("\n\n--- Alumno: ");
		System.out.println("Nombre del alumno: " + getNombreAlumno());
		System.out.println("cursando: " + getCursoAlumno());
		System.out.println("Id alumno: " + getIdAlumno());
		System.out.println("Dni del alumno: " + getDniAlumno());
		}
}
