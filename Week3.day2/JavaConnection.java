package week3.day2;

public class JavaConnection extends MySqlConnection {

		@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		super.executeQuery();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		super.connect();
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		super.disconnect();
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		super.executeUpdate();
	}

		public static void main(String[] args) {
			JavaConnection d = new JavaConnection();
			d.connect();
			d.disconnect();
			d.executeUpdate();
			d.executeQuery();
		}
		
	}


