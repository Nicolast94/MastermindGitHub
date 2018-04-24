package mastermind;

public enum Color {
	
	NEGRO("\u001B[40m"),
	ROJO("\u001B[101m"),
	VERDE("\u001B[42m"),
	AMARILLO("\u001B[103m"),
	AZUL("\u001B[104m"),
	MORADO("\u001B[45m"),
	CELESTE("\u001B[106m"),
	GRIS("\u001B[47m"),
	BLANCO("\u001B[1;107m"),
	VERDE_CLARO("\u001B[1;102m"),
	MORADO_CLARO("\u001B[105m"),
	RESETEAR("\u001B[0m"),
	IND_INVI("\u001B[1;97m"),
	IND_NEGRO("\u001B[30m"),
	IND_GRIS("\u001B[37m");
	
	
	private String cod_color;
	
	private Color(String cod_color) {
		this.cod_color = cod_color;
	}
	
	public String getCod_Color() {
		return cod_color;
	}
}
