package com.aipalbot.flight.reservation.interfaces;

import com.aipalbot.flight.reservation.models.Card;
import com.aipalbot.flight.reservation.util.CardType;

public interface IPaymentService {

	public Card createPaymentMethod(CardType card);
}
