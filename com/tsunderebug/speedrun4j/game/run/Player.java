package com.tsunderebug.speedrun4j.game.run;

import com.tsunderebug.speedrun4j.user.User;

import java.awt.*;
import java.io.IOException;

public class Player {

	private String rel;
	private String id;
	private String name;
	private String uri;

	public String getName() throws IOException {
		if(name == null) {
			return User.fromID(id).getNames().get("international");
		} else {
			return name;
		}
	}
	
	public String getID() throws IOException {
			return id;
		
	}

	public Color getColor() throws IOException {
		if(id != null) {
			return User.fromID(id).getNameStyle().getColor();
		} else {
			return Color.white;
		}
	}
	
	public String getURI() throws IOException {
		return uri;
	}

}
