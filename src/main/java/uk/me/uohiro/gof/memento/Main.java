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
			System.out.println("�O��ۑ��������ʂ���X�^�[�g���܂��B");
			gamer.restoreMemento(memento);
		} else {
			System.out.println("�V�K�ɃX�^�[�g���܂��B");
			memento = gamer.createMemento();
		}

		for (int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println("����F" + gamer);
			
			gamer.bet();
			
			System.out.println("��������" + gamer.getMoney() + "�~�ɂȂ�܂����B");
			
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("   ===> �����ԑ������̂ŁA���݂̏�Ԃ�ۑ����Ă�����");
				memento = gamer.createMemento();
				
				saveMemento(memento);
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("   ===> �����Ԍ������̂ŁA�ȑO�̏�Ԃɕ��A���悤�B");
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
