package com.java.prop;

public class WriteOnlyEx {

	public static void main(String[] args) {
		Agent agent = new Agent();
		agent.setAgentId(1);
		agent.setAgentName("Sourav");
		agent.setPremium(885764.5);
		
		
		System.out.println(agent);
	}
}
