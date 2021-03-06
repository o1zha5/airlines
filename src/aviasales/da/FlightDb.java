package aviasales.da;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by laptop on 21.07.2016.
 */
public interface FlightDb {
    List<Flight> filterFlightsByDate(Date flightDateFrom, Date flightDateTo);
    //ArrayList<Flight> loadFlights(String className) throws IOException;

    List<Flight> getFlightsByDate(Date flightDateFrom, Date flightDateTo);
}
