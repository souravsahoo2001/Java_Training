package com.java.agent;

import java.util.ArrayList;
import java.util.List;

public class AgentDAOImpl implements AgentDAO {
   static List<Agent> agentList;
	
	static {
		agentList = new ArrayList<Agent>();
	}
	
	public int generateAgentId() {
		if (agentList.size() == 0) {
			return 1;
		} else {
			return agentList.get(agentList.size()-1).getAgentId()+1;
		}
	}

	private List<Agent> agentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agent> showAgentDao() {
		// TODO Auto-generated method stub
		return agentList;
	}

	@Override
	public String addAgentDao(Agent agent) {
		int id = generateAgentId();
		agent.setAgentId(id);
		agentList.add(agent);
		return "Agent Record Inserted...";
	}



	

}
