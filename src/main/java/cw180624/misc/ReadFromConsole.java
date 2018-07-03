package cw180624.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFromConsole {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    Reader reader = new InputStreamReader(System.in);

    String input = reader.readLine();

    System.out.println(input + "!!!");
  }
}
