import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Krystian krystian = new Krystian();
        Roch roch = new Roch();

        ArrayList<Uczen> uczniowie = new ArrayList<>();
        uczniowie.add(krystian);
        uczniowie.add(roch);

        for(Uczen u: uczniowie){
            System.out.println(u.getClass().getName());
            u.uczSie();
        }
    }
}
