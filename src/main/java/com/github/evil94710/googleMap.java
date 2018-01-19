package com.github.evil94710;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class googleMap{

  public void openGoogleMap() throws Exception {
      Scanner keyboard = new Scanner(System.in);
      String input = keyboard.nextLine();
      Desktop d = Desktop.getDesktop();
      String url = "https://www.google.com.tw/maps/place/" + input;
      d.browse(new URI(url));
      keyboard.close();
  }

}
