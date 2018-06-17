package com.yr.JavaCoreProject.images_comparizon;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagesComparizonTest {
    public static void main(String[] args) {
        File firstImage = new File("src/main/resources/image1.png");
        File secondImage = new File("src/main/resources/image2.png");

        try {
            BufferedImage firstBufferdImage = ImageIO.read(firstImage);
            BufferedImage secondBufferdImage = ImageIO.read(secondImage);

            File outputFile = new File("src/main/resources/difference.png");
            ImageIO.write(compareTwoImages(firstBufferdImage, secondBufferdImage), "png", outputFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static BufferedImage compareTwoImages(BufferedImage fstImage, BufferedImage sndImage) {
        for (int y = 0; y < fstImage.getHeight(); y++) {
            for (int x = 0; x < fstImage.getWidth(); x++) {
                int clr = fstImage.getRGB(x, y);
                int lll = sndImage.getRGB(x, y);
                if (clr != lll) {
                    sndImage.setRGB(x, y, Color.RED.getRGB());
                }
            }
        }
        return sndImage;
    }
}
