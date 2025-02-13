package exercise;

public class MethodObject {

    class Account {
        public int gamma(int inputVal, int quantity, int yearToDate) {
            return new GammaCalculator(this, inputVal, quantity, yearToDate).calculate();
        }

        int delta() {
            return 10;
        }
    }

    // membuat gamma calculator untuk membuat Account cleaner dan mengubah semua perhitungan
    // method panjang di Account menjadi di gammaCalculator.calculate()
    class GammaCalculator {
        private final Account account;
        private final int inputVal;
        private final int quantity;
        private final int yearToDate;
        private int importantValue1;
        private int importantValue2;
        private int importantValue3;

        GammaCalculator(Account account, int inputVal, int quantity, int yearToDate) {
            this.account = account;
            this.inputVal = inputVal;
            this.quantity = quantity;
            this.yearToDate = yearToDate;
        }

        int calculate() {
            importantValue1 = (inputVal * quantity) + account.delta();
            importantValue2 = (inputVal * yearToDate) + 100;
            if ((yearToDate - importantValue1) > 100) {
                importantValue2 -= 20;
            }
            importantValue3 = importantValue2 * 7;
            return importantValue3 - 2 * importantValue1;
        }
    }

    private void test() {
        Account account = new Account();
        System.out.println(account.gamma(15, 10, 2010));
    }

    public static void main(String[] args) {
        MethodObject p = new MethodObject();
        p.test();
    }
}
