package com.irinaserova;

import java.awt.Graphics2D;

import javax.swing.JComponent;

import com.sun.prism.Graphics;
import com.sun.prism.paint.Color;

class JCanvas extends JComponent
{
   public void paintComponent(Graphics g) 
 {

    Graphics2D g2 = (Graphics2D) g;
      super.paintComponents((java.awt.Graphics) g);
      g2.setClip(Color.RED);   
      g2.drawRect(10,10,100,100);


   }
 }

