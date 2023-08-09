// Interface defining a contract for playing musical instruments
interface Instrument {
    void play();
    void tune();
}

// Concrete classes implementing the Instrument interface
class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the guitar");
    }
}

class Flute implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing the flute");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the flute");
    }
}

public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument flute = new Flute();

        guitar.tune();
        guitar.play();

        flute.tune();
        flute.play();
    }
}
