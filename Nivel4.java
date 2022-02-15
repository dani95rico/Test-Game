public class Nivel4 {
	private int [][] matriz=new int[5][5];
	private int movimientos;
	private String nombre;
	public Nivel4()
	{
		this.nombre="NIVEL 4";
		this.movimientos=17;
		this.matriz[0][0]=1;
		this.matriz[0][1]=8;
		this.matriz[0][2]=0;
		this.matriz[0][3]=8;
		this.matriz[0][4]=0;
		this.matriz[1][0]=0;
		this.matriz[1][1]=0;
		this.matriz[1][2]=0;
		this.matriz[1][3]=8;
		this.matriz[1][4]=2;
		this.matriz[2][0]=0;
		this.matriz[2][1]=0;
		this.matriz[2][2]=3;
		this.matriz[2][3]=0;
		this.matriz[2][4]=0;
		this.matriz[3][0]=4;
		this.matriz[3][1]=0;
		this.matriz[3][2]=0;
		this.matriz[3][3]=8;
		this.matriz[3][4]=8;
		this.matriz[4][0]=0;
		this.matriz[4][1]=5;
		this.matriz[4][2]=0;
		this.matriz[4][3]=0;
		this.matriz[4][4]=0;
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
