public class MainBank {

    public static void main(String[] args) {

        Bank akun1 = new Bank(
                "DeaErsa",
                "Pass_word",
                "1234567890",
                500000);

        akun1.tambahSaldo(200000, "Pass_word");
        akun1.tarikSaldo(100000, "Pass_word");
        akun1.tarikSaldo(700000, "Pass_word");
        akun1.tambahSaldo(50000, "Salah_pw");
    }
}
