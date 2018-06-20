package io;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Lesson2{
    public static void main0(String[] args) throws FileNotFoundException {
        InputStream in =
            new BufferedInputStream(
                new ProgressMonitorInputStream(
                        new Component() {
                            @Override
                            public String getName() {
                                return "stub";
                            }
                        },
                        "Reading...",
                        new FileInputStream("1")));
    }
}
