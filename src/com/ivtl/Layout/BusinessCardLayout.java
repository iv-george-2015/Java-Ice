package com.ivtl.Layout;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

public class BusinessCardLayout implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		Dimension d = new Dimension();
		d.setSize(500,500);
		return d;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		Dimension d = new Dimension();
		d.setSize(500,500);
		return d;
	}

	@Override
	public void layoutContainer(Container parent) {
		parent.add("OK-Btn", new Button("OK"));
		
	}

}
