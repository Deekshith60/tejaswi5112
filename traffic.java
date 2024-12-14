 import java.awt.*;
 import java.awt.event.*;
 import java.applet;
 public class traffic extends applet implements itemlistener
 {
 public void colournum()
 checkbox group cbg;
 checkbox red,yellow,green;
 string msg="";
 public void int()
 checkbox=new checkbox group();
 red=new checkbox("RED",cbg,true);
 yellow=new checkbox("YELLOW",cbg,true);
 green=new checkbox("GREEN",cbg,true);
 add(red);
 add(yellow);
 add(green);
 red.add itemlistener(this);
 yellow.add itemlistener(this);
 green.add itemlistener(this);
 
