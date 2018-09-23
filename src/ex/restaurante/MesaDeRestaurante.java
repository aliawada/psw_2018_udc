package ex.restaurante;

public class MesaDeRestaurante {
		private int qtdPedidos; // clientes na mesa
		private float precoPedido;
		
		public MesaDeRestaurante(int qtdPedidos) {
			this.qtdPedidos = qtdPedidos;
		}
		
		public void custoPedido(float precoCusto) {
			precoPedido = precoCusto * 2.0F;
		}
		
		public void adicionaAoPedido() {
			 qtdPedidos++;
		}
      
		public void zeraPedidos() {
			qtdPedidos = 0;
		}
		
		public float calculaTotal() {
			float total = qtdPedidos * precoPedido;
			return total;
		}
		
}