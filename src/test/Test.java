package test;

import javax.swing.UIManager;

import demo_project.views.DashboardView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new DashboardView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
