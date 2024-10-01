package baseball;

public class BaseBallTeam {
    //フィールド
    private String name;// チーム名
    private int win;    // 勝ち数
    private int lose;   // 負け数
    private int draw;   // 引き分け数

    // コンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率を計算するメソッド
    public double getRate() {

        //勝率の計算：勝率＝勝ち数/(勝ち数＋負け数)
        double winrate = (double)this.win / (double)(this.win + this.lose);

        //勝率を返す
        return winrate;
    }

    //reportを出力するメソッド
    public void report() {
        double winrate = getRate();
        System.out.println(this.name + " の2022年の成績は　" + this.win + "勝 " + this.lose + "敗 " + this.draw + "分、勝率は " + this.draw + "分、勝率は " + winrate + "です。");
    }


}
