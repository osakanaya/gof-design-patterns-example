package uk.me.uohiro.gof.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import uk.me.uohiro.gof.momento.game.Gamer;
import uk.me.uohiro.gof.momento.game.Memento;

public class Main {

	private static final String MEMENTO_FILE_NAME = "game.dat";
	
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);

//		Memento memento = gamer.createMemento();

		Memento memento = loadMemento();		
		if (memento != null) {
			System.out.println("前回保存した結果からスタートします。");
			gamer.restoreMemento(memento);
		} else {
			System.out.println("新規にスタートします。");
			memento = gamer.createMemento();
		}

		for (int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println("現状：" + gamer);
			
			gamer.bet();
			
			System.out.println("所持金は" + gamer.getMoney() + "円になりました。");
			
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("   ===> だいぶ増えたので、現在の状態を保存しておこう");
				memento = gamer.createMemento();
				
				saveMemento(memento);
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("   ===> だいぶ減ったので、以前の状態に復帰しよう。");
				gamer.restoreMemento(memento);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			
			System.out.println("");
		}
	}
	
	private static void saveMemento(Memento memento) {
		ObjectOutput out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream(MEMENTO_FILE_NAME));
			out.writeObject(memento);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
				}
			}
		}
	}

	private static Memento loadMemento() {
		Memento memento = null;
		
		ObjectInput in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(MEMENTO_FILE_NAME));
			memento = (Memento)in.readObject();
		} catch (IOException|ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
				}
			}
		}
		
		return memento;
	}

}
