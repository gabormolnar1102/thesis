package simulations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import CompilerElements.Token;
import implementations.SyntaxSimulationAncestor;

public class LR0Simulation extends SyntaxSimulationAncestor {
	private Map<Token, List<List<Token>>> rules;
	private List<Map<Token, List<List<Token>>>> history = new ArrayList<Map<Token, List<List<Token>>>>();
	private Set<Map<String, String>> canonicalSets = new HashSet<Map<String, String>>();
	private Boolean alwaysbreak;
	
	
	
	public LR0Simulation() {	
		//do InitStuffs
	}
	
	@Override
	public Map<Token, List<List<Token>>> getHistory(Integer index) {
		return history.get(index);
	}

	@Override
	public Boolean needAlwaysBreak() {
		return alwaysbreak;
	}

	@Override
	public void setAlwaysbreak(Boolean alwaysbreak) {
		this.alwaysbreak = alwaysbreak;
	}
	
	public void closure(String lhs, String value){
	}
	
	public void read(Integer setId, Integer prodId){
	}

	@Override
	public void doSimulation() {	
	}


}
