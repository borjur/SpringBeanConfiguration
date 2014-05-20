package com.boris.company;

import java.util.HashMap;
import java.util.Map;





public class Building {
	
	private Map<String,String> rooms = new HashMap<String,String>();
	private Map<String,Team> teams = new HashMap<String,Team>();
	
	public void setRooms(Map<String, String> rooms) {
		this.rooms = rooms;
	}
	public void setTeams(Map<String, Team> teams) {
		this.teams = teams;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
		result = prime * result + ((teams == null) ? 0 : teams.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
		if (rooms == null) {
			if (other.rooms != null)
				return false;
		} else if (!rooms.equals(other.rooms))
			return false;
		if (teams == null) {
			if (other.teams != null)
				return false;
		} else if (!teams.equals(other.teams))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String> entry: rooms.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		sb.append("\n");
		
		for(Map.Entry<String, Team> entry: teams.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}
	
	
}
