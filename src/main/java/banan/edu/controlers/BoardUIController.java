package banan.edu.controlers;

import banan.edu.model.Card;
import banan.edu.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ui")
public class BoardUIController {

    @Autowired
    BoardServiceImpl boardService;

    @GetMapping("/board")
    String getBoard(Model model){
        List<Card> deck = boardService.getStack();
        List<Card> deck2 = new ArrayList<>();
        List<Card> playerCards = new ArrayList<>();
        List<Card> dealerCards = new ArrayList<>();
        for (int i = 1; i < boardService.getStack().size(); i++) {
                deck2.add(new Card(i,"/image/back.png",i*3));
        }
        model.addAttribute("deck",deck2);
        model.addAttribute("trumpCard",deck.get(0));
        model.addAttribute("playerCards",playerCards);
        model.addAttribute("dealerCards",dealerCards);
        model.addAttribute("cardsSize",deck2.size());
        return "board";
    }

    @GetMapping("/give/cards/to/player")
    String givePlayerCards(Model model){
        List<Card> deck = boardService.getStack();
        List<Card> deck2 = new ArrayList<>();
        List<Card> playerCards = boardService.getPlayerCards();
        List<Card> dealerCards = boardService.getDealerCards();
        for (int i = 1; i < boardService.getStack().size(); i++) {
            deck2.add(new Card(i,"/image/back.png",i*3));
        }
        model.addAttribute("deck",deck2);
        model.addAttribute("trumpCard",deck.get(0));
        model.addAttribute("playerCards",playerCards);
        model.addAttribute("dealerCards",dealerCards);
        model.addAttribute("cardsSize",deck2.size());
        return "board";
    }

    @GetMapping("/give/cards/to/dealer")
    String giveDealerCards(Model model){
        List<Card> deck = boardService.getStack();
        List<Card> deck2 = new ArrayList<>();
        List<Card> playerCards = boardService.getPlayerCards();
        List<Card> dealerCards = boardService.getDealerCards();
        for (int i = 1; i < boardService.getStack().size(); i++) {
            deck2.add(new Card(i,"/image/back.png",i*3));
        }
        model.addAttribute("deck",deck2);
        model.addAttribute("trumpCard",deck.get(0));
        model.addAttribute("playerCards",playerCards);
        model.addAttribute("dealerCards",dealerCards);
        model.addAttribute("cardsSize",deck2.size());
        return "board";
    }

    @GetMapping("/shuffle")
    String getShuffle(Model model){
        List<Card> deck = boardService.getStack();
        boardService.shuffleDeck(deck);
        List<Card> deck2 = new ArrayList<>();
        List<Card> playerCards = new ArrayList<>();
        List<Card> dealerCards = new ArrayList<>();
        for (int i = 1; i < boardService.getStack().size(); i++) {
            deck2.add(new Card(i,"/image/back.png",i*3));
        }
        model.addAttribute("deck",deck2);
        model.addAttribute("trumpCard",deck.get(0));
        model.addAttribute("playerCards",playerCards);
        model.addAttribute("dealerCards",dealerCards);
        model.addAttribute("cardsSize",deck2.size());
        return "board";
    }


}
