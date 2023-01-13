public class People implements Runnable{

    private int NumP;

    public enum Gender{
        HOME, DONE, NEN
    }
    Gender Gender;

    public People(int numP, Gender gender) {
        NumP = numP;
        Gender = gender;
    }

    @Override
    public void run() {
        for (;;){
            goToBathromm();
            leaveToBathroom();
        }
    }

    private void goToBathromm(){

    }

    private void leaveToBathroom(){

    }
}
