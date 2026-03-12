public class Bank {

    private String namaAkun;
    private String password;
    private String nomorRekening;
    private double saldo;

    public Bank(String namaAkun, String password, String nomorRekening, double saldoAwal) {

        // mengecek apakah password memiliki huruf besar
        boolean adaHurufBesar = !password.equals(password.toLowerCase());

        if (namaAkun.length() < 4) {
            System.out.println("Nama akun tidak boleh kurang dari 4 huruf");
            return;
        }

        if (password.length() < 8 || !password.contains("_") || !adaHurufBesar) {
            System.out.println("Password minimal 8 karakter, harus ada _, dan minimal 1 huruf besar");
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

        System.out.println("Akun berhasil dibuat");
        tampilkanInfo();
    }

    public void tambahSaldo(double jumlah, String pw) {

        if (!pw.equals(password)) {
            System.out.println("\nPassword salah, transaksi gagal\n");
            return;
        }

        saldo += jumlah;

        System.out.println("\nSaldo berhasil ditambah: " + String.format("%.2f", jumlah));
        System.out.println("Saldo sekarang: " + String.format("%.2f", saldo) + "\n");
    }

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

    public void tampilkanInfo() {
        System.out.println("Nama Akun      : " + namaAkun);
        System.out.println("No Rekening    : " + nomorRekening);
        System.out.println("Saldo          : " + String.format("%.2f", saldo));
        System.out.println();
    }
}
