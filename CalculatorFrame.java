import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.*;

public class CalculatorFrame extends JFrame {	
	
	
	private JPanel jPanelUp, jPanelDown;
	public JTextField resultTF;;
	protected ButtonAll b = new ButtonAll();
	
		
	public CalculatorFrame(){
		
		Menu menu = new Menu();
		this.setSize(400, 450);
		this.JieMian(b.result);
		this.setTitle("我的计算器小程序");
		this.setJMenuBar(menu);
		this.setLocation(500, 150);
		this.validate();
		this.setVisible(true);
		this.pack();
		
	}
	
	public void JieMian(JTextField result){
		resultTF = result;
		//设置文本框布局
		resultTF.setText("0");
		resultTF.setHorizontalAlignment(JTextField.RIGHT);
		resultTF.setPreferredSize(new Dimension(25,40));//设置result的高度为40
		jPanelUp = new JPanel(new BorderLayout());
		jPanelUp.add(resultTF, BorderLayout.CENTER);
		
		jPanelDown = new JPanel(new BorderLayout());
		GridBagLayout gbl = new GridBagLayout();
		jPanelDown.setLayout(gbl);

		
		/**
		 * 设置数字按钮及功能键布局
		 */
		
		//设置mc按钮
		GridBagConstraints mcCons = new GridBagConstraints();
		mcCons.gridheight = 1;//设置按钮mc组件所占用的纵向格子数量
		mcCons.gridwidth = 1;
		mcCons.gridx = 0;//指定组合开始位置的x坐标
		mcCons.gridy = 0;
		mcCons.weightx = 1;//设置按钮水平拉伸
		mcCons.weighty = 1;
		mcCons.insets = new Insets(1,1,1,1);//指定组件与所在区域的外部边界。
		mcCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.mc, mcCons);
		jPanelDown.add(b.mc);
		
