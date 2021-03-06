package JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	
	ContentPaneEx() {
		setTitle("ContentPane과 JFrame 예제"); // 프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane(); 
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); // FlowLayout의 배치 관리자: 컴포넌트를 순서대로 부착하는 일을 맡은 객체 
		
		contentPane.add(new JButton("OK")); 
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150); // 프레임 크기 300 X 150
		setVisible(true); // 화면에 프레임 출력 
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
