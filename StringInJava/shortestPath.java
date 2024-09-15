package StringInJava;

public class shortestPath {
    public static float sortestPathToReachDestination(String str) {
        int x = 0;
        int y = 0;
        for(int i=0; i< str.length(); i++) {
            char dir = str.charAt(i);
            //north
            if(dir == 'N') {
                y++;
            } else if(dir == 'S') {//south
                y--;
            } else if (dir == 'E') {//east
                x++;
            } else {//west
                x--;
            }
        }
        /* pythagorus theorem */
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt( x2 + y2 );
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(sortestPathToReachDestination(str));
    }
}
