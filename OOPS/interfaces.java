public class interfaces {
    public static void main(String args[])
    {
       Queen q=new Queen();
       q.moves();
    }
}

interface chessplayer{
   void moves();
}

class Queen implements chessplayer{
     public void moves()
     {
        System.out.println("lest,right,up,down,diagonal(in all 4 dirns)");
     }
}

class Rook implements chessplayer{
    public void moves()
    {
        System.out.println("left,right,up,down");
    }
}

class King implements chessplayer{
    public void moves(){
        System.out.println("left,right,up,down,diagonal(in one step)");
    }
}