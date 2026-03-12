public class MainBank {
    public static void main(String[] args) {

        Bank akun1 = new Bank(
                "DeaErsa",
                "pass_word",
                "1234567890",
                500000);

        akun1.tambahSaldo(200000, "pass_word");
        akun1.tarikSaldo(100000, "pass_word");
        akun1.tarikSaldo(700000, "pass_word"); // saldo tidak cukup
        akun1.tambahSaldo(50000, "salah_pw"); // password salah
    }
}
