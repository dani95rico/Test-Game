// TEST GAME WITH 0 AND 1. JAVA LENGUAGE BY DANI95RICO

import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int modo;
		int dificultad;
		boolean salir=false;
		
		while(!salir)
		{
			System.out.println("**********TERRICERA 1.0**********");
			System.out.println("UN JUGADOR (SINGLE PLAYER) 1");
			System.out.println("MULTIJUGADOR (MULTIPLAYER) 2\nACABAR 3");
	
			modo=sc.nextInt();
			switch(modo)
			{
				case 1:
					boolean salir2=false;
					while(!salir2)
					{
					System.out.print("MUNDO 1\nMUNDO 2\nMUNDO 3\nMUNDO 4\nMUNDO 5\nATRAS 6");
					dificultad=sc.nextInt();
					switch(dificultad)
					{
						case 1:
							int nivel;
							System.out.println("SELECCIONE NIVEL:");
							System.out.println("Nivel 1\nNivel 2\nNivel 3\nNivel 4\nNivel 5\nNivel 6\nNivel 7\nNivel 8\nNivel 9\nNivel 10");
							nivel=sc.nextInt();
							switch(nivel)
							{
								case 1:
									Nivel1 nivel1=new Nivel1();
									jugar(nivel1.getMatriz(),nivel1.getMovimientos(),nivel1.getNombre());
									break;
								case 2:
									Nivel2 nivel2=new Nivel2();
									jugar(nivel2.getMatriz(),nivel2.getMovimientos(),nivel2.getNombre());
									break;
								case 3:
									Nivel3 nivel3=new Nivel3();
									jugar(nivel3.getMatriz(),nivel3.getMovimientos(),nivel3.getNombre());
									break;
								case 4:
									Nivel4 nivel4=new Nivel4();
									jugar(nivel4.getMatriz(),nivel4.getMovimientos(),nivel4.getNombre());
									break;
								case 5:
									Nivel5 nivel5=new Nivel5();
									jugar(nivel5.getMatriz(),nivel5.getMovimientos(),nivel5.getNombre());
									break;
								case 6:
									Nivel6 nivel6=new Nivel6();
									jugar(nivel6.getMatriz(),nivel6.getMovimientos(),nivel6.getNombre());
									break;
								case 7:
									Nivel7 nivel7=new Nivel7();
									jugar(nivel7.getMatriz(),nivel7.getMovimientos(),nivel7.getNombre());
								break;
								case 8:
									Nivel8 nivel8=new Nivel8();
									jugar(nivel8.getMatriz(),nivel8.getMovimientos(),nivel8.getNombre());
								break;
								case 9:
									Nivel9 nivel9=new Nivel9();
									jugar(nivel9.getMatriz(),nivel9.getMovimientos(),nivel9.getNombre());
								break;
								case 10:
									Nivel10 nivel10=new Nivel10();
									jugar(nivel10.getMatriz(),nivel10.getMovimientos(),nivel10.getNombre());
								break;
							}


							break;
						case 2:
							System.out.println("SELECCIONE NIVEL:");
							System.out.println("Nivel 1\nNivel 2\nNivel 3\nNivel 4\nNivel 5\nNivel 6\nNivel 7\nNivel 8\nNivel 9\nNivel 10");
							nivel=sc.nextInt();
							switch(nivel)
							{
								case 1:
									Nivel1 nivel1=new Nivel1();
									jugar2(nivel1.getMatriz(),nivel1.getMovimientos(),nivel1.getNombre());
									break;
								case 2:
									Nivel2 nivel2=new Nivel2();
									jugar2(nivel2.getMatriz(),nivel2.getMovimientos(),nivel2.getNombre());
									break;
								case 3:
									Nivel3 nivel3=new Nivel3();
									jugar2(nivel3.getMatriz(),nivel3.getMovimientos(),nivel3.getNombre());
									break;
								case 4:
									Nivel4 nivel4=new Nivel4();
									jugar2(nivel4.getMatriz(),nivel4.getMovimientos(),nivel4.getNombre());
									break;
								case 5:
									Nivel5 nivel5=new Nivel5();
									jugar2(nivel5.getMatriz(),nivel5.getMovimientos(),nivel5.getNombre());
									break;
								case 6:
									Nivel6 nivel6=new Nivel6();
									jugar2(nivel6.getMatriz(),nivel6.getMovimientos(),nivel6.getNombre());
									break;
								case 7:
									Nivel7 nivel7=new Nivel7();
									jugar2(nivel7.getMatriz(),nivel7.getMovimientos(),nivel7.getNombre());
								break;
								case 8:
									Nivel8 nivel8=new Nivel8();
									jugar2(nivel8.getMatriz(),nivel8.getMovimientos(),nivel8.getNombre());
								break;
								case 9:
									Nivel9 nivel9=new Nivel9();
									jugar2(nivel9.getMatriz(),nivel9.getMovimientos(),nivel9.getNombre());
								break;
								case 10:
									Nivel10 nivel10=new Nivel10();
									jugar2(nivel10.getMatriz(),nivel10.getMovimientos(),nivel10.getNombre());
								break;
							}
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 6:
							salir2=true;
							break;
					}
					}
				case 2:
					break;
				case 3:
					salir=true;
					break;
			}
		}
		sc.close();
		}
		
	 static int [][] moverIzquierda(int [][]matriz,int num)
	{
		int [][] resultado=null;
		 boolean salir=false;
		for(int x=0;x<matriz.length && !salir;x++)
		{
			for(int y=0;y<matriz[x].length && !salir;y++)
			{
				if(matriz[x][y]==num && y!=0 && matriz[x][y-1]==0)
				{
					matriz[x][y-1]=matriz[x][y];
					matriz[x][y]=0;
					salir=true;
				}
			}
		}
			
		resultado=matriz;
		return resultado;
	}
	 static int [][] moverDerecha(int [][]matriz,int num)
	{
		 int [][] resultado=null;
		 boolean salir=false;
			for(int x=0;x<matriz.length && !salir;x++)
			{
				for(int y=0;y<matriz[x].length && !salir;y++)
				{
					if(matriz[x][y]==num && y!=4 && matriz[x][y+1]==0)
					{
						matriz[x][y+1]=matriz[x][y];
						matriz[x][y]=0;
						salir=true;
					}
				}
			}
			
			resultado=matriz;
			return resultado;
	}
	 static int [][] moverArriba(int [][]matriz,int num)
	{
		 int [][] resultado=null;
		 boolean salir=false;
			for(int x=0;x<matriz.length && !salir;x++)
			{
				for(int y=0;y<matriz[x].length && !salir;y++)
				{
					if(matriz[x][y]==num && x!=0 && matriz[x-1][y]==0)
					{
						matriz[x-1][y]=matriz[x][y];
						matriz[x][y]=0;
						salir=true;
					}
				}
			}
			resultado=matriz;
			return resultado;
	}
	 static int [][] moverAbajo(int [][]matriz,int num)
	{
		 int [][] resultado=null;
		 boolean salir=false;
			for(int x=0;x<matriz.length && !salir;x++)
			{
				for(int y=0;y<matriz[x].length && !salir;y++)
				{
					if(matriz[x][y]==num && x!=4 && matriz[x+1][y]==0)
					{
						matriz[x+1][y]=matriz[x][y];
						matriz[x][y]=0;
						salir=true;
					}
				}
			}
			resultado=matriz;
			return resultado;
	}
	static void representar(int[][] matriz,int movimientos)
	{
		System.out.println("*********************************");
		System.out.println("Número de movimientos restante: "+movimientos);
		for(int x=0;x<matriz.length;x++)
		{
			for(int y=0;y<matriz[x].length;y++)
			{
				System.out.print(matriz[x][y]+"       ");
				if(y==4)
				{
					System.out.print("\n");
				}
			}
		}
	}
	static void jugar(int [][] matriz,int movimientos,String nombre)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(nombre);
		representar(matriz,movimientos);
		boolean salir=false;
		boolean perdido=false;
		int puntoNum;
		int eleccion;
	while(!salir)
	{
		System.out.print("Seleccione que punto quiere mover: ");
		puntoNum=sc.nextInt();
		System.out.print("Muevalo: ARRIBA(1) ABAJO(2) IZQUIERDA(3) DERECHA(4)");
		eleccion=sc.nextInt();
		switch(eleccion)
		{
		case 1:
			movimientos--;
			representar(matriz=moverArriba(matriz,puntoNum),movimientos);
			break;
		case 2:
			movimientos--;
			representar(matriz=moverAbajo(matriz,puntoNum),movimientos);
			break;
		case 3:
			movimientos--;
			representar(matriz=moverIzquierda(matriz,puntoNum),movimientos);
			break;
		case 4:
			movimientos--;
			representar(matriz=moverDerecha(matriz,puntoNum),movimientos);
			break;
		}
	
		if(matriz[0][2]==1 && matriz[1][2]==2 && matriz[2][2]==3 && matriz[3][2]==4 && matriz[4][2]==5)
		{
			salir=true;;
		}
	
	if(movimientos==0)
	{
		salir=true;
		perdido=true;
	}
	}
		if(!perdido)
		{
			System.out.println("HAS GANADO!!!! JUEGA OTRO NIVEL YA!");
		}else
		{
			System.out.println("LO SIENTO HAS PERDIDO");
		}
		sc.close();
	}
	static void jugar2(int [][] matriz,int movimientos,String nombre)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(nombre);
		representar(matriz,movimientos);
		boolean salir=false;
		boolean perdido=false;
		int puntoNum;
		int eleccion;
	while(!salir)
	{
		System.out.print("Seleccione que punto quiere mover: ");
		puntoNum=sc.nextInt();
		System.out.print("Muevalo: ARRIBA(1) ABAJO(2) IZQUIERDA(3) DERECHA(4)");
		eleccion=sc.nextInt();
		switch(eleccion)
		{
		case 1:
			movimientos--;
			moverPecesDerecha(matriz);
			representar(matriz=moverArriba(matriz,puntoNum),movimientos);
			moverPecesIzquierda(matriz);
			break;
		case 2:
			movimientos--;
			moverPecesDerecha(matriz);
			representar(matriz=moverAbajo(matriz,puntoNum),movimientos);
			moverPecesIzquierda(matriz);
			break;
		case 3:
			movimientos--;
			moverPecesDerecha(matriz);
			representar(matriz=moverIzquierda(matriz,puntoNum),movimientos);
			moverPecesIzquierda(matriz);
			break;
		case 4:
			movimientos--;
			moverPecesDerecha(matriz);
			representar(matriz=moverDerecha(matriz,puntoNum),movimientos);
			moverPecesIzquierda(matriz);
			break;
		}
	
		if(matriz[0][2]==1 && matriz[1][2]==2 && matriz[2][2]==3 && matriz[3][2]==4 && matriz[4][2]==5)
		{
			salir=true;;
		}
	
	if(movimientos==0)
	{
		salir=true;
		perdido=true;
	}
	}
		if(!perdido)
		{
			System.out.println("HAS GANADO!!!! JUEGA OTRO NIVEL YA!");
		}else
		{
			System.out.println("LO SIENTO HAS PERDIDO");
		}
		sc.close();
	}
	static int [][] moverPecesDerecha(int [][]matriz)
	{
		int [][]moverPeces=null;
		for(int x=0;x<matriz.length;x++)
		{
			for(int y=0;y<matriz[x].length;y++)
			{
				if(matriz[x][y]==8)
				{
					if(y!=4 && matriz[x][y+1]==0)
					{
						matriz[x][y+1]=matriz[x][y];
						matriz[x][y]=0;
						y++;
					}
				}
			}
		}
		return moverPeces;
	}
	static int [][] moverPecesIzquierda(int [][]matriz)
	{
		int [][]moverPeces=null;
		for(int x=0;x<matriz.length;x++)
		{
			for(int y=0;y<matriz[x].length;y++)
			{
				if(matriz[x][y]==8)
				{
					if(y!=0 && matriz[x][y-1]==0)
					{
						matriz[x][y-1]=matriz[x][y];
						matriz[x][y]=0;
						y++;
					}
				}
			}
		}
		return moverPeces;
	}
}
