package ListaCincoEstruturasDeSelecao;

public class ExercicioLista03Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float compraAcoes = 32.87f;
	    float vendaAcoes = 33.92f;
	    int quantAcoes = 1000;
	    float percent = 0.02f;
	    float totCompra;
	    float totVenda;
	    float totDespCompra;
	    float totDespVenda;
	    float totLucroVenda;
	    float totLucro;
	    float totLucroCompra;
	    
	    totCompra = compraAcoes * quantAcoes;
	    totVenda = vendaAcoes * quantAcoes;
	    totDespCompra = totCompra * percent;
	    totDespVenda = totVenda * percent;
	    totLucroVenda = totVenda - totDespVenda;
	    totLucroCompra = totCompra + totDespCompra;
	    totLucro = totLucroVenda - totLucroCompra;
	    
	    System.out.println("Valor total da compra: " +totCompra );
	    System.out.println("Valor da comissão compra: " +totDespCompra );
	    System.out.println("Valor total da venda: " +totVenda );
	    System.out.println("Valor da comissão venda: " +totDespVenda );
	    System.out.println("Lucro ou Prejuizo: " +totLucro );

	}

}
