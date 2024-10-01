package baseball;

public class Review03 {

    public static void main(String[] args) {
     // 各チームのインスタンスを生成
        BaseBallTeam Y  = new BaseBallTeam("東京ヤクルトスワローズ",80, 59, 4);
        BaseBallTeam De = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam T  = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam G  = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam C  = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam D  = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        Y.report();
        De.report();
        T.report();
        G.report();
        C.report();
        D.report();

    }

}
