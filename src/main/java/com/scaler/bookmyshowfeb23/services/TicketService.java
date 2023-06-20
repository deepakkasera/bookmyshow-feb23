package com.scaler.bookmyshowfeb23.services;

import com.scaler.bookmyshowfeb23.models.Show;
import com.scaler.bookmyshowfeb23.models.Ticket;
import com.scaler.bookmyshowfeb23.repository.ShowSeatRepository;
import com.scaler.bookmyshowfeb23.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private ShowSeatRepository showSeatRepository;
    private UserRepository userRepository;

    @Autowired //Not mandatory after spring 4.3
    TicketService(ShowSeatRepository showSeatRepository, UserRepository userRepository) {
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
    }

    public Ticket bookTicket(List<Long> showSeatIds, Long userId) {
        //Actual work for booking the ticket will come here.
        return null;
    }

}
