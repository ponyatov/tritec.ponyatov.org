package tritec.ponyatov.org;

public class Employee {

	static abstract class Empl {
		String FIO;
		
		@Override
		public String toString() { return "Employee:"+FIO; }

		Empl(String FIO) {
			this.FIO = FIO;
			recrute();
		}
		
		abstract void recrute();

		abstract void dismiss();
	};

	static class Boss extends Empl {
		Boss(String FIO) {
			super(FIO);
		}
		@Override
		public String toString() { return "Boss:"+FIO; }

		void OpenBankAccount() {
		}

		void CloseBankAccount() {
		}

		@Override
		void recrute() {
			OpenBankAccount();
		}

		@Override
		void dismiss() {
			CloseBankAccount();
		}

	}

	static class IT extends Empl {
		IT(String FIO) {
			super(FIO);
		}
		@Override
		public String toString() { return "IT:"+FIO; }

		void GrantPermissions() {
		}

		void RevokePermissions() {
		}

		@Override
		void recrute() {
			GrantPermissions();
		}

		@Override
		void dismiss() {
			RevokePermissions();
		}

	};


	public static void main(String[] args) {
		Empl[] X = { // storage
				new IT("Ivanov"),
				new IT("Petrov"),
				new Boss("Sidor")
		};
		X[1].dismiss();
		for (Empl i:X) System.out.println(i.toString());
	}

}
