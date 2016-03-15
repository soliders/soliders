import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Menu extends JMenuBar{
	
	public Menu() {
		// 创建菜单栏
		JMenu menu,subMenu;
		JMenuItem menuItem,subMenuItem;

		// 为菜单view增加子菜单
		menu = new JMenu("View");
		menuItem = new JMenuItem();
		menuItem.setText("static");
		menu.add(menuItem);
		menuItem = new JMenuItem();
		menuItem.setText("scientific");
		menu.add(menuItem);
		this.add(menu);
		
		// 为菜单edit增加子菜单
		menu = new JMenu("Edit");
		menuItem = new JMenuItem("copy");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));//设置快捷键
		menu.add(menuItem);
		menuItem = new JMenuItem("paste");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menu.add(menuItem);
		
		//为edit增加二级子菜单
		subMenu= new JMenu("history");
		subMenuItem  = new JMenuItem();
		subMenuItem.setText("Edit");
		subMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		subMenu.add(subMenuItem);
		subMenuItem = new JMenuItem();
		subMenuItem.setText("Clear");
		subMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
		subMenu.add(subMenuItem);
		menu.add(subMenu);
		this.add(menu);
		
		menu = new JMenu("Help");
		menuItem = new JMenuItem("about My Calculator");
		MouseListener ml = new MouseListener();
		menuItem.addActionListener(ml);
		menu.add(menuItem);
		this.add(menu);
		
	}
}

