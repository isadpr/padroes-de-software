package facade;

public class Client {
	public static void main(String[] args) {
		TravelBookingFacade travelBookingFacade = new TravelBookingFacade();
		
	    boolean isFlightBooked = travelBookingFacade.flightAvailability();
        if (isFlightBooked) {
            System.out.println("Voo reservado com sucesso!");
        } else {
            System.out.println("Falha ao reservar o voo.");
        }

        boolean isHotelBooked = travelBookingFacade.bookHotel();
        if (isHotelBooked) {
            System.out.println("Hotel reservado com sucesso!");
        } else {
            System.out.println("Falha ao reservar o hotel.");
        }
	}
}
