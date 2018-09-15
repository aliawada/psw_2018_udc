package ex.restaurante;

public class Principal {

	public static void main(String[] args) {
		
		RestauranteCaseiro restaurante = new RestauranteCaseiro(25);
                
		restaurante.custoBebida(2.5F);
		restaurante.custoPrato(3.7F);
		
		restaurante.adicionarCliente(1);
		restaurante.adicionarBebida(1);
                
        restaurante.adicionarCliente(2);
		restaurante.adicionarBebida(2);
        restaurante.adicionarBebida(2);
        restaurante.adicionarCliente(2);
		restaurante.adicionarBebida(2);
		restaurante.adicionarCliente(2);
		restaurante.adicionarBebida(2);
                
        System.out.println("Total da mesa 1: " + restaurante.calculaConta(1) +  "\n Cada cliente da mesa 1 paga: " + restaurante.dividirConta(1));
        System.out.println("Total da mesa 2: " + restaurante.calculaConta(2) +  "\n Cada cliente da mesa 2 paga: " + restaurante.dividirConta(2));
        
        restaurante.fecharMesa(1);
        restaurante.fecharMesa(2);  
        
        System.out.println(restaurante.impostoRestaurante());
            
        
}
}
