package example

class Agency {

    Flight flightId
    Ticket ticketId

    /* create table agency
(
    flight_id bigint references flight,
    ticket_id bigint references ticket,
    primary key (flight_id,ticket_id)
);

     */
  //  static mapping = {
    //    id columm: 'flightId', type: 'Flight'
      //  id columm: 'ticketId', type: 'Ticket'
    //}
    static constraints = {
    }
}
