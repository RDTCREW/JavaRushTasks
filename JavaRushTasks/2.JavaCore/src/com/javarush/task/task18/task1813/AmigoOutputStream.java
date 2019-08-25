package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream outputStream;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    public AmigoOutputStream(FileOutputStream outputStream) throws FileNotFoundException {
        //super(null);
        super("/dev/null");
        this.outputStream = outputStream;
    }


    @Override
    public void close() throws IOException {
        this.outputStream.flush();
        this.outputStream.write("JavaRush © All rights reserved.".getBytes());
        this.outputStream.close();
    }

    @Override
    public void write(int b) throws IOException {
        this.outputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.outputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.outputStream.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        this.outputStream.flush();
    }
}
