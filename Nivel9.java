
public class Nivel9 {
	private int [][] matriz=new int[5][5];
	private int movimientos;
	private String nombre;
	public Nivel9()
	{
		this.nombre="NIVEL 9";
		this.movimientos=30;
		this.matriz[0][0]=0;
		this.matriz[0][1]=8;
		this.matriz[0][2]=0;
		this.matriz[0][3]=0;
		this.matriz[0][4]=5;
		this.matriz[1][0]=0;
		this.matriz[1][1]=0;
		this.matriz[1][2]=0;
		this.matriz[1][3]=8;
		this.matriz[1][4]=0;
		this.matriz[2][0]=8;
		this.matriz[2][1]=8;
		this.matriz[2][2]=0;
		this.matriz[2][3]=8;
		this.matriz[2][4]=0;
		this.matriz[3][0]=2;
		this.matriz[3][1]=4;
		this.matriz[3][2]=0;
		this.matriz[3][3]=0;
		this.matriz[3][4]=0;
		this.matriz[4][0]=1;
		this.matriz[4][1]=3;
		this.matriz[4][2]=0;
		this.matriz[4][3]=8;
		this.matriz[4][4]=8;
	}
	public int[][] getMatriz()
	{
		return matriz;
	}
	public int getMovimientos()
	{
		return movimientos;
	}
	public String getNombre()
	{
		return nombre;
	}
}
