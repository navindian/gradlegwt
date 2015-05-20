package com.something.samplegwtproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;


public class SampleGWTProject implements EntryPoint {

	SimplePanel leftTopPanel;
	SimplePanel leftBottomPanel;
	SimplePanel middleTopPanel;
	SimplePanel middleBottomPanel;
	SimplePanel rightTopPanel;
	SimplePanel rightBottomPanel;
	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */

	//private final GreetingServiceAsync greetingService = (GreetingServiceAsync) GWT
			//.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		initalizePanels();

	}

	/**
	 * Loading all three panels
	 */
	private void initalizePanels() {
		// TODO Auto-generated method stub
		loadLeftPanel();
		loadMiddlePanel();
		loadRightPanel();
		loadGridPanel();
	}

	private void loadGridPanel() {
		// TODO Auto-generated method stub
		Grid grid = new Grid(2, 3);
		grid.setWidget(0, 0, leftTopPanel);
		grid.setWidget(0, 1, middleTopPanel);
		grid.setWidget(0, 2, rightTopPanel);
		grid.setWidget(1, 0, leftBottomPanel);
		grid.setWidget(1, 1, middleBottomPanel);
		grid.setWidget(1, 2, rightBottomPanel);
		grid.setBorderWidth(1);
		grid.setHeight("600px");
		grid.setWidth("1300px");

		DecoratorPanel mainPanel = new DecoratorPanel();
		mainPanel.add(grid);
		// Use RootPanel.get() to get the entire body element
		RootPanel.get().add(mainPanel);
	}

	private void loadRightPanel() {

	}

	private void loadMiddlePanel() {
		
	}

	private void loadLeftPanel() {
		leftTopPanel = new SimplePanel();
		leftTopPanel.isVisible();
		

	}

}
