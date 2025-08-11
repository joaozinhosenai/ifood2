import java.util.ArrayList;
import java.util.List;

class Pedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Pedido(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getTotal() {
        return quantidade * precoUnitario;
    }
}

public class TabelaPedidos {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido("X-Burger", 2, 15.00));
        pedidos.add(new Pedido("Refrigerante Lata", 3, 5.00));
        pedidos.add(new Pedido("Milkshake", 1, 10.00));

        System.out.println("+---------------------+-----------+--------------+------------+");
        System.out.printf("| %-19s | %-9s | %-12s | %-10s |\n", "Produto", "Quantidade", "Preço Unit.", "Total");
        System.out.println("+---------------------+-----------+--------------+------------+");

        double valorTotal = 0;

        for (Pedido p : pedidos) {
            System.out.printf("| %-19s | %-9d | R$ %9.2f | R$ %8.2f |\n",
                    p.getProduto(),
                    p.getQuantidade(),
                    p.getPrecoUnitario(),
                    p.getTotal());
            valorTotal += p.getTotal();
        }

        System.out.println("+---------------------+-----------+--------------+------------+");
        System.out.printf("| %-44s | R$ %8.2f |\n", "Valor Total", valorTotal);
        System.out.println("+---------------------+-----------+--------------+------------+");
    }
}
