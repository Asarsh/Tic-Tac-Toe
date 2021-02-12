import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TicTacToe extends JFrame implements ActionListener{
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b, start, changePlayer;
	JPanel p; JLabel l;
	JTextField tf1, tf2;
	JDialog d;
	String player1="player1 WINS", player2="player2 WINS", turn1, turn2, win1, win2;
	int a[], inc = 2, count = 0; boolean check = false;
	
	TicTacToe(){
        setVisible(false);
        setLayout(null);
        setSize(400, 430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        a = new int[9];
	for(int k = 0; k< 9; k++){
		a[k] = inc;
		inc++;
		}
	}

	public void declare(){
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b = new JButton("OK");
		start = new JButton("Start new Game");
		changePlayer = new JButton("change player's name");
		p = new JPanel();
		l = new JLabel("WELCOME");
		tf1 = new JTextField("Player 1");
		tf2 = new JTextField("Player 2");
		d = new JDialog(this);
	}
	
	public void add(){
	add(p);add(l);add(start);add(changePlayer);
	p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
	b.addActionListener(this);b1.addActionListener(this);b2.addActionListener(this);
	b3.addActionListener(this);b4.addActionListener(this);b5.addActionListener(this);
	b7.addActionListener(this);b6.addActionListener(this);b8.addActionListener(this);
	b9.addActionListener(this);start.addActionListener(this);changePlayer.addActionListener(this);
	p.setBounds(75, 85, 240, 240);
	start.setBounds(10, 360, 180, 30);
	changePlayer.setBounds(210, 360, 180, 30);
	p.setLayout(new GridLayout(3,3));
	l.setBounds(130,15 , 200, 30);
	p.setBackground(Color.GREEN);
	}
	
	public void dialogfunction(){
		d.setSize(300, 200);
		d.setLayout(null);
		d.setResizable(false);
		d.add(tf1); d.add(tf2);
		tf1.setBounds(75, 10, 150, 40);
		tf2.setBounds(75, 60, 150, 40);
		b.setBounds(110, 120, 80, 30);
		d.add(b);
		d.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(count % 2 == 0){
                        l.setText(turn2);
                        }
                else { l.setText(turn1);}
		
		if(e.getSource() == start){
			count = 0; inc = 2;
			l.setText(turn1);
			check = false;
			for(int k = 0; k< 9; k++){
                		a[k] = inc;
                		inc++;
                		}
			b1.setEnabled(true);
			b1.setText("1");
			b2.setEnabled(true);
			b2.setText("2");
                        b3.setEnabled(true);
			b3.setText("3");
                        b4.setEnabled(true);
			b4.setText("4");
                        b5.setEnabled(true);
			b5.setText("5");
                        b6.setEnabled(true);
			b6.setText("6");
                        b7.setEnabled(true);
			b7.setText("7");
                        b8.setEnabled(true);
			b8.setText("8");
                        b9.setEnabled(true);
			b9.setText("9");             
			}

		else if(e.getSource() == changePlayer){
			setVisible(false);
			d.setVisible(true);
			}

		else if(e.getSource() == b){
			player1 = tf1.getText();
			player2 = tf2.getText();
			win1 = player1.concat(" WINS");
			win2 = player2.concat(" WINS"); 
			turn1 = player1.concat("'s TURN");
			turn2 = player2.concat("'s TURN");
			if(count % 2 == 0){
                        	l.setText(turn1);
                        	}
                	else { l.setText(turn2);}
			check();
			d.setVisible(false);
			setVisible(true);
			}
		else if(e.getSource() == b1){
			if(count % 2 == 0){
				b1.setText("X");
				a[0] = 1;}
			else{
				b1.setText("O");
				a[0] = 0;}
			b1.setEnabled(false);
			count++;
			check();
			}
		else if(e.getSource() == b2){
                        if(count % 2 == 0){
                                b2.setText("X");
				a[1] = 1;}
                        else{
                                b2.setText("O");
				a[1] = 0;}
                        b2.setEnabled(false);
			count++;
			check();
			}
		else if(e.getSource() == b3){
                        if(count % 2 == 0){
                                b3.setText("X");
				a[2] = 1;}
                        else{
                                b3.setText("O");
				a[2] = 0;}
                        b3.setEnabled(false);
			count++;check();}
		else if(e.getSource() == b4){
                        if(count % 2 == 0){
                                b4.setText("X");
				a[3] = 1;}
                        else{
                                b4.setText("O");
				a[3] = 0;}
                        b4.setEnabled(false);
			count++; 
			check();}
		else if(e.getSource() == b5){
                        if(count % 2 == 0){
                                b5.setText("X");
				a[4] = 1;}
                        else{
                                b5.setText("O");
				a[4] = 0;}
                        b5.setEnabled(false);
			count++; check();}
		else if(e.getSource() == b6){
                        if(count % 2 == 0){
                                b6.setText("X");
				a[5] = 1;}
                        else{
                                b6.setText("O");
				a[5] = 0;}
                        b6.setEnabled(false);
			count++; check();}
		else if(e.getSource() == b7){
                        if(count % 2 == 0){
                                b7.setText("X");
				a[6] = 1;}
                        else{
                                b7.setText("O");
				a[6] = 0;}
                        b7.setEnabled(false);
			count++; check();}
		else if(e.getSource() == b8){
                        if(count % 2 == 0){
                                b8.setText("X");
				a[7] = 1;}
                        else{
                                b8.setText("O");
				a[7] = 0;}
                        b8.setEnabled(false);
			count++; check();}
		else if(e.getSource() == b9){
                        if(count % 2 == 0){
                                b9.setText("X");
				a[8] = 1;}
                        else{
                                b9.setText("O");
				a[8] = 0;}
                        b9.setEnabled(false);
			count++; check();}

		}

	public void check(){
		if((a[0] == 0 && a[0] == a[1] && a[1] == a[2]) || (a[3] == 0 && a[3] == a[4] && a[4] == a[5]) 
			|| (a[6] == 0 && a[6] == a[7] && a[7] == a[8]) || (a[0] == 0 && a[0] == a[4] && a[4] == a[8]) ||
			(a[2] == 0 && a[2] == a[4] && a[4] == a[6]) || (a[0] == 0 && a[0] == a[3] && a[3] == a[6]) ||
			(a[1] == 0 && a[1] == a[4] && a[4] == a[7]) || (a[2] == 0 && a[2] == a[5] && a[5] == a[8]))
				{l.setText(win2); check = true;}
		else if((a[0] == 1 && a[0] == a[1] && a[1] == a[2]) || (a[3] == 1 && a[3] == a[4] && a[4] == a[5])
                        || (a[6] == 1 && a[6] == a[7] && a[7] == a[8]) || (a[0] == 1 && a[0] == a[4] && a[4] == a[8]) ||
                        (a[2] == 1 && a[2] == a[4] && a[4] == a[6]) || (a[0] == 1 && a[0] == a[3] && a[3] == a[6]) ||
                        (a[1] == 1 && a[1] == a[4] && a[4] == a[7]) || (a[2] == 1 && a[2] == a[5] && a[5] == a[8]))
				{ l.setText(win1); check = true;}
		else if(count == 9){l.setText("MATCH DRAW");}
		if(check){
				b1.setEnabled(false);
                                b2.setEnabled(false);
                                b3.setEnabled(false);
                                b4.setEnabled(false);
                                b5.setEnabled(false);
                                b6.setEnabled(false);
                                b7.setEnabled(false);
                                b8.setEnabled(false);
                                b9.setEnabled(false);
			}

			}

	public static void main(String[] args){
		TicTacToe t = new TicTacToe() ;
		t.declare();
		t.add();
		t.dialogfunction();
		}
	}
