/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.callback.employeeis.components;

import java.awt.event.KeyEvent;

/**
 *
 * @author HAZIQ
 */
public class Event {

  public Event() {
  }
  
  public static boolean onEnter(KeyEvent evt) {
    return evt.getKeyCode() == 10;
  }
  
}
