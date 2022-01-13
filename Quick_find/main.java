public class main {

        public static void main(String[] args) {
                QF uf = new QF();
                uf.fillArray(10);
                uf.union(1, 4);
                System.out.println(uf.Connected(1, 4));
                uf.union(3, 4);
                System.out.println(uf.Connected(3, 4));
                System.out.println(uf.Connected(3, 1));
                uf.printArray();
        }

}
