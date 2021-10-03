package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class PaymentImpl implements PaymentDao {

	@Override
	public List<Payment> getPayments() {
		Connection conn = ConexionBD.getConnection();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("select * from payments");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public boolean createNewPayment(Payment payment) {
		
		try {
			Connection conn = ConexionBD.getConnection();
			
			PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO "+ "payments" + "(customerNumber,checkNumber,paymentDate,amount) VALUES(?,?,?,?)");
		    preparedStatement.setInt(1,payment.getCustomerNumber());
		    preparedStatement.setString(2,payment.getCheckNumber());
		    preparedStatement.setString(3,payment.getPaymentDate());
		    preparedStatement.setDouble(4,payment.getAmount());
		    boolean execute = preparedStatement.execute();
		    conn.close();
		    return execute;			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	
}
