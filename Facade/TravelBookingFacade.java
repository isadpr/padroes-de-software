package facade;

/* O Facade facilita a interação do cliente com o sistema, uma vez que o cliente não precisa lidar com a complexidade dos subsistemas.
Em vez disso, ele consegue utilizar métodos simples fornecidos pelo Facade e realizar as reservas de viagens online de forma
mais intuitiva. */

public class TravelBookingFacade {
	private PaymentProcess paymentProcess = new PaymentProcess();
	private AvailabilityChecker availabilityChecker = new AvailabilityChecker();
	private ReservationManager reservationManager = new ReservationManager();
	
    public boolean flightAvailability() {
        boolean isAvailable = availabilityChecker.checkFlightAvailability();
        if (isAvailable) {
            boolean isPaymentSuccessful = paymentProcess.processPayment();
            if (isPaymentSuccessful) {
                return reservationManager.bookFlight();
            }
        }
        return false;
    }
    
    public boolean bookHotel() {
        boolean isAvailable = availabilityChecker.checkHotelAvailability();
        if (isAvailable) {
            boolean isPaymentSuccessful =  paymentProcess.processPayment();
            if (isPaymentSuccessful) {
                return reservationManager.bookHotel();
            }
        }
        return false;
    }
    
}
