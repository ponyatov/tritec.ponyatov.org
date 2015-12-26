package tritec.ponyatov.org;

import java.util.Vector;

import tritec.ponyatov.org.Employee.Boss.Unbreakable;

public class Employee {

	static abstract class Empl {
		String FIO;
		Empl(String FIO) { this.FIO=FIO; recrute(); }
		abstract void recrute() throws Unbreakable;
		abstract void dismiss();
	};

	static Vector<Empl> X;		// storage
	
	class Boss extends Empl {
		Boss(String FIO) { super(FIO); }
		void OpenBankAccount() {}
		void CloseBankAccount() {}
		
		static final int counter=0;
		
		class Unbreakable extends Throwable {
			private static final long serialVersionUID = -7496040150189462685L;}

		@Override
		void recrute() throws Unbreakable {
			if (counter++>1) throw new Unbreakable();
			OpenBankAccount();
			X.add(this);
		}

		@Override
		void dismiss() {
			CloseBankAccount();
			X.remove(this);
		}
		
	}

	static class IT extends Empl {
		IT(String FIO) { super(FIO); }
		void GrantPermissions() {}
		void RevokePermissions() {}

		@Override
		void recrute() { GrantPermissions(); X.add(this); }
		@Override
		void dismiss() { RevokePermissions(); X.remove(this); }

	};

	public static void main(String[] args) {
		IT ivan = new IT("Ivanov");
		IT petr = new IT("Petrov");
	}

}
