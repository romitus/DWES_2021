package dao;

import java.util.List;

public interface PaymentDao {
	List<Payment> getPayments();
	boolean createNewPayment(Payment payment);
}
