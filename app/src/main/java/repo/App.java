/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package repo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;

public class App {

    public static void main(String[] args) {

//        String newFileName;
//
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter image path :");
//        String path = scanner.nextLine();
//        System.out.println("Enter output path :");
//         newFileName = null;
//        newFileName = scanner.nextLine();
//
//
//        Bitmap bitmap = new Bitmap(path ,newFileName);

        Bitmap bitmap = new Bitmap(args[0]);


//    try {
//
//
//        BufferedImage image = ImageIO.read(new File(args[0]));
//        Bitmap imageManpulation = new Bitmap() ;
//
//    }
//    catch (Exception e){
//        e.getMessage();
//    }

        boolean flag = true;
        while (flag) {

            //System.out.println("Choose an option :");

         //   System.out.println("\n1: Invert the image\n2: Apply black and white filter\n3: Rotate the image\n4: Exit the program");

            String choice = scanner.next();
            switch (choice) {

                case "invert": {

                    bitmap.invert();

                    break;
                }
                case "light": {

                    bitmap.light();
                    break;
                }
                case "vflip": {

                    bitmap.vflip();
                    break;
                }
//                case 3: {
//                    System.out.println("Do you want it to be 1 : ClockWise OR 2 : CounterClockWise ?");
//                    boolean validator = true;
//                    int angle = scanner.nextInt();
//                    while (validator) {
//                        validator = false;
//                        if (angle == 1) {
//                            angle = 90;
//                        } else if (angle == 2) {
//                            angle = -90;
//                        } else {
//                            System.out.println("Enter a correct choice!");
//                            angle = scanner.nextInt();
//                            validator = true;
//                        }
//                    }
//                    newimage.imageRotate(angle);
//                    break;
//                }
//                case 5: {
//                    replay = false;
//                    scanner.close();
//                }
            }
        }

        bitmap.save(args[2]);

    }
    public static String Menu(){
        return "\\n1: Invert the image\\n2: light filter\\n3: Rotate the image\\n4: Exit the program\"";
    }


}