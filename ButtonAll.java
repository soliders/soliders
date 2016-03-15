import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;
/**
 * 
 * @author solider
 * 实现按键的创建及相应事件的监听
 *
 */
public class ButtonAll extends JButton implements ActionListener{
	
	protected JButton [] jNumBtn = new JButton[10];
	protected JButton [] jOprBtn = new JButton[4];//加减乘除按钮数组
	private String [] jOprString = {"+","-","*","/"};
	private String tempString;//存储具体运算时所需要的临时运算符号
	private int operNum = 1, firstNumFlag = 1;//记录运算符的输入次数，默认只允许进行单次运算操作
	private double tempOne = 0,tempTwo = 0;//记录两次输入的数据，以实现算术运算
	private int tempLength = 0;//记录第一次输入了运算符后的文本框result中字符串长度
	private int pointNum = 0;//记录输入的小数点个数
	protected JButton mc,mr,ms,madd,mdec,point,equal,dshu,percent,sqrtOper,ce,c,back,oppsite;//相应的功能键
	protected JTextField result = new JTextField();
	
	public ButtonAll(){
		
		//创建数字按钮
		for(int i=0; i<jNumBtn.length; i++){
			jNumBtn[i] = new JButton();
			jNumBtn[i].setText(String.valueOf(i));
			jNumBtn[i].addActionListener(this);
			
		}
		//jNumBtn[0].
		
		//创建运算符按钮
		for(int i=0; i<jOprBtn.length ; i++){
			jOprBtn[i] = new JButton();
			jOprBtn[i].setText(jOprString[i]);
			jOprBtn[i].addActionListener(this);
		}
		
		//创建功能按钮
		mc = new JButton("MC");
		mc.addActionListener(this);
		mr = new JButton("MR");
		mr.addActionListener(this);
		ms = new JButton("MS");
		ms.addActionListener(this);
		madd = new JButton("M+");
		madd.addActionListener(this);
		mdec = new JButton("M-");
		mdec.addActionListener(this);
		point = new JButton(".");
		point.addActionListener(this);
		equal = new JButton("=");
		equal.addActionListener(this);
		dshu = new JButton("1/X");
		dshu.addActionListener(this);
		percent = new JButton("%");
		percent.addActionListener(this);
		sqrtOper = new JButton("√");
		sqrtOper.addActionListener(this);
		ce = new JButton("CE");
		ce.addActionListener(this);
		c = new JButton("C");
		c.addActionListener(this);
		back = new JButton("←");
		back.addActionListener(this);
		oppsite = new JButton("+/-");
		oppsite.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		/**
		 * 判断是否单击了数据按键并做出事件响应
		 */
		for (int i = 0; i < this.jNumBtn.length; i++) {
			if (e.getSource() == this.jNumBtn[i] && firstNumFlag == 1) {
				if (result.getText().equals("0")) {
					result.setText(jNumBtn[i].getText());
				} else {
					result.setText(result.getText() + jNumBtn[i].getText());
				}
			} else if (e.getSource() == this.jNumBtn[i]) {
				result.setText(result.getText() + jNumBtn[i].getText());
				operNum = 2;
			}
		}

		/**
		 * 做出运算符按钮的事件响应 若是第一次点击运算符，则显示在文件框中，若是多次输入则指定最后一次输入的运算符为有效运算符
		 * 规定本计算器只能进行单次的算术运算
		 * 
		 */
		for (int i = 0; i < this.jOprBtn.length; i++) {

			if (operNum == 1 && e.getSource() == this.jOprBtn[i]) {
				String resString = result.getText();

				if ((e.getSource() == this.jOprBtn[i])
						&& (!(resString.substring(resString.length() - 1)).equals(jOprString[0]))
						&& (!(resString.substring(resString.length() - 1)).equals(jOprString[1])
								&& (!(resString.substring(resString.length() - 1)).equals(jOprString[2]))
								&& (!(resString.substring(resString.length() - 1)).equals(jOprString[3])))) {
					// System.out.println(resString.substring(resString.length()-1));
					result.setText(resString + jOprBtn[i].getText());
				} else if (e.getSource() == this.jOprBtn[i]) {
					result.setText(resString.substring(0, resString.length() - 1) + jOprBtn[i].getText());
				}
				resString = result.getText();
				tempLength = resString.length();
				resString = resString.substring(0, tempLength - 1);
				//System.out.println(resString);
				tempOne = Double.parseDouble(resString); // 临时记录第一个运算数
				// System.out.println(String.valueOf(tempOne));

				firstNumFlag = 2;
			} else if (e.getSource() == this.jOprBtn[i]) {
				result.setText("0");
				JOptionPane.showMessageDialog(null, "本计算机器只能运行<<单次>>算术运算", "about help", JOptionPane.WARNING_MESSAGE);
				operNum = 1;
				firstNumFlag = 1;
				tempOne = 0;
				tempTwo = 0;
				tempLength = 0;
			}
		}

		if (e.getSource() == this.c) {
			//清空所有内容，计算器恢复到初始状态
			result.setText("0");
			this.operNum = 1;
			this.firstNumFlag = 1;
			this.tempOne = 0;
			this.tempTwo = 0;
			this.tempLength = 0;
			this.pointNum = 0;
		} else if (e.getSource() == this.mc) {

			JOptionPane.showMessageDialog(null, "本计算器暂不涉及存储器操作，故本功能暂时不实现！！", "特别提示", JOptionPane.WARNING_MESSAGE);
			operNum = 1;
			firstNumFlag = 1;
			tempOne = 0;
			tempTwo = 0;
			tempLength = 0;

		} else if (e.getSource() == this.mr) {

			JOptionPane.showMessageDialog(null, "本计算器暂不涉及存储器操作，故本功能暂时不实现！！", "特别提示", JOptionPane.WARNING_MESSAGE);
			operNum = 1;
			firstNumFlag = 1;
			tempOne = 0;
			tempTwo = 0;
			tempLength = 0;

		} else if (e.getSource() == this.ms) {

			JOptionPane.showMessageDialog(null, "本计算器暂不涉及存储器操作，故本功能暂时不实现！！", "特别提示", JOptionPane.WARNING_MESSAGE);
			operNum = 1;
			firstNumFlag = 1;
			tempOne = 0;
			tempTwo = 0;
			tempLength = 0;

		} else if (e.getSource() == this.madd) {

			JOptionPane.showMessageDialog(null, "本计算器暂不涉及存储器操作，故本功能暂时不实现！！", "特别提示", JOptionPane.WARNING_MESSAGE);
			operNum = 1;
			firstNumFlag = 1;
			tempOne = 0;
			tempTwo = 0;
			tempLength = 0;

		} else if (e.getSource() == this.mdec) {

			JOptionPane.showMessageDialog(null, "本计算器暂不涉及存储器操作，故本功能暂时不实现！！", "特别提示", JOptionPane.WARNING_MESSAGE);
			operNum = 1;
			firstNumFlag = 1;
			tempOne = 0;
			tempTwo = 0;
			tempLength = 0;

		} else if (e.getSource() == this.point) {

			String resString = result.getText();
			tempString = resString.substring(resString.length() - 1, resString.length());
			if (pointNum == 0 && !(firstNumFlag == 2 && operNum == 2)){
				//第一次输入小数时的处理
				tempString = result.getText();
				result.setText(tempString + ".");
				pointNum ++ ;
			}else if((pointNum == 1) && (tempString.equals("+") || tempString.equals("-") || tempString.equals("*") || tempString.equals("/"))){
				//第二次输入小数点并且是在运算符后发直接输入时的处理
				tempString = result.getText();
				result.setText(tempString + "0.");
				pointNum ++ ;
			} else if (tempString.equals(".")){
				//连续输入小数点时的处理
				result.setText(result.getText());
			} else if(firstNumFlag == 1 && pointNum != 0){
				//防止在第一个小数中出现类似3.3.3这样多个小数点的情况 
				tempString = result.getText();
				result.setText(tempString);
			} else if (firstNumFlag == 2 && operNum == 2 && pointNum == 2){
				//防止出现2.5+3.3.3这样的情况出现
				tempString = result.getText();
				result.setText(tempString);
			} if (firstNumFlag == 2 && operNum == 2 && (!tempString.equals("+") && !tempString.equals("-") && !tempString.equals("*") && !tempString.equals("/")) && pointNum < 2){
				//实现两个小数想加的操作
				tempString = result.getText();
				result.setText(tempString + ".");
				pointNum ++ ;
			}
			
		} else if (e.getSource() == this.equal) {

			if (firstNumFlag == 2 && operNum == 2) {
				//正常输入了两个数字和一个运算符，计算其结果
				double tempResult = 0;
				String resString = result.getText();
				tempString = resString.substring(tempLength - 1, tempLength);
				System.out.println(tempString);
				tempTwo = Double.parseDouble(resString.substring(tempLength));

				if (tempString.equals(this.jOprString[0])) {
					tempResult = tempOne + tempTwo;
				} else if (tempString.equals(this.jOprString[1])) {
					tempResult = tempOne - tempTwo;
				} else if (tempString.equals(this.jOprString[2])) {
					tempResult = tempOne * tempTwo;
				} else if (tempString.equals(this.jOprString[3])) {
					tempResult = tempOne / tempTwo;
				}
				// System.out.println(tempString);
				// System.out.println(String.valueOf(tempOne));
				System.out.println(String.valueOf(tempTwo));
				// System.out.println(String.valueOf(tempResult));
				result.setText(String.valueOf(tempResult));
				this.operNum = 1;
				this.firstNumFlag = 1;
				this.tempOne = 0;
				this.tempTwo = 0;
				this.tempLength = 0;

				// System.out.print(tempString);
			} else if (firstNumFlag == 1) {
				// 只输入了第一个数字
				String resString = result.getText();
				result.setText(resString);
				this.operNum = 1;
				this.firstNumFlag = 1;
				this.tempOne = 0;
				this.tempTwo = 0;
				this.tempLength = 0;

			} else if (firstNumFlag == 2) {
				// 输入了第一个数字和第一个运算符
				String resString = result.getText();
				this.tempLength = resString.length();
				tempString = resString.substring(0, tempLength - 1);
				// System.out.println(tempString);
				result.setText(tempString);
				this.operNum = 1;
				this.firstNumFlag = 1;
				this.tempOne = 0;
				this.tempTwo = 0;
				this.tempLength = 0;
			}

		} else if (e.getSource() == this.dshu) {
			
			if (firstNumFlag == 1) {
				// 只输入了第一个数字,求其倒数
				String resString = result.getText();
				double num = Double.parseDouble(resString);
				if(num != 0){
					num = 1 / num;
					resString = String.valueOf(num);
					result.setText(resString);
				}else {
					JOptionPane.showMessageDialog(null, "0不能求倒数！！", "特别提示",
							JOptionPane.WARNING_MESSAGE);
				}
			}else{
				result.setText(result.getText());
				JOptionPane.showMessageDialog(null, "不符合求倒数的规则！！", "特别提示",
						JOptionPane.WARNING_MESSAGE);
			}
			
		} else if (e.getSource() == this.percent) {

			if (firstNumFlag == 1) {
				// 只输入了第一个数字,求其百分比
				String resString = result.getText();
				double num = Double.parseDouble(resString);
				num = num / 100;
				resString = String.valueOf(num);
				result.setText(resString);
			}else{
				result.setText(result.getText());
				JOptionPane.showMessageDialog(null, "不符合求相百分比的规则！！", "特别提示",
						JOptionPane.WARNING_MESSAGE);
			}
			
		} else if (e.getSource() == this.sqrtOper) {
			
			if (firstNumFlag == 1) {
				// 只输入了第一个数字,求其百分比
				String resString = result.getText();
				double num = Double.parseDouble(resString);
				if(num >= 0){
					num = Math.sqrt(num);
					resString = String.valueOf(num);
					result.setText(resString);
				}else{
					result.setText(result.getText());
					JOptionPane.showMessageDialog(null, "负数不能进行求根操作！！", "特别提示",
							JOptionPane.WARNING_MESSAGE);
				}
				
			}else{
				result.setText(result.getText());
				JOptionPane.showMessageDialog(null, "不符合求根规则！！", "特别提示",
						JOptionPane.WARNING_MESSAGE);
			}

		} else if (e.getSource() == this.ce) {

			JOptionPane.showMessageDialog(null, "本计算器暂不涉及存储器操作，暂时无法实现输入内容与显示内容分开并存，故本功能暂时不实现！！", "特别提示",
					JOptionPane.WARNING_MESSAGE);
			operNum = 1;
			firstNumFlag = 1;
			tempOne = 0;
			tempTwo = 0;
			tempLength = 0;

		} else if (e.getSource() == this.back) {
			//实现退格功能
			String resString = result.getText();
			this.tempLength = resString.length();
			if (tempLength != 1) {
				resString = resString.substring(0, tempLength - 1);
				result.setText(resString);
			}
			if (tempLength == 0 || tempLength == 1) {
				result.setText("0");
				this.operNum = 1;
				this.firstNumFlag = 1;
				this.tempOne = 0;
				this.tempTwo = 0;
				this.tempLength = 0;
			}

		} else if (e.getSource() == this.oppsite) {
			if (firstNumFlag == 1) {
				// 只输入了第一个数字,根据其大小，求其相反数
				String resString = result.getText();
				double num = Double.parseDouble(resString);
				if(num>0){
					result.setText("-" + resString);
				}else if (num < 0){
					double temp = Math.abs(num);
					result.setText(String.valueOf(temp));
				}else{
					result.setText(resString);
				}
			}else{
				result.setText(result.getText());
				JOptionPane.showMessageDialog(null, "不符合求相反数的规则！！", "特别提示",
						JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}
}

	
	