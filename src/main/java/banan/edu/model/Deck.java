package banan.edu.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>(
            Arrays.asList(
                    new Card (4,Suit.CLUB , Denomination.SIX , 6, "/image/C6.png"),
                    new Card (5,Suit.CLUB , Denomination.SEVEN , 7, "/image/C7.png"),
                    new Card (6,Suit.CLUB , Denomination.EIGHT , 8, "/image/C8.png"),
                    new Card (7,Suit.CLUB , Denomination.NINE , 9, "/image/C9.png"),
                    new Card (8,Suit.CLUB , Denomination.TEN , 10, "/image/C10.png"),
                    new Card (9,Suit.CLUB , Denomination.JACK , 11, "/image/CJ.png"),
                    new Card (10,Suit.CLUB , Denomination.QUEEN , 12, "/image/CQ.png"),
                    new Card (11,Suit.CLUB , Denomination.KING , 13, "/image/CK.png"),
                    new Card (12,Suit.CLUB , Denomination.ACE , 14, "/image/CA.png"),
                    new Card (17,Suit.HEART , Denomination.SIX , 6, "/image/H6.png"),
                    new Card (18,Suit.HEART , Denomination.SEVEN , 7, "/image/H7.png"),
                    new Card (19,Suit.HEART , Denomination.EIGHT , 8, "/image/H8.png"),
                    new Card (20,Suit.HEART , Denomination.NINE , 9, "/image/H9.png"),
                    new Card (21,Suit.HEART , Denomination.TEN , 10, "/image/H10.png"),
                    new Card (22,Suit.HEART , Denomination.JACK , 11, "/image/HJ.png"),
                    new Card (23,Suit.HEART , Denomination.QUEEN , 12, "/image/HQ.png"),
                    new Card (24,Suit.HEART , Denomination.KING , 13, "/image/HK.png"),
                    new Card (25,Suit.HEART , Denomination.ACE , 14, "/image/HA.png"),
                    new Card (30,Suit.SPADE , Denomination.SIX , 6, "/image/P6.png"),
                    new Card (31,Suit.SPADE , Denomination.SEVEN , 7, "/image/P7.png"),
                    new Card (32,Suit.SPADE , Denomination.EIGHT , 8, "/image/P8.png"),
                    new Card (33,Suit.SPADE , Denomination.NINE , 9, "/image/P9.png"),
                    new Card (34,Suit.SPADE , Denomination.TEN , 10, "/image/P10.png"),
                    new Card (35,Suit.SPADE , Denomination.JACK , 11, "/image/PJ.png"),
                    new Card (36,Suit.SPADE , Denomination.QUEEN , 12, "/image/PQ.png"),
                    new Card (37,Suit.SPADE , Denomination.KING , 13, "/image/PK.png"),
                    new Card (38,Suit.SPADE , Denomination.ACE , 14, "/image/PA.png"),
                    new Card (43,Suit.DIAMOND , Denomination.SIX , 6, "/image/T6.png"),
                    new Card (44,Suit.DIAMOND , Denomination.SEVEN , 7, "/image/T7.png"),
                    new Card (45,Suit.DIAMOND , Denomination.EIGHT , 8, "/image/T8.png"),
                    new Card (46,Suit.DIAMOND , Denomination.NINE , 9, "/image/T9.png"),
                    new Card (47,Suit.DIAMOND , Denomination.TEN , 10, "/image/T10.png"),
                    new Card (48,Suit.DIAMOND , Denomination.JACK , 11, "/image/TJ.png"),
                    new Card (49,Suit.DIAMOND , Denomination.QUEEN , 12, "/image/TQ.png"),
                    new Card (50,Suit.DIAMOND , Denomination.KING , 13, "/image/TK.png"),
                    new Card (51,Suit.DIAMOND , Denomination.ACE , 14, "/image/TA.png")
            )
    );

    public List<Card> getDeck() {
        return deck;
    }

    public void clear(){
        deck.removeAll(deck);
    }

}