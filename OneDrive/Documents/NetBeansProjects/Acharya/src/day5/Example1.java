package day5;

public class Example1 {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        mt.setName("Adhil");
        mt.setTotal(200);
        System.out.println(mt.getName());
        System.out.println(mt.getTotal());
    }
}

class MovieTicket{
    private String name = "Adhil";
    private int total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}



