package SimpleLoginLogoutProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btnLogin = new Button();
		btnLogin.setOnClickListner(new OnClickListner() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("User is Logged In");
			}
		});
		
		
		Button btnLogout = new Button();
		btnLogout.setOnClickListner(new OnClickListner() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("User is Logged Out");
			}
		});
	}

}