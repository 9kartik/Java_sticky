/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author MauryaKa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.awt.AWTException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws AWTException, IOException {
        // TODO code application logic here
      // Throws AWTException

  Robot rb=new Robot();
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the x,y,width,height of capture");
  int x=10;
  int y=10;
  int width=60;
  int height=60;
  String file="kartik.png";
  // Get the BufferedImage object for writing to a fiel
  BufferedImage bim=rb.createScreenCapture(new Rectangle(x,y,width,height));
  /* Throws IOException
  * Write in PNG format. You can choose whatever format you want.
  * Write the image.
  * If you know the extension of the format.
  * Write to a file specified
  */
  ImageIO.write(bim,"PNG",new File(file));
 }

}
