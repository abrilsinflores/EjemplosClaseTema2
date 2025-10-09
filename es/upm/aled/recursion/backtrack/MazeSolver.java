package es.upm.aled.recursion.backtrack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MazeSolver {
	
	//array d String q conforma el laberinto -> maze
	private String[] maze; //la coordenada "y" es la posicc dentro del array, la coordenada "x" es la posicc dentro del Stirng 
	private char wall;
	private Coordinate start;
	private Coordinate end;
	private List<Coordinate> path;
	private Set<Coordinate> visited; //mjr conjunto xq no nos importa el orden d las casillas en las q hemos estado
	
	public MazeSolver(String[] maze, char wall, Coordinate start, Coordinate end) {
		super();
		this.maze = maze;
		this.wall = wall;
		this.start = start;
		this.end = end;
		this.path = new ArrayList<Coordinate>();
		this.visited = new HashSet<Coordinate>();
	}
	
	//method recursivo
	private boolean walk(Coordinate current) {
			
		//CASOS BASES
		//estoy fuera del maze? 
		if(current.getX() >= maze[0].length()		//la "x" se sale x la der
				|| current.getX() < 0 				//la "x" se sale x la izq
				|| current.getY() >= maze.length	// la "y" se sale x abajo
				|| current.getY() < 0) {			// la "y" se sale x arriba
			return false;
		}
		//estoy en un muro?
		if(maze[current.getY()].charAt(current.getX()) == wall) {
			return false;
		}
		//estoy en la salida?
		if(current.equals(end)) {
			path.add(current);
			return true;
		}
		//he estado antes?
		if(visited.contains(current)) {
			return false;
		}
		
		//PASO RECURSIVO: up, right, down, left
		this.visited.add(current);
		Coordinate up = new Coordinate(current.getX(),current.getY()-1);
		Coordinate right = new Coordinate(current.getX()+1,current.getY());
		Coordinate down = new Coordinate(current.getX(),current.getY()+1);
		Coordinate left = new Coordinate(current.getX()-1,current.getY());
		Coordinate toVisit[] = new Coordinate[4];
		toVisit[0] = up;
		toVisit[1] = right;
		toVisit[2] = down;
		toVisit[3] = left;
		for(Coordinate next : toVisit) { //se exploran todos los caminos posibles
			if(this.walk(next)) { //si devuelve true el caso base es q es por ahí
				path.add(current);
				return true;
			}
		}
		return false; 	
	}
	
	//method fachada
	public List<Coordinate> solve(){
		this.walk(start);
		return path;
	}
	
	public static void main(String[] args) throws IOException{ //probamos si funciona
		//hace falta implementar un método q no ha explicado en clase:
		Path filePath = Paths.get(args[0]); 
		List<String> mazeList = Files.readAllLines(filePath);
		String maze[] = mazeList.toArray(new String[0]);
		// Encontramos camino de inicio y fin
		Coordinate start = null, end = null;
		for (int i = 0; i < maze.length ; i++) {
			String string = maze[i];
			int startX = string.indexOf("E");
			int endX = string.indexOf("S");
			if (startX != -1) {
				start = new Coordinate(startX, i);
			}
			if (endX != -1) {
				end = new Coordinate(endX, i);
			}
		}
		// ESTO YA SÍ HECHO EN CLASE:
		//Creamos el resolvedor de laberintos
		MazeSolver solver = new MazeSolver(maze, '#', start, end);
		// Lo ejecutamos
		System.out.println(solver.solve());
	}

	
}
