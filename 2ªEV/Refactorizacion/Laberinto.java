package Refactorizacion;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;

class Maze {
   public int[][] maze;
   public LinkedList<Position> path = new LinkedList<Position>();
   public Position start;
}

class Position {
   public int x;
   public int y;

   public Position(int y, int x) {
       this.x = x;
       this.y = y;
   }
}

public class Laberinto {
   // 0 = wall
   // 1 = path
   // 2 = destination

   private static int[][] maze = {
           { 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
           { 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0 },
           { 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1 },
           { 1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0 },
           { 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0 },
           { 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1 }
   };

   public void setMaze(int[][] maze) {
       this.maze = maze;
   }

   public void randomMaze() {

   }

   static LinkedList<Position> path = new LinkedList<Position>();

   public static void main(String[] args) throws FileNotFoundException {
       solveMaze();
       for (Position p : path) {
           System.out.println(p.x + " " + p.y);
       }

   }

   public static String[] solveMaze() throws FileNotFoundException {
       ArrayList<String> movimientos = new ArrayList<String>();
       Position p = new Position(4, 8);
       path.push(p);

       while (true) {
           int y = path.peek().y;
           int x = path.peek().x;

           maze[y][x] = 0;

           // down
           if (isValid(y + 1, x)) {
               if (maze[y + 1][x] == 2) {
                   // System.out.println("Moved down. You won");
                   movimientos.add("Moved down. You won");
                   return (String[]) movimientos.toArray();
               } else if (maze[y + 1][x] == 1) {
                   // System.out.println("Moved down");
                   movimientos.add("Moved down");
                   path.push(new Position(y + 1, x));
                   continue;
               }
           }

           // left
           if (isValid(y, x - 1)) {
               if (maze[y][x - 1] == 2) {
                   movimientos.add("Moved left. You won");
                   return (String[]) movimientos.toArray();
               } else if (maze[y][x - 1] == 1) {
                   movimientos.add("Moved left");
                   path.push(new Position(y, x - 1));
                   continue;
               }
           }

           // up
           if (isValid(y - 1, x)) {
               if (maze[y - 1][x] == 2) {
                   movimientos.add("Moved up. You won");
                   return (String[]) movimientos.toArray();
               } else if (maze[y - 1][x] == 1) {
                   movimientos.add("Moved up");
                   path.push(new Position(y - 1, x));
                   continue;
               }
           }

           // right
           if (isValid(y, x + 1)) {
               if (maze[y][x + 1] == 2) {
                   movimientos.add("Moved right. You won");
                   return (String[]) movimientos.toArray();
               } else if (maze[y][x + 1] == 1) {
                   movimientos.add("Moved right");
                   path.push(new Position(y, x + 1));
                   continue;
               }
           }

           path.pop();
           movimientos.add("Moved back");
           if (path.size() <= 0) {
               return (String[]) movimientos.toArray();
           }
       }

   }

   private static boolean isValid(int y, int x) {
       if (y < 0 ||
               y >= maze.length ||
               x < 0 ||
               x >= maze[y].length) {
           return false;
       }
       return true;
   }

}
