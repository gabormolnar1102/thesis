package implementations;

import java.util.List;
import java.util.Map;

import CompilerElements.Token;
import interfaces.ISyntaxSimulation;

public class SyntaxSimulationAncestor implements ISyntaxSimulation {
	private Map<String, List<String>> rules;
	private List<Map<String, List<String>>> history;
	private List<Map<String, List<String>>> canonicalsets;
	

	@Override
	public void doSimulation() {
	}

	@Override
	public Map<Token, List<List<Token>>> getHistory(Integer index) {
		return null;
	}

	@Override
	public Boolean needAlwaysBreak() {
		return null;
	}

	@Override
	public void setAlwaysbreak(Boolean alwaysbreak) {	
	}

	@Override
	public void addDots(Map<Token, List<Token>> rules) {
	}

}
