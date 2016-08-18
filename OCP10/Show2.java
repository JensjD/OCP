import java.util.*;
public class Show2{
    private static final Show2 INSTANCE = new Show2();
    private Set<String> availableSeats;

    public static Show2 getInstance(){
        return INSTANCE;
    }
    private Show2(){
        availableSeats = new HashSet<String>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

    private static void ticketAgentBooks(String seat){
        Show2 show = Show2.getInstance();
        System.out.println(show.bookSeat(seat));
    }

    public static void main(String[] args){
        ticketAgentBooks("1A");
        ticketAgentBooks("1A");
    }
}
