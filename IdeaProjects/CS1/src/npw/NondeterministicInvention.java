package npw;

import painter.SPainter;
import shapes.SRectangle;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Random;

import static javax.swing.SwingUtilities.invokeLater;

public class NondeterministicInvention {
    private String path = pathBuilder();
       private BufferedImage image = randomlyGetImageFromPath(path);
       private int height = image.getHeight();
       private int width = image.getWidth();
       private SPainter painter = new SPainter( "NondeterministicInvention", width, height );
       //Changing this stretches picture
               private double pixelSize = 1;
       private SRectangle rectanglePixel = new SRectangle( pixelSize,pixelSize );

               //----- Constructors  -----
               private NondeterministicInvention() throws IOException {
                   paintTheRows();
               }
       //----- Methods / Functions  -----
               public static void main(String[] args) {
                   invokeLater( () -> {
                           try {
                                   new NondeterministicInvention();
                               } catch (IOException e) {
                                   e.printStackTrace();
                               }
                       } );
               }

               private String pathBuilder(){
                   String separator = System.getProperty("file.separator");
                   String home = null;

                   //Make Program Compatible With Windows (I use windows :P )
                   if(System.getProperty("os.name").startsWith("Windows")) {
                           home = System.getProperty("user.dir");
                       }
                   else if(System.getProperty("os.name").startsWith("Windows 10")) {
                           home = System.getProperty("user.dir");
                       }
                   else {
                           home = System.getProperty("user.home");
                       }
                   String path = home + separator + "CS1Files" + separator + "data" + separator;
                   return path;
               }
       private BufferedImage randomlyGetImageFromPath(String path) throws IOException {

                   Random rgen = new Random();
                   File dataFolder = new File(path);

                   // Randomly choose any image from the folder (Scan for Jpg and PNG);
                   FilenameFilter filter = (dir, name) -> {
                           String lowercaseName = name.toLowerCase();
                           if (lowercaseName.endsWith(".jpg")  ) {
                                   return true;
                               }
                           else if (lowercaseName.endsWith(".png")){
                                   return true;
                               }
                           else if(lowercaseName.endsWith(".jpeg")) {
                                   return true;
                               }
                           else {
                                   return false;
                               }
                       };
                   File[] listOfFiles = dataFolder.listFiles(filter);
                   File randomPicture = listOfFiles[rgen.nextInt(listOfFiles.length)];
                   return ImageIO.read(randomPicture);
               }
       private Color getPixelColor(int x, int y) {
                   int rgb = image.getRGB( x, y );
                   int red = (rgb & 0x00ff0000) >> 16;
                   int green = (rgb & 0x0000ff00) >> 8;
                   int blue = (rgb & 0x000000ff);
                   Color PixelColor = new Color( red, green, blue );
                   return PixelColor;
               }
       private void paintOnePixel(int workingPixel, int workingRow){
                   Color pixelColor = getPixelColor( workingPixel, workingRow);
                  painter.setColor( pixelColor );
                  //Changing this may make pictures generate faster
                  painter.mrt( 1 );
                  painter.paint( rectanglePixel );
              }
      private void paintOneRow(int workingRow){
                  int pixelIterator = 0;
                  while (pixelIterator < image.getWidth()) {
                          paintOnePixel( pixelIterator, workingRow);
                          pixelIterator = pixelIterator +1;
                      }
              }
      private void paintTheRows(){
                  int rowCount = 0;
                  // Starts Off From Corner of Canvas
                  painter.moveTo( new Point2D.Double( 0, 0 ) );
                  for (int rowIterator = 0; rowIterator < image.getHeight(); rowIterator++) {
                          paintOneRow( rowIterator);
                          rowCount = rowCount + 1;
                          //System.out.println( "DEBUG: Row Count:  " + rowCount );
                          // Makes a new Row
                          painter.moveTo( new Point2D.Double( 0, rowIterator ));

                          if (rowCount == image.getHeight()) {
                                  break;
                              }
                      }
              }
  }
