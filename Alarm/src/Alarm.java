import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of times to ring? ");
        int numRings = Integer.parseInt(scanner.next());

        System.out.println("Ring interval in seconds? ");
        int ringInterval = Integer.parseInt(scanner.next());

        Alarm alarm = new Alarm();
        alarm.start(ringInterval, numRings);

        System.out.println(Thread.currentThread().getName());
    }
    private Timer timer;

    private void start(int ringInterval, int numRings){

         timer = new Timer();
         timer.scheduleAtFixedRate(new Ring(numRings), ringInterval * 1000, ringInterval * 1000);

    }

    private void stop(){
        timer.cancel();
        System.out.println(Thread.currentThread().getName());
    }

    private class Ring extends TimerTask{

        private int numRings;

        public Ring(int numRings){
            this.numRings = numRings;
        }

        @Override
        public void run() {
            System.out.println("Alarm is ringing...");
            System.out.println(Thread.currentThread().getName());

            numRings--;

            if(numRings == 0){
                System.out.println("Alarm canceled");
                stop();
            }
        }
    }

}
