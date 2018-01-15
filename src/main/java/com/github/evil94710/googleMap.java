package com.github.evil94710;

import java.awt.Desktop;
import java.net.URI;

public class googleMap {

  public void openGoogleMap() throws Exception {
    Desktop d = Desktop.getDesktop();
    d.browse(new URI("https://www.google.com.tw/maps/"));
  }

}