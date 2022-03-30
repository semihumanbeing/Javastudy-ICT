package mymain;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class newEmployee extends JFrame {

	public newEmployee() {

		super("사원등록");

		// 입력컨트롤
		initNorthInputComponents();
		// 자기소개창
		initCenterText();
		// 저장종료
		initButtons();

		// 위치 정하기
		this.setLocation(200, 100);
		// 크기정하기
		//this.setSize(300, 400);
		pack();
		this.setResizable(true);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initNorthInputComponents() {
		JPanel northP = new JPanel(new GridLayout(6, 1));

		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
		// 1번줄
		JPanel p1 = new JPanel(fl);
		JLabel namelabel = new JLabel("성       명: ",JLabel.RIGHT);
		JTextField nameText = new JTextField(10);
		JLabel genderlabel = new JLabel("성 별: ",JLabel.RIGHT);
		JRadioButton malebutton = new JRadioButton("남");
		JRadioButton femalebutton = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(malebutton);
		bg.add(femalebutton);
		
		p1.add(namelabel);
		p1.add(nameText);
		p1.add(genderlabel);
		p1.add(malebutton);
		p1.add(femalebutton);
		// 2번줄
		JPanel p2 = new JPanel(fl);
		JLabel ssn = new JLabel("주민번호: ",JLabel.RIGHT);
		JTextField ssnfield1 = new JTextField(10);
		JLabel space = new JLabel("-");
		JTextField ssnfield2 = new JTextField(10);
		p2.add(ssn);
		p2.add(ssnfield1);
		p2.add(space);
		p2.add(ssnfield2);
		// 3번줄
		JPanel p3 = new JPanel(fl);
		JLabel address = new JLabel("주       소: ",JLabel.RIGHT);
		JTextField addressText = new JTextField(30);
		p3.add(address);
		p3.add(addressText);
		
		// 4번줄
		JPanel p4 = new JPanel(fl);
		JLabel department = new JLabel("부  서  명: ",JLabel.RIGHT);
		String[] depArray = {"총무부","꽈배기먹기부","강아지동영상감상부","섹스부","명박전여친부"};
		JComboBox<String> departmentBox = new JComboBox<String>(depArray);
		p4.add(department);
		p4.add(departmentBox);
		
		// 5번줄
		JPanel p5 = new JPanel(fl);
		JLabel hobby = new JLabel("취        미: ",JLabel.RIGHT);
		JCheckBox hobbyCheckbox1 = new JCheckBox("운동");
		JCheckBox hobbyCheckbox2 = new JCheckBox("음악");
		JCheckBox hobbyCheckbox3 = new JCheckBox("영화");
		JCheckBox hobbyCheckbox4 = new JCheckBox("독서");
		p5.add(hobby);
		p5.add(hobbyCheckbox1);
		p5.add(hobbyCheckbox2);
		p5.add(hobbyCheckbox3);
		p5.add(hobbyCheckbox4);
		// 6번줄
		JPanel p6 = new JPanel(fl);
		JLabel profile = new JLabel("자기소개",JLabel.RIGHT);
		p6.add(profile);

		// 각 패널을 north 패널에 추가한다.

		northP.add(p1);
		northP.add(p2);
		northP.add(p3);
		northP.add(p4);
		northP.add(p5);
		northP.add(p6);

		this.add(northP, "North");
		
		Dimension d = new Dimension(60,20);
		namelabel.setPreferredSize(d);
		genderlabel.setPreferredSize(d);
		ssn.setPreferredSize(d);
		address.setPreferredSize(d);
		department.setPreferredSize(d);
		hobby.setPreferredSize(d);
		profile.setPreferredSize(d);
		

	}

	private void initCenterText() {
		JTextArea textProfile = new JTextArea();
		JScrollPane jsp = new JScrollPane(textProfile);
		jsp.setPreferredSize(new Dimension(100,150));
		this.add(jsp,"Center");
		
		
		

	}

	private void initButtons() {
		JPanel p = new JPanel();
		JButton saveButton = new JButton("저장");
		JButton exitButton = new JButton("종료");
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		p.add(saveButton);
		p.add(exitButton);
		
		this.add(p, "South");
	}

	public static void main(String[] args) {
		new newEmployee();

	}

}
