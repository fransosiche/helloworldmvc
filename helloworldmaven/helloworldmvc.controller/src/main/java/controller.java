package fr.exia.helloworldmaven;
package helloworldmvc.controller;

public class controller {

	private IView view;
	private IModel model;

	public controller(IView view, IModel model) {
		// TODO Auto-generated constructor stub
		this.view = view;
		this.model = model;
	}

	public void run() {
		this.view.displayMessage(this.model.getHelloWorld());

	}

}
