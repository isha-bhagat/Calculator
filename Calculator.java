import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Calculator.class" width="1000" height="850">
</applet>
*/
public class Calculator extends Applet implements ActionListener
{
Color r1,r2,r3;
TextField z;
Button a,b,c,d,e,f,g1,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w;
double a4,b4,c4;
char op;
public void init()
{
setLayout(null);
r1=new Color(204,204,204);
r2=new Color(100,100,53);
r3=new Color(0,0,153);
z = new TextField(50);

a = new Button("ABS");
b = new Button("Backspace");
c = new Button("Clear");
d = new Button("7");
e = new Button("8");
f = new Button("9");
g1 = new Button("+");
h = new Button("%");
i = new Button("4");
j = new Button("5");
k = new Button("6");
l = new Button("-");
m = new Button("=");
n = new Button("1");
o = new Button("2");
p = new Button("3");
q = new Button("*");
r = new Button("SQRT");
s = new Button("0");
t = new Button(".");
u = new Button("+/-");
v = new Button("/");
w = new Button("1/x");
add(a);
add(b);
add(c);
add(c);
add(d);
add(e);
add(f);
add(g1);
add(h);
add(i);
add(j);
add(k);
add(l);
add(m);
add(n);
add(o);
add(p);
add(q);
add(r);
add(s);
add(t);
add(u);
add(v);
add(w);
a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
d.addActionListener(this);
e.addActionListener(this);
f.addActionListener(this);
g1.addActionListener(this);
h.addActionListener(this);
i.addActionListener(this);
j.addActionListener(this);
k.addActionListener(this);
l.addActionListener(this);
m.addActionListener(this);
n.addActionListener(this);
o.addActionListener(this);
p.addActionListener(this);
q.addActionListener(this);
r.addActionListener(this);
s.addActionListener(this);
t.addActionListener(this);
u.addActionListener(this);
v.addActionListener(this);
w.addActionListener(this);

a.setBounds(150,300,100,50);
b.setBounds(450,300,100,50);
c.setBounds(750,300,100,50);
d.setBounds(150,400,80,50);
e.setBounds(300,400,80,50);
f.setBounds(450,400,80,50);
g1.setBounds(600,400,80,50);
h.setBounds(750,400,80,50);
i.setBounds(150,500,80,50);
j.setBounds(300,500,80,50);
k.setBounds(450,500,80,50);
l.setBounds(600,500,80,50);
m.setBounds(750,500,80,50);
n.setBounds(150,600,80,50);
o.setBounds(300,600,80,50);
p.setBounds(450,600,80,50);
q.setBounds(600,600,80,50);
r.setBounds(750,600,80,50);
s.setBounds(150,700,80,50);
t.setBounds(300,700,80,50);
u.setBounds(450,700,80,50);
v.setBounds(600,700,80,50);
w.setBounds(750,700,80,50);
add(z);
z.setBounds(100,100,800,150);
}

public void actionPerformed(ActionEvent e1)
{
String s1=e1.getActionCommand();

if(s1.equals("1"))
{
String s4=z.getText().concat("1");
z.setText(s4);
}

if(s1.equals("2"))
{
String s4=z.getText().concat("2");
z.setText(s4);
}

if(s1.equals("3"))
{
String s4=z.getText().concat("3");
z.setText(s4);
}

if(s1.equals("4"))
{
String s4=z.getText().concat("4");
z.setText(s4);
}

if(s1.equals("5"))
{
String s4=z.getText().concat("5");
z.setText(s4);
}

if(s1.equals("6"))
{
String s4=z.getText().concat("6");
z.setText(s4);
}

if(s1.equals("7"))
{
String s4=z.getText().concat("7");
z.setText(s4);
}

if(s1.equals("8"))
{
String s4=z.getText().concat("8");
z.setText(s4);
}

if(s1.equals("9"))
{
String s4=z.getText().concat("9");
z.setText(s4);
}

if(s1.equals("0"))
{
String s4=z.getText().concat("0");
z.setText(s4);
}
if(s1.equals("."))
{
String s4=z.getText();
z.setText(s4);
}

if(s1.equals("Clear"))
{
z.setText("");
}


if(s1.equals("+"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='+';
}

if(s1.equals("-"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='-';
}

if(s1.equals("*"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='*';
}

if(s1.equals("/"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='/';
}

if(s1.equals("%"))
{
a4=Double.parseDouble(z.getText());
z.setText("");
op='%';
}

if(s1.equals("="))
{
b4=Double.parseDouble(z.getText());

switch(op)
{
case'+':
c4=a4+b4;
z.setText(""+c4);
break;
case'-':
c4=a4-b4;
z.setText(""+c4);
break;
case'*':
c4=a4*b4;
z.setText(""+c4);
break;
case'/':
c4=a4/b4;
z.setText(""+c4);
break;
case'%':
c4=a4%b4;
z.setText(""+c4);
break;
}
}

if(s1.equals("SQRT"))
{
a4=Double.parseDouble(z.getText());
b4=Math.sqrt(a4);
z.setText(""+b4);
}
if(s1.equals("+/-"))
{
a4=Double.parseDouble(z.getText());
b4=-1.0*a4;
z.setText(""+b4);
}
if(s1.equals("ABS"))
{
a4=Double.parseDouble(z.getText());
b4=Math.abs(a4);
z.setText(""+b4);
}

if(s1.equals("1/x"))
{
a4=Double.parseDouble(z.getText());
b4=1.0/a4;
z.setText(""+b4);
}

if(s1.equals("Backspace"))
{
int a4=Integer.parseInt(z.getText());
int b4=a4/10;
z.setText(""+b4);
}
}
public void paint(Graphics g)
{
g.drawRect(50, 20,900,800);
setBackground(r1);
setForeground(r3);
a.setForeground(r3);
b.setForeground(r3);
c.setForeground(r3);
d.setForeground(r3);
e.setForeground(r3);
f.setForeground(r3);
g1.setForeground(r3);

h.setForeground(r3);
i.setForeground(r3);

j.setForeground(r3);
k.setForeground(r3);
l.setForeground(r3);
m.setForeground(r3);
n.setForeground(r3);

o.setForeground(r3);
p.setForeground(r3);
q.setForeground(r3);
r.setForeground(r3);
s.setForeground(r3);
t.setForeground(r3);

u.setForeground(r3);
v.setForeground(r3);
w.setForeground(r3);
}



}
