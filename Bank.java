public class Bank {
    private String namaAkun;
    private String password;
    private String nomorRekening;
    private double saldo;

    // Constructor
    public Bank(String namaAkun, String password, String nomorRekening, double saldoAwal) {

        if (namaAkun.length() < 4) {
            System.out.println("Nama akun tidak boleh kurang dari 4 huruf");
            return;
        }

        if (password.length() < 8 || !password.contains("_")) {
            System.out.println("Password minimal 8 karakter dan harus ada _");
            return;
        }

        if (nomorRekening.length() < 10) {
            System.out.println("Nomor rekening tidak boleh kurang dari 10 karakter");
            return;
        }

        if (saldoAwal < 0) {
            System.out.println("Saldo awal tidak boleh minus");
            return;
        }

        this.namaAkun = namaAkun;
        this.password = password;
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;

        System.out.println("\nAkun berhasil dibuat");
        tampilkanInfo();
    }

    // Method menambah saldo
    public void tambahSaldo(double jumlah, String pw) {
        if (!pw.equals(password)) {
            System.out.println("\nPassword salah, transaksi gagal\n");
            return;
        }

        saldo += jumlah;
        System.out.println("\nSaldo berhasil ditambah: " + String.format("%.2f", jumlah));
        System.out.println("Saldo sekarang: " + String.format("%.2f", saldo) + "\n");
    }

    // Method mengurangi saldo
    public void tarikSaldo(double jumlah, String pw) {
        if (!pw.equals(password)) {
            System.out.println("\nPassword salah, transaksi gagal\n");
            return;
        }

        if (jumlah > saldo) {
            System.out.println("\nSaldo tidak mencukupi\n");
            return;
        }

        saldo -= jumlah;
        System.out.println("\nSaldo berhasil ditarik: " + String.format("%.2f", jumlah));
        System.out.println("Saldo sekarang: " + String.format("%.2f", saldo) + "\n");
    }

    // Method menampilkan info akun
    public void tampilkanInfo() {
        System.out.println("Nama Akun      : " + namaAkun);
        System.out.println("No Rekening    : " + nomorRekening);
        System.out.println("Saldo          : " + String.format("%.2f", saldo) + "\n");
    }
}