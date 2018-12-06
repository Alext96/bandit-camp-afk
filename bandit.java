import java.awt.*;
import java.awt.event.MouseEvent;

public class bandit {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        for (int x=0; x<1620;x++) {
            int randomClick = (60+ (int) (Math.random()*500));
            int randomValue = (490000+ (int) (Math.random()*100000));
            int randomWait = (500+ (int) (Math.random()*2000));

            System.out.println(randomValue);
            System.out.println(randomClick);
            System.out.println(randomWait);

            Thread.sleep(randomWait);

            Thread.sleep(randomValue);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(randomClick);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(randomWait);
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(randomClick);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }


    }

}
