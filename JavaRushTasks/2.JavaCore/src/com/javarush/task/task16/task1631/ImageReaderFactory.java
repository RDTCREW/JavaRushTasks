package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

        public static ImageReader getImageReader(ImageTypes imageType ){

            if (imageType == null){
                throw new IllegalArgumentException("Неизвестный тип картинки");
            } else if (imageType == ImageTypes.JPG){
                return new JpgReader();
            } else if (imageType == ImageTypes.PNG){
                return new PngReader();
            } else if (imageType == ImageTypes.BMP){
                return new BmpReader();
            } else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
            //return (ImageReader)null;
        }


}