		//设置mr按钮
		GridBagConstraints mrCons = new GridBagConstraints();
		mrCons.gridheight = 1;//设置按钮mr组件所占用的纵向格子数量
		mrCons.gridwidth = 1;
		mrCons.gridx = 1;//指定组合开始位置的x坐标
		mrCons.gridy = 0;
		mrCons.weightx = 1;//设置按钮水平拉伸
		mrCons.weighty = 1;
		mrCons.insets = new Insets(1,1,1,1);//指定组件与所在区域的外部边界。
		mrCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.mr, mrCons);
		jPanelDown.add(b.mr);
		
		//设置ms按钮
		GridBagConstraints msCons = new GridBagConstraints();
		msCons.gridheight = 1;//设置按钮ms组件所占用的纵向格子数量
		msCons.gridwidth = 1;
		msCons.gridx = 2;//指定组合开始位置的x坐标
		msCons.gridy = 0;
		msCons.weightx = 1;//设置按钮水平拉伸
		msCons.weighty = 1;
		msCons.insets = new Insets(1,1,1,1);//指定组件与所在区域的外部边界。
		msCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.ms, msCons);
		jPanelDown.add(b.ms);
		
		
		//设置madd按钮
		GridBagConstraints maddCons = new GridBagConstraints();
		maddCons.gridheight = 1;//设置按钮madd组件所占用的纵向格子数量
		maddCons.gridwidth = 1;
		maddCons.gridx = 3;//指定组合开始位置的x坐标
		maddCons.gridy = 0;
		maddCons.weightx = 1;//设置按钮水平拉伸
		maddCons.weighty = 1;
		maddCons.insets = new Insets(1,1,1,1);//指定组件与所在区域的外部边界。
		maddCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.madd, maddCons);
		jPanelDown.add(b.madd);
		
		
		// 设置mdec按钮
		GridBagConstraints mdecCons = new GridBagConstraints();
		//mdecCons.gridwidth = GridBagConstraints.REMAINDER;// 设置本按钮为此行的最后一个
		mdecCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		mdecCons.gridwidth = 1;
		mdecCons.gridx = 4;// 指定组合开始位置的x坐标
		mdecCons.gridy = 0;
		mdecCons.weightx = 1;//设置按钮水平拉伸
		mdecCons.weighty = 1;
		mdecCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		mdecCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.mdec, mdecCons);
		jPanelDown.add(b.mdec);

		// 设置back按钮
		GridBagConstraints backCons = new GridBagConstraints();
		backCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		backCons.gridwidth = 1;
		backCons.gridx = 0;// 指定组合开始位置的x坐标
		backCons.gridy = 1;
		backCons.weightx = 1;//设置按钮水平拉伸
		backCons.weighty = 1;
		backCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		backCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.back, backCons);
		jPanelDown.add(b.back);

		// 设置ce按钮
		GridBagConstraints ceCons = new GridBagConstraints();
		ceCons.gridheight = 1;// 设置按钮ce组件所占用的纵向格子数量
		ceCons.gridwidth = 1;
		ceCons.gridx = 1;// 指定组合开始位置的x坐标
		ceCons.gridy = 1;
		ceCons.weightx = 1;//设置按钮水平拉伸
		ceCons.weighty = 1;
		ceCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		ceCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.ce, ceCons);
		jPanelDown.add(b.ce);

		// 设置c按钮
		GridBagConstraints cCons = new GridBagConstraints();
		cCons.gridheight = 1;// 设置按钮\c组件所占用的纵向格子数量
		cCons.gridwidth = 1;
		cCons.gridx = 2;// 指定组合开始位置的x坐标
		cCons.gridy = 1;
		cCons.weightx = 1;//设置按钮水平拉伸
		cCons.weighty = 1;
		cCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		cCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.c, cCons);
		jPanelDown.add(b.c);

		// 设置oppsite按钮
		GridBagConstraints oppCons = new GridBagConstraints();
		oppCons.gridheight = 1;// 设置按钮oppsite组件所占用的纵向格子数量
		oppCons.gridwidth = 1;
		oppCons.gridx = 3;// 指定组合开始位置的x坐标
		oppCons.gridy = 1;
		oppCons.weightx = 1;//设置按钮水平拉伸
		oppCons.weighty = 1;
		oppCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		oppCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.oppsite, oppCons);
		jPanelDown.add(b.oppsite);

		// 设置right按钮
		GridBagConstraints rightCons = new GridBagConstraints();
		rightCons.gridwidth = GridBagConstraints.REMAINDER;// 设置本按钮为此行的最后一个
		rightCons.gridheight = 1;// 设置按钮right组件所占用的纵向格子数量
		rightCons.gridwidth = 1;
		rightCons.gridx = 4;// 指定组合开始位置的x坐标
		rightCons.gridy = 1;
		rightCons.weightx = 1;//设置按钮水平拉伸
		rightCons.weighty = 1;
		rightCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		rightCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.sqrtOper, rightCons);
		jPanelDown.add(b.sqrtOper);

		// 设置7按钮
		GridBagConstraints sevenCons = new GridBagConstraints();
		sevenCons.gridheight = 1;// 设置按钮7组件所占用的纵向格子数量
		sevenCons.gridwidth = 1;
		sevenCons.gridx = 0;// 指定组合开始位置的x坐标
		sevenCons.gridy = 2;
		sevenCons.weightx = 1;//设置按钮水平拉伸
		sevenCons.weighty = 1;
		sevenCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		sevenCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[7], sevenCons);
		jPanelDown.add(b.jNumBtn[7]);
		

		// 设置8按钮
		GridBagConstraints eightCons = new GridBagConstraints();
		eightCons.gridheight = 1;// 设置按钮8组件所占用的纵向格子数量
		eightCons.gridwidth = 1;
		eightCons.gridx = 1;// 指定组合开始位置的x坐标
		eightCons.gridy = 2;
		eightCons.weightx = 1;//设置按钮水平拉伸
		eightCons.weighty = 1;
		eightCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		eightCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[8], eightCons);
		jPanelDown.add(b.jNumBtn[8]);

		// 设置9按钮
		GridBagConstraints nineCons = new GridBagConstraints();
		nineCons.gridheight = 1;// 设置按钮9组件所占用的纵向格子数量
		nineCons.gridwidth = 1;
		nineCons.gridx = 2;// 指定组合开始位置的x坐标
		nineCons.gridy = 2;
		nineCons.weightx = 1;//设置按钮水平拉伸
		nineCons.weighty = 1;
		nineCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		nineCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[9], nineCons);
		jPanelDown.add(b.jNumBtn[9]);

		// 设置/按钮
		GridBagConstraints divCons = new GridBagConstraints();
		divCons.gridheight = 1;// 设置按钮/组件所占用的纵向格子数量
		divCons.gridwidth = 1;
		divCons.gridx = 3;// 指定组合开始位置的x坐标
		divCons.gridy = 2;
		divCons.weightx = 1;//设置按钮水平拉伸
		divCons.weighty = 1;
		divCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		divCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jOprBtn[3], divCons);
		jPanelDown.add(b.jOprBtn[3]);

		// 设置%按钮
		GridBagConstraints percentCons = new GridBagConstraints();
		percentCons.gridwidth = GridBagConstraints.REMAINDER;
		percentCons.gridheight = 1;// 设置按钮percent组件所占用的纵向格子数量
		percentCons.gridwidth = 1;
		percentCons.gridx = 4;// 指定组合开始位置的x坐标
		percentCons.gridy = 2;
		percentCons.weightx = 1;//设置按钮水平拉伸
		percentCons.weighty = 1;
		percentCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		percentCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.percent, percentCons);
		jPanelDown.add(b.percent);

		// 设置4按钮
		GridBagConstraints fourCons = new GridBagConstraints();
		fourCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		fourCons.gridwidth = 1;
		fourCons.gridx = 0;// 指定组合开始位置的x坐标
		fourCons.gridy = 3;
		fourCons.weightx = 1;//设置按钮水平拉伸
		fourCons.weighty = 1;
		fourCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		fourCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[4], fourCons);
		jPanelDown.add(b.jNumBtn[4]);

		// 设置5按钮
		GridBagConstraints fiveCons = new GridBagConstraints();
		fiveCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		fiveCons.gridwidth = 1;
		fiveCons.gridx = 1;// 指定组合开始位置的x坐标
		fiveCons.gridy = 3;
		fiveCons.weightx = 1;//设置按钮水平拉伸
		fiveCons.weighty = 1;
		fiveCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		fiveCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[5], fiveCons);
		jPanelDown.add(b.jNumBtn[5]);

		// 设置6按钮
		GridBagConstraints sixCons = new GridBagConstraints();// 使用GridBag必须要有的限制条件
		sixCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		sixCons.gridwidth = 1;
		sixCons.gridx = 2;// 指定组合开始位置的x坐标
		sixCons.gridy = 3;
		sixCons.weightx = 1;//设置按钮水平拉伸
		sixCons.weighty = 1;
		sixCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		sixCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[6], sixCons);
		jPanelDown.add(b.jNumBtn[6]);

		// 设置*按钮
		GridBagConstraints multiplyCons = new GridBagConstraints();
		multiplyCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		multiplyCons.gridwidth = 1;
		multiplyCons.gridx = 3;// 指定组合开始位置的x坐标
		multiplyCons.gridy = 3;
		multiplyCons.weightx = 1;//设置按钮水平拉伸
		multiplyCons.weighty = 1;
		multiplyCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		multiplyCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jOprBtn[2], multiplyCons);
		jPanelDown.add(b.jOprBtn[2]);

		// 设置dshu按钮
		GridBagConstraints daoshuCons = new GridBagConstraints();
		daoshuCons.gridwidth = GridBagConstraints.REMAINDER;
		daoshuCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		daoshuCons.gridwidth = 1;
		daoshuCons.gridx = 4;// 指定组合开始位置的x坐标
		daoshuCons.gridy = 3;
		daoshuCons.weightx = 1;//设置按钮水平拉伸
		daoshuCons.weighty = 1;
		daoshuCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		daoshuCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.dshu, daoshuCons);
		jPanelDown.add(b.dshu);

		// 设置1按钮
		GridBagConstraints oneCons = new GridBagConstraints();
		oneCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		oneCons.gridwidth = 1;
		oneCons.gridx = 0;// 指定组合开始位置的x坐标
		oneCons.gridy = 4;
		oneCons.weightx = 1;//设置按钮水平拉伸
		oneCons.weighty = 1;
		oneCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		oneCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[1], oneCons);
		jPanelDown.add(b.jNumBtn[1]);

		// 设置2按钮
		GridBagConstraints twoCons = new GridBagConstraints();
		twoCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		twoCons.gridwidth = 1;
		twoCons.gridx = 1;// 指定组合开始位置的x坐标
		twoCons.gridy = 4;
		twoCons.weightx = 1;//设置按钮水平拉伸
		twoCons.weighty = 1;
		twoCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		twoCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[2], twoCons);
		jPanelDown.add(b.jNumBtn[2]);

		// 设置3按钮
		GridBagConstraints threeCons = new GridBagConstraints();
		threeCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		threeCons.gridwidth = 1;
		threeCons.gridx = 2;// 指定组合开始位置的x坐标
		threeCons.gridy = 4;
		threeCons.weightx = 1;//设置按钮水平拉伸
		threeCons.weighty = 1;
		threeCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		threeCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[3], threeCons);
		jPanelDown.add(b.jNumBtn[3]);

		// 设置-按钮
		GridBagConstraints minusCons = new GridBagConstraints();
		minusCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		minusCons.gridwidth = 1;
		minusCons.gridx = 3;// 指定组合开始位置的x坐标
		minusCons.gridy = 4;
		minusCons.weightx = 1;//设置按钮水平拉伸
		minusCons.weighty = 1;
		minusCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		minusCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jOprBtn[1], minusCons);
		jPanelDown.add(b.jOprBtn[1]);

		// 设置=按钮
		GridBagConstraints equalCons = new GridBagConstraints();
		equalCons.gridwidth = GridBagConstraints.REMAINDER;
		equalCons.gridheight = 2;// 设置按钮mdec组件所占用的纵向格子数量
		equalCons.gridwidth = 1;
		equalCons.gridx = 4;// 指定组合开始位置的x坐标
		equalCons.gridy = 4;
		equalCons.weightx = 1;//设置按钮水平拉伸
		equalCons.weighty = 1;
		equalCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		equalCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.equal, equalCons);
		jPanelDown.add(b.equal);

		// 设置0按钮
		GridBagConstraints zeroCons = new GridBagConstraints();
		zeroCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		zeroCons.gridwidth = 2;
		zeroCons.gridx = 0;// 指定组合开始位置的x坐标
		zeroCons.gridy = 5;
		zeroCons.weightx = 1;//设置按钮水平拉伸
		zeroCons.weighty = 1;
		zeroCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		zeroCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jNumBtn[0], zeroCons);
		jPanelDown.add(b.jNumBtn[0]);

		// 设置.按钮			
		GridBagConstraints pointCons = new GridBagConstraints();
		pointCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		pointCons.gridwidth = 1;
		pointCons.gridx = 2;// 指定组合开始位置的x坐标
		pointCons.gridy = 5;
		pointCons.weightx = 1;//设置按钮水平拉伸
		pointCons.weighty = 1;
		pointCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		pointCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.point, pointCons);
		jPanelDown.add(b.point);

		// 设置+按钮
		GridBagConstraints addCons = new GridBagConstraints();
		addCons.gridheight = 1;// 设置按钮mdec组件所占用的纵向格子数量
		addCons.gridwidth = 1;
		addCons.gridx = 3;// 指定组合开始位置的x坐标
		addCons.gridy = 5;
		addCons.weightx = 1;//设置按钮水平拉伸
		addCons.weighty = 1;
		addCons.insets = new Insets(1, 1, 1, 1);// 指定组件与所在区域的外部边界。
		addCons.fill = GridBagConstraints.BOTH;
		gbl.setConstraints(b.jOprBtn[0], addCons);
		jPanelDown.add(b.jOprBtn[0]);
				
				
		this.add(jPanelUp,BorderLayout.NORTH);
		this.add(jPanelDown, BorderLayout.CENTER);
	} 
	
	
}

