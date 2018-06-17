package com.yr.JavaCoreProject.images_comparizon;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagesForComparizon {

    public static final String RESOURCES_PATH = "src/main/resources/";

    public static void main(String[] args) {
        File image1 = new File(RESOURCES_PATH + "img1.png");
        File image2 = new File(RESOURCES_PATH + "img2.png");
        File image3 = new File(RESOURCES_PATH + "image3.png");
        File image4 = new File(RESOURCES_PATH + "image4.png");

        try {
            BufferedImage bufImage1 = ImageIO.read(image1);
            BufferedImage bufImage2 = ImageIO.read(image2);
            BufferedImage bufImage3 = ImageIO.read(image3);
            BufferedImage bufImage4 = ImageIO.read(image4);

            File outputFile12 = new File(RESOURCES_PATH + "difile12.png");
            File outputFile123 = new File(RESOURCES_PATH + "outputFile123.png");
            File outputFile1234 = new File(RESOURCES_PATH + "difffile1234.png");

            // comparing image 1 and 2
            ImageIO.write(ImagesComparizonTest.compareTwoImages(bufImage1, bufImage2), "png", outputFile12);
            BufferedImage bufImage12 = ImageIO.read(outputFile12);

            // comparing images 1,2 and 3
            ImageIO.write(ImagesComparizonTest.compareTwoImages(bufImage12, bufImage3), "png", outputFile123);
            BufferedImage bufImage34 = ImageIO.read(outputFile123);

            // comparing images 1,2,3 and 4
            ImageIO.write(ImagesComparizonTest.compareTwoImages(bufImage34, bufImage4), "png", outputFile1234);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
