load("libs/test1.js");


test1.sc1.prototype.run = function() {
	/**
	 * @type MT.Application
	 */
	var app = this.app;
	var bug = 0;
    

	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	app.button("OK").tap();
	try {
	    app.label('Hello!').verify(); //if label exists
	} catch(Exception) {
	    app.debug().print("Label not found");
	    bug++;
	}	
	  app.debug().print("Test finishing! Find troubles: " + bug);
};