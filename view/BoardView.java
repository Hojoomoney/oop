package view;

import model.Board;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main() {
        List<Board> articles = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            articles.add(Board.builder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRandomName())
                    .build());
        }
// 향상된 for
//        for(BoardDto board : articles){
//            System.out.println(board.toString());
//        }
        // Stream
        articles.forEach(i -> {
            System.out.println(i.toString());
        });
    }
}
