package banan.edu.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Board {
    private Stack<Card> stack;
    private List<Card> playerCards;
    private List<Card> dealerCards;
    private List<Card> playerMoves;
    private List<Card> dealerMoves;
    private List<Card> trash;
    private String message;
    private Suit trump;
    private Card trumpCard;
    private boolean turn;

    public Board() {
        this.stack = new Stack<>();
        this.playerCards = new ArrayList<>();
        this.dealerCards = new ArrayList<>();
        this.playerMoves = new ArrayList<>();
        this.dealerMoves = new ArrayList<>();
        this.trash = new ArrayList<>();
        this.message = "Welcome";
        this.trump = null;
        this.trumpCard = null;
        this.turn = true;
    }

    public Board(Stack<Card> stack, List<Card> playerCards, List<Card> dealerCards, List<Card> playerMoves, List<Card> dealerMoves, List<Card> trash, String message, Suit trump, Card trumpCard, boolean turn) {
        this.stack = stack;
        this.playerCards = playerCards;
        this.dealerCards = dealerCards;
        this.playerMoves = playerMoves;
        this.dealerMoves = dealerMoves;
        this.trash = trash;
        this.message = message;
        this.trump = trump;
        this.trumpCard = trumpCard;
        this.turn = turn;
    }

    public List<Card> getPlayerMoves() {
        return playerMoves;
    }

    public void setPlayerMoves(List<Card> playerMoves) {
        this.playerMoves = playerMoves;
    }

    public List<Card> getDealerMoves() {
        return dealerMoves;
    }

    public void setDealerMoves(List<Card> dealerMoves) {
        this.dealerMoves = dealerMoves;
    }

    public Stack<Card> getStack() {
        return stack;
    }

    public void setStack(Stack<Card> stack) {
        this.stack = stack;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public List<Card> getDealerCards() {
        return dealerCards;
    }

    public void setDealerCards(List<Card> dealerCards) {
        this.dealerCards = dealerCards;
    }

    public List<Card> getTrash() {
        return trash;
    }

    public void setTrash(List<Card> trash) {
        this.trash = trash;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Suit getTrump() {
        return trump;
    }

    public void setTrump(Suit trump) {
        this.trump = trump;
    }

    public Card getTrumpCard() {
        return trumpCard;
    }

    public void setTrumpCard(Card trumpCard) {
        this.trumpCard = trumpCard;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public java.lang.String toString() {
        return "Board{" +
                "stack=" + stack +
                ", playerCards=" + playerCards +
                ", dealerCards=" + dealerCards +
                ", trash=" + trash +
                ", message=" + message +
                ", trump=" + trump +
                ", trumpCard=" + trumpCard +
                ", turn=" + turn +
                '}';
    }
}
