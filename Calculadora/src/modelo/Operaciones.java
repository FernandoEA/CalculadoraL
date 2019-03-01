package modelo;

public enum Operaciones {

	SUMA("SUMA") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1+ope2;
		}
	},
	RESTA("RESTA") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1-ope2;
		}
	},
	MULTIPLICACION("MULTIPLICACION") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1*ope2;
		}
	},
	DIVISION("DIVISION") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1/ope2;
		}
	};
	
	private String nombre;

	private Operaciones(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public abstract double resultado(double ope1,double ope2);
	
	
}
