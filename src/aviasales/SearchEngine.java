package aviasales;

import aviasales.da.FlightDb;
import aviasales.da.Route;
import aviasales.domain.Ticket;

/**
 * Retrieved from http://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
 */
public class SearchEngine {

    public Route findRoute(SearchCriteria searchCriteria) { //searchCriteria для поиска маршрутов
      return null;
    }

    public SearchEngine(FlightDb flightDb) {
       this.flightDb = flightDb;
    }

    private FlightDb flightDb;

    public Ticket findTickets(SearchCriteria searchCriteria) { //searchCriteria для поиска билетов
        return null;
    }

}
