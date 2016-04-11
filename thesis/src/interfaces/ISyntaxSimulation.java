package interfaces;

import java.util.List;
import java.util.Map;

import CompilerElements.Token;

public interface ISyntaxSimulation {
	public void doSimulation();
	public Map<Token, List<List<Token>>> getHistory(Integer index);
	public Boolean needAlwaysBreak();
	void setAlwaysbreak(Boolean alwaysbreak);
	void addDots(Map<Token, List<Token>> rules);
}
