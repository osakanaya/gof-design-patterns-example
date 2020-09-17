package uk.me.uohiro.gof.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BigCharFactory {

	private Map<String, BigChar> pool = new ConcurrentHashMap<>();
	
	private static BigCharFactory singleton = new BigCharFactory();
	
	private BigCharFactory() {}
	
	public static BigCharFactory getInstance() {
		return singleton;
	}
	
	public BigChar getBigChar(char charName) {
		return pool.computeIfAbsent("" + charName, key -> {
			BigChar bigChar = pool.get(key);
			if (bigChar == null) {
				return new BigChar(charName);
			}
			
			return bigChar;
		});
	}
}
